
package com.dulcejosefina.ejb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para genero.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="genero">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEMENINO"/>
 *     &lt;enumeration value="MASCULINO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "genero")
@XmlEnum
public enum Genero {

    FEMENINO,
    MASCULINO;

    public String value() {
        return name();
    }

    public static Genero fromValue(String v) {
        return valueOf(v);
    }

}
