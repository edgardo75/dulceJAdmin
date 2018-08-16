
package com.dulcejosefina.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para packProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="packProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compra" type="{http://ejb.dulcejosefina.com/}compraProducto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="porcentajedescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="venta" type="{http://ejb.dulcejosefina.com/}ventaProducto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packProducto", propOrder = {
    "compra",
    "descripcion",
    "id",
    "porcentajedescripcion",
    "venta"
})
public class PackProducto {

    @XmlElement(nillable = true)
    protected List<CompraProducto> compra;
    protected String descripcion;
    protected Long id;
    protected String porcentajedescripcion;
    @XmlElement(nillable = true)
    protected List<VentaProducto> venta;

    /**
     * Gets the value of the compra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompraProducto }
     * 
     * 
     */
    public List<CompraProducto> getCompra() {
        if (compra == null) {
            compra = new ArrayList<CompraProducto>();
        }
        return this.compra;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajedescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajedescripcion() {
        return porcentajedescripcion;
    }

    /**
     * Define el valor de la propiedad porcentajedescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajedescripcion(String value) {
        this.porcentajedescripcion = value;
    }

    /**
     * Gets the value of the venta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the venta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VentaProducto }
     * 
     * 
     */
    public List<VentaProducto> getVenta() {
        if (venta == null) {
            venta = new ArrayList<VentaProducto>();
        }
        return this.venta;
    }

}
