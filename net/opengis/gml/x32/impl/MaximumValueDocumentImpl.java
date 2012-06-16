/*
 * An XML document type.
 * Localname: maximumValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MaximumValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one maximumValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MaximumValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MaximumValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaximumValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXIMUMVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "maximumValue");
    
    
    /**
     * Gets the "maximumValue" element
     */
    public double getMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMVALUE$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximumValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMUMVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maximumValue" element
     */
    public void setMaximumValue(double maximumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMVALUE$0);
            }
            target.setDoubleValue(maximumValue);
        }
    }
    
    /**
     * Sets (as xml) the "maximumValue" element
     */
    public void xsetMaximumValue(org.apache.xmlbeans.XmlDouble maximumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMUMVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXIMUMVALUE$0);
            }
            target.set(maximumValue);
        }
    }
}
