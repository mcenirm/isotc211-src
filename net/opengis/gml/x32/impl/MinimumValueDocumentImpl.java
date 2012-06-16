/*
 * An XML document type.
 * Localname: minimumValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MinimumValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one minimumValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MinimumValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MinimumValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinimumValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMUMVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "minimumValue");
    
    
    /**
     * Gets the "minimumValue" element
     */
    public double getMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMVALUE$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimumValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMUMVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minimumValue" element
     */
    public void setMinimumValue(double minimumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMVALUE$0);
            }
            target.setDoubleValue(minimumValue);
        }
    }
    
    /**
     * Sets (as xml) the "minimumValue" element
     */
    public void xsetMinimumValue(org.apache.xmlbeans.XmlDouble minimumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMUMVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINIMUMVALUE$0);
            }
            target.set(minimumValue);
        }
    }
}
