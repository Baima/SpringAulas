package io.github.baima.vendas;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

    @Bean(name = "cachorro")
    public Animal cachorro(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("au au, pega no meu pé");
            }
        };
    }

    @Bean(name = "gato")
    public Animal gato(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("miau miau, to passando mal");
            }
        };
    }
}
