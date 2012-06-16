/*
 * XML Type:  MI_CoverageDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MICoverageDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_CoverageDescription_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MICoverageDescriptionTypeImpl extends org.isotc211.x2005.gmd.impl.MDCoverageDescriptionTypeImpl implements org.isotc211.x2005.gmi.MICoverageDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public MICoverageDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEELEMENTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "rangeElementDescription");
    
    
    /**
     * Gets array of all "rangeElementDescription" elements
     */
    public org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType[] getRangeElementDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RANGEELEMENTDESCRIPTION$0, targetList);
            org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType[] result = new org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rangeElementDescription" element
     */
    public org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType getRangeElementDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType)get_store().find_element_user(RANGEELEMENTDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rangeElementDescription" element
     */
    public int sizeOfRangeElementDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANGEELEMENTDESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "rangeElementDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRangeElementDescriptionArray(org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType[] rangeElementDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(rangeElementDescriptionArray, RANGEELEMENTDESCRIPTION$0);
    }
    
    /**
     * Sets ith "rangeElementDescription" element
     */
    public void setRangeElementDescriptionArray(int i, org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType rangeElementDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType)get_store().find_element_user(RANGEELEMENTDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rangeElementDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rangeElementDescription" element
     */
    public org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType insertNewRangeElementDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType)get_store().insert_element_user(RANGEELEMENTDESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rangeElementDescription" element
     */
    public org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType addNewRangeElementDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRangeElementDescriptionPropertyType)get_store().add_element_user(RANGEELEMENTDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rangeElementDescription" element
     */
    public void removeRangeElementDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANGEELEMENTDESCRIPTION$0, i);
        }
    }
}
