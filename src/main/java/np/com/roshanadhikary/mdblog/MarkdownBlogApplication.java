package np.com.roshanadhikary.mdblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "np.com.roshanadhikary.mdblog.entities")
@EnableJpaRepositories(basePackages = "np.com.roshanadhikary.mdblog.repositories")
public class MarkdownBlogApplication {
	public static void main(String[] args) {
		SpringApplication.run(MarkdownBlogApplication.class, args);
	}
}
