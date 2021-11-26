package com.raulmvp.controller;

import com.raulmvp.dao.UniverseDao;
import com.raulmvp.entity.UniverseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/universe")
public class UniverseController {

    @Autowired
    UniverseDao universeDao;

    @GetMapping("/get-by-id")
    public ResponseEntity<UniverseEntity> getUniverseEntityById(int id) {
        UniverseEntity universeEntity = universeDao.getUniverseById(id);
        return new ResponseEntity<UniverseEntity>(universeEntity, HttpStatus.OK);
    }

    @GetMapping("/get-by-username")
    public ResponseEntity<List<UniverseEntity>> getByUsername(String username) {
        List uLst = universeDao.getUniverseListByUsername(username);
        return new ResponseEntity<>(uLst, HttpStatus.OK);
    }
}
