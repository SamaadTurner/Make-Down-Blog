package np.com.roshanadhikary.mdblog.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import np.com.roshanadhikary.mdblog.entities.Post;

public interface PostRepository extends CrudRepository<Post, Long>, PagingAndSortingRepository<Post, Long> {

}
