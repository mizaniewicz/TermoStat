package fireup.pro.termostat.infra;

import fireup.pro.termostat.domain.TemperatureProvider;
import fireup.pro.termostat.domain.TemperatureSample;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
public class RaspberryPiTemperatureProvider implements TemperatureProvider {
    @Override
    public TemperatureSample sample() {
        return TemperatureSample.of(prepareRandomTemperature(), LocalDateTime.now());
    }

    private Double prepareRandomTemperature() {
        Random ran = new Random();
        return 10.0 + ran.nextDouble() * 20;
    }
}
