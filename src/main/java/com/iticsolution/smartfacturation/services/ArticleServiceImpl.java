package com.iticsolution.smartfacturation.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iticsolution.smartfacturation.dto.ArticleRequestDTO;
import com.iticsolution.smartfacturation.dto.ArticleResponseDTO;
import com.iticsolution.smartfacturation.entities.Article;
import com.iticsolution.smartfacturation.mappers.ArticleMapper;
import com.iticsolution.smartfacturation.repositories.ArticleRepository;



@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
	private ArticleRepository articleRepository;
	private ArticleMapper articleMapper;
	

	  public ArticleServiceImpl(ArticleRepository  articleRepository,ArticleMapper articleMapper)
	  {
		  this.articleRepository=articleRepository;
	      this.articleMapper=articleMapper; }
	 
	@Override
	public ArticleResponseDTO save(ArticleRequestDTO articleRequestDTO) {
		Article article =articleMapper.fromArticleRequestDTO(articleRequestDTO);
		Article articleSaved=articleRepository.save(article);
		
		return articleMapper.fromArticle(articleSaved);
	}

	@Override
	public List<ArticleResponseDTO> listArticles() {
		List<Article> articles =articleRepository.findAll();
		List<ArticleResponseDTO> articleResponseDTOs=
				articles.stream()
					.map(art->articleMapper.fromArticle(art))
					.collect(Collectors.toList());
		return articleResponseDTOs;
	}

	@Override
	public ArticleResponseDTO getArticleById(Long id) {
		Article article=articleRepository.findById(id).get();
		return articleMapper.fromArticle(article);
		
	}

	@Override
	public List<ArticleResponseDTO> getArticleByRef(String ref) {
		List<Article> articles =articleRepository.findByRefArtContains(ref);
		List<ArticleResponseDTO> articleResponseDTOs=
				articles.stream()
					.map(art->articleMapper.fromArticle(art))
					.collect(Collectors.toList());
		return articleResponseDTOs;
	}

	@Override
	public ArticleResponseDTO update(ArticleRequestDTO articleRequestDTO) {
		Article article =articleMapper.fromArticleRequestDTO(articleRequestDTO);
		Article articleUpdate=articleRepository.save(article);
		return articleMapper.fromArticle(articleUpdate);
	}

	@Override
	public void deleteArticle(Long id) {
		articleRepository.deleteById(id);

	}

}
