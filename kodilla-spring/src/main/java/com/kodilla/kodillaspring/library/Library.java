package com.kodilla.kodillaspring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    //Wtrzykiwanie zaleznosci przez wlasciwosc klasy
    /*
    @Autowired
    private LibraryDbController libraryDbController;

     */
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    //Wstrzykiwanie zaleznosci za pomoca konstruktora
    /*
    @Autowired
    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }
     */

    //Wstrzykiwanie zaleznosci za pomoca settera
    /*
    @Autowired
    public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

     */

    public void saveToDb(){
        libraryDbController.saveData();
    }

    public void loadFromDb(){
        libraryDbController.loadData();
    }
}
