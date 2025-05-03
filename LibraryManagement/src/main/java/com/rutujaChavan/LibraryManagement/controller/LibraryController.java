package com.rutujaChavan.LibraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutujaChavan.LibraryManagement.model.LibraryModel;
import com.rutujaChavan.LibraryManagement.service.LibraryService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController()
@RequestMapping("/book")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/add")
    public ResponseEntity<Object> addData(@RequestBody LibraryModel lm) {
        return libraryService.addData(lm);
    }

    @GetMapping("/get")
    public ResponseEntity<Object> listData() {
        return libraryService.listData();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deletData(@PathVariable int id) {
        return libraryService.deleteData(id);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Object> updateData(@PathVariable int id, @RequestBody LibraryModel lr) {
        // TODO: process PUT request

        return libraryService.updateData(id, lr);
    }

}
