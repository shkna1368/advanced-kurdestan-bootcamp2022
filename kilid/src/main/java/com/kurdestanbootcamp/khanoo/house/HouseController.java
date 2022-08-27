package com.kurdestanbootcamp.khanoo.house;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/house/")
@AllArgsConstructor
public class HouseController {

    private final IHouseService service;
    private HouseMapper mapper;


    @PostMapping("/v1")

    public ResponseEntity save(@RequestBody HouseDTO houseDTO){
    House house=mapper.toHouse(houseDTO);
        service.save(house);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("/v1/{id}")

    public ResponseEntity<HouseDTO> getById(@PathVariable Long id ){
    House house= service.getById(id);
    HouseDTO houseDTO=mapper.toHouseDTO(house);
        return ResponseEntity.ok(houseDTO);
    }


    @GetMapping("/v1")

    public ResponseEntity<List<HouseDTO>> getAll(){



    List<House> cities=    service.getAll();
    List<HouseDTO> houseDTOS=    mapper.toHouseDTOS(cities);

        return ResponseEntity.ok(houseDTOS);
    }

    @DeleteMapping("/v1/{id}")

    public ResponseEntity delete(@PathVariable Long id){

        service.delete(id);
        return ResponseEntity.ok().build();


    }



}
