
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
 * <p>Clase Java para persona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientePerefencial" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="cuil" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="detalles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="fechaCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaUltimaCompraCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://ejb.dulcejosefina.com/}genero" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="keyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaPersonaTelefono" type="{http://ejb.dulcejosefina.com/}personaTelefono" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perefencial" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="perfil" type="{http://ejb.dulcejosefina.com/}perfilUsuario" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://ejb.dulcejosefina.com/}producto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="puntosClientePrefencial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://ejb.dulcejosefina.com/}rolPersona" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://ejb.dulcejosefina.com/}tipoDocumento" minOccurs="0"/>
 *         &lt;element name="tiposPersona" type="{http://ejb.dulcejosefina.com/}tipoPersona" minOccurs="0"/>
 *         &lt;element name="ventaSucursal" type="{http://ejb.dulcejosefina.com/}ventaSucursal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "apellido",
    "clientePerefencial",
    "cuil",
    "detalles",
    "dni",
    "email",
    "estado",
    "fechaCarga",
    "fechaUltimaCompraCliente",
    "genero",
    "id",
    "keyPassword",
    "listaPersonaTelefono",
    "login",
    "nombre",
    "password",
    "perefencial",
    "perfil",
    "producto",
    "puntosClientePrefencial",
    "rol",
    "tipoDocumento",
    "tiposPersona",
    "ventaSucursal"
})
public class Persona {

    protected String apellido;
    @XmlSchemaType(name = "unsignedShort")
    protected int clientePerefencial;
    protected long cuil;
    protected String detalles;
    protected long dni;
    protected String email;
    @XmlSchemaType(name = "unsignedShort")
    protected int estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaCompraCliente;
    protected Genero genero;
    protected Long id;
    protected String keyPassword;
    @XmlElement(nillable = true)
    protected List<PersonaTelefono> listaPersonaTelefono;
    protected String login;
    protected String nombre;
    protected String password;
    @XmlSchemaType(name = "unsignedShort")
    protected int perefencial;
    protected PerfilUsuario perfil;
    @XmlElement(nillable = true)
    protected List<Producto> producto;
    protected Integer puntosClientePrefencial;
    protected RolPersona rol;
    protected TipoDocumento tipoDocumento;
    protected TipoPersona tiposPersona;
    @XmlElement(nillable = true)
    protected List<VentaSucursal> ventaSucursal;

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
     * Obtiene el valor de la propiedad clientePerefencial.
     * 
     */
    public int getClientePerefencial() {
        return clientePerefencial;
    }

    /**
     * Define el valor de la propiedad clientePerefencial.
     * 
     */
    public void setClientePerefencial(int value) {
        this.clientePerefencial = value;
    }

    /**
     * Obtiene el valor de la propiedad cuil.
     * 
     */
    public long getCuil() {
        return cuil;
    }

    /**
     * Define el valor de la propiedad cuil.
     * 
     */
    public void setCuil(long value) {
        this.cuil = value;
    }

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalles(String value) {
        this.detalles = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     */
    public long getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     */
    public void setDni(long value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCarga() {
        return fechaCarga;
    }

    /**
     * Define el valor de la propiedad fechaCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCarga(XMLGregorianCalendar value) {
        this.fechaCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaCompraCliente.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaCompraCliente() {
        return fechaUltimaCompraCliente;
    }

    /**
     * Define el valor de la propiedad fechaUltimaCompraCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaCompraCliente(XMLGregorianCalendar value) {
        this.fechaUltimaCompraCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link Genero }
     *     
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link Genero }
     *     
     */
    public void setGenero(Genero value) {
        this.genero = value;
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
     * Obtiene el valor de la propiedad keyPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPassword() {
        return keyPassword;
    }

    /**
     * Define el valor de la propiedad keyPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPassword(String value) {
        this.keyPassword = value;
    }

    /**
     * Gets the value of the listaPersonaTelefono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPersonaTelefono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPersonaTelefono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonaTelefono }
     * 
     * 
     */
    public List<PersonaTelefono> getListaPersonaTelefono() {
        if (listaPersonaTelefono == null) {
            listaPersonaTelefono = new ArrayList<PersonaTelefono>();
        }
        return this.listaPersonaTelefono;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad perefencial.
     * 
     */
    public int getPerefencial() {
        return perefencial;
    }

    /**
     * Define el valor de la propiedad perefencial.
     * 
     */
    public void setPerefencial(int value) {
        this.perefencial = value;
    }

    /**
     * Obtiene el valor de la propiedad perfil.
     * 
     * @return
     *     possible object is
     *     {@link PerfilUsuario }
     *     
     */
    public PerfilUsuario getPerfil() {
        return perfil;
    }

    /**
     * Define el valor de la propiedad perfil.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilUsuario }
     *     
     */
    public void setPerfil(PerfilUsuario value) {
        this.perfil = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Producto }
     * 
     * 
     */
    public List<Producto> getProducto() {
        if (producto == null) {
            producto = new ArrayList<Producto>();
        }
        return this.producto;
    }

    /**
     * Obtiene el valor de la propiedad puntosClientePrefencial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuntosClientePrefencial() {
        return puntosClientePrefencial;
    }

    /**
     * Define el valor de la propiedad puntosClientePrefencial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuntosClientePrefencial(Integer value) {
        this.puntosClientePrefencial = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link RolPersona }
     *     
     */
    public RolPersona getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link RolPersona }
     *     
     */
    public void setRol(RolPersona value) {
        this.rol = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tiposPersona.
     * 
     * @return
     *     possible object is
     *     {@link TipoPersona }
     *     
     */
    public TipoPersona getTiposPersona() {
        return tiposPersona;
    }

    /**
     * Define el valor de la propiedad tiposPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPersona }
     *     
     */
    public void setTiposPersona(TipoPersona value) {
        this.tiposPersona = value;
    }

    /**
     * Gets the value of the ventaSucursal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ventaSucursal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVentaSucursal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VentaSucursal }
     * 
     * 
     */
    public List<VentaSucursal> getVentaSucursal() {
        if (ventaSucursal == null) {
            ventaSucursal = new ArrayList<VentaSucursal>();
        }
        return this.ventaSucursal;
    }

}
