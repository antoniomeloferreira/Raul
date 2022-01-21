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

    @PostMapping("/create-universe")
    public ResponseEntity<String> createUniverse(String name) {
        UniverseEntity universeEntity = universeService.createUniverse(name);
        return universeService.getUniverseByName(name) == null ? new ResponseEntity<>("UniverseEntity created", HttpStatus.OK) : new ResponseEntity<>("UniverseEntity's name already exists", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/get-by-id")
    public ResponseEntity<UniverseEntity> getUniverseEntityById(int id) {
        UniverseEntity universeEntity = universeService.getUniverseById(id);
        return new ResponseEntity<UniverseEntity>(universeEntity, HttpStatus.OK);
    }

    @GetMapping("/get-by-username")
    public ResponseEntity<List<UniverseEntity>> getUniverseByUsername(String username) {
        List uLst = universeService.getUniverseListByUsername(username);
        return new ResponseEntity<>(uLst, HttpStatus.OK);
    }

    @GetMapping("/get-by-name")
    public ResponseEntity<UniverseEntity> getUniverseByName(String name) {
        UniverseEntity universeEntity = universeService.getUniverseByName(name);
        return new ResponseEntity<>(universeEntity, HttpStatus.OK);
    }

    @DeleteMapping("/delete-universe")
    public ResponseEntity<String> deleteUser(String name) {
        universeService.deleteUniverse(name);
        return new ResponseEntity<>("Universe deleted", HttpStatus.OK);
    }
}
