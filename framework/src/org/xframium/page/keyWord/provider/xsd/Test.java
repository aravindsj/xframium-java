//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.29 at 06:25:30 PM EST 
//


package org.xframium.page.keyWord.provider.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Test complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Test"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.xframium.org/testRegistry}Description" minOccurs="0"/&gt;
 *         &lt;element name="step" type="{http://www.xframium.org/testRegistry}Step" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dataDriver" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dataProvider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tagNames" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="linkId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="threshold" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="os" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="contentKeys" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="deviceTags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Test", propOrder = {
    "description",
    "step"
})
public class Test {

    protected Description description;
    @XmlElement(required = true)
    protected List<Step> step;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "dataDriver")
    protected String dataDriver;
    @XmlAttribute(name = "dataProvider")
    protected String dataProvider;
    @XmlAttribute(name = "tagNames")
    protected String tagNames;
    @XmlAttribute(name = "linkId")
    protected String linkId;
    @XmlAttribute(name = "timed")
    protected Boolean timed;
    @XmlAttribute(name = "threshold")
    protected Integer threshold;
    @XmlAttribute(name = "active")
    protected Boolean active;
    @XmlAttribute(name = "os")
    protected String os;
    @XmlAttribute(name = "contentKeys")
    protected String contentKeys;
    @XmlAttribute(name = "deviceTags")
    protected String deviceTags;
    @XmlAttribute(name = "count")
    protected Integer count;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Step }
     * 
     * 
     */
    public List<Step> getStep() {
        if (step == null) {
            step = new ArrayList<Step>();
        }
        return this.step;
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
     * Gets the value of the dataDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDriver() {
        return dataDriver;
    }

    /**
     * Sets the value of the dataDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDriver(String value) {
        this.dataDriver = value;
    }

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProvider(String value) {
        this.dataProvider = value;
    }

    /**
     * Gets the value of the tagNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagNames() {
        return tagNames;
    }

    /**
     * Sets the value of the tagNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagNames(String value) {
        this.tagNames = value;
    }

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the timed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTimed() {
        if (timed == null) {
            return false;
        } else {
            return timed;
        }
    }

    /**
     * Sets the value of the timed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimed(Boolean value) {
        this.timed = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getThreshold() {
        if (threshold == null) {
            return  0;
        } else {
            return threshold;
        }
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshold(Integer value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActive() {
        if (active == null) {
            return true;
        } else {
            return active;
        }
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the contentKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentKeys() {
        return contentKeys;
    }

    /**
     * Sets the value of the contentKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentKeys(String value) {
        this.contentKeys = value;
    }

    /**
     * Gets the value of the deviceTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTags() {
        return deviceTags;
    }

    /**
     * Sets the value of the deviceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTags(String value) {
        this.deviceTags = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
