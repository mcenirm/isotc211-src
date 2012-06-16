/*
 * An XML document type.
 * Localname: Date
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.DateDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Date(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class DateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.DateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Date");
    
    
    /**
     * Gets the "Date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Date" element
     */
    public org.isotc211.x2005.gco.DateType xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateType target = null;
            target = (org.isotc211.x2005.gco.DateType)get_store().find_element_user(DATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Date" element
     */
    public boolean isNilDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateType target = null;
            target = (org.isotc211.x2005.gco.DateType)get_store().find_element_user(DATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "Date" element
     */
    public void xsetDate(org.isotc211.x2005.gco.DateType date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateType target = null;
            target = (org.isotc211.x2005.gco.DateType)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gco.DateType)get_store().add_element_user(DATE$0);
            }
            target.set(date);
        }
    }
    
    /**
     * Nils the "Date" element
     */
    public void setNilDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateType target = null;
            target = (org.isotc211.x2005.gco.DateType)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gco.DateType)get_store().add_element_user(DATE$0);
            }
            target.setNil();
        }
    }
}
