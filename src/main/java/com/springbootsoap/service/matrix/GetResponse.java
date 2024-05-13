
package com.springbootsoap.service.matrix;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matrixID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matrixID"
})
@XmlRootElement(name = "getResponse", namespace = "http://mojaprzestrzen.pl/matrix")
public class GetResponse {

    protected int matrixID;

    /**
     * Gets the value of the matrixID property.
     * 
     */
    public int getMatrixID() {
        return matrixID;
    }

    /**
     * Sets the value of the matrixID property.
     * 
     */
    public void setMatrixID(int value) {
        this.matrixID = value;
    }

}
