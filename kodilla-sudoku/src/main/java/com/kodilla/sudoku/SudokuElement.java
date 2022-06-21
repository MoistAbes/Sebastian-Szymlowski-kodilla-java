package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SudokuElement {

    public static int EMPTY = -1;

    private int value;
    private List<Integer> possibleValues;

    public SudokuElement() {
        this.value = EMPTY;
        possibleValues = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            possibleValues.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }
}
