package cac.flightsApi.controllers;

import cac.flightsApi.Models.Flight;
import cac.flightsApi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
     FlightService flightService;

    @GetMapping("")
    public List<Flight> getAllFlights(){
        return flightService.bringAllFlights();
    }

    @PostMapping("/add")
    public void createFlight(@RequestBody Flight flight){
        flightService.addFlight(flight);
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable Long id){
        return flightService.findFlightById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteFlightById(id);
    }

    @PutMapping("/update")
    public  Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }
}
