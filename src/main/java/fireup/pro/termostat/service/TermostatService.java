package fireup.pro.termostat.service;

import fireup.pro.termostat.domain.TemperatureProvider;
import fireup.pro.termostat.domain.TemperatureSample;
import fireup.pro.termostat.domain.Termostat;
import fireup.pro.termostat.repository.TermostatRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class TermostatService {

    private TermostatRepository repository;
    private TemperatureProvider provider;

    @Autowired
    public TermostatService(TermostatRepository repository, TemperatureProvider provider) {
        this.repository = repository;
        this.provider = provider;
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

    @Scheduled(fixedDelayString = "${termostat.sampleDelay}")
    public void readTemperatureSample() {
        TemperatureSample sample = provider.sample();
        log.info("Read temperature sample: {}", sample);
        repository.save(new Termostat(sample.getTemperatureInCelsius(), sample.getTimestamp()));
        log.debug("Saved temperature sample: {}", sample);
    }
}
