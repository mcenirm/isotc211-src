/*
 * XML Type:  EX_VerticalExtent_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXVerticalExtentType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML EX_VerticalExtent_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class EXVerticalExtentTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.EXVerticalExtentType
{
    private static final long serialVersionUID = 1L;
    
    public EXVerticalExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMUMVALUE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "minimumValue");
    private static final javax.xml.namespace.QName MAXIMUMVALUE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "maximumValue");
    private static final javax.xml.namespace.QName VERTICALCRS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "verticalCRS");
    
    
    /**
     * Gets the "minimumValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(MINIMUMVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "minimumValue" element
     */
    public void setMinimumValue(org.isotc211.x2005.gco.RealPropertyType minimumValue)
    {
        generatedSetterHelperImpl(minimumValue, MINIMUMVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "minimumValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(MINIMUMVALUE$0);
            return target;
        }
    }
    
    /**
     * Gets the "maximumValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(MAXIMUMVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maximumValue" element
     */
    public void setMaximumValue(org.isotc211.x2005.gco.RealPropertyType maximumValue)
    {
        generatedSetterHelperImpl(maximumValue, MAXIMUMVALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maximumValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(MAXIMUMVALUE$2);
            return target;
        }
    }
    
    /**
     * Gets the "verticalCRS" element
     */
    public org.isotc211.x2005.gsr.SCCRSPropertyType getVerticalCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gsr.SCCRSPropertyType target = null;
            target = (org.isotc211.x2005.gsr.SCCRSPropertyType)get_store().find_element_user(VERTICALCRS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalCRS" element
     */
    public void setVerticalCRS(org.isotc211.x2005.gsr.SCCRSPropertyType verticalCRS)
    {
        generatedSetterHelperImpl(verticalCRS, VERTICALCRS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalCRS" element
     */
    public org.isotc211.x2005.gsr.SCCRSPropertyType addNewVerticalCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gsr.SCCRSPropertyType target = null;
            target = (org.isotc211.x2005.gsr.SCCRSPropertyType)get_store().add_element_user(VERTICALCRS$4);
            return target;
        }
    }
}
