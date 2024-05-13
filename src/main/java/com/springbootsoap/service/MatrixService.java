package com.springbootsoap.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatrixService {
    private List<Matrix> matrixList;

    public Matrix getMatrixByID(int id) {
        return matrixList.get(id);
    }

    public void insertMatrix(Matrix matrix) {
        matrixList.add(matrix);
    }

}
