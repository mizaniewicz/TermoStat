package fireup.pro.termostat.domain;

import lombok.Value;

import java.time.LocalDateTime;

@Value(staticConstructor = "of")
public class TemperatureSample {
    final Double temperatureInCelsius;
    final LocalDateTime timestamp;
}
