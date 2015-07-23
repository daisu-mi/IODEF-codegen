//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.23 at 09:39:40 PM JST 
//


package ietf.params.xml.ns.iodef_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}ContactName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}ContactTitle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}RegistryHandle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}PostalAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}Email" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}Telephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}Fax" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}Timezone" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-2.0}AdditionalData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="role" use="required" type="{urn:ietf:params:xml:ns:iodef-2.0}contact-role-type" /&gt;
 *       &lt;attribute name="ext-role" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" use="required" type="{urn:ietf:params:xml:ns:iodef-2.0}contact-type-type" /&gt;
 *       &lt;attribute name="ext-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="restriction" type="{urn:ietf:params:xml:ns:iodef-2.0}restriction-type" /&gt;
 *       &lt;attribute name="ext-restriction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contactName",
    "contactTitle",
    "description",
    "registryHandle",
    "postalAddress",
    "email",
    "telephone",
    "fax",
    "timezone",
    "contact",
    "additionalData"
})
@XmlRootElement(name = "Contact")
public class Contact {

    @XmlElement(name = "ContactName")
    protected List<MLStringType> contactName;
    @XmlElement(name = "ContactTitle")
    protected List<MLStringType> contactTitle;
    @XmlElement(name = "Description")
    protected List<MLStringType> description;
    @XmlElement(name = "RegistryHandle")
    protected List<RegistryHandle> registryHandle;
    @XmlElement(name = "PostalAddress")
    protected PostalAddress postalAddress;
    @XmlElement(name = "Email")
    protected List<ContactMeansType> email;
    @XmlElement(name = "Telephone")
    protected List<ContactMeansType> telephone;
    @XmlElement(name = "Fax")
    protected ContactMeansType fax;
    @XmlElement(name = "Timezone")
    protected String timezone;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlElement(name = "AdditionalData")
    protected List<ExtensionType> additionalData;
    @XmlAttribute(name = "role", required = true)
    protected ContactRoleType role;
    @XmlAttribute(name = "ext-role")
    protected String extRole;
    @XmlAttribute(name = "type", required = true)
    protected ContactTypeType type;
    @XmlAttribute(name = "ext-type")
    protected String extType;
    @XmlAttribute(name = "restriction")
    protected RestrictionType restriction;
    @XmlAttribute(name = "ext-restriction")
    protected String extRestriction;

    /**
     * Gets the value of the contactName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MLStringType }
     * 
     * 
     */
    public List<MLStringType> getContactName() {
        if (contactName == null) {
            contactName = new ArrayList<MLStringType>();
        }
        return this.contactName;
    }

    /**
     * Gets the value of the contactTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MLStringType }
     * 
     * 
     */
    public List<MLStringType> getContactTitle() {
        if (contactTitle == null) {
            contactTitle = new ArrayList<MLStringType>();
        }
        return this.contactTitle;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MLStringType }
     * 
     * 
     */
    public List<MLStringType> getDescription() {
        if (description == null) {
            description = new ArrayList<MLStringType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the registryHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryHandle }
     * 
     * 
     */
    public List<RegistryHandle> getRegistryHandle() {
        if (registryHandle == null) {
            registryHandle = new ArrayList<RegistryHandle>();
        }
        return this.registryHandle;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress }
     *     
     */
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress }
     *     
     */
    public void setPostalAddress(PostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMeansType }
     * 
     * 
     */
    public List<ContactMeansType> getEmail() {
        if (email == null) {
            email = new ArrayList<ContactMeansType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMeansType }
     * 
     * 
     */
    public List<ContactMeansType> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<ContactMeansType>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMeansType }
     *     
     */
    public ContactMeansType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMeansType }
     *     
     */
    public void setFax(ContactMeansType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<ExtensionType>();
        }
        return this.additionalData;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRoleType }
     *     
     */
    public ContactRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRoleType }
     *     
     */
    public void setRole(ContactRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the extRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtRole() {
        return extRole;
    }

    /**
     * Sets the value of the extRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtRole(String value) {
        this.extRole = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeType }
     *     
     */
    public ContactTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeType }
     *     
     */
    public void setType(ContactTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the extType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtType() {
        return extType;
    }

    /**
     * Sets the value of the extType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtType(String value) {
        this.extType = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestriction(RestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the extRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtRestriction() {
        return extRestriction;
    }

    /**
     * Sets the value of the extRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtRestriction(String value) {
        this.extRestriction = value;
    }

}