//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.23 at 09:39:40 PM JST 
//


package ietf.params.xml.ns.iodef_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for incident-purpose-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="incident-purpose-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="traceback"/&gt;
 *     &lt;enumeration value="mitigation"/&gt;
 *     &lt;enumeration value="reporting"/&gt;
 *     &lt;enumeration value="watch"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="ext-value"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "incident-purpose-type")
@XmlEnum
public enum IncidentPurposeType {

    @XmlEnumValue("traceback")
    TRACEBACK("traceback"),
    @XmlEnumValue("mitigation")
    MITIGATION("mitigation"),
    @XmlEnumValue("reporting")
    REPORTING("reporting"),
    @XmlEnumValue("watch")
    WATCH("watch"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("ext-value")
    EXT_VALUE("ext-value");
    private final String value;

    IncidentPurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncidentPurposeType fromValue(String v) {
        for (IncidentPurposeType c: IncidentPurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
