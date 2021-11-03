package com.iticsolution.smartfacturation;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.iticsolution.smartfacturation.dto.ArticleRequestDTO;
import com.iticsolution.smartfacturation.dto.ArticleResponseDTO;
import com.iticsolution.smartfacturation.services.ArticleService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages = { "com.iticsolution.smartfacturation" })
@SpringBootApplication
@EnableSwagger2
public class SmartFacturationApplication  implements CommandLineRunner{
	//@Autowired
	ArticleService articleService;
	public SmartFacturationApplication(ArticleService articleService) {
		this.articleService=articleService;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SmartFacturationApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ArticleRequestDTO articleRequestDTO=new ArticleRequestDTO();
		articleRequestDTO.setDesignation("product 1");
		articleRequestDTO.setPrixUnitHT(200.00);
		articleRequestDTO.setRefArt("FA001");
		articleRequestDTO.setTauxTVA(20d);
		articleRequestDTO.setTypeArt("Service");
		articleService.save(articleRequestDTO);
		ArticleRequestDTO articleRequestDTO2=new ArticleRequestDTO();
		articleRequestDTO2.setDesignation("product 2");
		articleRequestDTO2.setPrixUnitHT(200.00);
		articleRequestDTO2.setRefArt("FA002");
		articleRequestDTO2.setTauxTVA(20d);
		articleRequestDTO2.setTypeArt("Produit");
		articleService.save(articleRequestDTO2);
		for (ArticleResponseDTO art : articleService.listArticles()) {
			System.out.println("product"+art.getDesignation());
		}
		
	}

	

}
