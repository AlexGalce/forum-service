package telran.java52.forum.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;

@Getter
public class ForumDto {
	String id;
	ForumAddDto forumAddDto;
	String author;
    LocalDateTime dateCreated;
    int likes;
    List<String> comments;
}
