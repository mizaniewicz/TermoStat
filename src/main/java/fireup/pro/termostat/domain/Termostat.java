package fireup.pro.termostat.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public class Termostat {
    @Id
    @GeneratedValue
    private Long id;
    private final double temperature;
    private LocalDateTime timestamp = LocalDateTime.now();
}
