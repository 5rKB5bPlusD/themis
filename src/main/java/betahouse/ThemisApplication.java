package betahouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ServletComponentScan
@ComponentScan
@MapperScan("betahouse.model.mapper")
@SpringBootApplication
public class ThemisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThemisApplication.class, args);
	}
}
