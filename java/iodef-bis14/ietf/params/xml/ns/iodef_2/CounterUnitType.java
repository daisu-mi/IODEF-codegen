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
 * <p>Java class for counter-unit-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="counter-unit-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="byte"/&gt;
 *     &lt;enumeration value="mbit"/&gt;
 *     &lt;enumeration value="packet"/&gt;
 *     &lt;enumeration value="flow"/&gt;
 *     &lt;enumeration value="session"/&gt;
 *     &lt;enumeration value="event"/&gt;
 *     &lt;enumeration value="alert"/&gt;
 *     &lt;enumeration value="message"/&gt;
 *     &lt;enumeration value="host"/&gt;
 *     &lt;enumeration value="site"/&gt;
 *     &lt;enumeration value="organization"/&gt;
 *     &lt;enumeration value="ext-value"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "counter-unit-type")
@XmlEnum
public enum CounterUnitType {

    @XmlEnumValue("byte")
    BYTE("byte"),
    @XmlEnumValue("mbit")
    MBIT("mbit"),
    @XmlEnumValue("packet")
    PACKET("packet"),
    @XmlEnumValue("flow")
    FLOW("flow"),
    @XmlEnumValue("session")
    SESSION("session"),
    @XmlEnumValue("event")
    EVENT("event"),
    @XmlEnumValue("alert")
    ALERT("alert"),
    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("host")
    HOST("host"),
    @XmlEnumValue("site")
    SITE("site"),
    @XmlEnumValue("organization")
    ORGANIZATION("organization"),
    @XmlEnumValue("ext-value")
    EXT_VALUE("ext-value");
    private final String value;

    CounterUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CounterUnitType fromValue(String v) {
        for (CounterUnitType c: CounterUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
