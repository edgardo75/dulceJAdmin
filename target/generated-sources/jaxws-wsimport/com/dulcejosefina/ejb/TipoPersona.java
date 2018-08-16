
package com.dulcejosefina.ejb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoPersona.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoPersona">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JEFE"/>
 *     &lt;enumeration value="EMPLEADO"/>
 *     &lt;enumeration value="CLIENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoPersona")
@XmlEnum
public enum TipoPersona {

    JEFE,
    EMPLEADO,
    CLIENTE;

    public String value() {
        return name();
    }

    public static TipoPersona fromValue(String v) {
        return valueOf(v);
    }

}
