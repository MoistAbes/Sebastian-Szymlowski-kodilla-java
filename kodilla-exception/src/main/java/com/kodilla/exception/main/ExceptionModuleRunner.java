package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile("nie_ma_takiego_pliku.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.handleSecondChallangeException();
    }
}
