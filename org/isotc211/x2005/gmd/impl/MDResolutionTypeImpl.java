/*
 * XML Type:  MD_Resolution_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDResolutionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Resolution_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDResolutionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDResolutionType
{
    private static final long serialVersionUID = 1L;
    
    public MDResolutionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIVALENTSCALE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "equivalentScale");
    private static final javax.xml.namespace.QName DISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distance");
    
    
    /**
     * Gets the "equivalentScale" element
     */
    public org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType getEquivalentScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType)get_store().find_element_user(EQUIVALENTSCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "equivalentScale" element
     */
    public boolean isSetEquivalentScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EQUIVALENTSCALE$0) != 0;
        }
    }
    
    /**
     * Sets the "equivalentScale" element
     */
    public void setEquivalentScale(org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType equivalentScale)
    {
        generatedSetterHelperImpl(equivalentScale, EQUIVALENTSCALE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "equivalentScale" element
     */
    public org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType addNewEquivalentScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType)get_store().add_element_user(EQUIVALENTSCALE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "equivalentScale" element
     */
    public void unsetEquivalentScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EQUIVALENTSCALE$0, 0);
        }
    }
    
    /**
     * Gets the "distance" element
     */
    public org.isotc211.x2005.gco.DistancePropertyType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DistancePropertyType target = null;
            target = (org.isotc211.x2005.gco.DistancePropertyType)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distance" element
     */
    public boolean isSetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCE$2) != 0;
        }
    }
    
    /**
     * Sets the "distance" element
     */
    public void setDistance(org.isotc211.x2005.gco.DistancePropertyType distance)
    {
        generatedSetterHelperImpl(distance, DISTANCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "distance" element
     */
    public org.isotc211.x2005.gco.DistancePropertyType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DistancePropertyType target = null;
            target = (org.isotc211.x2005.gco.DistancePropertyType)get_store().add_element_user(DISTANCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "distance" element
     */
    public void unsetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCE$2, 0);
        }
    }
}
