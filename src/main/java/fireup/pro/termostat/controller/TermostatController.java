package fireup.pro.termostat.controller;

import fireup.pro.termostat.domain.Termostat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TermostatController {
    @GetMapping("/temperature")
    public ResponseEntity<Termostat> showTemperature(@RequestParam("date") String date) {
        return null;
    }

    @GetMapping("/temperaturesbetween")
    public ResponseEntity<List<Termostat>> temperaturesBetweenDates(@PathVariable("startdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String startdate,
                                                                    @PathVariable("enddate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String enddate) {

        return null;
    }

}
