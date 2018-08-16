
package com.dulcejosefina.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para sucursal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sucursal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaUltimaCompra" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaUltimaVenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presupuestoList" type="{http://ejb.dulcejosefina.com/}presupuesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productoList" type="{http://ejb.dulcejosefina.com/}producto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ventaSucursalList" type="{http://ejb.dulcejosefina.com/}ventaSucursal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sucursal", propOrder = {
    "descripcion",
    "fechaUltimaCompra",
    "fechaUltimaVenta",
    "id",
    "nombre",
    "presupuestoList",
    "productoList",
    "ventaSucursalList"
})
public class Sucursal {

    protected String descripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaCompra;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaVenta;
    protected Long id;
    protected String nombre;
    @XmlElement(nillable = true)
    protected List<Presupuesto> presupuestoList;
    @XmlElement(nillable = true)
    protected List<Producto> productoList;
    @XmlElement(nillable = true)
    protected List<VentaSucursal> ventaSucursalList;

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
     * Obtiene el valor de la propiedad fechaUltimaCompra.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    /**
     * Define el valor de la propiedad fechaUltimaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaCompra(XMLGregorianCalendar value) {
        this.fechaUltimaCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaVenta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaVenta() {
        return fechaUltimaVenta;
    }

    /**
     * Define el valor de la propiedad fechaUltimaVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaVenta(XMLGregorianCalendar value) {
        this.fechaUltimaVenta = value;
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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the presupuestoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presupuestoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresupuestoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Presupuesto }
     * 
     * 
     */
    public List<Presupuesto> getPresupuestoList() {
        if (presupuestoList == null) {
            presupuestoList = new ArrayList<Presupuesto>();
        }
        return this.presupuestoList;
    }

    /**
     * Gets the value of the productoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Producto }
     * 
     * 
     */
    public List<Producto> getProductoList() {
        if (productoList == null) {
            productoList = new ArrayList<Producto>();
        }
        return this.productoList;
    }

    /**
     * Gets the value of the ventaSucursalList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ventaSucursalList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVentaSucursalList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VentaSucursal }
     * 
     * 
     */
    public List<VentaSucursal> getVentaSucursalList() {
        if (ventaSucursalList == null) {
            ventaSucursalList = new ArrayList<VentaSucursal>();
        }
        return this.ventaSucursalList;
    }

}
