package io.sankalp.habitstrackerapplication.controller;

import io.sankalp.habitstrackerapplication.payload.HabitDTO;
import io.sankalp.habitstrackerapplication.service.HabitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping ( "/api/habits" )
public class HabitController {

    private final HabitService service;

    public HabitController ( HabitService service ) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<HabitDTO> createHabit ( @RequestBody HabitDTO habit ) {
        return new ResponseEntity<> ( service.createHabit ( habit ), HttpStatus.CREATED );
    }

    @GetMapping ( "/string" )
    public ResponseEntity<Map<String, String>> getString ( @RequestBody Map<String, String> arg ) {
        return new ResponseEntity<> ( arg, HttpStatus.OK );
    }
}
