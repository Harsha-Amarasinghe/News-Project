package com.example.demo.controller;

        import com.example.demo.entity.Category;
        import com.example.demo.entity.News;
        import com.example.demo.service.CategoryService;
        import com.example.demo.service.NewsService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
@RequestMapping("/api")
public class NewsController {

    @Autowired
    private final NewsService newsService;
    @Autowired
    private final CategoryService categoryService;

    public NewsController(NewsService newsService, CategoryService categoryService) {
        this.newsService = newsService;
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> showCategories() {
        return categoryService.getAllCategories();
    }


    @GetMapping("/categories/{id}/news")
    public List<News> showNewsByCategory(@PathVariable Long id, Model model) {
        return newsService.getNewsByCategory(id);
    }


}