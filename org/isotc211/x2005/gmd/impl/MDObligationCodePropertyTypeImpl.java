/*
 * XML Type:  MD_ObligationCode_PropertyType
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDObligationCodePropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_ObligationCode_PropertyType(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDObligationCodePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDObligationCodePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public MDObligationCodePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDOBLIGATIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ObligationCode");
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "MD_ObligationCode" element
     */
    public org.isotc211.x2005.gmd.MDObligationCodeType.Enum getMDObligationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.isotc211.x2005.gmd.MDObligationCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MD_ObligationCode" element
     */
    public org.isotc211.x2005.gmd.MDObligationCodeType xgetMDObligationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDObligationCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDObligationCodeType)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MD_ObligationCode" element
     */
    public boolean isSetMDObligationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MDOBLIGATIONCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "MD_ObligationCode" element
     */
    public void setMDObligationCode(org.isotc211.x2005.gmd.MDObligationCodeType.Enum mdObligationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MDOBLIGATIONCODE$0);
            }
            target.setEnumValue(mdObligationCode);
        }
    }
    
    /**
     * Sets (as xml) the "MD_ObligationCode" element
     */
    public void xsetMDObligationCode(org.isotc211.x2005.gmd.MDObligationCodeType mdObligationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDObligationCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDObligationCodeType)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDObligationCodeType)get_store().add_element_user(MDOBLIGATIONCODE$0);
            }
            target.set(mdObligationCode);
        }
    }
    
    /**
     * Unsets the "MD_ObligationCode" element
     */
    public void unsetMDObligationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MDOBLIGATIONCODE$0, 0);
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
