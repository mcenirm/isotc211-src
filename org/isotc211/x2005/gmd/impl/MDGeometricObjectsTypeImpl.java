/*
 * XML Type:  MD_GeometricObjects_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeometricObjectsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_GeometricObjects_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDGeometricObjectsTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDGeometricObjectsType
{
    private static final long serialVersionUID = 1L;
    
    public MDGeometricObjectsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRICOBJECTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "geometricObjectType");
    private static final javax.xml.namespace.QName GEOMETRICOBJECTCOUNT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "geometricObjectCount");
    
    
    /**
     * Gets the "geometricObjectType" element
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectTypeCodePropertyType getGeometricObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectTypeCodePropertyType)get_store().find_element_user(GEOMETRICOBJECTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geometricObjectType" element
     */
    public void setGeometricObjectType(org.isotc211.x2005.gmd.MDGeometricObjectTypeCodePropertyType geometricObjectType)
    {
        generatedSetterHelperImpl(geometricObjectType, GEOMETRICOBJECTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometricObjectType" element
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectTypeCodePropertyType addNewGeometricObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectTypeCodePropertyType)get_store().add_element_user(GEOMETRICOBJECTTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "geometricObjectCount" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getGeometricObjectCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(GEOMETRICOBJECTCOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "geometricObjectCount" element
     */
    public boolean isSetGeometricObjectCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRICOBJECTCOUNT$2) != 0;
        }
    }
    
    /**
     * Sets the "geometricObjectCount" element
     */
    public void setGeometricObjectCount(org.isotc211.x2005.gco.IntegerPropertyType geometricObjectCount)
    {
        generatedSetterHelperImpl(geometricObjectCount, GEOMETRICOBJECTCOUNT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometricObjectCount" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewGeometricObjectCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(GEOMETRICOBJECTCOUNT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "geometricObjectCount" element
     */
    public void unsetGeometricObjectCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRICOBJECTCOUNT$2, 0);
        }
    }
}
