/*
 * XML Type:  AbstractMI_GeolocationInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML AbstractMI_GeolocationInformation_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class AbstractMIGeolocationInformationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMIGeolocationInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUALITYINFO$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "qualityInfo");
    
    
    /**
     * Gets array of all "qualityInfo" elements
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType[] getQualityInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUALITYINFO$0, targetList);
            org.isotc211.x2005.gmd.DQDataQualityPropertyType[] result = new org.isotc211.x2005.gmd.DQDataQualityPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "qualityInfo" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType getQualityInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().find_element_user(QUALITYINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "qualityInfo" element
     */
    public int sizeOfQualityInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUALITYINFO$0);
        }
    }
    
    /**
     * Sets array of all "qualityInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQualityInfoArray(org.isotc211.x2005.gmd.DQDataQualityPropertyType[] qualityInfoArray)
    {
        check_orphaned();
        arraySetterHelper(qualityInfoArray, QUALITYINFO$0);
    }
    
    /**
     * Sets ith "qualityInfo" element
     */
    public void setQualityInfoArray(int i, org.isotc211.x2005.gmd.DQDataQualityPropertyType qualityInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().find_element_user(QUALITYINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(qualityInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualityInfo" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType insertNewQualityInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().insert_element_user(QUALITYINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qualityInfo" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType addNewQualityInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().add_element_user(QUALITYINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "qualityInfo" element
     */
    public void removeQualityInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUALITYINFO$0, i);
        }
    }
}
