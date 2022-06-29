
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
 *         &lt;element name="iin" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "iin"
})
@XmlRootElement(name = "getUsersRequest", namespace = "http://www.javaspringclub.com/movies-ws")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class GetUsersRequest {

    @XmlElement(namespace = "http://www.javaspringclub.com/movies-ws")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-06-27T03:08:05+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long iin;

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

}
