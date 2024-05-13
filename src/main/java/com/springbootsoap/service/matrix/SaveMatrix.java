
package com.springbootsoap.service.matrix;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="endOfRow" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="endOfArray" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="array"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "matrixID",
    "endOfRow",
    "endOfArray",
    "array"
})
@XmlRootElement(name = "saveMatrix", namespace = "http://mojaprzestrzen.pl/matrix")
public class SaveMatrix {

    protected int matrixID;
    protected boolean endOfRow;
    protected boolean endOfArray;
    @XmlElement(required = true)
    protected SaveMatrix.Array array;

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

    /**
     * Gets the value of the endOfRow property.
     * 
     */
    public boolean isEndOfRow() {
        return endOfRow;
    }

    /**
     * Sets the value of the endOfRow property.
     * 
     */
    public void setEndOfRow(boolean value) {
        this.endOfRow = value;
    }

    /**
     * Gets the value of the endOfArray property.
     * 
     */
    public boolean isEndOfArray() {
        return endOfArray;
    }

    /**
     * Sets the value of the endOfArray property.
     * 
     */
    public void setEndOfArray(boolean value) {
        this.endOfArray = value;
    }

    /**
     * Gets the value of the array property.
     * 
     * @return
     *     possible object is
     *     {@link SaveMatrix.Array }
     *     
     */
    public SaveMatrix.Array getArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveMatrix.Array }
     *     
     */
    public void setArray(SaveMatrix.Array value) {
        this.array = value;
    }


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
     *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
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
        "item"
    })
    public static class Array {

        @XmlElement(type = Integer.class)
        protected List<Integer> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getItem() {
            if (item == null) {
                item = new ArrayList<Integer>();
            }
            return this.item;
        }

    }

}
