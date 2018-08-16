
package com.dulcejosefina.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para moduloUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="moduloUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nombreModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfilModulo" type="{http://ejb.dulcejosefina.com/}perfilUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moduloUsuario", propOrder = {
    "codigoModulo",
    "id",
    "nombreModulo",
    "perfilModulo"
})
public class ModuloUsuario {

    protected String codigoModulo;
    protected Long id;
    protected String nombreModulo;
    protected PerfilUsuario perfilModulo;

    /**
     * Obtiene el valor de la propiedad codigoModulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoModulo() {
        return codigoModulo;
    }

    /**
     * Define el valor de la propiedad codigoModulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoModulo(String value) {
        this.codigoModulo = value;
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
     * Obtiene el valor de la propiedad nombreModulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreModulo() {
        return nombreModulo;
    }

    /**
     * Define el valor de la propiedad nombreModulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreModulo(String value) {
        this.nombreModulo = value;
    }

    /**
     * Obtiene el valor de la propiedad perfilModulo.
     * 
     * @return
     *     possible object is
     *     {@link PerfilUsuario }
     *     
     */
    public PerfilUsuario getPerfilModulo() {
        return perfilModulo;
    }

    /**
     * Define el valor de la propiedad perfilModulo.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilUsuario }
     *     
     */
    public void setPerfilModulo(PerfilUsuario value) {
        this.perfilModulo = value;
    }

}
