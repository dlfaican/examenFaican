package ec.edu.espe.examenfaican.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenfaican.examen.dao.ColegioRepository;
import ec.edu.espe.examenfaican.examen.domain.Colegio;

@Service
public class ColegioService {

    private  final ColegioRepository colegioRepository;
    
    public ColegioService(ColegioRepository colegioRepository) {
        this.colegioRepository = colegioRepository;
    }

    public Colegio crearColegio(Colegio colegio) {
        try {
            return this.colegioRepository.save(colegio);
        } catch (Exception e) {
            throw new CreateException("Error al crear un Colegio: " + colegio.toString(), e);
        }
    }
    
    
    


    
}
