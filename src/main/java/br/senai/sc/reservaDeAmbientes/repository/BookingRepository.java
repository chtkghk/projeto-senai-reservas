package br.senai.sc.reservaDeAmbientes.repository;

import br.senai.sc.reservaDeAmbientes.entity.Booking;
import br.senai.sc.reservaDeAmbientes.entity.Environment;
import br.senai.sc.reservaDeAmbientes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Booking findBookingById(Long id);
    Booking findBookingByEnvironment(Environment environment);
    List<Booking> findBookingsByUser(User user);

}
