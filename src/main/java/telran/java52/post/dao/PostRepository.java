package telran.java52.post.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;



import telran.java52.post.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {
	Stream<Post> findPostsByAuthorIgnoreCase(String author);
	Stream<Post> findPostsByTagsIgnoreCase(List<String> tag);
	Stream<Post> findByDateCreatedBetween(LocalDate dateCreatedFrom, LocalDate dateCreatedTo);
}
