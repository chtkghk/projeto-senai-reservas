package br.senai.sc.reservaDeAmbientes.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "reserva")
public class Booking {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;

    @Column(length = 16, nullable = false)
    @Temporal(TemporalType.TIMESTAMP) @Basic private Date startDatetime;

    @Column(length = 16, nullable = false)
    @Temporal(TemporalType.TIMESTAMP) @Basic private Date endDatetime;

    @JoinColumn(name = "cdUsuario", nullable = false)
    @ManyToOne private User user;

    @JoinColumn(name = "cdAmbiente", nullable = false)
    @ManyToOne private Environment environment;

}
