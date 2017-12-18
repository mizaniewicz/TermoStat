package fireup.pro.termostat.repository;

import fireup.pro.termostat.domain.Termostat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TermostatRepository extends CrudRepository<Termostat, Long> {

    @Override
    List<Termostat> findAll();
    Termostat findById(Long id);
    Termostat findByTimestamp(LocalDateTime date);
    List<Termostat> findAllByTimestampBetween(LocalDateTime startDate, LocalDateTime endDate);

}
