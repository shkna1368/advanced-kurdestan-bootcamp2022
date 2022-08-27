package com.kurdestanbootcamp.showin.place;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/house/")
@AllArgsConstructor
public class PlaceController {

    private final IPlaceService service;
    private PlaceMapper mapper;


    @PostMapping("/v1")

    public ResponseEntity save(@RequestBody PlaceDTO placeDTO){
    Place place =mapper.toHouse(placeDTO);
        service.save(place);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("/v1/{id}")

    public ResponseEntity<PlaceDTO> getById(@PathVariable Long id ){
    Place place = service.getById(id);
    PlaceDTO placeDTO =mapper.toHouseDTO(place);
        return ResponseEntity.ok(placeDTO);
    }


    @GetMapping("/v1")

    public ResponseEntity<List<PlaceDTO>> getAll(){



    List<Place> cities=    service.getAll();
    List<PlaceDTO> placeDTOS =    mapper.toHouseDTOS(cities);

        return ResponseEntity.ok(placeDTOS);
    }

    @DeleteMapping("/v1/{id}")

    public ResponseEntity delete(@PathVariable Long id){

        service.delete(id);
        return ResponseEntity.ok().build();


    }



}
