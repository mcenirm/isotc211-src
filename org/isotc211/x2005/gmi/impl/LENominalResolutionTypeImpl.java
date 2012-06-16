/*
 * XML Type:  LE_NominalResolution_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LENominalResolutionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML LE_NominalResolution_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class LENominalResolutionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.LENominalResolutionType
{
    private static final long serialVersionUID = 1L;
    
    public LENominalResolutionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCANNINGRESOLUTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "scanningResolution");
    private static final javax.xml.namespace.QName GROUNDRESOLUTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "groundResolution");
    
    
    /**
     * Gets the "scanningResolution" element
     */
    public org.isotc211.x2005.gco.DistancePropertyType getScanningResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DistancePropertyType target = null;
            target = (org.isotc211.x2005.gco.DistancePropertyType)get_store().find_element_user(SCANNINGRESOLUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scanningResolution" element
     */
    public boolean isSetScanningResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCANNINGRESOLUTION$0) != 0;
        }
    }
    
    /**
     * Sets the "scanningResolution" element
     */
    public void setScanningResolution(org.isotc211.x2005.gco.DistancePropertyType scanningResolution)
    {
        generatedSetterHelperImpl(scanningResolution, SCANNINGRESOLUTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scanningResolution" element
     */
    public org.isotc211.x2005.gco.DistancePropertyType addNewScanningResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DistancePropertyType target = null;
            target = (org.isotc211.x2005.gco.DistancePropertyType)get_store().add_element_user(SCANNINGRESOLUTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "scanningResolution" element
     */
    public void unsetScanningResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCANNINGRESOLUTION$0, 0);
        }
    }
    
    /**
     * Gets the "groundResolution" element
     */
    public org.isotc211.x2005.gco.DistancePropertyType getGroundResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DistancePropertyType target = null;
            target = (org.isotc211.x2005.gco.DistancePropertyType)get_store().find_element_user(GROUNDRESOLUTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "groundResolution" element
     */
    public boolean isSetGroundResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUNDRESOLUTION$2) != 0;
        }
    }
    
    /**
     * Sets the "groundResolution" element
     */
    public void setGroundResolution(org.isotc211.x2005.gco.DistancePropertyType groundResolution)
    {
        generatedSetterHelperImpl(groundResolution, GROUNDRESOLUTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "groundResolution" element
     */
    public org.isotc211.x2005.gco.DistancePropertyType addNewGroundResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DistancePropertyType target = null;
            target = (org.isotc211.x2005.gco.DistancePropertyType)get_store().add_element_user(GROUNDRESOLUTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "groundResolution" element
     */
    public void unsetGroundResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUNDRESOLUTION$2, 0);
        }
    }
}
