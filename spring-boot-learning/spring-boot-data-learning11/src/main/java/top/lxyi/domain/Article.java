package top.lxyi.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "t_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    @Column(name = "cover")
    private String cover;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "a_id")
    private List<Discuss> discussList;
}