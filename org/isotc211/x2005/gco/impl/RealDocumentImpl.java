/*
 * An XML document type.
 * Localname: Real
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.RealDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Real(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class RealDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.RealDocument
{
    private static final long serialVersionUID = 1L;
    
    public RealDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REAL$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Real");
    
    
    /**
     * Gets the "Real" element
     */
    public double getReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Real" element
     */
    public org.apache.xmlbeans.XmlDouble xgetReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Real" element
     */
    public void setReal(double real)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REAL$0);
            }
            target.setDoubleValue(real);
        }
    }
    
    /**
     * Sets (as xml) the "Real" element
     */
    public void xsetReal(org.apache.xmlbeans.XmlDouble real)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REAL$0);
            }
            target.set(real);
        }
    }
}
