
package com.bcinfo.umap.ws.schemas;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestHeader complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessPlatformID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="devicePwd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="needReport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recvMsgSeq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader", propOrder = {
    "accessPlatformID",
    "deviceId",
    "devicePwd",
    "msgId",
    "needReport",
    "recvMsgSeq"
})
@ToString
public class RequestHeader {

    @XmlElement(required = true, nillable = true)
    protected String accessPlatformID;
    @XmlElement(required = true, nillable = true)
    protected String deviceId;
    @XmlElement(required = true, nillable = true)
    protected String devicePwd;
    @XmlElement(required = true, nillable = true)
    protected String msgId;
    @XmlElement(required = true, nillable = true)
    protected String needReport;
    @XmlElement(required = true, nillable = true)
    protected String recvMsgSeq;

    /**
     * 获取accessPlatformID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPlatformID() {
        return accessPlatformID;
    }

    /**
     * 设置accessPlatformID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPlatformID(String value) {
        this.accessPlatformID = value;
    }

    /**
     * 获取deviceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置deviceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * 获取devicePwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePwd() {
        return devicePwd;
    }

    /**
     * 设置devicePwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePwd(String value) {
        this.devicePwd = value;
    }

    /**
     * 获取msgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * 设置msgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * 获取needReport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedReport() {
        return needReport;
    }

    /**
     * 设置needReport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedReport(String value) {
        this.needReport = value;
    }

    /**
     * 获取recvMsgSeq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvMsgSeq() {
        return recvMsgSeq;
    }

    /**
     * 设置recvMsgSeq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvMsgSeq(String value) {
        this.recvMsgSeq = value;
    }

}
