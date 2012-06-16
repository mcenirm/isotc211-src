/*
 * XML Type:  TM_PeriodDuration_PropertyType
 * Namespace: http://www.isotc211.org/2005/gts
 * Java type: org.isotc211.x2005.gts.TMPeriodDurationPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gts.impl;
/**
 * An XML TM_PeriodDuration_PropertyType(@http://www.isotc211.org/2005/gts).
 *
 * This is a complex type.
 */
public class TMPeriodDurationPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gts.TMPeriodDurationPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public TMPeriodDurationPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TMPERIODDURATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gts", "TM_PeriodDuration");
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
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
     * True if has "TM_PeriodDuration" element
     */
    public boolean isSetTMPeriodDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMPERIODDURATION$0) != 0;
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
    
    /**
     * Unsets the "TM_PeriodDuration" element
     */
    public void unsetTMPeriodDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMPERIODDURATION$0, 0);
        }
    }
    
    /**
     * Gets the "nilReason" attribute
     */
    public java.lang.Object getNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "nilReason" attribute
     */
    public net.opengis.gml.x32.NilReasonType xgetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            return target;
        }
    }
    
    /**
     * True if has "nilReason" attribute
     */
    public boolean isSetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NILREASON$2) != null;
        }
    }
    
    /**
     * Sets the "nilReason" attribute
     */
    public void setNilReason(java.lang.Object nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$2);
            }
            target.setObjectValue(nilReason);
        }
    }
    
    /**
     * Sets (as xml) the "nilReason" attribute
     */
    public void xsetNilReason(net.opengis.gml.x32.NilReasonType nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$2);
            }
            target.set(nilReason);
        }
    }
    
    /**
     * Unsets the "nilReason" attribute
     */
    public void unsetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NILREASON$2);
        }
    }
}
