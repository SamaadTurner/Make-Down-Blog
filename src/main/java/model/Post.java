package model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(length = 150)
    private String synopsis;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
