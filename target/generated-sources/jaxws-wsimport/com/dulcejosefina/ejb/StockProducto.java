
package com.dulcejosefina.ejb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para stockProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="stockProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadActual" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadAgregada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="detalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaAgregadoProducto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="porcentajeCompra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="porcentajeVenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precioUnitarioCompra" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="precioUnitarioVenta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://ejb.dulcejosefina.com/}producto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stockProducto", propOrder = {
    "cantidadActual",
    "cantidadAgregada",
    "cantidadInicial",
    "detalle",
    "fechaAgregadoProducto",
    "id",
    "porcentajeCompra",
    "porcentajeVenta",
    "precioUnitarioCompra",
    "precioUnitarioVenta",
    "producto"
})
public class StockProducto {

    protected int cantidadActual;
    protected int cantidadAgregada;
    protected int cantidadInicial;
    protected String detalle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAgregadoProducto;
    protected Long id;
    protected double porcentajeCompra;
    protected double porcentajeVenta;
    protected BigDecimal precioUnitarioCompra;
    protected BigDecimal precioUnitarioVenta;
    protected Producto producto;

    /**
     * Obtiene el valor de la propiedad cantidadActual.
     * 
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Define el valor de la propiedad cantidadActual.
     * 
     */
    public void setCantidadActual(int value) {
        this.cantidadActual = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadAgregada.
     * 
     */
    public int getCantidadAgregada() {
        return cantidadAgregada;
    }

    /**
     * Define el valor de la propiedad cantidadAgregada.
     * 
     */
    public void setCantidadAgregada(int value) {
        this.cantidadAgregada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadInicial.
     * 
     */
    public int getCantidadInicial() {
        return cantidadInicial;
    }

    /**
     * Define el valor de la propiedad cantidadInicial.
     * 
     */
    public void setCantidadInicial(int value) {
        this.cantidadInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalle(String value) {
        this.detalle = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAgregadoProducto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAgregadoProducto() {
        return fechaAgregadoProducto;
    }

    /**
     * Define el valor de la propiedad fechaAgregadoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAgregadoProducto(XMLGregorianCalendar value) {
        this.fechaAgregadoProducto = value;
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
     * Obtiene el valor de la propiedad porcentajeCompra.
     * 
     */
    public double getPorcentajeCompra() {
        return porcentajeCompra;
    }

    /**
     * Define el valor de la propiedad porcentajeCompra.
     * 
     */
    public void setPorcentajeCompra(double value) {
        this.porcentajeCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeVenta.
     * 
     */
    public double getPorcentajeVenta() {
        return porcentajeVenta;
    }

    /**
     * Define el valor de la propiedad porcentajeVenta.
     * 
     */
    public void setPorcentajeVenta(double value) {
        this.porcentajeVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitarioCompra.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioUnitarioCompra() {
        return precioUnitarioCompra;
    }

    /**
     * Define el valor de la propiedad precioUnitarioCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioUnitarioCompra(BigDecimal value) {
        this.precioUnitarioCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitarioVenta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    /**
     * Define el valor de la propiedad precioUnitarioVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioUnitarioVenta(BigDecimal value) {
        this.precioUnitarioVenta = value;
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

}
