package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book = new Book("autor1", "tytul1", 1998, "autor");
        Book book1 = new Book("autor2", "tytul2", 2021, "autor");
        Book book2 = new Book("autor3", "tytul3", 1890, "autor");
        Book book3 = new Book("autor4", "tytul4", 2002, "autor");
        Book book4 = new Book("autor5", "tytul5", 1995, "autor");
        Book book5 = new Book("autor6", "tytul6", 2011, "autor");
        Book book6 = new Book("autor7", "tytul7", 2012, "autor");


        Set<Book> bookSet = new HashSet<>();

        bookSet.add(book);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);


        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2002, result);


    }


}
