//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:01:25 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="from" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="requestIdentifier" type="{http://www.onem2m.org/xml/protocols}requestID"/>
 *         &lt;element name="resourceType" type="{http://www.onem2m.org/xml/protocols}resourceType" minOccurs="0"/>
 *         // XSD-1.6.0 deleted. &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="primitiveContent" type="{http://www.onem2m.org/xml/protocols}primitiveContent" minOccurs="0"/>
 *         // XSD-1.6.0 added. &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="originatingTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="requestExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}abstimestamp" minOccurs="0"/>
 *         &lt;element name="resultExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}abstimestamp" minOccurs="0"/>
 *         &lt;element name="operationExecutionTime" type="{http://www.onem2m.org/xml/protocols}abstimestamp" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://www.onem2m.org/xml/protocols}responseTypeInfo" minOccurs="0"/>
 *         &lt;element name="resultPersistence" type="{http://www.w3.org/2001/XMLSchema}abstimestamp" minOccurs="0"/>
 *         &lt;element name="resultContent" type="{http://www.onem2m.org/xml/protocols}resultContent" minOccurs="0"/>
 *         &lt;element name="eventCategory" type="{http://www.onem2m.org/xml/protocols}eventCat" minOccurs="0"/>
 *         &lt;element name="deliveryAggregation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterCriteria" type="{http://www.onem2m.org/xml/protocols}filterCriteria" minOccurs="0"/>
 *         &lt;element name="discoveryResultType" type="{http://www.onem2m.org/xml/protocols}discResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operation",
    "to",
    "from",
    "requestIdentifier",
    "resourceType",
//    "name",
    "primitiveContent",
//    "role", // added. 1.6.0 but deleted in CDT-2.7.0
    "roleIDs",  // added in CDT-2.7.0
    "originatingTimestamp",
    "requestExpirationTimestamp",
    "resultExpirationTimestamp",
    "operationExecutionTime",
    "responseType",
    "resultPersistence",
    "resultContent",
    "eventCategory",
    "deliveryAggregation",
    "groupRequestIdentifier",
    "filterCriteria",
    "discoveryResultType",
    "tokens",			// added in CDT-2.7.0
    "tokenIDs",			// added in CDT-2.7.0
    "localTokenIDs",	// added in CDT-2.7.0
    "tokenReqIndicator"	// added in CDT-2.7.0
})
//@XmlRootElement(name = "requestPrimitive")
//@XmlRootElement(name = Naming.REQUESTPRIMITIVE_SN)
@XmlRootElement(name = Naming.REQUESTPRIMITIVE_SN)
public class RequestPrimitive {

//	public final static String SCHEMA_LOCATION = "CDT-requestPrimitive-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-requestPrimitive-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-requestPrimitive-v2_7_0.xsd";
	
    //@XmlElement(required = true)
    @XmlElement(name = Naming.OPERATION_SN, required = true)
    protected Integer operation;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.TO_SN, required = true)
    @XmlSchemaType(name = "anyURI")
    protected String to;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.FROM_SN, required = true)
    protected String from;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.REQUESTIDENTIFIER_SN, required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String requestIdentifier;
    @XmlElement(name = Naming.RESOURCETYPE_SN)
    protected Integer resourceType;
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "NCName")
//    @XmlElement(name = "nm")
//    protected String name;		// removed. XSD-1.6.0
    @XmlElement(name = Naming.PRIMITIVECONTENT_SN)
    protected PrimitiveContent primitiveContent;
    //@XmlElement(name = "rol")
    //protected Object role;			// added. XSD-1.6.0
    @XmlList
    @XmlElement(name = Naming.ROLEIDS_SN)
    protected List<String> roleIDs;
    @XmlElement(name = Naming.ORIGINATINGTIMESTAMP_SN)
    protected String originatingTimestamp;
    @XmlElement(name = Naming.REQUESTEXPIRATIONTIMESTAMP_SN)
    protected String requestExpirationTimestamp;
    @XmlElement(name = Naming.RESULTEXPIRATIONTIMESTAMP_SN)
    protected String resultExpirationTimestamp;
    @XmlElement(name = Naming.OPERATIONEXECUTIONTIME_SN)
    protected String operationExecutionTime;
    @XmlElement(name = Naming.RESPONSETYPE_SN)
    protected ResponseTypeInfo responseType;
    @XmlElement(name = Naming.RESULTPERSISTENCE_SN)
