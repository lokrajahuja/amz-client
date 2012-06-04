package com.amazonaws.mws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeedSubmissionIdList" type="{http://mws.amazonaws.com/doc/2009-01-01/}IdList" minOccurs="0"/>
 *         &lt;element name="MaxCount" type="{http://mws.amazonaws.com/doc/2009-01-01/}Count" minOccurs="0"/>
 *         &lt;element name="FeedTypeList" type="{http://mws.amazonaws.com/doc/2009-01-01/}TypeList" minOccurs="0"/>
 *         &lt;element name="FeedProcessingStatusList" type="{http://mws.amazonaws.com/doc/2009-01-01/}StatusList" minOccurs="0"/>
 *         &lt;element name="SubmittedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubmittedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Wed Feb 18 13:28:59 PST 2009
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marketplace",
    "merchant",
    "feedSubmissionIdList",
    "maxCount",
    "feedTypeList",
    "feedProcessingStatusList",
    "submittedFromDate",
    "submittedToDate"
})
@XmlRootElement(name = "GetFeedSubmissionListRequest")
public class GetFeedSubmissionListRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "FeedSubmissionIdList")
    protected IdList feedSubmissionIdList;
    @XmlElement(name = "MaxCount")
    protected Integer maxCount;
    @XmlElement(name = "FeedTypeList")
    protected TypeList feedTypeList;
    @XmlElement(name = "FeedProcessingStatusList")
    protected StatusList feedProcessingStatusList;
    @XmlElement(name = "SubmittedFromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedFromDate;
    @XmlElement(name = "SubmittedToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedToDate;

    /**
     * Default constructor
     * 
     */
    public GetFeedSubmissionListRequest() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public GetFeedSubmissionListRequest(final String marketplace, final String merchant, final IdList feedSubmissionIdList, final Integer maxCount, final TypeList feedTypeList, final StatusList feedProcessingStatusList, final XMLGregorianCalendar submittedFromDate, final XMLGregorianCalendar submittedToDate) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.feedSubmissionIdList = feedSubmissionIdList;
        this.maxCount = maxCount;
        this.feedTypeList = feedTypeList;
        this.feedProcessingStatusList = feedProcessingStatusList;
        this.submittedFromDate = submittedFromDate;
        this.submittedToDate = submittedToDate;
    }

    /**
     * Gets the value of the marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Sets the value of the marketplace property.
     * 
     * @deprecated Not used anymore.  MWS ignores this parameter, but it is left
     * in here for backwards compatibility.
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplace(String value) {
        this.marketplace = value;
    }

    /**
     * @deprecated  See {@link #setMarketplace(String)}
     */
    public boolean isSetMarketplace() {
        return (this.marketplace!= null);
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    public boolean isSetMerchant() {
        return (this.merchant!= null);
    }

    /**
     * Gets the value of the feedSubmissionIdList property.
     * 
     * @return
     *     possible object is
     *     {@link IdList }
     *     
     */
    public IdList getFeedSubmissionIdList() {
        return feedSubmissionIdList;
    }

    /**
     * Sets the value of the feedSubmissionIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdList }
     *     
     */
    public void setFeedSubmissionIdList(IdList value) {
        this.feedSubmissionIdList = value;
    }

    public boolean isSetFeedSubmissionIdList() {
        return (this.feedSubmissionIdList!= null);
    }

    /**
     * Gets the value of the maxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCount(Integer value) {
        this.maxCount = value;
    }

    public boolean isSetMaxCount() {
        return (this.maxCount!= null);
    }

    /**
     * Gets the value of the feedTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link TypeList }
     *     
     */
    public TypeList getFeedTypeList() {
        return feedTypeList;
    }

    /**
     * Sets the value of the feedTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeList }
     *     
     */
    public void setFeedTypeList(TypeList value) {
        this.feedTypeList = value;
    }

    public boolean isSetFeedTypeList() {
        return (this.feedTypeList!= null);
    }

    /**
     * Gets the value of the feedProcessingStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link StatusList }
     *     
     */
    public StatusList getFeedProcessingStatusList() {
        return feedProcessingStatusList;
    }

    /**
     * Sets the value of the feedProcessingStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusList }
     *     
     */
    public void setFeedProcessingStatusList(StatusList value) {
        this.feedProcessingStatusList = value;
    }

    public boolean isSetFeedProcessingStatusList() {
        return (this.feedProcessingStatusList!= null);
    }

    /**
     * Gets the value of the submittedFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedFromDate() {
        return submittedFromDate;
    }

    /**
     * Sets the value of the submittedFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setSubmittedFromDate(XMLGregorianCalendar value) {
        this.submittedFromDate = value;
    }

    public boolean isSetSubmittedFromDate() {
        return (this.submittedFromDate!= null);
    }

    /**
     * Gets the value of the submittedToDate property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedToDate() {
        return submittedToDate;
    }

    /**
     * Sets the value of the submittedToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setSubmittedToDate(XMLGregorianCalendar value) {
        this.submittedToDate = value;
    }

    public boolean isSetSubmittedToDate() {
        return (this.submittedToDate!= null);
    }

    /**
     * Sets the value of the Marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }

    /**
     * Sets the value of the Merchant property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withMerchant(String value) {
        setMerchant(value);
        return this;
    }

    /**
     * Sets the value of the FeedSubmissionIdList property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withFeedSubmissionIdList(IdList value) {
        setFeedSubmissionIdList(value);
        return this;
    }

    /**
     * Sets the value of the MaxCount property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withMaxCount(Integer value) {
        setMaxCount(value);
        return this;
    }

    /**
     * Sets the value of the FeedTypeList property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withFeedTypeList(TypeList value) {
        setFeedTypeList(value);
        return this;
    }

    /**
     * Sets the value of the FeedProcessingStatusList property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withFeedProcessingStatusList(StatusList value) {
        setFeedProcessingStatusList(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedFromDate property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withSubmittedFromDate(XMLGregorianCalendar value) {
        setSubmittedFromDate(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedToDate property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetFeedSubmissionListRequest withSubmittedToDate(XMLGregorianCalendar value) {
        setSubmittedToDate(value);
        return this;
    }
    


    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetMarketplace()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Marketplace"));
            json.append(" : ");
            json.append(quoteJSON(getMarketplace()));
            first = false;
        }
        if (isSetMerchant()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Merchant"));
            json.append(" : ");
            json.append(quoteJSON(getMerchant()));
            first = false;
        }
        if (isSetFeedSubmissionIdList()) {
            if (!first) json.append(", ");
            json.append("\"FeedSubmissionIdList\" : {");
            IdList  feedSubmissionIdList = getFeedSubmissionIdList();


            json.append(feedSubmissionIdList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetMaxCount()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("MaxCount"));
            json.append(" : ");
            json.append(quoteJSON(getMaxCount() + ""));
            first = false;
        }
        if (isSetFeedTypeList()) {
            if (!first) json.append(", ");
            json.append("\"FeedTypeList\" : {");
            TypeList  feedTypeList = getFeedTypeList();


            json.append(feedTypeList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetFeedProcessingStatusList()) {
            if (!first) json.append(", ");
            json.append("\"FeedProcessingStatusList\" : {");
            StatusList  feedProcessingStatusList = getFeedProcessingStatusList();


            json.append(feedProcessingStatusList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetSubmittedFromDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedFromDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedFromDate() + ""));
            first = false;
        }
        if (isSetSubmittedToDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedToDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedToDate() + ""));
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
