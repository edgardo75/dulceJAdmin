
package com.dulcejosefina.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarProductoDeUnaVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarProductoDeUnaVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarProductoDeUnaVenta", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class EliminarProductoDeUnaVenta {

    protected long arg0;
    protected long arg1;
    protected long arg2;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     */
    public long getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     */
    public void setArg0(long value) {
        this.arg0 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg1.
     * 
     */
    public long getArg1() {
        return arg1;
    }

    /**
     * Define el valor de la propiedad arg1.
     * 
     */
    public void setArg1(long value) {
        this.arg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg2.
     * 
     */
    public long getArg2() {
        return arg2;
    }

    /**
     * Define el valor de la propiedad arg2.
     * 
     */
    public void setArg2(long value) {
        this.arg2 = value;
    }

}
