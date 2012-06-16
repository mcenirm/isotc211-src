/*
 * XML Type:  MD_VectorSpatialRepresentation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_VectorSpatialRepresentation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDVectorSpatialRepresentationTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractMDSpatialRepresentationTypeImpl implements org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType
{
    private static final long serialVersionUID = 1L;
    
    public MDVectorSpatialRepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOLOGYLEVEL$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "topologyLevel");
    private static final javax.xml.namespace.QName GEOMETRICOBJECTS$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "geometricObjects");
    
    
    /**
     * Gets the "topologyLevel" element
     */
    public org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType getTopologyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType)get_store().find_element_user(TOPOLOGYLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "topologyLevel" element
     */
    public boolean isSetTopologyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOLOGYLEVEL$0) != 0;
        }
    }
    
    /**
     * Sets the "topologyLevel" element
     */
    public void setTopologyLevel(org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType topologyLevel)
    {
        generatedSetterHelperImpl(topologyLevel, TOPOLOGYLEVEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topologyLevel" element
     */
    public org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType addNewTopologyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType)get_store().add_element_user(TOPOLOGYLEVEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "topologyLevel" element
     */
    public void unsetTopologyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOLOGYLEVEL$0, 0);
        }
    }
    
    /**
     * Gets array of all "geometricObjects" elements
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType[] getGeometricObjectsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOMETRICOBJECTS$2, targetList);
            org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType[] result = new org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geometricObjects" element
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType getGeometricObjectsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType)get_store().find_element_user(GEOMETRICOBJECTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geometricObjects" element
     */
    public int sizeOfGeometricObjectsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRICOBJECTS$2);
        }
    }
    
    /**
     * Sets array of all "geometricObjects" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGeometricObjectsArray(org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType[] geometricObjectsArray)
    {
        check_orphaned();
        arraySetterHelper(geometricObjectsArray, GEOMETRICOBJECTS$2);
    }
    
    /**
     * Sets ith "geometricObjects" element
     */
    public void setGeometricObjectsArray(int i, org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType geometricObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType)get_store().find_element_user(GEOMETRICOBJECTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geometricObjects);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geometricObjects" element
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType insertNewGeometricObjects(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType)get_store().insert_element_user(GEOMETRICOBJECTS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geometricObjects" element
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType addNewGeometricObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectsPropertyType)get_store().add_element_user(GEOMETRICOBJECTS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "geometricObjects" element
     */
    public void removeGeometricObjects(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRICOBJECTS$2, i);
        }
    }
}
