//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.10 at 01:12:09 오후 KST 
//


package org.onem2m.xml.protocols;

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
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="App-ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AE-ID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="pointOfAccess" type="{http://www.onem2m.org/xml/protocols}poaList" minOccurs="0"/>
 *         &lt;element name="ontologyRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="nodeLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="requestReachability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "appName",
    "appID",
    "aeid",
    "pointOfAccess",
    "ontologyRef",
    "nodeLink",
    "requestReachability",
    "childResource",
    "containerOrGroupOrAccessControlPolicy"
})
@XmlRootElement(name = "AE")
public class AE
    extends AnnounceableResource
{

    protected String appName;
    @XmlElement(name = "App-ID", required = true)
    protected String appID;
    @XmlElement(name = "AE-ID", required = true)
    protected String aeid;
    @XmlList
    protected List<String> pointOfAccess;
    @XmlSchemaType(name = "anyURI")
    protected String ontologyRef;
    @XmlSchemaType(name = "anyURI")
    protected String nodeLink;
    protected boolean requestReachability;
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "schedule", namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class),
        @XmlElement(name = "group", namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "pollingChannel", namespace = "http://www.onem2m.org/xml/protocols", type = PollingChannel.class),
        @XmlElement(name = "accessControlPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
        @XmlElement(name = "container", namespace = "http://www.onem2m.org/xml/protocols", type = Container.class)
    })
    protected List<Resource> containerOrGroupOrAccessControlPolicy;

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the aeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEID() {
        return aeid;
    }

    /**
     * Sets the value of the aeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEID(String value) {
        this.aeid = value;
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
        if (pointOfAccess == null) {
            pointOfAccess = new ArrayList<String>();
        }
        return this.pointOfAccess;
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
     * Gets the value of the requestReachability property.
     * 
     */
    public boolean isRequestReachability() {
        return requestReachability;
    }

    /**
     * Sets the value of the requestReachability property.
     * 
     */
    public void setRequestReachability(boolean value) {
        this.requestReachability = value;
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
        if (childResource == null) {
            childResource = new ArrayList<ChildResourceRef>();
        }
        return this.childResource;
    }

    /**
     * Gets the value of the containerOrGroupOrAccessControlPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerOrGroupOrAccessControlPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerOrGroupOrAccessControlPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * {@link Group }
     * {@link Subscription }
     * {@link PollingChannel }
     * {@link AccessControlPolicy }
     * {@link Container }
     * 
     * 
     */
    public List<Resource> getContainerOrGroupOrAccessControlPolicy() {
        if (containerOrGroupOrAccessControlPolicy == null) {
            containerOrGroupOrAccessControlPolicy = new ArrayList<Resource>();
        }
        return this.containerOrGroupOrAccessControlPolicy;
    }

}
