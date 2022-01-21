package com.raulmvp.controller;

import com.raulmvp.entity.UniverseEntity;
import com.raulmvp.service.UniverseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universe")
public class UniverseController {

    @Autowired
    UniverseService universeService;

    @PostMapping("/create")
    public ResponseEntity<UniverseEntity> createUniverse(@RequestBody String aName) {
        UniverseEntity universeEntity = universeService.createUniverse(aName);
        return universeEntity != null ? new ResponseEntity<>(universeEntity, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/by-id")
    public ResponseEntity<UniverseEntity> getUniverseEntityById(@RequestBody Integer aId) {
        UniverseEntity universeEntity = universeService.getUniverseById(aId);
        return new ResponseEntity<UniverseEntity>(universeEntity, HttpStatus.OK);
    }

    @GetMapping("/by-username")
    public ResponseEntity<List<UniverseEntity>> getUniverseByUsername(@RequestBody String aUsername) {
        List universeList = universeService.getUniverseListByUsername(aUsername);
        return new ResponseEntity<>(universeList, HttpStatus.OK);
    }

    @GetMapping("/by-name")
    public ResponseEntity<UniverseEntity> getUniverseByName(@RequestBody String aName) {
        UniverseEntity universeEntity = universeService.getUniverseByName(aName);
        return new ResponseEntity<>(universeEntity, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteUser(@RequestBody String aName) {
        Boolean isDeleted = universeService.deleteUniverse(aName);
        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }
}
