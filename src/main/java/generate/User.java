
package generate;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", namespace = "http://www.javaspringclub.com/movies-ws", propOrder = {
    "iin",
    "name",
    "date"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class User {

    @XmlElement(namespace = "http://www.javaspringclub.com/movies-ws")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long iin;
    @XmlElement(namespace = "http://www.javaspringclub.com/movies-ws", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(namespace = "http://www.javaspringclub.com/movies-ws", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String date;

    /**
     * Gets the value of the iin property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getIin() {
        return iin;
    }

    /**
     * Sets the value of the iin property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIin(long value) {
        this.iin = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDate(String value) {
        this.date = value;
    }

}
