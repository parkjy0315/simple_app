package article.service;

import article.entity.Article;
import article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList() {
        return articleRepository.findAll();
    }

    public void write(String subject) {
        Article article = new Article();
        article.setSubject(subject);
        articleRepository.save(article);
    }
}
