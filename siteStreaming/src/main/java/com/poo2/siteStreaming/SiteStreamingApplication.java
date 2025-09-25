package com.poo2.siteStreaming;

import com.poo2.siteStreaming.Entidades.Categoria;
import com.poo2.siteStreaming.Repository.CategoriaRepository;
import com.poo2.siteStreaming.Repository.UsuarioRepository;
import com.poo2.siteStreaming.Repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class SiteStreamingApplication {

	public static void main(String[] args) {
        SpringApplication.run(SiteStreamingApplication.class, args);

    }
    @Bean
    CommandLineRunner run(VideoRepository repository, CategoriaRepository categoriaRepository, UsuarioRepository usuarioRepository) {
        return args -> {
            System.out.println("\n ---------------------------------------- ");
            System.out.println(" -- TODOS OS VIDEOS -- ");
            System.out.println(" ---------------------------------------- \n");
            repository.findAllByOrderByTituloAsc().forEach(v ->
                    System.out.println(
                            "\nVídeo: " + v.getTitulo() +
                                    " | Categoria: " +(v.getCategoria()  != null ? v.getCategoria().getNome() : "Sem categoria") + "\n"
                    )
            );
            System.out.println(" ---------------------------------------- ");
            System.out.println(" -- TODOS OS VIDEOS DA CATEGORIA AÇÃO -- ");
            System.out.println(" ---------------------------------------- \n");
            Categoria acao = categoriaRepository.findByNomeIgnoreCase("Ação");
            repository.findByCategoriaOrderByTituloAsc(acao).forEach(v ->
                    System.out.println(
                            "\nVídeo: " + v.getTitulo() +
                                    " | Categoria: " +(v.getCategoria()  != null ? v.getCategoria().getNome() : "Sem categoria") + "\n"
                    )
            );
            System.out.println(" ---------------------------------------- ");
            System.out.println(" -- TOP 10 VIDEOS MELHORES AVALIADOS -- ");
            System.out.println(" ---------------------------------------- \n");
            repository.findTop10MelhorAvaliados(PageRequest.of(0, 10)).forEach(v ->
                System.out.println(
                        "\nVídeo: " + v.titulo() +
                                " | Categoria: " + (v.categoria() != null ? v.categoria() : "Sem categoria") + " | Nota: " + v.mediaNota() + "\n"
                )
            );
            System.out.println(" ---------------------------------------- ");
            System.out.println(" -- TOP 10 VIDEOS MAIS ASSISTIDOS -- ");
            System.out.println(" ---------------------------------------- \n");
            repository.findTop10MaisAssistidos(PageRequest.of(0, 10)).forEach(v ->
                System.out.println(
                        "\nVídeo: " + v.titulo() +
                                " | Categoria: " + (v.categoria() != null ? v.categoria() : "Sem categoria") + " | Total de Vizualização: " + v.totalVizualizacoes() + "\n"
                )
            );
            System.out.println(" ---------------------------------------- ");
            System.out.println(" -- USUÁRIOS COM MAIS VIZUALIZAÇÕES -- ");
            System.out.println(" ---------------------------------------- \n");
            usuarioRepository.findTopUsuariosMaisAtivos(PageRequest.of(0,10)).forEach(u ->
                System.out.println(
                        "\nUsuario: " + u.nomeUsuario() +
                                " | Total Visualizações: " + u.totalVisualizacoes() + "\n"
                )
            );

        };
    }

}
