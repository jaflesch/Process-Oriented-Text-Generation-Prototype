
package org.omg.spec.bpmn._20100524.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tDataStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDataStore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataState" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="capacity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="isUnlimited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="itemSubjectRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDataStore", propOrder = {
    "dataState"
})
public class TDataStore
    extends TRootElement
{

    protected TDataState dataState;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "capacity")
    protected BigInteger capacity;
    @XmlAttribute(name = "isUnlimited")
    protected Boolean isUnlimited;
    @XmlAttribute(name = "itemSubjectRef")
    protected QName itemSubjectRef;

    /**
     * Gets the value of the dataState property.
     * 
     * @return
     *     possible object is
     *     {@link TDataState }
     *     
     */
    public TDataState getDataState() {
        return dataState;
    }

    /**
     * Sets the value of the dataState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataState }
     *     
     */
    public void setDataState(TDataState value) {
        this.dataState = value;
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
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapacity(BigInteger value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the isUnlimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsUnlimited() {
        if (isUnlimited == null) {
            return true;
        } else {
            return isUnlimited;
        }
    }

    /**
     * Sets the value of the isUnlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnlimited(Boolean value) {
        this.isUnlimited = value;
    }

    /**
     * Gets the value of the itemSubjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getItemSubjectRef() {
        return itemSubjectRef;
    }

    /**
     * Sets the value of the itemSubjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setItemSubjectRef(QName value) {
        this.itemSubjectRef = value;
    }

}
