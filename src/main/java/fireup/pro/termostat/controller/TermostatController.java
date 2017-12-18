package fireup.pro.termostat.controller;

import fireup.pro.termostat.domain.Termostat;
import fireup.pro.termostat.service.TermostatService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TermostatController {
    TermostatService termostatService;

    public TermostatController(TermostatService termostatService) {
        this.termostatService = termostatService;
    }

    @GetMapping("/temperature")
    public Termostat showTemperature(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {
        return termostatService.getTemperatureByDate(date);
    }

    @GetMapping("/temperature/{id}")
    public Termostat showTemperature(@PathVariable("id") Long id) {
        return termostatService.getTemperatureById(id);
    }

    @GetMapping("/temperatures/{startdate}/{enddate}")
    public List<Termostat> temperaturesBetweenDates(@PathVariable("startdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDateTime startDate,
                                                    @PathVariable("enddate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDateTime endDate) {
        return termostatService.getTEmeraturesBetweenDates(startDate, endDate);
    }

    @GetMapping("/temperatures")
    public List<Termostat> showTeperatures() {
        return termostatService.getAllTeperatures();
    }

}
