package com.enesaksoy.flightsearchapi.dto.flight;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FlightUpdateRequest {

    private String departureAirportCode;
    private String arrivalAirportCode;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private double price;
}
