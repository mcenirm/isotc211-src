/*
 * XML Type:  EX_BoundingPolygon_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXBoundingPolygonType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML EX_BoundingPolygon_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class EXBoundingPolygonTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractEXGeographicExtentTypeImpl implements org.isotc211.x2005.gmd.EXBoundingPolygonType
{
    private static final long serialVersionUID = 1L;
    
    public EXBoundingPolygonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "polygon");
    
    
    /**
     * Gets array of all "polygon" elements
     */
    public org.isotc211.x2005.gss.GMObjectPropertyType[] getPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POLYGON$0, targetList);
            org.isotc211.x2005.gss.GMObjectPropertyType[] result = new org.isotc211.x2005.gss.GMObjectPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "polygon" element
     */
    public org.isotc211.x2005.gss.GMObjectPropertyType getPolygonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMObjectPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMObjectPropertyType)get_store().find_element_user(POLYGON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "polygon" element
     */
    public int sizeOfPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGON$0);
        }
    }
    
    /**
     * Sets array of all "polygon" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPolygonArray(org.isotc211.x2005.gss.GMObjectPropertyType[] polygonArray)
    {
        check_orphaned();
        arraySetterHelper(polygonArray, POLYGON$0);
    }
    
    /**
     * Sets ith "polygon" element
     */
    public void setPolygonArray(int i, org.isotc211.x2005.gss.GMObjectPropertyType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMObjectPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMObjectPropertyType)get_store().find_element_user(POLYGON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(polygon);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "polygon" element
     */
    public org.isotc211.x2005.gss.GMObjectPropertyType insertNewPolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMObjectPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMObjectPropertyType)get_store().insert_element_user(POLYGON$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "polygon" element
     */
    public org.isotc211.x2005.gss.GMObjectPropertyType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMObjectPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMObjectPropertyType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "polygon" element
     */
    public void removePolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGON$0, i);
        }
    }
}
