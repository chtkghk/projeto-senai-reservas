package br.senai.sc.reservaDeAmbientes.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ambiente")
public class Environment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;

    @Column(name = "nome", nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "detalhes", length = 50) private String detail;
    @Column(name = "descrição", length = 150) private String description;

    @OneToMany(mappedBy = "environment") private List<Item> items;
    @OneToMany(mappedBy = "environment") private List<Request> requests;
    @OneToMany(mappedBy = "environment") private List<Booking> bookings;

}
