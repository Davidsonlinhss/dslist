package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity // configura a classe Java para que ela seja equivalente a uma tabela no banco de dados
@Table(name = "tb_game")
@Data
public class Game {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "game_year") // customização da coluna no banco de dados;
    private Integer year;

    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

}
