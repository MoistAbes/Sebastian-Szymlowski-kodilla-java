package com.kodilla.sudoku;

import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> board;


    

    public List<SudokuRow> getBoard() {
        return board;
    }


    @Override
    public String toString() {
        String result = "";

        for (SudokuRow sudokuRow : board) {
            for (SudokuElement sudokuElement : sudokuRow.getRow()){
                result += " " + sudokuElement.getValue() + " ";
            }
            result += "\n";
        }

        return result;
    }
}
