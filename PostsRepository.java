package Group3_CSC340.TSRP_Backend.Posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer>{
}