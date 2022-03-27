package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    //15.2

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Main library");
        Book book = new Book("Rozlam", "Mikolaj Wielki", LocalDate.of(2012, 12, 3));
        Book book2 = new Book("Sterczyk", "Wandal Maklom", LocalDate.of(1999, 2, 22));
        Book book3 = new Book("Lodowiec", "Wartek Lod", LocalDate.of(2002, 6, 11));

        library.getBooks().add(book);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //creating shallow library copy
        Library libraryShallowCopy = null;
        try {
            libraryShallowCopy = library.shallowCopy();
            libraryShallowCopy.setName("Shallow copy Library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //creating deep library copy
        Library libraryDeepCopy = null;
        try {
            libraryDeepCopy = library.deepCopy();
            libraryDeepCopy.setName("Deep copy library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        System.out.println(library.getBooks());
        System.out.println(libraryShallowCopy.getBooks());
        System.out.println(libraryDeepCopy.getBooks());

        //When
        library.getBooks().remove(book);

        System.out.println("");


        //Then
        System.out.println(library.getBooks());
        System.out.println(libraryShallowCopy.getBooks());
        System.out.println(libraryDeepCopy.getBooks());
        assertEquals(2, library.getBooks().size());
        assertEquals(2, libraryShallowCopy.getBooks().size());
        assertEquals(3, libraryDeepCopy.getBooks().size());
        assertEquals(library.getBooks(), libraryShallowCopy.getBooks());
        assertNotEquals(libraryDeepCopy.getBooks(), library.getBooks());





    }
}
