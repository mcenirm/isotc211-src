/*
 * XML Type:  MI_Metadata_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIMetadataType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Metadata_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIMetadataTypeImpl extends org.isotc211.x2005.gmd.impl.MDMetadataTypeImpl implements org.isotc211.x2005.gmi.MIMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public MIMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACQUISITIONINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "acquisitionInformation");
    
    
    /**
     * Gets array of all "acquisitionInformation" elements
     */
    public org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType[] getAcquisitionInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACQUISITIONINFORMATION$0, targetList);
            org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType[] result = new org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "acquisitionInformation" element
     */
    public org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType getAcquisitionInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType)get_store().find_element_user(ACQUISITIONINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "acquisitionInformation" element
     */
    public int sizeOfAcquisitionInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACQUISITIONINFORMATION$0);
        }
    }
    
    /**
     * Sets array of all "acquisitionInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAcquisitionInformationArray(org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType[] acquisitionInformationArray)
    {
        check_orphaned();
        arraySetterHelper(acquisitionInformationArray, ACQUISITIONINFORMATION$0);
    }
    
    /**
     * Sets ith "acquisitionInformation" element
     */
    public void setAcquisitionInformationArray(int i, org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType acquisitionInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType)get_store().find_element_user(ACQUISITIONINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(acquisitionInformation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "acquisitionInformation" element
     */
    public org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType insertNewAcquisitionInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType)get_store().insert_element_user(ACQUISITIONINFORMATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "acquisitionInformation" element
     */
    public org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType addNewAcquisitionInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIAcquisitionInformationPropertyType)get_store().add_element_user(ACQUISITIONINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "acquisitionInformation" element
     */
    public void removeAcquisitionInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACQUISITIONINFORMATION$0, i);
        }
    }
}
