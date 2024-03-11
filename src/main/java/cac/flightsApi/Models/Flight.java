package cac.flightsApi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String source;
    private String destination;
    private LocalDateTime dateTimeDeparture;
    private LocalDateTime dateTimeArrival;
    private double priceInPesos;
    private String frecuency;

    public Flight(String source, String destination, LocalDateTime dateTimeDeparture, LocalDateTime dateTimeArrival, double priceInPesos, String frecuency){
        this.source = source;
        this.destination = destination;
        this.dateTimeDeparture = dateTimeDeparture;
        this.dateTimeArrival = dateTimeArrival;
        this.priceInPesos = priceInPesos;
        this.frecuency = frecuency;
    }


}
