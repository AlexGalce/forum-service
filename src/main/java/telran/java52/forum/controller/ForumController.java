package telran.java52.forum.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.java52.forum.dto.ForumAddCommentsDto;
import telran.java52.forum.dto.ForumAddDto;
import telran.java52.forum.dto.ForumDateDto;
import telran.java52.forum.dto.ForumDto;
import telran.java52.forum.dto.ForumMessageDto;
import telran.java52.forum.service.ForumService;

@RestController
public class ForumController{
	
	ForumService forumService;

	@PostMapping("/post/{user}")
	public ForumDto addPost(@PathVariable String user, @RequestBody ForumAddDto forumAddDto) {
		return forumService.addPost(user, forumAddDto);
	}

	@GetMapping("/post/{id}")
	public ForumDto findPostById(@PathVariable String id) {
		return forumService.findPostById(id);
	}

	@PutMapping ("/post/{id}/like")
	public void addLike(@PathVariable String id) {
		
	}

	@GetMapping("/posts/author/{user}")
	public ForumDto findPostByAuthor(@PathVariable String user) {
		return forumService.findPostByAuthor(user);
	}

	@PutMapping("/post/{id}/comment/{user}")
	public ForumAddCommentsDto addComments(@PathVariable String id, @PathVariable String user, @RequestBody ForumMessageDto forumMessageDto) {
		
		return forumService.addComments(id, user, forumMessageDto);
	}

	@DeleteMapping("/post/{id}")
	public ForumDto deletePost(@PathVariable String id) {
		
		return forumService.deletePost(id);
	}

	@PostMapping("/posts/tags")
	public ForumAddCommentsDto findPostsByTags(@RequestBody Set<String> tags) {
		
		return forumService.findPostsByTags(tags);
	}

	@PostMapping ("/posts/period")
	public ForumAddCommentsDto findPostsByPeriod(@RequestBody ForumDateDto forumDateDto) {
		
		return forumService.findPostsByPeriod(forumDateDto);
	}

	@PutMapping("/post/{id}")
	public ForumDto updatePost(@PathVariable String id, @RequestBody ForumAddDto forumAddDto) {
		return forumService.updatePost(id, forumAddDto);
	}
	
}