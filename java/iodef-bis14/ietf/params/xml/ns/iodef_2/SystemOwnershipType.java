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
 * <p>Java class for system-ownership-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="system-ownership-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="organization"/&gt;
 *     &lt;enumeration value="personal"/&gt;
 *     &lt;enumeration value="partner"/&gt;
 *     &lt;enumeration value="customer"/&gt;
 *     &lt;enumeration value="no-relationship"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="ext-value"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "system-ownership-type")
@XmlEnum
public enum SystemOwnershipType {

    @XmlEnumValue("organization")
    ORGANIZATION("organization"),
    @XmlEnumValue("personal")
    PERSONAL("personal"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("no-relationship")
    NO_RELATIONSHIP("no-relationship"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ext-value")
    EXT_VALUE("ext-value");
    private final String value;

    SystemOwnershipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemOwnershipType fromValue(String v) {
        for (SystemOwnershipType c: SystemOwnershipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}