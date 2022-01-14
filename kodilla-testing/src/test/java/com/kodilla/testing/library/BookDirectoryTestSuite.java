package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Nested
    @DisplayName("Testing listBooksWithCondition method")
    class TestListBookWithCondition{

        @Test
        void testListBookWithConditionsReturnList(){
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
            resultListOfBooks.add(book1);                                                    // [9]
            resultListOfBooks.add(book2);                                                    // [10]
            resultListOfBooks.add(book3);                                                    // [11]
            resultListOfBooks.add(book4);

            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            //When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            //Then
            assertEquals(4, theListOfBooks.size());

        }

        @Test
        void testListBooksWithConditionMoreThan20(){
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
            List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
            List<Book> resultListOf40Books = generateListOfNBooks(40);

            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

            //When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]

            //Then
            assertEquals(0, theListOfBooks0.size());                                         // [14]
            assertEquals(15, theListOfBooks15.size());                                       // [15]
            assertEquals(0, theListOfBooks40.size());

        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3(){
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            //When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            //Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

        }

    }

    @Nested
    @DisplayName("testing listBooksInHandsOf method")
    class TestListBooksInHandOf{

        @Test
        void testListBooksInHandOfReturnList(){

            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf1Books = generateListOfNBooks(1);
            List<Book> resultListOf5Books = generateListOfNBooks(5);

            LibraryUser libraryUser0Books = new LibraryUser("Stefan", "Matlak", "123456");
            LibraryUser libraryUser1Books = new LibraryUser("Gryczan", "Robson", "1235671");
            LibraryUser libraryUser5Books = new LibraryUser("Robar", "Karasuk", "89241521");


            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0Books)).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1Books)).thenReturn(resultListOf1Books);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5Books)).thenReturn(resultListOf5Books);

            //When
            List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser0Books);    // [11]
            List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser1Books);   // [12]
            List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser5Books);  // [13]

            //Then
            assertEquals(0, theListOfBooks0.size());                                         // [14]
            assertEquals(1, theListOfBooks1.size());                                       // [15]
            assertEquals(5, theListOfBooks5.size());

        }

    }


    public List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++){
            resultList.add(new Book("Title " + n, "Author " + n, 1970 + n));
        }
        return resultList;
    }
}
