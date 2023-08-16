package com.enesaksoy.flightsearchapi.controller.contract;

import com.enesaksoy.flightsearchapi.dto.FlightDTO;
import com.enesaksoy.flightsearchapi.dto.FlightDeleteRequest;
import com.enesaksoy.flightsearchapi.dto.FlightSaveRequest;
import com.enesaksoy.flightsearchapi.dto.FlightUpdateRequest;

import java.util.List;

public interface FlightControllerContract {
    List<FlightDTO> findAll();
    FlightDTO findById(Long id);
    void delete(FlightDeleteRequest flightDeleteRequest);
    FlightDTO update(Long id, FlightUpdateRequest flightUpdateRequest);
    FlightDTO save (FlightSaveRequest flightSaveRequest);
}