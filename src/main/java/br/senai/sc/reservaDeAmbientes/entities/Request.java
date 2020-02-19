package br.senai.sc.reservaDeAmbientes.entities;

import br.senai.sc.reservaDeAmbientes.util.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "solicitacao")
public class Request {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;

    @Column(name = "descricao", length = 255, nullable = false) private String description;

    @Column(name = "pretencao_inicio", nullable = false)
    @Temporal(TemporalType.TIMESTAMP) @Basic private Date startDatetime;

    @Column(name = "pretencao_fim", nullable = false)
    @Temporal(TemporalType.TIMESTAMP) @Basic private Date endDatetime;

    @Column(columnDefinition = "tinyint(1) default 0", nullable = false)
    @Enumerated(EnumType.ORDINAL) private Status status;

    @JoinColumn(name = "cdUsuario", updatable = false, nullable = false)
    @ManyToOne(optional = false) private User user;

    @JoinColumn(name = "cdAmbiente", updatable = false, nullable = false)
    @ManyToOne(optional = false) private Environment environment;

}
