
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
 * <p>Clase Java para producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="producto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadIngresada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadTotalActual" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compra" type="{http://ejb.dulcejosefina.com/}compraProducto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detallepresupuestosList" type="{http://ejb.dulcejosefina.com/}detallePresupuesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fechaCantidadIngresada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaIngresoInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaUltimaCompra" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaUltimaVenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaUltimoIngreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fraccionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imagenProductoList" type="{http://ejb.dulcejosefina.com/}imagenProducto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaDetalleVentaSucursal" type="{http://ejb.dulcejosefina.com/}detalleVentaSucursal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personaFK" type="{http://ejb.dulcejosefina.com/}persona" minOccurs="0"/>
 *         &lt;element name="porcentajeCompra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="porcentajeVenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precioUnitarioCompra" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="precioUnitarioVenta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="proveedorFK" type="{http://ejb.dulcejosefina.com/}proveedor" minOccurs="0"/>
 *         &lt;element name="stockProductoList" type="{http://ejb.dulcejosefina.com/}stockProducto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sucursalFK" type="{http://ejb.dulcejosefina.com/}sucursal" minOccurs="0"/>
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
@XmlType(name = "producto", propOrder = {
    "cantidadIngresada",
    "cantidadInicial",
    "cantidadTotalActual",
    "codigoBarra",
    "compra",
    "descripcion",
    "detalleCompra",
    "detalleProducto",
    "detalleVenta",
    "detallepresupuestosList",
    "fechaCantidadIngresada",
    "fechaIngresoInicial",
    "fechaUltimaActualizacion",
    "fechaUltimaCompra",
    "fechaUltimaVenta",
    "fechaUltimoIngreso",
    "fechaVencimiento",
    "fraccionado",
    "id",
    "imagenProductoList",
    "listaDetalleVentaSucursal",
    "personaFK",
    "porcentajeCompra",
    "porcentajeVenta",
    "precioUnitarioCompra",
    "precioUnitarioVenta",
    "proveedorFK",
    "stockProductoList",
    "sucursalFK",
    "venta"
})
public class Producto {

    protected int cantidadIngresada;
    protected int cantidadInicial;
    protected int cantidadTotalActual;
    protected String codigoBarra;
    @XmlElement(nillable = true)
    protected List<CompraProducto> compra;
    protected String descripcion;
    protected String detalleCompra;
    protected String detalleProducto;
    protected String detalleVenta;
    @XmlElement(nillable = true)
    protected List<DetallePresupuesto> detallepresupuestosList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCantidadIngresada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngresoInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaActualizacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaCompra;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaVenta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimoIngreso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimiento;
    protected int fraccionado;
    protected Long id;
    @XmlElement(nillable = true)
    protected List<ImagenProducto> imagenProductoList;
    @XmlElement(nillable = true)
    protected List<DetalleVentaSucursal> listaDetalleVentaSucursal;
    protected Persona personaFK;
    protected double porcentajeCompra;
    protected double porcentajeVenta;
    protected BigDecimal precioUnitarioCompra;
    protected BigDecimal precioUnitarioVenta;
    protected Proveedor proveedorFK;
    @XmlElement(nillable = true)
    protected List<StockProducto> stockProductoList;
    protected Sucursal sucursalFK;
    @XmlElement(nillable = true)
    protected List<VentaProducto> venta;

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
     * Obtiene el valor de la propiedad detalleCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleCompra() {
        return detalleCompra;
    }

    /**
     * Define el valor de la propiedad detalleCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleCompra(String value) {
        this.detalleCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleProducto() {
        return detalleProducto;
    }

    /**
     * Define el valor de la propiedad detalleProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleProducto(String value) {
        this.detalleProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleVenta() {
        return detalleVenta;
    }

    /**
     * Define el valor de la propiedad detalleVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleVenta(String value) {
        this.detalleVenta = value;
    }

    /**
     * Gets the value of the detallepresupuestosList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detallepresupuestosList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetallepresupuestosList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetallePresupuesto }
     * 
     * 
     */
    public List<DetallePresupuesto> getDetallepresupuestosList() {
        if (detallepresupuestosList == null) {
            detallepresupuestosList = new ArrayList<DetallePresupuesto>();
        }
        return this.detallepresupuestosList;
    }

    /**
     * Obtiene el valor de la propiedad fechaCantidadIngresada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCantidadIngresada() {
        return fechaCantidadIngresada;
    }

    /**
     * Define el valor de la propiedad fechaCantidadIngresada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCantidadIngresada(XMLGregorianCalendar value) {
        this.fechaCantidadIngresada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngresoInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngresoInicial() {
        return fechaIngresoInicial;
    }

    /**
     * Define el valor de la propiedad fechaIngresoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngresoInicial(XMLGregorianCalendar value) {
        this.fechaIngresoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacion(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacion = value;
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
     * Obtiene el valor de la propiedad fechaUltimoIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimoIngreso() {
        return fechaUltimoIngreso;
    }

    /**
     * Define el valor de la propiedad fechaUltimoIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimoIngreso(XMLGregorianCalendar value) {
        this.fechaUltimoIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimiento(XMLGregorianCalendar value) {
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
     * Gets the value of the imagenProductoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagenProductoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagenProductoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagenProducto }
     * 
     * 
     */
    public List<ImagenProducto> getImagenProductoList() {
        if (imagenProductoList == null) {
            imagenProductoList = new ArrayList<ImagenProducto>();
        }
        return this.imagenProductoList;
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
     * Obtiene el valor de la propiedad personaFK.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersonaFK() {
        return personaFK;
    }

    /**
     * Define el valor de la propiedad personaFK.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersonaFK(Persona value) {
        this.personaFK = value;
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
     * Gets the value of the stockProductoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockProductoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockProductoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockProducto }
     * 
     * 
     */
    public List<StockProducto> getStockProductoList() {
        if (stockProductoList == null) {
            stockProductoList = new ArrayList<StockProducto>();
        }
        return this.stockProductoList;
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
