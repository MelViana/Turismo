package br.ifsul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import br.ifsul.repository.CidadeRepository;
import br.ifsul.repository.CidadeRepository;
import br.ifsul.ui.UICidade;

@SpringBootApplication
public class Application {

    @Autowired
	private CidadeRepository cidade;


	public static void main(String[] args) {

		SpringApplicationBuilder sab = new SpringApplicationBuilder(Application.class);
		sab.headless(false);
		ConfigurableApplicationContext cac = sab.run(args);

		Application app = (Application) cac.getBean("Application");

		UICidade cidade1 = new UICidade(app.cidade);
		cidade1.setVisible(true);

	}

}
