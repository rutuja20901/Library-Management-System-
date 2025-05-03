package com.rutujaChavan.LibraryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.rutujaChavan.LibraryManagement.model.LibraryModel;
import com.rutujaChavan.LibraryManagement.repository.LibraryRepository;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepo;

    // Add data
    public ResponseEntity<Object> addData(LibraryModel lr) {
        try {
            LibraryModel newLr = new LibraryModel(lr.getISBN(), lr.getTitle(), lr.getAuthor(),
                    lr.getDescription(), lr.getGenere(), lr.getPublicationYear(),
                    lr.getCopiesAvailable(),
                    lr.getPublisher(), lr.getCoverImageUrl());
            libraryRepo.save(newLr);
            return ResponseEntity.status(HttpStatus.CREATED).body(newLr);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // Get data
    public ResponseEntity<Object> listData() {
        List<LibraryModel> ldata = libraryRepo.findAll();
        if (ldata.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Data not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(ldata);

    }

    // Delete data by id
    public ResponseEntity<Object> deleteData(@PathVariable int id) {
        if (libraryRepo.existsById(id)) {
            libraryRepo.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Book deleted successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    // Update data by id
    public ResponseEntity<Object> updateData(@PathVariable int id, @RequestBody LibraryModel lr) {
        Optional<LibraryModel> op = libraryRepo.findById(id);
        if (op.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
        }
        lr.setId(id);
        LibraryModel lrs = libraryRepo.save(lr);
        return ResponseEntity.status(HttpStatus.OK).body(lrs);
    }
}
