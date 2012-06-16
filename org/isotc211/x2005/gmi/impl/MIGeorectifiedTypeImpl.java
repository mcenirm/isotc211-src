/*
 * XML Type:  MI_Georectified_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGeorectifiedType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Georectified_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIGeorectifiedTypeImpl extends org.isotc211.x2005.gmd.impl.MDGeorectifiedTypeImpl implements org.isotc211.x2005.gmi.MIGeorectifiedType
{
    private static final long serialVersionUID = 1L;
    
    public MIGeorectifiedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKPOINT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "checkPoint");
    private static final javax.xml.namespace.QName GEOLOCATIONIDENTIFICATION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "geolocationIdentification");
    
    
    /**
     * Gets array of all "checkPoint" elements
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType[] getCheckPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHECKPOINT$0, targetList);
            org.isotc211.x2005.gmi.MIGCPPropertyType[] result = new org.isotc211.x2005.gmi.MIGCPPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "checkPoint" element
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType getCheckPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().find_element_user(CHECKPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "checkPoint" element
     */
    public int sizeOfCheckPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKPOINT$0);
        }
    }
    
    /**
     * Sets array of all "checkPoint" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCheckPointArray(org.isotc211.x2005.gmi.MIGCPPropertyType[] checkPointArray)
    {
        check_orphaned();
        arraySetterHelper(checkPointArray, CHECKPOINT$0);
    }
    
    /**
     * Sets ith "checkPoint" element
     */
    public void setCheckPointArray(int i, org.isotc211.x2005.gmi.MIGCPPropertyType checkPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().find_element_user(CHECKPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(checkPoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "checkPoint" element
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType insertNewCheckPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().insert_element_user(CHECKPOINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "checkPoint" element
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType addNewCheckPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().add_element_user(CHECKPOINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "checkPoint" element
     */
    public void removeCheckPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKPOINT$0, i);
        }
    }
    
    /**
     * Gets array of all "geolocationIdentification" elements
     */
    public org.isotc211.x2005.gmi.MIGCPCollectionPropertyType[] getGeolocationIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOLOCATIONIDENTIFICATION$2, targetList);
            org.isotc211.x2005.gmi.MIGCPCollectionPropertyType[] result = new org.isotc211.x2005.gmi.MIGCPCollectionPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geolocationIdentification" element
     */
    public org.isotc211.x2005.gmi.MIGCPCollectionPropertyType getGeolocationIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPCollectionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPCollectionPropertyType)get_store().find_element_user(GEOLOCATIONIDENTIFICATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geolocationIdentification" element
     */
    public int sizeOfGeolocationIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOLOCATIONIDENTIFICATION$2);
        }
    }
    
    /**
     * Sets array of all "geolocationIdentification" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGeolocationIdentificationArray(org.isotc211.x2005.gmi.MIGCPCollectionPropertyType[] geolocationIdentificationArray)
    {
        check_orphaned();
        arraySetterHelper(geolocationIdentificationArray, GEOLOCATIONIDENTIFICATION$2);
    }
    
    /**
     * Sets ith "geolocationIdentification" element
     */
    public void setGeolocationIdentificationArray(int i, org.isotc211.x2005.gmi.MIGCPCollectionPropertyType geolocationIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPCollectionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPCollectionPropertyType)get_store().find_element_user(GEOLOCATIONIDENTIFICATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geolocationIdentification);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geolocationIdentification" element
     */
    public org.isotc211.x2005.gmi.MIGCPCollectionPropertyType insertNewGeolocationIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPCollectionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPCollectionPropertyType)get_store().insert_element_user(GEOLOCATIONIDENTIFICATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geolocationIdentification" element
     */
    public org.isotc211.x2005.gmi.MIGCPCollectionPropertyType addNewGeolocationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPCollectionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPCollectionPropertyType)get_store().add_element_user(GEOLOCATIONIDENTIFICATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "geolocationIdentification" element
     */
    public void removeGeolocationIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOLOCATIONIDENTIFICATION$2, i);
        }
    }
}
