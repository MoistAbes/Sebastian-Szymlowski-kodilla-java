package com.kodilla.kodillaspring.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class ReaderConfig {


    @Autowired
    @Qualifier("book1")
    Book book;

    @Bean
    public Reader getReader() {
        return new Reader(book);
    }

    @Bean(name = "book1")
    @Scope("prototype")
    public Book getBookOne() {
        return new Book("The book number one");
    }


    @Bean(name = "book2")
    @Scope("prototype")
    @Conditional(IfDayIsOddCondition.class)
    public Book getBookTwo() {
        return new Book("The book number two");
    }



     


}