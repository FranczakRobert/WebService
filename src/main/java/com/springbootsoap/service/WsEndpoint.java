package com.springbootsoap.service;

import com.springbootsoap.service.matrix.GetResponse;
import com.springbootsoap.service.matrix.SaveMatrix;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class WsEndpoint {

    private final MatrixService matrixService;

    public WsEndpoint(MatrixService matrixService) {
        this.matrixService = matrixService;
    }

    @PayloadRoot(namespace = "http://mojaprzestrzen.pl/matrix", localPart = "saveMatrix")
    @ResponsePayload
    public void saveMatrix(@RequestPayload SaveMatrix saveMatrix) {
       saveMatrix.isEndOfArray();
       saveMatrix.isEndOfRow();
       saveMatrix.getArray();
       saveMatrix.getMatrixID();
       System.out.println(saveMatrix.getArray());




    }
}
