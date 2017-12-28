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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableSubordinateResource">
 *       &lt;sequence>
 *         &lt;element name="stateTag" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="contentInfo" type="{http://www.onem2m.org/xml/protocols}contentInfo" minOccurs="0"/>
 *         &lt;element name="contentSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="ontologyRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "stateTag",
    "creator",
    "contentInfo",
    "contentSize",
    "ontologyRef",
    "content",
    "childResource",		// added in CDT-2.7.0
    "semanticDescriptor"	// added in CDT-2.7.0
})
//@XmlRootElement(name = "contentInstance")
@XmlRootElement(name = Naming.CONTENTINSTANCE_SN)
public class ContentInstance
    extends AnnounceableSubordinateResource
{

//	public final static String SCHEMA_LOCATION = "CDT-contentInstance-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-contentInstance-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-contentInstance-v2_7_0.xsd";
	
	public static final String LATEST_SHORTNAME = "la";  
	public static final String OLDEST_SHORTNAME = "ol";  
	
	
    //@XmlElement(name = "st", required = true)
	@XmlElement(name = Naming.STATETAG_SN)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer stateTag;
    @XmlElement(name = Naming.CREATOR_SN)
    protected String creator;
    @XmlElement(name = Naming.CONTENTINFO_SN)
    protected String contentInfo;
    //@XmlElement(name = "cs", required = true)
    @XmlElement(name = Naming.CONTENTSIZE_SN)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer contentSize;
    @XmlElement(name = Naming.ONTOLOGYREF_SN)
    @XmlSchemaType(name = "anyURI")
    protected String ontologyRef;
    //@XmlElement(name = "con", required = true)
    @XmlElement(name = Naming.CONTENT_SN)
    protected String content;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;					// added in CDT-2.7.0
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    @XmlElement(name = Naming.SEMANTICDESCRIPTOR_SN, namespace = "http://www.onem2m.org/xml/protocols")
    protected List<SemanticDescriptor> semanticDescriptor;			// added in CDT-2.7.0
    
    //public ContentInstance() {
    //	this.setResourceType(RESOURCE_TYPE.CONTENT_INST.Value());
    //}

    /**
     * Gets the value of the stateTag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateTag() {
        return stateTag;
    }

    /**
     * Sets the value of the stateTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateTag(Integer value) {
        this.stateTag = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the contentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentInfo() {
        return contentInfo;
    }

    /**
     * Sets the value of the contentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentInfo(String value) {
        this.contentInfo = value;
    }

    /**
     * Gets the value of the contentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentSize() {
        return contentSize;
    }

    /**
     * Sets the value of the contentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentSize(Integer value) {
        this.contentSize = value;
    }

    /**
     * Gets the value of the ontologyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyRef() {
        return ontologyRef;
    }

    /**
     * Sets the value of the ontologyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyRef(String value) {
        this.ontologyRef = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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
      //  if (childResource == null) {
      //      childResource = new ArrayList<ChildResourceRef>();
      //  }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the semanticDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticDescriptor }
     * 
     * 
     */
    public List<SemanticDescriptor> getSemanticDescriptor() {
     //   if (semanticDescriptor == null) {
     //       semanticDescriptor = new ArrayList<SemanticDescriptor>();
     //   }
        return this.semanticDescriptor;
    }
    
    public void addSemanticDescriptor(SemanticDescriptor value) {
    	if (semanticDescriptor == null) {
    		semanticDescriptor = new ArrayList<SemanticDescriptor>();
    	}
    	this.semanticDescriptor.add(value);
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
		//	creator is Optional in CDT-2.7.0
		//	if (this.creator != null) {
		//		throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'creator' is NP on CREATE operation");
		//	}
			if (this.content == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'content' is M on CREATE operation");
			}
			// v1.0.1 - TBD
			//blocked in v1.0.1 but opened in 2016-10-17...
			if (this.contentSize != null) {	 
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'contentSize' is NP on CREATE operation");
			}
			if (this.stateTag != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'stateTag' is NP on CREATE operation");
			}
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			throw new OneM2MException(RESPONSE_STATUS.OPERATION_NOT_ALLOWED, "UPDATE operation not allowed for ContentInstance");
				
		}
	
		super.validate(operation);
		
	}
	
	public String toString() {
		return super.toString()+
				"[contentInstance]\r\n"+
				"creator:"+creator+"\r\n"+
				"contentInfo:"+contentInfo+"\r\n"+
				"contentSize:"+contentSize+"\r\n"+
				"ontologyRef:"+ontologyRef+"\r\n"+
				"content:"+content+"\r\n";
	}
}