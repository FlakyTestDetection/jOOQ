







package org.jooq.util.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jooq.util.jaxb.tools.StringAdapter;


/**
 * <p>Java class for MatcherRule complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MatcherRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="transform" type="{http://www.jooq.org/xsd/jooq-codegen-3.10.0.xsd}MatcherTransformType" minOccurs="0"/&gt;
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatcherRule", propOrder = {

})
@SuppressWarnings({
    "all"
})
public class MatcherRule implements Serializable
{

    private final static long serialVersionUID = 31000L;
    @XmlSchemaType(name = "string")
    protected MatcherTransformType transform;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String expression;

    /**
     * A pre-defined transformation type that transforms this rule's output into a specific format.
     *
     * @return
     *     possible object is
     *     {@link MatcherTransformType }
     *
     */
    public MatcherTransformType getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     *
     * @param value
     *     allowed object is
     *     {@link MatcherTransformType }
     *
     */
    public void setTransform(MatcherTransformType value) {
        this.transform = value;
    }

    /**
     * A replacement expression that transforms the matched expression in a new value.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    public MatcherRule withTransform(MatcherTransformType value) {
        setTransform(value);
        return this;
    }

    public MatcherRule withExpression(String value) {
        setExpression(value);
        return this;
    }

}
