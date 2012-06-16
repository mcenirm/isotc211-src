/*
 * XML Type:  EX_GeographicBoundingBox_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXGeographicBoundingBoxType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML EX_GeographicBoundingBox_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class EXGeographicBoundingBoxTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractEXGeographicExtentTypeImpl implements org.isotc211.x2005.gmd.EXGeographicBoundingBoxType
{
    private static final long serialVersionUID = 1L;
    
    public EXGeographicBoundingBoxTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WESTBOUNDLONGITUDE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "westBoundLongitude");
    private static final javax.xml.namespace.QName EASTBOUNDLONGITUDE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "eastBoundLongitude");
    private static final javax.xml.namespace.QName SOUTHBOUNDLATITUDE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "southBoundLatitude");
    private static final javax.xml.namespace.QName NORTHBOUNDLATITUDE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "northBoundLatitude");
    
    
    /**
     * Gets the "westBoundLongitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType getWestBoundLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().find_element_user(WESTBOUNDLONGITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "westBoundLongitude" element
     */
    public void setWestBoundLongitude(org.isotc211.x2005.gco.DecimalPropertyType westBoundLongitude)
    {
        generatedSetterHelperImpl(westBoundLongitude, WESTBOUNDLONGITUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "westBoundLongitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType addNewWestBoundLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().add_element_user(WESTBOUNDLONGITUDE$0);
            return target;
        }
    }
    
    /**
     * Gets the "eastBoundLongitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType getEastBoundLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().find_element_user(EASTBOUNDLONGITUDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eastBoundLongitude" element
     */
    public void setEastBoundLongitude(org.isotc211.x2005.gco.DecimalPropertyType eastBoundLongitude)
    {
        generatedSetterHelperImpl(eastBoundLongitude, EASTBOUNDLONGITUDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "eastBoundLongitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType addNewEastBoundLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().add_element_user(EASTBOUNDLONGITUDE$2);
            return target;
        }
    }
    
    /**
     * Gets the "southBoundLatitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType getSouthBoundLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().find_element_user(SOUTHBOUNDLATITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "southBoundLatitude" element
     */
    public void setSouthBoundLatitude(org.isotc211.x2005.gco.DecimalPropertyType southBoundLatitude)
    {
        generatedSetterHelperImpl(southBoundLatitude, SOUTHBOUNDLATITUDE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "southBoundLatitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType addNewSouthBoundLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().add_element_user(SOUTHBOUNDLATITUDE$4);
            return target;
        }
    }
    
    /**
     * Gets the "northBoundLatitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType getNorthBoundLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().find_element_user(NORTHBOUNDLATITUDE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "northBoundLatitude" element
     */
    public void setNorthBoundLatitude(org.isotc211.x2005.gco.DecimalPropertyType northBoundLatitude)
    {
        generatedSetterHelperImpl(northBoundLatitude, NORTHBOUNDLATITUDE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "northBoundLatitude" element
     */
    public org.isotc211.x2005.gco.DecimalPropertyType addNewNorthBoundLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DecimalPropertyType target = null;
            target = (org.isotc211.x2005.gco.DecimalPropertyType)get_store().add_element_user(NORTHBOUNDLATITUDE$6);
            return target;
        }
    }
}
