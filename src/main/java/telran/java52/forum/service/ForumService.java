package telran.java52.forum.service;

import java.util.Set;

import telran.java52.forum.dto.ForumAddCommentsDto;
import telran.java52.forum.dto.ForumAddDto;
import telran.java52.forum.dto.ForumDateDto;
import telran.java52.forum.dto.ForumDto;
import telran.java52.forum.dto.ForumMessageDto;

public interface ForumService {
	ForumDto addPost(String user, ForumAddDto forumAddDto);
	ForumDto findPostById (String id);
	void addLike(String id);
	ForumDto findPostByAuthor (String user);
	ForumAddCommentsDto addComments(String id, String user, ForumMessageDto forumMessageDto);
	ForumDto deletePost(String id);
	ForumAddCommentsDto findPostsByTags(Set<String> tags);
	ForumAddCommentsDto findPostsByPeriod (ForumDateDto forumDateDto);
	ForumDto updatePost(String id, ForumAddDto forumAddDto);
}
