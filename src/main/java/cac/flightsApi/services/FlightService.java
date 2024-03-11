package cac.flightsApi.services;

import cac.flightsApi.Models.Flight;
import cac.flightsApi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> bringAllFlights(){
        return flightRepository.findAll();
    }

    public void addFlight(Flight flight){
        flightRepository.save(flight);
    }

    public Flight findFlightById(Long id){
        return flightRepository.findById(id).orElse(null);
    }

    public void deleteFlightById(Long id){
        flightRepository.deleteById(id);
    }

    public Flight updateFlight(Flight flight){
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId()).orElse(null);
    }
}
