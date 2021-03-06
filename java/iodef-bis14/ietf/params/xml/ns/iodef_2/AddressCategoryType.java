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
 * <p>Java class for address-category-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="address-category-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="asn"/&gt;
 *     &lt;enumeration value="atm"/&gt;
 *     &lt;enumeration value="e-mail"/&gt;
 *     &lt;enumeration value="mac"/&gt;
 *     &lt;enumeration value="ipv4-addr"/&gt;
 *     &lt;enumeration value="ipv4-net"/&gt;
 *     &lt;enumeration value="ipv4-net-mask"/&gt;
 *     &lt;enumeration value="ipv6-addr"/&gt;
 *     &lt;enumeration value="ipv6-net"/&gt;
 *     &lt;enumeration value="ipv6-net-mask"/&gt;
 *     &lt;enumeration value="site-uri"/&gt;
 *     &lt;enumeration value="ext-value"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "address-category-type")
@XmlEnum
public enum AddressCategoryType {

    @XmlEnumValue("asn")
    ASN("asn"),
    @XmlEnumValue("atm")
    ATM("atm"),
    @XmlEnumValue("e-mail")
    E_MAIL("e-mail"),
    @XmlEnumValue("mac")
    MAC("mac"),
    @XmlEnumValue("ipv4-addr")
    IPV_4_ADDR("ipv4-addr"),
    @XmlEnumValue("ipv4-net")
    IPV_4_NET("ipv4-net"),
    @XmlEnumValue("ipv4-net-mask")
    IPV_4_NET_MASK("ipv4-net-mask"),
    @XmlEnumValue("ipv6-addr")
    IPV_6_ADDR("ipv6-addr"),
    @XmlEnumValue("ipv6-net")
    IPV_6_NET("ipv6-net"),
    @XmlEnumValue("ipv6-net-mask")
    IPV_6_NET_MASK("ipv6-net-mask"),
    @XmlEnumValue("site-uri")
    SITE_URI("site-uri"),
    @XmlEnumValue("ext-value")
    EXT_VALUE("ext-value");
    private final String value;

    AddressCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressCategoryType fromValue(String v) {
        for (AddressCategoryType c: AddressCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
