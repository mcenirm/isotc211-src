/*
 * XML Type:  Multiplicity_Type
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.MultiplicityType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML Multiplicity_Type(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class MultiplicityTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gco.MultiplicityType
{
    private static final long serialVersionUID = 1L;
    
    public MultiplicityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "range");
    
    
    /**
     * Gets array of all "range" elements
     */
    public org.isotc211.x2005.gco.MultiplicityRangePropertyType[] getRangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RANGE$0, targetList);
            org.isotc211.x2005.gco.MultiplicityRangePropertyType[] result = new org.isotc211.x2005.gco.MultiplicityRangePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "range" element
     */
    public org.isotc211.x2005.gco.MultiplicityRangePropertyType getRangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityRangePropertyType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityRangePropertyType)get_store().find_element_user(RANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "range" element
     */
    public int sizeOfRangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANGE$0);
        }
    }
    
    /**
     * Sets array of all "range" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRangeArray(org.isotc211.x2005.gco.MultiplicityRangePropertyType[] rangeArray)
    {
        check_orphaned();
        arraySetterHelper(rangeArray, RANGE$0);
    }
    
    /**
     * Sets ith "range" element
     */
    public void setRangeArray(int i, org.isotc211.x2005.gco.MultiplicityRangePropertyType range)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityRangePropertyType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityRangePropertyType)get_store().find_element_user(RANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(range);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "range" element
     */
    public org.isotc211.x2005.gco.MultiplicityRangePropertyType insertNewRange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityRangePropertyType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityRangePropertyType)get_store().insert_element_user(RANGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "range" element
     */
    public org.isotc211.x2005.gco.MultiplicityRangePropertyType addNewRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityRangePropertyType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityRangePropertyType)get_store().add_element_user(RANGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "range" element
     */
    public void removeRange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANGE$0, i);
        }
    }
}
