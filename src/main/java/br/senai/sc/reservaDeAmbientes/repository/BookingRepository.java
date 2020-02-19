package br.senai.sc.reservaDeAmbientes.repository;

import br.senai.sc.reservaDeAmbientes.entities.Booking;
import br.senai.sc.reservaDeAmbientes.entities.Environment;
import br.senai.sc.reservaDeAmbientes.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Booking findBookingById(Long id);
    Booking findBookingByEnvironment(Environment environment);
    List<Booking> findBookingsByUser(User user);

}
