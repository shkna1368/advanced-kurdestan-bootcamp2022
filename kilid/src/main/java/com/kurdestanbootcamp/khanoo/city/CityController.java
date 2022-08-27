package com.kurdestanbootcamp.khanoo.city;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post/")
@AllArgsConstructor
public class CityController {

    private final ICityService service;
    private CityMapper mapper;


    @PostMapping("/v1")
    public ResponseEntity save(@RequestBody CityDTO cityDTO){
    City city=mapper.toCity(cityDTO);
        service.save(city);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("/v1/{id}")
    public ResponseEntity<CityDTO> getById(@PathVariable Long id ){
    City city= service.getById(id);
    CityDTO cityDTO=mapper.toCityDTO(city);
        return ResponseEntity.ok(cityDTO);
    }
    @GetMapping("/v1")
    public ResponseEntity<List<CityDTO>> getAll(){

    List<City> cities=    service.getAll();
    List<CityDTO> cityDTOS=    mapper.toCityDTOs(cities);
        return ResponseEntity.ok(cityDTOS);
    }

    @DeleteMapping("/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }



}
