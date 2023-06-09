package top.lxyi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lxyi.domain.Article;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

    Optional<Article> findById(Integer id);


}
