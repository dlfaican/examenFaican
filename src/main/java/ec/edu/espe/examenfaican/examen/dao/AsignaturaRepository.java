package ec.edu.espe.examenfaican.examen.dao;

import java.math.BigDecimal;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examenfaican.examen.domain.Asignatura;

public interface AsignaturaRepository extends CrudRepository<Asignatura, String> {
    //List<Asignatura>findByNombreAndCreditos(String nombre, BigDecimal creditos);
}

