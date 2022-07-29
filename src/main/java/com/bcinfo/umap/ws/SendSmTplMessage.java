
package com.bcinfo.umap.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bcinfo.umap.ws.schemas.RequestHeader;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://schemas.ws.umap.bcinfo.com}RequestHeader"/&gt;
 *         &lt;element name="sourceAddr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destMobiles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="templetId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tplVars" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "sourceAddr",
    "destMobiles",
    "templetId",
    "tplVars"
})
@XmlRootElement(name = "sendSmTplMessage")
public class SendSmTplMessage {

    @XmlElement(required = true)
    protected RequestHeader header;
    @XmlElement(required = true)
    protected String sourceAddr;
    @XmlElement(required = true)
    protected List<String> destMobiles;
    @XmlElement(required = true)
    protected String templetId;
    @XmlElement(required = true)
    protected List<String> tplVars;

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setHeader(RequestHeader value) {
        this.header = value;
    }

    /**
     * 获取sourceAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddr() {
        return sourceAddr;
    }

    /**
     * 设置sourceAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddr(String value) {
        this.sourceAddr = value;
    }

    /**
     * Gets the value of the destMobiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destMobiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestMobiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDestMobiles() {
        if (destMobiles == null) {
            destMobiles = new ArrayList<String>();
        }
        return this.destMobiles;
    }

    /**
     * 获取templetId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempletId() {
        return templetId;
    }

    /**
     * 设置templetId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempletId(String value) {
        this.templetId = value;
    }

    /**
     * Gets the value of the tplVars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tplVars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTplVars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTplVars() {
        if (tplVars == null) {
            tplVars = new ArrayList<String>();
        }
        return this.tplVars;
    }

}
