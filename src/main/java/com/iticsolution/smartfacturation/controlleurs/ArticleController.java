package com.iticsolution.smartfacturation.controlleurs;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iticsolution.smartfacturation.dto.ArticleResponseDTO;
import com.iticsolution.smartfacturation.services.ArticleService;

@RestController
@RequestMapping(path="/api")
public class ArticleController {
	ArticleService articleService;
	public ArticleController(ArticleService articleService) {
		this.articleService=articleService;
	}
	
	@GetMapping(path="/articles")
	public List<ArticleResponseDTO>listArticles(){
		
		return articleService.listArticles();
	}

}
