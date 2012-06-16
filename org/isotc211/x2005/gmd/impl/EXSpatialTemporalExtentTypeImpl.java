/*
 * XML Type:  EX_SpatialTemporalExtent_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXSpatialTemporalExtentType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML EX_SpatialTemporalExtent_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class EXSpatialTemporalExtentTypeImpl extends org.isotc211.x2005.gmd.impl.EXTemporalExtentTypeImpl implements org.isotc211.x2005.gmd.EXSpatialTemporalExtentType
{
    private static final long serialVersionUID = 1L;
    
    public EXSpatialTemporalExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPATIALEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "spatialExtent");
    
    
    /**
     * Gets array of all "spatialExtent" elements
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] getSpatialExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPATIALEXTENT$0, targetList);
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "spatialExtent" element
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType getSpatialExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().find_element_user(SPATIALEXTENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "spatialExtent" element
     */
    public int sizeOfSpatialExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPATIALEXTENT$0);
        }
    }
    
    /**
     * Sets array of all "spatialExtent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpatialExtentArray(org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] spatialExtentArray)
    {
        check_orphaned();
        arraySetterHelper(spatialExtentArray, SPATIALEXTENT$0);
    }
    
    /**
     * Sets ith "spatialExtent" element
     */
    public void setSpatialExtentArray(int i, org.isotc211.x2005.gmd.EXGeographicExtentPropertyType spatialExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().find_element_user(SPATIALEXTENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(spatialExtent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spatialExtent" element
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType insertNewSpatialExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().insert_element_user(SPATIALEXTENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spatialExtent" element
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType addNewSpatialExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().add_element_user(SPATIALEXTENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "spatialExtent" element
     */
    public void removeSpatialExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPATIALEXTENT$0, i);
        }
    }
}
