/*
 * An XML document type.
 * Localname: realizationEpoch
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RealizationEpochDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one realizationEpoch(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RealizationEpochDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.RealizationEpochDocument
{
    private static final long serialVersionUID = 1L;
    
    public RealizationEpochDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALIZATIONEPOCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "realizationEpoch");
    
    
    /**
     * Gets the "realizationEpoch" element
     */
    public java.util.Calendar getRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALIZATIONEPOCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "realizationEpoch" element
     */
    public org.apache.xmlbeans.XmlDate xgetRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REALIZATIONEPOCH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "realizationEpoch" element
     */
    public void setRealizationEpoch(java.util.Calendar realizationEpoch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALIZATIONEPOCH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALIZATIONEPOCH$0);
            }
            target.setCalendarValue(realizationEpoch);
        }
    }
    
    /**
     * Sets (as xml) the "realizationEpoch" element
     */
    public void xsetRealizationEpoch(org.apache.xmlbeans.XmlDate realizationEpoch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REALIZATIONEPOCH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(REALIZATIONEPOCH$0);
            }
            target.set(realizationEpoch);
        }
    }
}
