package com.iticsolution.smartfacturation.mappers;


import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.iticsolution.smartfacturation.dto.ArticleRequestDTO;
import com.iticsolution.smartfacturation.dto.ArticleResponseDTO;
import com.iticsolution.smartfacturation.entities.Article;



@Mapper(componentModel = "spring")
public interface ArticleMapper {
	Article fromArticleRequestDTO(ArticleRequestDTO articleRequestDTO);
	ArticleResponseDTO fromArticle(Article article);
}
