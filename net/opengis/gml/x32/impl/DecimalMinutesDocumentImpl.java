/*
 * An XML document type.
 * Localname: decimalMinutes
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DecimalMinutesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one decimalMinutes(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DecimalMinutesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DecimalMinutesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecimalMinutesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMALMINUTES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "decimalMinutes");
    
    
    /**
     * Gets the "decimalMinutes" element
     */
    public java.math.BigDecimal getDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimalMinutes" element
     */
    public net.opengis.gml.x32.DecimalMinutesType xgetDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DecimalMinutesType target = null;
            target = (net.opengis.gml.x32.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "decimalMinutes" element
     */
    public void setDecimalMinutes(java.math.BigDecimal decimalMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMALMINUTES$0);
            }
            target.setBigDecimalValue(decimalMinutes);
        }
    }
    
    /**
     * Sets (as xml) the "decimalMinutes" element
     */
    public void xsetDecimalMinutes(net.opengis.gml.x32.DecimalMinutesType decimalMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DecimalMinutesType target = null;
            target = (net.opengis.gml.x32.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DecimalMinutesType)get_store().add_element_user(DECIMALMINUTES$0);
            }
            target.set(decimalMinutes);
        }
    }
}
