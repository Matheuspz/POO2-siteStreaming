package com.poo2.siteStreaming;

import com.poo2.siteStreaming.Repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SiteStreamingApplication {

	public static void main(String[] args) {
        SpringApplication.run(SiteStreamingApplication.class, args);

    }
    @Bean
    CommandLineRunner run(VideoRepository repository) {
        return args -> {
            repository.findAllByOrderByTituloAsc().forEach(v ->
                    System.out.println(
                            "\nVídeo: " + v.getTitulo() +
                                    " | Categoria: " +(v.getCategoria()  != null ? v.getCategoria().getNome() : "Sem categoria") + "\n")
            );
        };
    }

}
