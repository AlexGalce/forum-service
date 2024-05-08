package telran.java52.forum.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;


@Getter
public class ForumAddCommentsDto {
	String id;
	ForumAddDto forumAddDto;
	String author;
    LocalDateTime dateCreated;
    int likes;
    List<ForumCommentsDto> comments;
}
