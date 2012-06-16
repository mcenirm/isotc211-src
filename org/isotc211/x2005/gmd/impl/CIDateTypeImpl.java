/*
 * XML Type:  CI_Date_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIDateType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_Date_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CIDateTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CIDateType
{
    private static final long serialVersionUID = 1L;
    
    public CIDateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "date");
    private static final javax.xml.namespace.QName DATETYPE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dateType");
    
    
    /**
     * Gets the "date" element
     */
    public org.isotc211.x2005.gco.DatePropertyType getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.isotc211.x2005.gco.DatePropertyType date)
    {
        generatedSetterHelperImpl(date, DATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.isotc211.x2005.gco.DatePropertyType addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().add_element_user(DATE$0);
            return target;
        }
    }
    
    /**
     * Gets the "dateType" element
     */
    public org.isotc211.x2005.gmd.CIDateTypeCodePropertyType getDateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDateTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDateTypeCodePropertyType)get_store().find_element_user(DATETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dateType" element
     */
    public void setDateType(org.isotc211.x2005.gmd.CIDateTypeCodePropertyType dateType)
    {
        generatedSetterHelperImpl(dateType, DATETYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateType" element
     */
    public org.isotc211.x2005.gmd.CIDateTypeCodePropertyType addNewDateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDateTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDateTypeCodePropertyType)get_store().add_element_user(DATETYPE$2);
            return target;
        }
    }
}
