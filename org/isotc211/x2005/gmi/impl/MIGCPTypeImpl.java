/*
 * XML Type:  MI_GCP_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGCPType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_GCP_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIGCPTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIGCPType
{
    private static final long serialVersionUID = 1L;
    
    public MIGCPTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICCOORDINATES$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "geographicCoordinates");
    private static final javax.xml.namespace.QName ACCURACYREPORT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "accuracyReport");
    
    
    /**
     * Gets the "geographicCoordinates" element
     */
    public org.isotc211.x2005.gmi.DirectPositionPropertyType getGeographicCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.DirectPositionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.DirectPositionPropertyType)get_store().find_element_user(GEOGRAPHICCOORDINATES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geographicCoordinates" element
     */
    public void setGeographicCoordinates(org.isotc211.x2005.gmi.DirectPositionPropertyType geographicCoordinates)
    {
        generatedSetterHelperImpl(geographicCoordinates, GEOGRAPHICCOORDINATES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geographicCoordinates" element
     */
    public org.isotc211.x2005.gmi.DirectPositionPropertyType addNewGeographicCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.DirectPositionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.DirectPositionPropertyType)get_store().add_element_user(GEOGRAPHICCOORDINATES$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "accuracyReport" elements
     */
    public org.isotc211.x2005.gmd.DQElementPropertyType[] getAccuracyReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCURACYREPORT$2, targetList);
            org.isotc211.x2005.gmd.DQElementPropertyType[] result = new org.isotc211.x2005.gmd.DQElementPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "accuracyReport" element
     */
    public org.isotc211.x2005.gmd.DQElementPropertyType getAccuracyReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().find_element_user(ACCURACYREPORT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "accuracyReport" element
     */
    public int sizeOfAccuracyReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCURACYREPORT$2);
        }
    }
    
    /**
     * Sets array of all "accuracyReport" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAccuracyReportArray(org.isotc211.x2005.gmd.DQElementPropertyType[] accuracyReportArray)
    {
        check_orphaned();
        arraySetterHelper(accuracyReportArray, ACCURACYREPORT$2);
    }
    
    /**
     * Sets ith "accuracyReport" element
     */
    public void setAccuracyReportArray(int i, org.isotc211.x2005.gmd.DQElementPropertyType accuracyReport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().find_element_user(ACCURACYREPORT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accuracyReport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "accuracyReport" element
     */
    public org.isotc211.x2005.gmd.DQElementPropertyType insertNewAccuracyReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().insert_element_user(ACCURACYREPORT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "accuracyReport" element
     */
    public org.isotc211.x2005.gmd.DQElementPropertyType addNewAccuracyReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().add_element_user(ACCURACYREPORT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "accuracyReport" element
     */
    public void removeAccuracyReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCURACYREPORT$2, i);
        }
    }
}
