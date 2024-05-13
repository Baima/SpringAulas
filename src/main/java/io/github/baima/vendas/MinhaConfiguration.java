package io.github.baima.vendas;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("rodando a configuração de desenvolvimento");
        };

    }


}
