package br.senai.sc.reservaDeAmbientes.repository;

import br.senai.sc.reservaDeAmbientes.entities.User;
import br.senai.sc.reservaDeAmbientes.util.UserPrivileges;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
    User findUserByEmail(String email);
    List<User> findUsersByUserPrivileges(UserPrivileges userPrivileges);

}
