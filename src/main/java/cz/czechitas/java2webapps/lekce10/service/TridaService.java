package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TridaService {

    private final Logger logger = LoggerFactory.getLogger(TridaService.class);
    private final TridaRepository tridaRepository;

    public TridaService(TridaRepository tridaRepository) {
        this.tridaRepository = tridaRepository;
    }

    public List<Trida> findAll() {
        return tridaRepository.findAll();
    }

    public Trida findById(int id) {
        Optional<Trida> trida = tridaRepository.findById(id);
        if (trida.isEmpty()) {
            logger.warn("Třída s id={} nebyla nalezena.", id);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return trida.get();
    }

    public List<Student> getStudents(int id) {
        return tridaRepository.findById(id).get().getStudenti();
    }
}
