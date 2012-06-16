/*
 * An XML document type.
 * Localname: Integer
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.IntegerDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Integer(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class IntegerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.IntegerDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntegerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Integer");
    
    
    /**
     * Gets the "Integer" element
     */
    public java.math.BigInteger getInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Integer" element
     */
    public org.apache.xmlbeans.XmlInteger xgetInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTEGER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Integer" element
     */
    public void setInteger(java.math.BigInteger integer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGER$0);
            }
            target.setBigIntegerValue(integer);
        }
    }
    
    /**
     * Sets (as xml) the "Integer" element
     */
    public void xsetInteger(org.apache.xmlbeans.XmlInteger integer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTEGER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INTEGER$0);
            }
            target.set(integer);
        }
    }
}
