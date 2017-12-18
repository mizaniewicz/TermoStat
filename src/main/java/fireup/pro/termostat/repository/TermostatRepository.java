package fireup.pro.termostat.repository;

import fireup.pro.termostat.domain.Termostat;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TermostatRepository extends CrudRepository<Termostat, Long> {
    Termostat find(LocalDateTime date);
    List<Termostat> findAllByTimestampBetween(LocalDateTime startDate, LocalDateTime endDate);
}
