package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transform uma classe em uma ENTIDADE do BD
// JPA = Java Persistence API
// @Data = Cria todos os Getters e Setters

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;


    @Column(name = "idade")
    private int idade;

    // Muitos NINJAS tem APENAS UMA missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key (CHAVE ESTRANGEIRA)
    private MissoesModel missoes;



}
