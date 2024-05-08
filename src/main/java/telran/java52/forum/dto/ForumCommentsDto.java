package telran.java52.forum.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ForumCommentsDto {
	String user;
    String message;
    LocalDateTime dateCreated;
    int likes;
}