//  protected Duration resultPersistence;  : data type changed. Duration(1.2.0) -> absTimestamp(1.3.0)
    protected String resultPersistence;
    @XmlElement(name = Naming.RESULTCONTENT_SN)
    protected Integer resultContent;
    @XmlElement(name = Naming.EVENTCATEGORY_SN)
//    protected String eventCategory;
    protected Integer eventCategory;
    @XmlElement(name = Naming.DELIVERYAGGREGATION_SN)
    protected Boolean deliveryAggregation;
    @XmlElement(name = Naming.GROUPREQUESTIDENTIFIER_SN)
    protected String groupRequestIdentifier;
    @XmlElement(name = Naming.FILTERCRITERIA_SN)
    protected FilterCriteria filterCriteria;
    @XmlElement(name = Naming.DISCOVERYRESULTTYPE_SN)
    protected Integer discoveryResultType;
    @XmlElement(name = Naming.TOKENS_SN)
    protected String tokens;
    @XmlElement(name = Naming.TOKENIDS_SN)
    protected String tokenIDs;
    @XmlList
    @XmlElement(name = Naming.LOCALTOKENIDS_SN)
    protected List<String> localTokenIDs;
    @XmlElement(name = Naming.TOKENREQINDICATOR_SN)
    protected Boolean tokenReqIndicator;

    
	public String toString() {
		StringBuilder bld = new StringBuilder();
		
		bld.append("\n Operation=").append(operation).append("\n");
		bld.append(" To=").append(to).append("\n");
		bld.append(" From:").append(from).append("\n");
		bld.append(" RequestIdentifier:").append(requestIdentifier).append("\n");
		bld.append(" ResourceType:").append(resourceType).append("\n");
//		bld.append(" Name:").append(name).append("\n");
		bld.append(" OriginatingTimestamp:").append(originatingTimestamp).append("\n");
		bld.append(" RequestExpirationTimestamp:").append(requestExpirationTimestamp).append("\n");
		bld.append(" ResultExpirationTimestamp:").append(resultExpirationTimestamp).append("\n");
		bld.append(" OperationExecutionTime:").append(operationExecutionTime).append("\n");
		bld.append(" ResponseType:").append(responseType).append("\n");
		bld.append(" ResultPersistence:").append(resultPersistence).append("\n");
		bld.append(" ResultContent:").append(resultContent).append("\n");
		bld.append(" EventCategory:").append(eventCategory).append("\n");
		bld.append(" DeliveryAggregation:").append(deliveryAggregation).append("\n");
		bld.append(" GroupRequestIdentifier:").append(groupRequestIdentifier).append("\n");
		bld.append(" DiscoveryResultType:").append(discoveryResultType).append("\n");
		bld.append("\n");
		
		if(filterCriteria != null) {
			bld.append(filterCriteria.toString());
		}
		
		if(primitiveContent != null) {
			bld.append(" PrimitiveContent exist.").append("\n");
		}
		
		return bld.toString();
	}
    
    
    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperation(Integer value) {
        this.operation = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the requestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * Sets the value of the requestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdentifier(String value) {
        this.requestIdentifier = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResourceType(Integer value) {
        this.resourceType = value;
    }

//    /**
//     * Gets the value of the name property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * Sets the value of the name property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setName(String value) {
//        this.name = value;
//    }

    /**
     * Gets the value of the primitiveContent property.
     * 
     * @return
     *     possible object is
     *     {@link PrimitiveContent }
     *     
     */
    public PrimitiveContent getPrimitiveContent() {
        return primitiveContent;
    }

    /**
     * Sets the value of the primitiveContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimitiveContent }
     *     
     */
    public void setPrimitiveContent(PrimitiveContent value) {
        this.primitiveContent = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     *
    public Object getRole() {
        return role;
    }

    **
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     *
    public void setRole(Object value) {
        this.role = value;
    }
    */
    
    /**
     * Gets the value of the roleIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleIDs() {
     //   if (roleIDs == null) {
     //       roleIDs = new ArrayList<String>();
     //   }
        return this.roleIDs;
    }
    
    public void addRoleIDs(String id) {
    	if (roleIDs == null) {
    		roleIDs = new ArrayList<String>();
    	}
    	this.roleIDs.add(id);
    }
    
    /**
     * Gets the value of the originatingTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingTimestamp() {
        return originatingTimestamp;
    }

    /**
     * Sets the value of the originatingTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingTimestamp(String value) {
        this.originatingTimestamp = value;
    }

    /**
     * Gets the value of the requestExpirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestExpirationTimestamp() {
        return requestExpirationTimestamp;
    }

    /**
     * Sets the value of the requestExpirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestExpirationTimestamp(String value) {
        this.requestExpirationTimestamp = value;
    }

    /**
     * Gets the value of the resultExpirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultExpirationTimestamp() {
        return resultExpirationTimestamp;
    }

    /**
     * Sets the value of the resultExpirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultExpirationTimestamp(String value) {
        this.resultExpirationTimestamp = value;
    }

    /**
     * Gets the value of the operationExecutionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationExecutionTime() {
        return operationExecutionTime;
    }

    /**
     * Sets the value of the operationExecutionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationExecutionTime(String value) {
        this.operationExecutionTime = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTypeInfo }
     *     
     */
    public ResponseTypeInfo getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTypeInfo }
     *     
     */
    public void setResponseType(ResponseTypeInfo value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the resultPersistence property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
//    public Duration getResultPersistence() {
    public String getResultPersistence() {
        return resultPersistence;
    }

    /**
     * Sets the value of the resultPersistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
//    public void setResultPersistence(Duration value) {
    public void setResultPersistence(String value) {
        this.resultPersistence = value;
    }

    /**
     * Gets the value of the resultContent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultContent() {
        return resultContent;
    }

    /**
     * Sets the value of the resultContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultContent(Integer value) {
        this.resultContent = value;
    }

    /**
     * Gets the value of the eventCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
//    public String getEventCategory() {
//        return eventCategory;
//    }
	public Integer getEventCategory() {
		return eventCategory;
	}

    
    /**
     * Sets the value of the eventCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
//    public void setEventCategory(String value) {
//        this.eventCategory = value;
//    }
	public void setEventCategory(Integer value) {
		this.eventCategory = value;
	}
	
    /**
     * Gets the value of the deliveryAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryAggregation() {
        return deliveryAggregation == null ? Boolean.FALSE : deliveryAggregation;
    }

    /**
     * Sets the value of the deliveryAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryAggregation(Boolean value) {
        this.deliveryAggregation = value;
    }

    /**
     * Gets the value of the groupRequestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupRequestIdentifier() {
        return groupRequestIdentifier;
    }

    /**
     * Sets the value of the groupRequestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupRequestIdentifier(String value) {
        this.groupRequestIdentifier = value;
    }

    /**
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCriteria }
     *     
     */
    public FilterCriteria getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCriteria }
     *     
     */
    public void setFilterCriteria(FilterCriteria value) {
        this.filterCriteria = value;
    }

    /**
     * Gets the value of the discoveryResultType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscoveryResultType() {
        return discoveryResultType;
    }

    /**
     * Sets the value of the discoveryResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscoveryResultType(Integer value) {
        this.discoveryResultType = value;
    }
    
    /**
     * Gets the value of the tokens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokens() {
        return tokens;
    }

    /**
     * Sets the value of the tokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokens(String value) {
        this.tokens = value;
    }

    /**
     * Gets the value of the tokenIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenIDs() {
        return tokenIDs;
    }

    /**
     * Sets the value of the tokenIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenIDs(String value) {
        this.tokenIDs = value;
    }

    /**
     * Gets the value of the localTokenIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localTokenIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalTokenIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocalTokenIDs() {
     //   if (localTokenIDs == null) {
     //       localTokenIDs = new ArrayList<String>();
     //   }
        return this.localTokenIDs;
    }
    
    public void addLocalTokenIDs(String id) {
    	if (localTokenIDs == null) {
    		localTokenIDs = new ArrayList<String>();
    	}
    	this.localTokenIDs.add(id);
    }

    /**
     * Gets the value of the tokenReqIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTokenReqIndicator() {
        return tokenReqIndicator;
    }

    /**
     * Sets the value of the tokenReqIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTokenReqIndicator(Boolean value) {
        this.tokenReqIndicator = value;
    }
    
 // added in CDT-2.7.0
	public void validate(OPERATION operation) throws OneM2MException {
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
			
			if (this.operation == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operation is M on CREATE");		
			}
			if (this.to == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "to is M on CREATE");		
			}
			if (this.requestIdentifier == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "requestIdentifier is M on CREATE");		
			}
			if (this.resourceType == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "resourceType is M on CREATE");		
			}
			if (this.primitiveContent == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "primitiveContent is M on CREATE");		
			}
			if (this.filterCriteria != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "filterCriteria is NP on CREATE");		
			}
			if (this.discoveryResultType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "discoveryResultType is NP on CREATE");		
			}
			
		} else if (operation.equals(OPERATION.RETRIEVE)) {	// RETRIEVE 요청에 대한 데이터 유효성 체크
			
			if (this.operation == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operation is M on RETRIEVE");		
			}
			if (this.to == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "to is M on RETRIEVE");		
			}
			if (this.from == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "from is M on RETRIEVE");		
			}
			if (this.requestIdentifier == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "requestIdentifier is M on RETRIEVE");		
			}
			if (this.resourceType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "resourceType is NP on RETRIEVE");		
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크
			
			if (this.operation == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operation is M on UPDATE");		
			}
			if (this.to == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "to is M on UPDATE");		
			}
			if (this.from == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "from is M on UPDATE");		
			}
			if (this.requestIdentifier == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "requestIdentifier is M on UPDATE");		
			}
			if (this.resourceType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "resourceType is NP on UPDATE");		
			}
			if (this.primitiveContent == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "primitiveContent is M on UPDATE");		
			}
			if (this.discoveryResultType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "discoveryResultType is NP on UPDATE");		
			}
		
		} else if (operation.equals(OPERATION.DELETE)) {	// DELETE 요청에 대한 데이터 유효성 체크
			if (this.operation == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operation is M on DELETE");		
			}
			if (this.to == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "to is M on DELETE");		
			}
			if (this.from == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "from is M on DELETE");		
			}
			if (this.requestIdentifier == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "requestIdentifier is M on DELETE");		
			}
			if (this.resourceType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "resourceType is NP on DELETE");		
			}
			if (this.primitiveContent != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "primitiveContent is NP on DELETE");		
			}
			if (this.discoveryResultType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "discoveryResultType is NP on DELETE");		
			}
		} else if (operation.equals(OPERATION.NOTIFY)) {	// NOTIFY 요청에 대한 데이터 유효성 체크
			
			if (this.operation == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "operation is M on NOTIFY");		
			}
			if (this.to == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "to is M on NOTIFY");		
			}
			if (this.from == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "from is M on NOTIFY");		
			}
			if (this.requestIdentifier == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "requestIdentifier is M on NOTIFY");		
			}
			if (this.resourceType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "resourceType is NP on NOTIFY");		
			}
			if (this.primitiveContent == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "primitiveContent is M on NOTIFY");		
			}
			if (this.resultPersistence != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "resultPersistence is NP on NOTIFY");		
			}
			if (this.resultContent != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "resultContent is NP on NOTIFY");		
			}
			if (this.filterCriteria != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "filterCriteria is NP on NOTIFY");		
			}
			if (this.discoveryResultType != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "discoveryResultType is NP on NOTIFY");		
			}
			
		}
		
		
	}

}
