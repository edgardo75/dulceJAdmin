
package com.dulcejosefina.ejb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para pedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descuentoPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="detallePedidoList" type="{http://ejb.dulcejosefina.com/}detallePedido" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fechaVenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idUsuarioExpidioPedido" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="porcentajeDescuento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="porcentajeRecargo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="proveedorFK" type="{http://ejb.dulcejosefina.com/}proveedor" minOccurs="0"/>
 *         &lt;element name="recargoPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sucursalFK" type="{http://ejb.dulcejosefina.com/}sucursal" minOccurs="0"/>
 *         &lt;element name="totalAPagar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalDescuento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalGeneral" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalRecargo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedido", propOrder = {
    "cantidad",
    "descuentoPesos",
    "detallePedidoList",
    "fechaVenta",
    "id",
    "idUsuarioExpidioPedido",
    "porcentajeDescuento",
    "porcentajeRecargo",
    "proveedorFK",
    "recargoPesos",
    "sucursalFK",
    "totalAPagar",
    "totalDescuento",
    "totalGeneral",
    "totalRecargo"
})
public class Pedido {

    protected Integer cantidad;
    protected BigDecimal descuentoPesos;
    @XmlElement(nillable = true)
    protected List<DetallePedido> detallePedidoList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVenta;
    protected Long id;
    protected long idUsuarioExpidioPedido;
    protected BigDecimal porcentajeDescuento;
    protected BigDecimal porcentajeRecargo;
    protected Proveedor proveedorFK;
    protected BigDecimal recargoPesos;
    protected Sucursal sucursalFK;
    protected BigDecimal totalAPagar;
    protected BigDecimal totalDescuento;
    protected BigDecimal totalGeneral;
    protected BigDecimal totalRecargo;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

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
     * Gets the value of the detallePedidoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detallePedidoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetallePedidoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetallePedido }
     * 
     * 
     */
    public List<DetallePedido> getDetallePedidoList() {
        if (detallePedidoList == null) {
            detallePedidoList = new ArrayList<DetallePedido>();
        }
        return this.detallePedidoList;
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
     * Obtiene el valor de la propiedad idUsuarioExpidioPedido.
     * 
     */
    public long getIdUsuarioExpidioPedido() {
        return idUsuarioExpidioPedido;
    }

    /**
     * Define el valor de la propiedad idUsuarioExpidioPedido.
     * 
     */
    public void setIdUsuarioExpidioPedido(long value) {
        this.idUsuarioExpidioPedido = value;
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
     * Obtiene el valor de la propiedad proveedorFK.
     * 
     * @return
     *     possible object is
     *     {@link Proveedor }
     *     
     */
    public Proveedor getProveedorFK() {
        return proveedorFK;
    }

    /**
     * Define el valor de la propiedad proveedorFK.
     * 
     * @param value
     *     allowed object is
     *     {@link Proveedor }
     *     
     */
    public void setProveedorFK(Proveedor value) {
        this.proveedorFK = value;
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
     * Obtiene el valor de la propiedad sucursalFK.
     * 
     * @return
     *     possible object is
     *     {@link Sucursal }
     *     
     */
    public Sucursal getSucursalFK() {
        return sucursalFK;
    }

    /**
     * Define el valor de la propiedad sucursalFK.
     * 
     * @param value
     *     allowed object is
     *     {@link Sucursal }
     *     
     */
    public void setSucursalFK(Sucursal value) {
        this.sucursalFK = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAPagar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAPagar() {
        return totalAPagar;
    }

    /**
     * Define el valor de la propiedad totalAPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAPagar(BigDecimal value) {
        this.totalAPagar = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDescuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    /**
     * Define el valor de la propiedad totalDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDescuento(BigDecimal value) {
        this.totalDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGeneral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGeneral() {
        return totalGeneral;
    }

    /**
     * Define el valor de la propiedad totalGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGeneral(BigDecimal value) {
        this.totalGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRecargo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRecargo() {
        return totalRecargo;
    }

    /**
     * Define el valor de la propiedad totalRecargo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRecargo(BigDecimal value) {
        this.totalRecargo = value;
    }

}
