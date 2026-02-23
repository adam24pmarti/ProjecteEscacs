package com.example.reservasajedrez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.function.EntityResponse;

import com.example.reservasajedrez.model.Reserva;
import com.example.reservasajedrez.service.ReservaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("api/reservas")
@Tag(name = "Reservations", description = "API for managing chess table reservations")
public class ReservaController {

    @Autowired
    private final ReservaService service;

    @Autowired
    public ReservaController(@Qualifier("ReservaServiceImpl") ReservaService service) {
        this.service = service;
    }

    @Operation(
        summary = "Create a new reservation",
        description = "Creates a new reservation for a chess table"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Reservation successfully created"),
        @ApiResponse(responseCode = "400", description = "Invalid reservation data"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping
    public Reserva create(@RequestBody Reserva reserva) {
        return service.create(reserva);
    }

    @Operation(
        summary = "Find reservation by ID",
        description = "Retrieves a reservation using its unique identifier (NIF)"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Reservation found"),
        @ApiResponse(responseCode = "404", description = "Reservation not found")
    })
    @GetMapping("/{nif}")
    public EntityResponse<Reserva> findByID(
            @Parameter(description = "Unique identifier (NIF) of the reservation", example = "12345678A")
            @PathVariable("nif") String id) {
        return null;
    }
}