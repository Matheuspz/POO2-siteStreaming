package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.Entidades.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video,Integer> {

    List<Video> findAllByOrderByTituloAsc();

}
