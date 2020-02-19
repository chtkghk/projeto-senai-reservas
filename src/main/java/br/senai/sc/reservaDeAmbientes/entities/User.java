package br.senai.sc.reservaDeAmbientes.entities;

import br.senai.sc.reservaDeAmbientes.util.UserPrivileges;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "usuario")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;

    @Column(length = 100, nullable = false) private String nome;
    @Column(length = 75, nullable = false, unique = true) private String email;
    @Column(length = 25, nullable = false) private String senha;

    @Column(columnDefinition = "tinyint(1) default 0", nullable = false)
    @Enumerated(EnumType.STRING) private UserPrivileges userPrivileges;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Phone> telefones;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Request> requests;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Booking> bookings;

}
