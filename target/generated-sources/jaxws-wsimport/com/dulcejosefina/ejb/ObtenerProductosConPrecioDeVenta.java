
package com.dulcejosefina.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductosConPrecioDeVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductosConPrecioDeVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ejb.dulcejosefina.com/}stringBuilder" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://ejb.dulcejosefina.com/}producto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://ejb.dulcejosefina.com/}ventaProducto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductosConPrecioDeVenta", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class ObtenerProductosConPrecioDeVenta {

    protected StringBuilder arg0;
    protected List<Producto> arg1;
    protected List<VentaProducto> arg2;
    protected int arg3;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link StringBuilder }
     *     
     */
    public StringBuilder getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link StringBuilder }
     *     
     */
    public void setArg0(StringBuilder value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Producto }
     * 
     * 
     */
    public List<Producto> getArg1() {
        if (arg1 == null) {
            arg1 = new ArrayList<Producto>();
        }
        return this.arg1;
    }

    /**
     * Gets the value of the arg2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VentaProducto }
     * 
     * 
     */
    public List<VentaProducto> getArg2() {
        if (arg2 == null) {
            arg2 = new ArrayList<VentaProducto>();
        }
        return this.arg2;
    }

    /**
     * Obtiene el valor de la propiedad arg3.
     * 
     */
    public int getArg3() {
        return arg3;
    }

    /**
     * Define el valor de la propiedad arg3.
     * 
     */
    public void setArg3(int value) {
        this.arg3 = value;
    }

}
