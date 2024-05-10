package telran.java52.forum.dto;


import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ForumDto {
	String id;
    String title;
    String content;
    String author;
    LocalDateTime dateCreated;
    @Singular
    List<String> tags;
    Integer likes;
    List<ForumAddCommentsDto> comments;
}
    
