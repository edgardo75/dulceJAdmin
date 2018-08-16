
package com.dulcejosefina.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para imagenProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="imagenProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="magnitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pathImagenEnDisco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productoFK" type="{http://ejb.dulcejosefina.com/}producto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagenProducto", propOrder = {
    "extension",
    "id",
    "magnitud",
    "nombreImagen",
    "pathImagenEnDisco",
    "productoFK"
})
public class ImagenProducto {

    protected String extension;
    protected Long id;
    protected String magnitud;
    protected String nombreImagen;
    protected String pathImagenEnDisco;
    protected Producto productoFK;

    /**
     * Obtiene el valor de la propiedad extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Define el valor de la propiedad extension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
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
     * Obtiene el valor de la propiedad magnitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagnitud() {
        return magnitud;
    }

    /**
     * Define el valor de la propiedad magnitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagnitud(String value) {
        this.magnitud = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreImagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreImagen() {
        return nombreImagen;
    }

    /**
     * Define el valor de la propiedad nombreImagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreImagen(String value) {
        this.nombreImagen = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImagenEnDisco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImagenEnDisco() {
        return pathImagenEnDisco;
    }

    /**
     * Define el valor de la propiedad pathImagenEnDisco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImagenEnDisco(String value) {
        this.pathImagenEnDisco = value;
    }

    /**
     * Obtiene el valor de la propiedad productoFK.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getProductoFK() {
        return productoFK;
    }

    /**
     * Define el valor de la propiedad productoFK.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setProductoFK(Producto value) {
        this.productoFK = value;
    }

}
