package com.proyecto.microservicio2.controller;

import com.proyecto.microservicio2.dto.DefaultResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;

@RestController
public class ProyectoController {

    @GetMapping("/query-application")
    public DefaultResponseDto hello(){
        DefaultResponseDto responseDto = new DefaultResponseDto();
        responseDto.setCode(1);
        responseDto.setMessage("Operation successfully");
        responseDto.setTimestamp(Instant.now());
        System.out.println(responseDto.toString());
        return responseDto;
    }
}
