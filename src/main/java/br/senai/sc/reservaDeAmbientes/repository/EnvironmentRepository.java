package br.senai.sc.reservaDeAmbientes.repository;

import br.senai.sc.reservaDeAmbientes.entity.Environment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvironmentRepository extends JpaRepository<Environment, Long> {

    Environment findEnvironmentById(Long id);
    Environment findEnvironmentByName(String name);

}
