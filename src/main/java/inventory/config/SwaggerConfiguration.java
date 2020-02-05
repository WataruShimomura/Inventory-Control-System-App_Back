package inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

	@Configuration
	@EnableSwagger2
	public class SwaggerConfiguration {
		    @Bean
		    public Docket swaggerSpringMvcPlugin() {
		        return new Docket(DocumentationType.SWAGGER_2)
		                .groupName("sample-api")    // APIドキュメントをグルーピングするための識別名
		                .select()
		                .paths(paths())
		                .build()
		                .apiInfo(apiInfo());
		    }

		    @SuppressWarnings("unchecked")
			private Predicate<String> paths() {
		        // ドキュメント生成の対象とするAPIのURLを指定
		        // この場合、「/user」で始まるAPIがドキュメント生成対象となる
		        return Predicates.or(Predicates.containsPattern("/"));
		    }

		    @SuppressWarnings("deprecation")
			private ApiInfo apiInfo() {
		        return new ApiInfo("Inventory API", "V1", null, null, null, null, null);
		    }
		}
