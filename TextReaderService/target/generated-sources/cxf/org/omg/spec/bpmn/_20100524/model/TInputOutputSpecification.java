
package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tInputOutputSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tInputOutputSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataInput" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutput" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}inputSet" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}outputSet" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInputOutputSpecification", propOrder = {
    "dataInput",
    "dataOutput",
    "inputSet",
    "outputSet"
})
public class TInputOutputSpecification
    extends TBaseElement
{

    protected List<TDataInput> dataInput;
    protected List<TDataOutput> dataOutput;
    @XmlElement(required = true)
    protected List<TInputSet> inputSet;
    @XmlElement(required = true)
    protected List<TOutputSet> outputSet;

    /**
     * Gets the value of the dataInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataInput }
     * 
     * 
     */
    public List<TDataInput> getDataInput() {
        if (dataInput == null) {
            dataInput = new ArrayList<TDataInput>();
        }
        return this.dataInput;
    }

    /**
     * Gets the value of the dataOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataOutput }
     * 
     * 
     */
    public List<TDataOutput> getDataOutput() {
        if (dataOutput == null) {
            dataOutput = new ArrayList<TDataOutput>();
        }
        return this.dataOutput;
    }

    /**
     * Gets the value of the inputSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInputSet }
     * 
     * 
     */
    public List<TInputSet> getInputSet() {
        if (inputSet == null) {
            inputSet = new ArrayList<TInputSet>();
        }
        return this.inputSet;
    }

    /**
     * Gets the value of the outputSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOutputSet }
     * 
     * 
     */
    public List<TOutputSet> getOutputSet() {
        if (outputSet == null) {
            outputSet = new ArrayList<TOutputSet>();
        }
        return this.outputSet;
    }

}
