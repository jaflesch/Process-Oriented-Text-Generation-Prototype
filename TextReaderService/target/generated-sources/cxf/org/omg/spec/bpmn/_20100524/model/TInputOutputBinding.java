
package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tInputOutputBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tInputOutputBinding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;attribute name="operationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="inputDataRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="outputDataRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInputOutputBinding")
public class TInputOutputBinding
    extends TBaseElement
{

    @XmlAttribute(name = "operationRef", required = true)
    protected QName operationRef;
    @XmlAttribute(name = "inputDataRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object inputDataRef;
    @XmlAttribute(name = "outputDataRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object outputDataRef;

    /**
     * Gets the value of the operationRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOperationRef() {
        return operationRef;
    }

    /**
     * Sets the value of the operationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOperationRef(QName value) {
        this.operationRef = value;
    }

    /**
     * Gets the value of the inputDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInputDataRef() {
        return inputDataRef;
    }

    /**
     * Sets the value of the inputDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInputDataRef(Object value) {
        this.inputDataRef = value;
    }

    /**
     * Gets the value of the outputDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOutputDataRef() {
        return outputDataRef;
    }

    /**
     * Sets the value of the outputDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOutputDataRef(Object value) {
        this.outputDataRef = value;
    }

}
