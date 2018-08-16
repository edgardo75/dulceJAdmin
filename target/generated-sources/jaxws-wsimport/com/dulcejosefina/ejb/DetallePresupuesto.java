
package com.dulcejosefina.ejb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detallePresupuesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detallePresupuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPack" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idVentaProducto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nombrePack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="presentacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="presupuesto" type="{http://ejb.dulcejosefina.com/}presupuesto" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://ejb.dulcejosefina.com/}producto" minOccurs="0"/>
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detallePresupuesto", propOrder = {
    "cantidad",
    "codigo",
    "descripcion",
    "id",
    "idPack",
    "idVentaProducto",
    "nombrePack",
    "precio",
    "presentacion",
    "presupuesto",
    "producto",
    "subtotal"
})
public class DetallePresupuesto {

    protected int cantidad;
    protected String codigo;
    protected String descripcion;
    protected Long id;
    protected long idPack;
    protected long idVentaProducto;
    protected String nombrePack;
    protected double precio;
    protected int presentacion;
    protected Presupuesto presupuesto;
    protected Producto producto;
    protected BigDecimal subtotal;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
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
     * Obtiene el valor de la propiedad idPack.
     * 
     */
    public long getIdPack() {
        return idPack;
    }

    /**
     * Define el valor de la propiedad idPack.
     * 
     */
    public void setIdPack(long value) {
        this.idPack = value;
    }

    /**
     * Obtiene el valor de la propiedad idVentaProducto.
     * 
     */
    public long getIdVentaProducto() {
        return idVentaProducto;
    }

    /**
     * Define el valor de la propiedad idVentaProducto.
     * 
     */
    public void setIdVentaProducto(long value) {
        this.idVentaProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePack.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePack() {
        return nombrePack;
    }

    /**
     * Define el valor de la propiedad nombrePack.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePack(String value) {
        this.nombrePack = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad presentacion.
     * 
     */
    public int getPresentacion() {
        return presentacion;
    }

    /**
     * Define el valor de la propiedad presentacion.
     * 
     */
    public void setPresentacion(int value) {
        this.presentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad presupuesto.
     * 
     * @return
     *     possible object is
     *     {@link Presupuesto }
     *     
     */
    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    /**
     * Define el valor de la propiedad presupuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Presupuesto }
     *     
     */
    public void setPresupuesto(Presupuesto value) {
        this.presupuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setProducto(Producto value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubtotal(BigDecimal value) {
        this.subtotal = value;
    }

}
