
package com.dulcejosefina.ejb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para historicoVentaSucursal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="historicoVentaSucursal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descuentoPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fechaVenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="porcentajeDescuento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="porcentajeRecargo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="recargoPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalVenta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ventaSucursal" type="{http://ejb.dulcejosefina.com/}ventaSucursal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historicoVentaSucursal", propOrder = {
    "descuentoPesos",
    "fechaVenta",
    "id",
    "porcentajeDescuento",
    "porcentajeRecargo",
    "recargoPesos",
    "totalVenta",
    "ventaSucursal"
})
public class HistoricoVentaSucursal {

    protected BigDecimal descuentoPesos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVenta;
    protected Long id;
    protected BigDecimal porcentajeDescuento;
    protected BigDecimal porcentajeRecargo;
    protected BigDecimal recargoPesos;
    protected BigDecimal totalVenta;
    protected VentaSucursal ventaSucursal;

    /**
     * Obtiene el valor de la propiedad descuentoPesos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuentoPesos() {
        return descuentoPesos;
    }

    /**
     * Define el valor de la propiedad descuentoPesos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuentoPesos(BigDecimal value) {
        this.descuentoPesos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVenta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Define el valor de la propiedad fechaVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVenta(XMLGregorianCalendar value) {
        this.fechaVenta = value;
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
     * Obtiene el valor de la propiedad porcentajeDescuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Define el valor de la propiedad porcentajeDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeDescuento(BigDecimal value) {
        this.porcentajeDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeRecargo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    /**
     * Define el valor de la propiedad porcentajeRecargo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeRecargo(BigDecimal value) {
        this.porcentajeRecargo = value;
    }

    /**
     * Obtiene el valor de la propiedad recargoPesos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecargoPesos() {
        return recargoPesos;
    }

    /**
     * Define el valor de la propiedad recargoPesos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecargoPesos(BigDecimal value) {
        this.recargoPesos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalVenta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    /**
     * Define el valor de la propiedad totalVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVenta(BigDecimal value) {
        this.totalVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad ventaSucursal.
     * 
     * @return
     *     possible object is
     *     {@link VentaSucursal }
     *     
     */
    public VentaSucursal getVentaSucursal() {
        return ventaSucursal;
    }

    /**
     * Define el valor de la propiedad ventaSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link VentaSucursal }
     *     
     */
    public void setVentaSucursal(VentaSucursal value) {
        this.ventaSucursal = value;
    }

}
