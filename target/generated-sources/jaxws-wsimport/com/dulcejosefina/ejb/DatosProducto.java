
package com.dulcejosefina.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadIngresada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadTotalActual" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCantidadIngresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngresoInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaUltimaCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaUltimaVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraccionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="precioUnitarioCompra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precioUnitarioVenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="primerCantidadInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosProducto", propOrder = {
    "cantidadIngresada",
    "cantidadTotalActual",
    "codigoBarra",
    "descripcion",
    "detalle",
    "fechaCantidadIngresada",
    "fechaIngresoInicial",
    "fechaUltimaActualizacion",
    "fechaUltimaCompra",
    "fechaUltimaVenta",
    "fechaVencimiento",
    "fraccionado",
    "id",
    "precioUnitarioCompra",
    "precioUnitarioVenta",
    "primerCantidadInicial"
})
public class DatosProducto {

    protected int cantidadIngresada;
    protected int cantidadTotalActual;
    protected String codigoBarra;
    protected String descripcion;
    protected String detalle;
    protected String fechaCantidadIngresada;
    protected String fechaIngresoInicial;
    protected String fechaUltimaActualizacion;
    protected String fechaUltimaCompra;
    protected String fechaUltimaVenta;
    protected String fechaVencimiento;
    protected int fraccionado;
    protected long id;
    protected double precioUnitarioCompra;
    protected double precioUnitarioVenta;
    protected int primerCantidadInicial;

    /**
     * Obtiene el valor de la propiedad cantidadIngresada.
     * 
     */
    public int getCantidadIngresada() {
        return cantidadIngresada;
    }

    /**
     * Define el valor de la propiedad cantidadIngresada.
     * 
     */
    public void setCantidadIngresada(int value) {
        this.cantidadIngresada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadTotalActual.
     * 
     */
    public int getCantidadTotalActual() {
        return cantidadTotalActual;
    }

    /**
     * Define el valor de la propiedad cantidadTotalActual.
     * 
     */
    public void setCantidadTotalActual(int value) {
        this.cantidadTotalActual = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarra() {
        return codigoBarra;
    }

    /**
     * Define el valor de la propiedad codigoBarra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarra(String value) {
        this.codigoBarra = value;
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
     * Obtiene el valor de la propiedad fechaCantidadIngresada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCantidadIngresada() {
        return fechaCantidadIngresada;
    }

    /**
     * Define el valor de la propiedad fechaCantidadIngresada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCantidadIngresada(String value) {
        this.fechaCantidadIngresada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngresoInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngresoInicial() {
        return fechaIngresoInicial;
    }

    /**
     * Define el valor de la propiedad fechaIngresoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngresoInicial(String value) {
        this.fechaIngresoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimaActualizacion(String value) {
        this.fechaUltimaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    /**
     * Define el valor de la propiedad fechaUltimaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimaCompra(String value) {
        this.fechaUltimaCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimaVenta() {
        return fechaUltimaVenta;
    }

    /**
     * Define el valor de la propiedad fechaUltimaVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimaVenta(String value) {
        this.fechaUltimaVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fraccionado.
     * 
     */
    public int getFraccionado() {
        return fraccionado;
    }

    /**
     * Define el valor de la propiedad fraccionado.
     * 
     */
    public void setFraccionado(int value) {
        this.fraccionado = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitarioCompra.
     * 
     */
    public double getPrecioUnitarioCompra() {
        return precioUnitarioCompra;
    }

    /**
     * Define el valor de la propiedad precioUnitarioCompra.
     * 
     */
    public void setPrecioUnitarioCompra(double value) {
        this.precioUnitarioCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitarioVenta.
     * 
     */
    public double getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    /**
     * Define el valor de la propiedad precioUnitarioVenta.
     * 
     */
    public void setPrecioUnitarioVenta(double value) {
        this.precioUnitarioVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad primerCantidadInicial.
     * 
     */
    public int getPrimerCantidadInicial() {
        return primerCantidadInicial;
    }

    /**
     * Define el valor de la propiedad primerCantidadInicial.
     * 
     */
    public void setPrimerCantidadInicial(int value) {
        this.primerCantidadInicial = value;
    }

}
