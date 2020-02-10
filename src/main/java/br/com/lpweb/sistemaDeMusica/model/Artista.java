package br.com.lpweb.sistemaDeMusica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "artistas")
public class Artista {
      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "artista_id")
      Integer id;

      @NotEmpty
      @NotNull
      String nome;

      String nacionalidade;

      @ManyToMany
      @JoinTable(
          name="autorias",
          joinColumns = @JoinColumn(name = "id_artista"),
          inverseJoinColumns = @JoinColumn(name = "id_musica")
      )
//      @JsonIgnore
      private List<Musica> autorias;

      @ManyToMany
      @JoinTable(
          name="interpretacoes",
          joinColumns = @JoinColumn(name = "id_artista"),
          inverseJoinColumns = @JoinColumn(name = "id_musica")
      )
//      @JsonIgnore
      private List<Musica> interpretacoes;

      @ManyToMany
      @JoinTable(
          name="albuns_participantes",
          joinColumns = @JoinColumn(name = "id_artista"),
          inverseJoinColumns = @JoinColumn(name = "id_album")
      )
//      @JsonIgnore
      private List<Musica> participacoes;



}
