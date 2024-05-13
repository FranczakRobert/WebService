package com.springbootsoap.service;

import java.util.List;

public class Matrix {
    private int id;
    private int rowNumber;
    private boolean isCompleted;

    // if endofRow = false
    // and endOfArray = false
    // dodajmy do row.
    // isCompleted = false

    // if endofRow = true
    // and endOfArray = false
    // skaczemy na nastepny wiersz (rowNumber++)
    // isCompleted = false

    // if endofRow = true
    // and endOfArray = true
    // isCompleted = true

    public Matrix() {

    }
}
