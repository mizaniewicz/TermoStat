package fireup.pro.termostat.service;

import fireup.pro.termostat.repository.TermostatRepository;
import org.springframework.stereotype.Service;

@Service
public class TermostatService {
    private TermostatRepository repository;

    public TermostatService(TermostatRepository repository) {
        this.repository = repository;
    }

    public double getCurrentTemperature() {
        return 0;
    }
}
