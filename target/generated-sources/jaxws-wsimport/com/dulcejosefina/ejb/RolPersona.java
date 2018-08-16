
package com.dulcejosefina.ejb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolPersona.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="rolPersona">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADMINISTRADOR"/>
 *     &lt;enumeration value="INVITADO"/>
 *     &lt;enumeration value="OPERADOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rolPersona")
@XmlEnum
public enum RolPersona {

    ADMINISTRADOR,
    INVITADO,
    OPERADOR;

    public String value() {
        return name();
    }

    public static RolPersona fromValue(String v) {
        return valueOf(v);
    }

}
