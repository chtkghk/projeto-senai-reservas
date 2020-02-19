package br.senai.sc.reservaDeAmbientes.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "telefone")
public class Phone {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;

    @JoinColumn(name = "cdUser", nullable = false)
    @ManyToOne private User user;

    @Column(name = "number", nullable = false, length = 13)
    private String number;

}
