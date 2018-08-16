
package com.dulcejosefina.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para perfilUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="perfilUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPerfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modulo" type="{http://ejb.dulcejosefina.com/}moduloUsuario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombrePerfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfilPersona" type="{http://ejb.dulcejosefina.com/}persona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "perfilUsuario", propOrder = {
    "codigoPerfil",
    "id",
    "modulo",
    "nombrePerfil",
    "perfilPersona"
})
public class PerfilUsuario {

    protected String codigoPerfil;
    protected Long id;
    @XmlElement(nillable = true)
    protected List<ModuloUsuario> modulo;
    protected String nombrePerfil;
    protected Persona perfilPersona;

    /**
     * Obtiene el valor de la propiedad codigoPerfil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    /**
     * Define el valor de la propiedad codigoPerfil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPerfil(String value) {
        this.codigoPerfil = value;
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
     * Gets the value of the modulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuloUsuario }
     * 
     * 
     */
    public List<ModuloUsuario> getModulo() {
        if (modulo == null) {
            modulo = new ArrayList<ModuloUsuario>();
        }
        return this.modulo;
    }

    /**
     * Obtiene el valor de la propiedad nombrePerfil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePerfil() {
        return nombrePerfil;
    }

    /**
     * Define el valor de la propiedad nombrePerfil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePerfil(String value) {
        this.nombrePerfil = value;
    }

    /**
     * Obtiene el valor de la propiedad perfilPersona.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPerfilPersona() {
        return perfilPersona;
    }

    /**
     * Define el valor de la propiedad perfilPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPerfilPersona(Persona value) {
        this.perfilPersona = value;
    }

}
