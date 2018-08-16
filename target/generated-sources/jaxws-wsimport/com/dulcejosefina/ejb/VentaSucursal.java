
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
 * <p>Clase Java para ventaSucursal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ventaSucursal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anulado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caja" type="{http://ejb.dulcejosefina.com/}cajaEntradaSalida" minOccurs="0"/>
 *         &lt;element name="cajaFK" type="{http://ejb.dulcejosefina.com/}cajaEntradaSalida" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descuentoPesos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fechaVenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="historicoVentaSucursal" type="{http://ejb.dulcejosefina.com/}historicoVentaSucursal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="horaVenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idUsuarioExpidioVenta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="listaDetalleVentaSucursal" type="{http://ejb.dulcejosefina.com/}detalleVentaSucursal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persona" type="{http://ejb.dulcejosefina.com/}persona" minOccurs="0"/>
 *         &lt;element name="porcentajeDescuento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="porcentajeRecargo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "ventaSucursal", propOrder = {
    "anulado",
    "apellido",
    "caja",
    "cajaFK",
    "cantidad",
    "descuentoPesos",
    "fechaVenta",
    "historicoVentaSucursal",
    "horaVenta",
    "id",
    "idUsuarioExpidioVenta",
    "listaDetalleVentaSucursal",
    "nombre",
    "persona",
    "porcentajeDescuento",
    "porcentajeRecargo",
    "recargoPesos",
    "sucursalFK",
    "totalAPagar",
    "totalDescuento",
    "totalGeneral",
    "totalRecargo"
})
public class VentaSucursal {

    protected int anulado;
    protected String apellido;
    protected CajaEntradaSalida caja;
    protected CajaEntradaSalida cajaFK;
    protected Integer cantidad;
    protected BigDecimal descuentoPesos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVenta;
    @XmlElement(nillable = true)
    protected List<HistoricoVentaSucursal> historicoVentaSucursal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horaVenta;
    protected Long id;
    protected long idUsuarioExpidioVenta;
    @XmlElement(nillable = true)
    protected List<DetalleVentaSucursal> listaDetalleVentaSucursal;
    protected String nombre;
    protected Persona persona;
    protected BigDecimal porcentajeDescuento;
    protected BigDecimal porcentajeRecargo;
    protected BigDecimal recargoPesos;
    protected Sucursal sucursalFK;
    protected BigDecimal totalAPagar;
    protected BigDecimal totalDescuento;
    protected BigDecimal totalGeneral;
    protected BigDecimal totalRecargo;

    /**
     * Obtiene el valor de la propiedad anulado.
     * 
     */
    public int getAnulado() {
        return anulado;
    }

    /**
     * Define el valor de la propiedad anulado.
     * 
     */
    public void setAnulado(int value) {
        this.anulado = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad caja.
     * 
     * @return
     *     possible object is
     *     {@link CajaEntradaSalida }
     *     
     */
    public CajaEntradaSalida getCaja() {
        return caja;
    }

    /**
     * Define el valor de la propiedad caja.
     * 
     * @param value
     *     allowed object is
     *     {@link CajaEntradaSalida }
     *     
     */
    public void setCaja(CajaEntradaSalida value) {
        this.caja = value;
    }

    /**
     * Obtiene el valor de la propiedad cajaFK.
     * 
     * @return
     *     possible object is
     *     {@link CajaEntradaSalida }
     *     
     */
    public CajaEntradaSalida getCajaFK() {
        return cajaFK;
    }

    /**
     * Define el valor de la propiedad cajaFK.
     * 
     * @param value
     *     allowed object is
     *     {@link CajaEntradaSalida }
     *     
     */
    public void setCajaFK(CajaEntradaSalida value) {
        this.cajaFK = value;
    }

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
     * Gets the value of the historicoVentaSucursal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicoVentaSucursal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricoVentaSucursal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricoVentaSucursal }
     * 
     * 
     */
    public List<HistoricoVentaSucursal> getHistoricoVentaSucursal() {
        if (historicoVentaSucursal == null) {
            historicoVentaSucursal = new ArrayList<HistoricoVentaSucursal>();
        }
        return this.historicoVentaSucursal;
    }

    /**
     * Obtiene el valor de la propiedad horaVenta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraVenta() {
        return horaVenta;
    }

    /**
     * Define el valor de la propiedad horaVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraVenta(XMLGregorianCalendar value) {
        this.horaVenta = value;
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
     * Obtiene el valor de la propiedad idUsuarioExpidioVenta.
     * 
     */
    public long getIdUsuarioExpidioVenta() {
        return idUsuarioExpidioVenta;
    }

    /**
     * Define el valor de la propiedad idUsuarioExpidioVenta.
     * 
     */
    public void setIdUsuarioExpidioVenta(long value) {
        this.idUsuarioExpidioVenta = value;
    }

    /**
     * Gets the value of the listaDetalleVentaSucursal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDetalleVentaSucursal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDetalleVentaSucursal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleVentaSucursal }
     * 
     * 
     */
    public List<DetalleVentaSucursal> getListaDetalleVentaSucursal() {
        if (listaDetalleVentaSucursal == null) {
            listaDetalleVentaSucursal = new ArrayList<DetalleVentaSucursal>();
        }
        return this.listaDetalleVentaSucursal;
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
     * Obtiene el valor de la propiedad persona.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Define el valor de la propiedad persona.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(Persona value) {
        this.persona = value;
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
