package fireup.pro.termostat.service;

import fireup.pro.termostat.domain.Termostat;
import fireup.pro.termostat.repository.TermostatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TermostatService {

    private TermostatRepository repository;

    @Autowired
    public TermostatService(TermostatRepository repository) {
        this.repository = repository;
    }

    public List<Termostat> getAllTeperatures() {
        return repository.findAll();
    }

    public Termostat getTemperatureById(Long id) {
        return repository.findById(id);
    }

    public List<Termostat> getTEmeraturesBetweenDates(LocalDateTime startDate, LocalDateTime endDate) {
        return repository.findAllByTimestampBetween(startDate, endDate);
    }

}
