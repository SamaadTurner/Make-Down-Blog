package np.com.roshanadhikary.mdblog.entities;

import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String name;

    @Column(length = 255)
    private String url;

    @OneToMany(mappedBy = "author")
    private List<Post> posts;
}
