package br.senai.sc.reservaDeAmbientes.repository;

import br.senai.sc.reservaDeAmbientes.entities.Phone;
import br.senai.sc.reservaDeAmbientes.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

    Phone findPhoneById(Long id);
    Phone findPhoneByNumber(String number);
    List<Phone> findPhoneByUser(User user);

}
