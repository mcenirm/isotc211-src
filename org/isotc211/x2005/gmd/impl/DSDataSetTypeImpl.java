/*
 * XML Type:  DS_DataSet_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSDataSetType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML DS_DataSet_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class DSDataSetTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.DSDataSetType
{
    private static final long serialVersionUID = 1L;
    
    public DSDataSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HAS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "has");
    private static final javax.xml.namespace.QName PARTOF$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "partOf");
    
    
    /**
     * Gets array of all "has" elements
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType[] getHasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HAS$0, targetList);
            org.isotc211.x2005.gmd.MDMetadataPropertyType[] result = new org.isotc211.x2005.gmd.MDMetadataPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "has" element
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType getHasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().find_element_user(HAS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "has" element
     */
    public int sizeOfHasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HAS$0);
        }
    }
    
    /**
     * Sets array of all "has" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setHasArray(org.isotc211.x2005.gmd.MDMetadataPropertyType[] hasArray)
    {
        check_orphaned();
        arraySetterHelper(hasArray, HAS$0);
    }
    
    /**
     * Sets ith "has" element
     */
    public void setHasArray(int i, org.isotc211.x2005.gmd.MDMetadataPropertyType has)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().find_element_user(HAS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(has);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "has" element
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType insertNewHas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().insert_element_user(HAS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "has" element
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType addNewHas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().add_element_user(HAS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "has" element
     */
    public void removeHas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HAS$0, i);
        }
    }
    
    /**
     * Gets array of all "partOf" elements
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType[] getPartOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTOF$2, targetList);
            org.isotc211.x2005.gmd.DSAggregatePropertyType[] result = new org.isotc211.x2005.gmd.DSAggregatePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "partOf" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType getPartOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(PARTOF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "partOf" element
     */
    public int sizeOfPartOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTOF$2);
        }
    }
    
    /**
     * Sets array of all "partOf" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPartOfArray(org.isotc211.x2005.gmd.DSAggregatePropertyType[] partOfArray)
    {
        check_orphaned();
        arraySetterHelper(partOfArray, PARTOF$2);
    }
    
    /**
     * Sets ith "partOf" element
     */
    public void setPartOfArray(int i, org.isotc211.x2005.gmd.DSAggregatePropertyType partOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(PARTOF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(partOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "partOf" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType insertNewPartOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().insert_element_user(PARTOF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "partOf" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType addNewPartOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().add_element_user(PARTOF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "partOf" element
     */
    public void removePartOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTOF$2, i);
        }
    }
}
