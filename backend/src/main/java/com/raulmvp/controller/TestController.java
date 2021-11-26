package com.raulmvp.controller;

import com.raulmvp.dao.UniverseDao;
import com.raulmvp.entity.UniverseEntity;
import com.raulmvp.model.Universe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    UniverseDao universeDao;

    @GetMapping("/universe")
    public ResponseEntity<UniverseEntity> getUniverseEntity(int id) {
        UniverseEntity u = universeDao.getUniverseById(id);
        return new ResponseEntity<UniverseEntity>(u, HttpStatus.OK);
    }
}
