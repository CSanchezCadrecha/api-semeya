package com.proyecto.semeya.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.semeya.models.Photo;
import com.proyecto.semeya.repositories.PhotoRepository;

@RestController
@RequestMapping(path = "/api/") //Todas las rutas empezaran por /api/
public class PhotoController {

    @Autowired
    PhotoRepository repository;

    @GetMapping(value="/photos")
    public List<Photo> getAll(){
        return repository.findAll();
    }
    
}
