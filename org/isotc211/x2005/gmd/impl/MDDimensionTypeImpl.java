/*
 * XML Type:  MD_Dimension_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Dimension_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDDimensionTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDDimensionType
{
    private static final long serialVersionUID = 1L;
    
    public MDDimensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dimensionName");
    private static final javax.xml.namespace.QName DIMENSIONSIZE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dimensionSize");
    private static final javax.xml.namespace.QName RESOLUTION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "resolution");
    
    
    /**
     * Gets the "dimensionName" element
     */
    public org.isotc211.x2005.gmd.MDDimensionNameTypeCodePropertyType getDimensionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionNameTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionNameTypeCodePropertyType)get_store().find_element_user(DIMENSIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dimensionName" element
     */
    public void setDimensionName(org.isotc211.x2005.gmd.MDDimensionNameTypeCodePropertyType dimensionName)
    {
        generatedSetterHelperImpl(dimensionName, DIMENSIONNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dimensionName" element
     */
    public org.isotc211.x2005.gmd.MDDimensionNameTypeCodePropertyType addNewDimensionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionNameTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionNameTypeCodePropertyType)get_store().add_element_user(DIMENSIONNAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "dimensionSize" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getDimensionSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(DIMENSIONSIZE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dimensionSize" element
     */
    public void setDimensionSize(org.isotc211.x2005.gco.IntegerPropertyType dimensionSize)
    {
        generatedSetterHelperImpl(dimensionSize, DIMENSIONSIZE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dimensionSize" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewDimensionSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(DIMENSIONSIZE$2);
            return target;
        }
    }
    
    /**
     * Gets the "resolution" element
     */
    public org.isotc211.x2005.gco.MeasurePropertyType getResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MeasurePropertyType target = null;
            target = (org.isotc211.x2005.gco.MeasurePropertyType)get_store().find_element_user(RESOLUTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resolution" element
     */
    public boolean isSetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOLUTION$4) != 0;
        }
    }
    
    /**
     * Sets the "resolution" element
     */
    public void setResolution(org.isotc211.x2005.gco.MeasurePropertyType resolution)
    {
        generatedSetterHelperImpl(resolution, RESOLUTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resolution" element
     */
    public org.isotc211.x2005.gco.MeasurePropertyType addNewResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MeasurePropertyType target = null;
            target = (org.isotc211.x2005.gco.MeasurePropertyType)get_store().add_element_user(RESOLUTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "resolution" element
     */
    public void unsetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOLUTION$4, 0);
        }
    }
}
