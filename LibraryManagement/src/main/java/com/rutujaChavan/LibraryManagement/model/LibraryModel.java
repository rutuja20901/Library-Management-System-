package com.rutujaChavan.LibraryManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LibraryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ISBN;
    private String title;
    private String Author;
    private String Description;
    private String Genere;
    private int PublicationYear;
    private int CopiesAvailable;
    private String Publisher;
    private String CoverImageUrl;

    public LibraryModel() {

    }

    public LibraryModel(String iSBN, String title, String author, String description, String genere,
            int publicationYear, int copiesAvailable, String publisher, String coverImageUrl) {
        this.ISBN = iSBN;
        this.title = title;
        this.Author = author;
        this.Description = description;
        this.Genere = genere;
        this.PublicationYear = publicationYear;
        this.CopiesAvailable = copiesAvailable;
        this.Publisher = publisher;
        this.CoverImageUrl = coverImageUrl;
    }

    public LibraryModel(int id, String iSBN, String title, String author, String description, String genere,
            int publicationYear, int copiesAvailable, String publisher, String coverImageUrl) {
        this.id = id;
        this.ISBN = iSBN;
        this.title = title;
        this.Author = author;
        this.Description = description;
        this.Genere = genere;
        this.PublicationYear = publicationYear;
        this.CopiesAvailable = copiesAvailable;
        this.Publisher = publisher;
        this.CoverImageUrl = coverImageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        PublicationYear = publicationYear;
    }

    public int getCopiesAvailable() {
        return CopiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        CopiesAvailable = copiesAvailable;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getCoverImageUrl() {
        return CoverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        CoverImageUrl = coverImageUrl;
    }

    @Override
    public String toString() {
        return "LibraryModel [id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", Author=" + Author
                + ", Description=" + Description + ", Genere=" + Genere + ", PublicationYear=" + PublicationYear
                + ", CopiesAvailable=" + CopiesAvailable + ", Publisher=" + Publisher + ", CoverImageUrl="
                + CoverImageUrl + "]";
    }

}
