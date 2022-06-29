
package generate;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="user" type="{http://www.javaspringclub.com/movies-ws}user"/>
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
    "user"
})
@XmlRootElement(name = "getUsersResponse", namespace = "http://www.javaspringclub.com/movies-ws")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class GetUsersResponse {

    @XmlElement(namespace = "http://www.javaspringclub.com/movies-ws", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected User user;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUser(User value) {
        this.user = value;
    }

}
