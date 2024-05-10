package telran.java52.forum.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ForumAddCommentsDto {
		String user;
	    String message;
	    LocalDateTime dateCreated;
	    Integer likes;
	}


