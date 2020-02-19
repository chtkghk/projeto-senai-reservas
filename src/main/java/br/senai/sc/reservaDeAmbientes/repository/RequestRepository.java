package br.senai.sc.reservaDeAmbientes.repository;

import br.senai.sc.reservaDeAmbientes.entity.Request;
import br.senai.sc.reservaDeAmbientes.util.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {

    Request findRequestById(Long id);
    List<Request> findRequestsByStartDatetimeIsBefore(Date datetime);
    List<Request> findRequestsByEndDatetimeIsAfter(Date datetime);
    List<Request> findRequestsByStatus(Status status);

}
