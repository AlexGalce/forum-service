package telran.java52.forum.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class ForumAddDto {
	String title;
	String content;
	List<String> tags;
	
}