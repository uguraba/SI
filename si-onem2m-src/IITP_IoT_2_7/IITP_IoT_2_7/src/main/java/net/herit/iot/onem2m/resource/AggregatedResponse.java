//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:07:53 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.message.onem2m.OneM2mResponse;


/**
 * <p>Java class for aggregatedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aggregatedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.onem2m.org/xml/protocols}responsePrimitive" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aggregatedResponse", propOrder = {
	"resourceID",
	"responsePrimitive"
})
@XmlRootElement(name = Naming.AGGREGATEDRESPONSE_SN)
public class AggregatedResponse {
//	public final static String SCHEMA_LOCATION = "CDT-responsePrimitive-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-responsePrimitive-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-responsePrimitive-v2_7_0.xsd";
	
	@XmlElement(name = Naming.RESOURCEID_SN)
	@XmlSchemaType(name = "anyURI")
    protected String resourceID;		// added in CDT-2.7.0
	
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols", required = true)
    @XmlElement(name = Naming.RESPONSEPRIMITIVE_SN, namespace = "http://www.onem2m.org/xml/protocols", required = true)
    protected List<ResponsePrimitive> responsePrimitive;

    
    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceID(String value) {
        this.resourceID = value;
    }
    
    /**
     * Gets the value of the responsePrimitive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsePrimitive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsePrimitive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsePrimitive }
     * 
     * 
     */
    public List<ResponsePrimitive> getResponsePrimitive() {
//        if (responsePrimitive == null) {
//            responsePrimitive = new ArrayList<ResponsePrimitive>();
//        }
        return this.responsePrimitive;
    };

	public void addResponsePrimitive(ResponsePrimitive response) {

        if (responsePrimitive == null) {
            responsePrimitive = new ArrayList<ResponsePrimitive>();
        }
        responsePrimitive.add(response);
		
	}

}
