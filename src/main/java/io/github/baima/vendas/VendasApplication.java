package io.github.baima.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    public static void main(String[] args) {

        SpringApplication.run(VendasApplication.class, args);
    }

   @GetMapping("/hello")
   public String helloWorld(){
        return applicationName;
        //essa é a string applicationName daqui de baixo, não a do qualifier
   }

   @Cachorro
   private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
          this.animal.fazerBarulho();
        };
    }

   @Value("${spring.application.name}")
   private String applicationName;

}
