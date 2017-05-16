







package org.jooq.util.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jooq.util.jaxb.tools.StringAdapter;


/**
 * <p>Java class for Generator complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Generator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strategy" type="{http://www.jooq.org/xsd/jooq-codegen-3.10.0.xsd}Strategy" minOccurs="0"/&gt;
 *         &lt;element name="database" type="{http://www.jooq.org/xsd/jooq-codegen-3.10.0.xsd}Database" minOccurs="0"/&gt;
 *         &lt;element name="generate" type="{http://www.jooq.org/xsd/jooq-codegen-3.10.0.xsd}Generate" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://www.jooq.org/xsd/jooq-codegen-3.10.0.xsd}Target" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Generator", propOrder = {

})
@SuppressWarnings({
    "all"
})
public class Generator implements Serializable
{

    private final static long serialVersionUID = 31000L;
    @XmlElement(defaultValue = "org.jooq.util.DefaultGenerator")
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String name = "org.jooq.util.DefaultGenerator";
    protected Strategy strategy;
    protected Database database;
    protected Generate generate;
    protected Target target;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
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
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the strategy property.
     *
     * @return
     *     possible object is
     *     {@link Strategy }
     *
     */
    public Strategy getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     *
     * @param value
     *     allowed object is
     *     {@link Strategy }
     *
     */
    public void setStrategy(Strategy value) {
        this.strategy = value;
    }

    /**
     * Gets the value of the database property.
     *
     * @return
     *     possible object is
     *     {@link Database }
     *
     */
    public Database getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     *
     * @param value
     *     allowed object is
     *     {@link Database }
     *
     */
    public void setDatabase(Database value) {
        this.database = value;
    }

    /**
     * Gets the value of the generate property.
     *
     * @return
     *     possible object is
     *     {@link Generate }
     *
     */
    public Generate getGenerate() {
        return generate;
    }

    /**
     * Sets the value of the generate property.
     *
     * @param value
     *     allowed object is
     *     {@link Generate }
     *
     */
    public void setGenerate(Generate value) {
        this.generate = value;
    }

    /**
     * Gets the value of the target property.
     *
     * @return
     *     possible object is
     *     {@link Target }
     *
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     *
     * @param value
     *     allowed object is
     *     {@link Target }
     *
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    public Generator withName(String value) {
        setName(value);
        return this;
    }

    public Generator withStrategy(Strategy value) {
        setStrategy(value);
        return this;
    }

    public Generator withDatabase(Database value) {
        setDatabase(value);
        return this;
    }

    public Generator withGenerate(Generate value) {
        setGenerate(value);
        return this;
    }

    public Generator withTarget(Target value) {
        setTarget(value);
        return this;
    }

}
