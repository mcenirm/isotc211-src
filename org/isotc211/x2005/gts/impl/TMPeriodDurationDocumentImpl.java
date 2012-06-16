/*
 * An XML document type.
 * Localname: TM_PeriodDuration
 * Namespace: http://www.isotc211.org/2005/gts
 * Java type: org.isotc211.x2005.gts.TMPeriodDurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gts.impl;
/**
 * A document containing one TM_PeriodDuration(@http://www.isotc211.org/2005/gts) element.
 *
 * This is a complex type.
 */
public class TMPeriodDurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gts.TMPeriodDurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TMPeriodDurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TMPERIODDURATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gts", "TM_PeriodDuration");
    
    
    /**
     * Gets the "TM_PeriodDuration" element
     */
    public org.apache.xmlbeans.GDuration getTMPeriodDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPERIODDURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "TM_PeriodDuration" element
     */
    public org.apache.xmlbeans.XmlDuration xgetTMPeriodDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TMPERIODDURATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TM_PeriodDuration" element
     */
    public void setTMPeriodDuration(org.apache.xmlbeans.GDuration tmPeriodDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPERIODDURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPERIODDURATION$0);
            }
            target.setGDurationValue(tmPeriodDuration);
        }
    }
    
    /**
     * Sets (as xml) the "TM_PeriodDuration" element
     */
    public void xsetTMPeriodDuration(org.apache.xmlbeans.XmlDuration tmPeriodDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TMPERIODDURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(TMPERIODDURATION$0);
            }
            target.set(tmPeriodDuration);
        }
    }
}
