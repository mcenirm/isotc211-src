/*
 * XML Type:  MultiplicityRange_Type
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.MultiplicityRangeType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML MultiplicityRange_Type(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class MultiplicityRangeTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gco.MultiplicityRangeType
{
    private static final long serialVersionUID = 1L;
    
    public MultiplicityRangeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOWER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "lower");
    private static final javax.xml.namespace.QName UPPER$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "upper");
    
    
    /**
     * Gets the "lower" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getLower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(LOWER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lower" element
     */
    public void setLower(org.isotc211.x2005.gco.IntegerPropertyType lower)
    {
        generatedSetterHelperImpl(lower, LOWER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lower" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewLower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(LOWER$0);
            return target;
        }
    }
    
    /**
     * Gets the "upper" element
     */
    public org.isotc211.x2005.gco.UnlimitedIntegerPropertyType getUpper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnlimitedIntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.UnlimitedIntegerPropertyType)get_store().find_element_user(UPPER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "upper" element
     */
    public void setUpper(org.isotc211.x2005.gco.UnlimitedIntegerPropertyType upper)
    {
        generatedSetterHelperImpl(upper, UPPER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "upper" element
     */
    public org.isotc211.x2005.gco.UnlimitedIntegerPropertyType addNewUpper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnlimitedIntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.UnlimitedIntegerPropertyType)get_store().add_element_user(UPPER$2);
            return target;
        }
    }
}
