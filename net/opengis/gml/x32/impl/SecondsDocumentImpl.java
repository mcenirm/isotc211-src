/*
 * An XML document type.
 * Localname: seconds
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SecondsDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one seconds(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SecondsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SecondsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecondsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECONDS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "seconds");
    
    
    /**
     * Gets the "seconds" element
     */
    public java.math.BigDecimal getSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "seconds" element
     */
    public net.opengis.gml.x32.ArcSecondsType xgetSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcSecondsType target = null;
            target = (net.opengis.gml.x32.ArcSecondsType)get_store().find_element_user(SECONDS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "seconds" element
     */
    public void setSeconds(java.math.BigDecimal seconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDS$0);
            }
            target.setBigDecimalValue(seconds);
        }
    }
    
    /**
     * Sets (as xml) the "seconds" element
     */
    public void xsetSeconds(net.opengis.gml.x32.ArcSecondsType seconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcSecondsType target = null;
            target = (net.opengis.gml.x32.ArcSecondsType)get_store().find_element_user(SECONDS$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcSecondsType)get_store().add_element_user(SECONDS$0);
            }
            target.set(seconds);
        }
    }
}
