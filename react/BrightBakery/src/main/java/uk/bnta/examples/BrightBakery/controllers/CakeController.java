package uk.bnta.examples.BrightBakery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.bnta.examples.BrightBakery.models.Cake;
import uk.bnta.examples.BrightBakery.repositories.CakeRepository;

import java.util.List;

@RestController
public class CakeController {

    @Autowired
    CakeRepository cakeRepository;

    @GetMapping("/cakes")
    public ResponseEntity<List<Cake>> getAllCakes(){
        List<Cake> cakes = cakeRepository.findAll();
        return new ResponseEntity<>(cakes, HttpStatus.OK);
    }

    @PostMapping("/cakes")
    public ResponseEntity<Cake> addNewCake(@RequestBody Cake cake){
        cakeRepository.save(cake);
        return new ResponseEntity<>(cake, HttpStatus.CREATED);
    }

}
