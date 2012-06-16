/*
 * XML Type:  AbstractDS_Aggregate_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDSAggregateType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML AbstractDS_Aggregate_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class AbstractDSAggregateTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.AbstractDSAggregateType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDSAggregateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSEDOF$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "composedOf");
    private static final javax.xml.namespace.QName SERIESMETADATA$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "seriesMetadata");
    private static final javax.xml.namespace.QName SUBSET$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "subset");
    private static final javax.xml.namespace.QName SUPERSET$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "superset");
    
    
    /**
     * Gets array of all "composedOf" elements
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType[] getComposedOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPOSEDOF$0, targetList);
            org.isotc211.x2005.gmd.DSDataSetPropertyType[] result = new org.isotc211.x2005.gmd.DSDataSetPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "composedOf" element
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType getComposedOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().find_element_user(COMPOSEDOF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "composedOf" element
     */
    public int sizeOfComposedOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPOSEDOF$0);
        }
    }
    
    /**
     * Sets array of all "composedOf" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComposedOfArray(org.isotc211.x2005.gmd.DSDataSetPropertyType[] composedOfArray)
    {
        check_orphaned();
        arraySetterHelper(composedOfArray, COMPOSEDOF$0);
    }
    
    /**
     * Sets ith "composedOf" element
     */
    public void setComposedOfArray(int i, org.isotc211.x2005.gmd.DSDataSetPropertyType composedOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().find_element_user(COMPOSEDOF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(composedOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "composedOf" element
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType insertNewComposedOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().insert_element_user(COMPOSEDOF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "composedOf" element
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType addNewComposedOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().add_element_user(COMPOSEDOF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "composedOf" element
     */
    public void removeComposedOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPOSEDOF$0, i);
        }
    }
    
    /**
     * Gets array of all "seriesMetadata" elements
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType[] getSeriesMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIESMETADATA$2, targetList);
            org.isotc211.x2005.gmd.MDMetadataPropertyType[] result = new org.isotc211.x2005.gmd.MDMetadataPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "seriesMetadata" element
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType getSeriesMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().find_element_user(SERIESMETADATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "seriesMetadata" element
     */
    public int sizeOfSeriesMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIESMETADATA$2);
        }
    }
    
    /**
     * Sets array of all "seriesMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSeriesMetadataArray(org.isotc211.x2005.gmd.MDMetadataPropertyType[] seriesMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(seriesMetadataArray, SERIESMETADATA$2);
    }
    
    /**
     * Sets ith "seriesMetadata" element
     */
    public void setSeriesMetadataArray(int i, org.isotc211.x2005.gmd.MDMetadataPropertyType seriesMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().find_element_user(SERIESMETADATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(seriesMetadata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "seriesMetadata" element
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType insertNewSeriesMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().insert_element_user(SERIESMETADATA$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "seriesMetadata" element
     */
    public org.isotc211.x2005.gmd.MDMetadataPropertyType addNewSeriesMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataPropertyType)get_store().add_element_user(SERIESMETADATA$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "seriesMetadata" element
     */
    public void removeSeriesMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIESMETADATA$2, i);
        }
    }
    
    /**
     * Gets array of all "subset" elements
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType[] getSubsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSET$4, targetList);
            org.isotc211.x2005.gmd.DSAggregatePropertyType[] result = new org.isotc211.x2005.gmd.DSAggregatePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subset" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType getSubsetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(SUBSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subset" element
     */
    public int sizeOfSubsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSET$4);
        }
    }
    
    /**
     * Sets array of all "subset" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubsetArray(org.isotc211.x2005.gmd.DSAggregatePropertyType[] subsetArray)
    {
        check_orphaned();
        arraySetterHelper(subsetArray, SUBSET$4);
    }
    
    /**
     * Sets ith "subset" element
     */
    public void setSubsetArray(int i, org.isotc211.x2005.gmd.DSAggregatePropertyType subset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(SUBSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subset);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subset" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType insertNewSubset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().insert_element_user(SUBSET$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subset" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType addNewSubset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().add_element_user(SUBSET$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "subset" element
     */
    public void removeSubset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSET$4, i);
        }
    }
    
    /**
     * Gets array of all "superset" elements
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType[] getSupersetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPERSET$6, targetList);
            org.isotc211.x2005.gmd.DSAggregatePropertyType[] result = new org.isotc211.x2005.gmd.DSAggregatePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "superset" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType getSupersetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(SUPERSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "superset" element
     */
    public int sizeOfSupersetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPERSET$6);
        }
    }
    
    /**
     * Sets array of all "superset" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupersetArray(org.isotc211.x2005.gmd.DSAggregatePropertyType[] supersetArray)
    {
        check_orphaned();
        arraySetterHelper(supersetArray, SUPERSET$6);
    }
    
    /**
     * Sets ith "superset" element
     */
    public void setSupersetArray(int i, org.isotc211.x2005.gmd.DSAggregatePropertyType superset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(SUPERSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(superset);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "superset" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType insertNewSuperset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().insert_element_user(SUPERSET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "superset" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType addNewSuperset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().add_element_user(SUPERSET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "superset" element
     */
    public void removeSuperset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPERSET$6, i);
        }
    }
}
