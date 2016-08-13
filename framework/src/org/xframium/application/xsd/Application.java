//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.12 at 12:41:57 PM IST 
//


package org.xframium.application.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Application complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capability" type="{http://www.xframium.org/applicationRegistry}DeviceCapability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectCapability" type="{http://www.xframium.org/applicationRegistry}ObjectDeviceCapability" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appPackage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bundleId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iosInstall" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="androidInstall" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application", propOrder = {
    "capability",
    "objectCapability"
})
public class Application {

    protected List<DeviceCapability> capability;
    protected List<ObjectDeviceCapability> objectCapability;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "appPackage")
    protected String appPackage;
    @XmlAttribute(name = "bundleId")
    protected String bundleId;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "iosInstall")
    protected String iosInstall;
    @XmlAttribute(name = "androidInstall")
    protected String androidInstall;

    /**
     * Gets the value of the capability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceCapability }
     * 
     * 
     */
    public List<DeviceCapability> getCapability() {
        if (capability == null) {
            capability = new ArrayList<DeviceCapability>();
        }
        return this.capability;
    }

    /**
     * Gets the value of the objectCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectDeviceCapability }
     * 
     * 
     */
    public List<ObjectDeviceCapability> getObjectCapability() {
        if (objectCapability == null) {
            objectCapability = new ArrayList<ObjectDeviceCapability>();
        }
        return this.objectCapability;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the appPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPackage() {
        return appPackage;
    }

    /**
     * Sets the value of the appPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPackage(String value) {
        this.appPackage = value;
    }

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleId(String value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the iosInstall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIosInstall() {
        return iosInstall;
    }

    /**
     * Sets the value of the iosInstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIosInstall(String value) {
        this.iosInstall = value;
    }

    /**
     * Gets the value of the androidInstall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAndroidInstall() {
        return androidInstall;
    }

    /**
     * Sets the value of the androidInstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndroidInstall(String value) {
        this.androidInstall = value;
    }

}
