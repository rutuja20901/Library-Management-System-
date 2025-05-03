package com.rutujaChavan.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rutujaChavan.LibraryManagement.model.LibraryModel;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryModel, Integer> {

}
