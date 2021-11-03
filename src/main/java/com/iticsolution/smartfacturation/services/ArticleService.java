package com.iticsolution.smartfacturation.services;

import java.util.List;

import com.iticsolution.smartfacturation.dto.ArticleRequestDTO;
import com.iticsolution.smartfacturation.dto.ArticleResponseDTO;

public interface ArticleService {
	ArticleResponseDTO save(ArticleRequestDTO articleRequestDTO);
	List<ArticleResponseDTO> listArticles();
	ArticleResponseDTO getArticleById(Long id);
	List<ArticleResponseDTO> getArticleByRef(String ref);
	ArticleResponseDTO update(ArticleRequestDTO articleRequestDTO);
	void deleteArticle(Long id);
	
	
	

}
