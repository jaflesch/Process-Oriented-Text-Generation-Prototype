
package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tLane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tLane">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element name="partitionElement" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement" minOccurs="0"/>
 *         &lt;element name="flowNodeRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="childLaneSet" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tLaneSet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="partitionElementRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLane", propOrder = {
    "partitionElement",
    "flowNodeRef",
    "childLaneSet"
})
public class TLane
    extends TBaseElement
{

    protected TBaseElement partitionElement;
    @XmlElementRef(name = "flowNodeRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class)
    protected List<JAXBElement<Object>> flowNodeRef;
    protected TLaneSet childLaneSet;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "partitionElementRef")
    protected QName partitionElementRef;

    /**
     * Gets the value of the partitionElement property.
     * 
     * @return
     *     possible object is
     *     {@link TBaseElement }
     *     
     */
    public TBaseElement getPartitionElement() {
        return partitionElement;
    }

    /**
     * Sets the value of the partitionElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBaseElement }
     *     
     */
    public void setPartitionElement(TBaseElement value) {
        this.partitionElement = value;
    }

    /**
     * Gets the value of the flowNodeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowNodeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowNodeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFlowNodeRef() {
        if (flowNodeRef == null) {
            flowNodeRef = new ArrayList<JAXBElement<Object>>();
        }
        return this.flowNodeRef;
    }

    /**
     * Gets the value of the childLaneSet property.
     * 
     * @return
     *     possible object is
     *     {@link TLaneSet }
     *     
     */
    public TLaneSet getChildLaneSet() {
        return childLaneSet;
    }

    /**
     * Sets the value of the childLaneSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLaneSet }
     *     
     */
    public void setChildLaneSet(TLaneSet value) {
        this.childLaneSet = value;
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
     * Gets the value of the partitionElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPartitionElementRef() {
        return partitionElementRef;
    }

    /**
     * Sets the value of the partitionElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPartitionElementRef(QName value) {
        this.partitionElementRef = value;
    }

}
