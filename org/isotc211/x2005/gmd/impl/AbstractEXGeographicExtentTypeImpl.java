/*
 * XML Type:  AbstractEX_GeographicExtent_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractEXGeographicExtentType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML AbstractEX_GeographicExtent_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class AbstractEXGeographicExtentTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.AbstractEXGeographicExtentType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractEXGeographicExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENTTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "extentTypeCode");
    
    
    /**
     * Gets the "extentTypeCode" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getExtentTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(EXTENTTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extentTypeCode" element
     */
    public boolean isSetExtentTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENTTYPECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "extentTypeCode" element
     */
    public void setExtentTypeCode(org.isotc211.x2005.gco.BooleanPropertyType extentTypeCode)
    {
        generatedSetterHelperImpl(extentTypeCode, EXTENTTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extentTypeCode" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewExtentTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(EXTENTTYPECODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "extentTypeCode" element
     */
    public void unsetExtentTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENTTYPECODE$0, 0);
        }
    }
}
