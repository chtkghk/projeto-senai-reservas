package br.senai.sc.reservaDeAmbientes.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "item")
public class Item {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;

    @Column(name = "nome", nullable = false, length = 50) private String name;
    @Column(name = "quantidade", nullable = false, columnDefinition = "smallint(3)")
    private Short amount;

    @JoinColumn(name = "cdAmbiente", nullable = false)
    @ManyToOne private Environment environment;

}
