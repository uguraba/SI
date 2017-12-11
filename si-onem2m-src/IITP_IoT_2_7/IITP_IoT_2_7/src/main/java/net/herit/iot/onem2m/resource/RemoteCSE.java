//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:07 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mRequest.RESOURCE_TYPE;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="cseType" type="{http://www.onem2m.org/xml/protocols}cseTypeID" minOccurs="0"/>
 *         &lt;element name="pointOfAccess" type="{http://www.onem2m.org/xml/protocols}poaList" minOccurs="0"/>
 *         &lt;element name="CSEBase" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="CSE-ID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="M2M-Ext-ID" type="{http://www.onem2m.org/xml/protocols}externalID" minOccurs="0"/>
 *         &lt;element name="Trigger-Recipient-ID" type="{http://www.onem2m.org/xml/protocols}triggerRecipientID" minOccurs="0"/>
 *         &lt;element name="requestReachability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nodeLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}container"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}group"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}accessControlPolicy"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}pollingChannel"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}schedule"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cseType",
    "pointOfAccess",
    "cseBase",
    "cseid",
    "m2MExtID",
    "triggerRecipientID",
    "requestReachability",
    "nodeLink",
    "childResource",
  //  "containerOrGroupOrAccessControlPolicy"		deleted in CDT-2.7.0
    "nodeAnncOrContainerOrContainerAnnc"			// added in CDT-2.7.0
})
//@XmlRootElement(name = "remoteCSE")
@XmlRootElement(name = "csr")
public class RemoteCSE
    extends AnnounceableResource
{
//	public final static String SCHEMA_LOCATION = "CDT-remoteCSE-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-remoteCSE-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-remoteCSE-v2_7_0.xsd";
	
	@XmlElement(name = Naming.CSETYPE_SN)
	protected Integer cseType;
	@XmlElement(name = Naming.POINTOFACCESS_SN)
	@XmlList
	protected List<String> pointOfAccess;
	//@XmlElement(name = "CSEBase", required = true)
	@XmlElement(name = Naming.CSEBASE_SN)
	@XmlSchemaType(name = "anyURI")
	protected String cseBase;
	//@XmlElement(name = "CSE-ID", required = true)
	@XmlElement(name = Naming.CSEID_SN)
	protected String cseid;
	//@XmlElement(name = "M2M-Ext-ID")
	@XmlElement(name = Naming.M2MEXTID_SN)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String m2MExtID;
	//@XmlElement(name = "Trigger-Recipient-ID")
	@XmlElement(name = Naming.TRIGGERRECIPIENTID_SN)
	protected Long triggerRecipientID;
	@XmlElement(name = Naming.REQUESTREACHABILITY_SN)
	//protected boolean requestReachability;
	protected Boolean requestReachability;
	@XmlElement(name = Naming.NODELINK_SN)
	@XmlSchemaType(name = "anyURI")
	protected String nodeLink;
	@XmlElement(name = Naming.CHILDRESOURCE_SN)
	protected List<ChildResourceRef> childResource;
	@XmlElements({
        @XmlElement(name = "container", namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
        @XmlElement(name = "group", namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
        @XmlElement(name = "accessControlPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "pollingChannel", namespace = "http://www.onem2m.org/xml/protocols", type = PollingChannel.class),
        @XmlElement(name = "schedule", namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class),
        @XmlElement(name = "nodeAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = NodeAnnc.class),		// added in CDT-2.7.0
        @XmlElement(name = "containerAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = ContainerAnnc.class),		// added in CDT-2.7.0
        @XmlElement(name = "groupAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = GroupAnnc.class),
        @XmlElement(name = "accessControlPolicyAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicyAnnc.class),		// added in CDT-2.7.0
        @XmlElement(name = "timeSeries", namespace = "http://www.onem2m.org/xml/protocols", type = TimeSeries.class),		// added in CDT-2.7.0
        @XmlElement(name = "timeSeriesAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = TimeSeriesAnnc.class),		// added in CDT-2.7.0
        @XmlElement(name = "locationPolicyAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicyAnnc.class),		// added in CDT-2.7.0
        @XmlElement(name = "AEAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AEAnnc.class),		// added in CDT-2.7.0
        @XmlElement(name = "sg_flexContainerResource", namespace = "http://www.onem2m.org/xml/protocols", type = FlexContainerResource.class),		// added in CDT-2.7.0
        @XmlElement(name = "sg_announcedFlexContainerResource", namespace = "http://www.onem2m.org/xml/protocols", type = AnnouncedFlexContainerResource.class)		// added in CDT-2.7.0
    })
    //protected List<Resource> containerOrGroupOrAccessControlPolicy;	changed from containerOrGroupOrAccessControlPolicy to nodeAnncOrContainerOrContainerAnnc
	protected List<Object> nodeAnncOrContainerOrContainerAnnc;

	public RemoteCSE() {
		//this.resourceType = RESOURCE_TYPE.REMOTE_CSE.Value();
	}
	
    /**
     * Gets the value of the cseType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCseType() {
        return cseType;
    }

    /**
     * Sets the value of the cseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCseType(Integer value) {
        this.cseType = value;
    }

    /**
     * Gets the value of the pointOfAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPointOfAccess() {
//    	if (pointOfAccess == null) {
//    		pointOfAccess = new ArrayList<String>();
//        }
    	return this.pointOfAccess;
    }
    
    public void addPointOfAccess(String poa) {
   	    if (pointOfAccess == null) {
   	    	pointOfAccess = new ArrayList<String>();
   	    }
   	    this.pointOfAccess.add(poa);
    }

    /**
     * Gets the value of the cseBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSEBase() {
        return cseBase;
    }

    /**
     * Sets the value of the cseBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSEBase(String value) {
        this.cseBase = value;
    }

    /**
     * Gets the value of the cseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSEID() {
        return cseid;
    }

    /**
     * Sets the value of the cseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSEID(String value) {
        this.cseid = value;
    }

    /**
     * Gets the value of the m2MExtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM2MExtID() {
        return m2MExtID;
    }

    /**
     * Sets the value of the m2MExtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM2MExtID(String value) {
        this.m2MExtID = value;
    }

    /**
     * Gets the value of the triggerRecipientID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTriggerRecipientID() {
        return triggerRecipientID;
    }

    /**
     * Sets the value of the triggerRecipientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTriggerRecipientID(Long value) {
        this.triggerRecipientID = value;
    }

    /**
     * Gets the value of the requestReachability property.
     * 
     */
    public Boolean isRequestReachability() {
        return requestReachability;
    }

    /**
     * Sets the value of the requestReachability property.
     * 
     */
    public void setRequestReachability(Boolean value) {
        this.requestReachability = value;
    }

    /**
     * Gets the value of the nodeLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeLink() {
        return nodeLink;
    }

    /**
     * Sets the value of the nodeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeLink(String value) {
        this.nodeLink = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
//    	if (childResource == null) {
//    		childResource = new ArrayList<ChildResourceRef>();
//    	}
    	return this.childResource;
    }

    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(ch);
    }
    
    /**
     * Gets the value of the nodeAnncOrContainerOrContainerAnnc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeAnncOrContainerOrContainerAnnc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeAnncOrContainerOrContainerAnnc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Container }
     * {@link AccessControlPolicy }
     * {@link Subscription }
     * {@link Group }
     * {@link PollingChannel }
     * {@link Schedule }
     * 
     * 
     */
    public List<Object> getNodeAnncOrContainerOrContainerAnnc() {
//    	if (nodeAnncOrContainerOrContainerAnnc == null) {
//    		nodeAnncOrContainerOrContainerAnnc = new ArrayList<Resource>();
//    	}
    	return this.nodeAnncOrContainerOrContainerAnnc;
    }

    public void addNodeAnncOrContainerOrContainerAnnc(Object res) {
    	if (nodeAnncOrContainerOrContainerAnnc == null) {
    		nodeAnncOrContainerOrContainerAnnc = new ArrayList<Object>();
    	}
    	this.nodeAnncOrContainerOrContainerAnnc.add(res);
    }
    
    
    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			if (this.cseid == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'cseid' is M on CREATE operation");
			}
			if(this.cseid != null && !this.cseid.startsWith("/")) {
				//throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'cseid' should be SP-relative format starting with '/'");
				this.cseid = "/" + this.cseid;
			}
			if (this.cseBase == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'cseBase' is M on CREATE operation");				
			}
			if (this.requestReachability == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'requestReachability' is M on CREATE operation");					
			}
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.cseType != null) {  //blocked for interop test in 2016.05.10 but opened in 2016-10-17...
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'cseType' is NP on UPDATE operation");
			}
			if (this.cseBase != null) {  //blocked for interop test in 2016.05.10 but opened in 2016-10-17..
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'cseBase' is NP on UPDATE operation");
			}
			if (this.cseid != null) {  //blocked for interop test in 2016.05.10 but opened in 2016-10-17..
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'cseid' is NP on UPDATE operation");
			}
		} else if (operation.equals(OPERATION.RETRIEVE)) {
			
		}
	
		super.validate(operation);
		
	}
}
