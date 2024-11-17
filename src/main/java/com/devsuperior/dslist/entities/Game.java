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

    @Column(name = "gamer_year") // customização da coluna no banco de dados;
    private Integer year;

    private String genre;
    private String plataforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

}
