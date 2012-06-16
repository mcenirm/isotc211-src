/*
 * XML Type:  MD_Distribution_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Distribution_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDDistributionTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public MDDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTRIBUTIONFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distributionFormat");
    private static final javax.xml.namespace.QName DISTRIBUTOR$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distributor");
    private static final javax.xml.namespace.QName TRANSFEROPTIONS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "transferOptions");
    
    
    /**
     * Gets array of all "distributionFormat" elements
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType[] getDistributionFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTRIBUTIONFORMAT$0, targetList);
            org.isotc211.x2005.gmd.MDFormatPropertyType[] result = new org.isotc211.x2005.gmd.MDFormatPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distributionFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType getDistributionFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(DISTRIBUTIONFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distributionFormat" element
     */
    public int sizeOfDistributionFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTIONFORMAT$0);
        }
    }
    
    /**
     * Sets array of all "distributionFormat" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDistributionFormatArray(org.isotc211.x2005.gmd.MDFormatPropertyType[] distributionFormatArray)
    {
        check_orphaned();
        arraySetterHelper(distributionFormatArray, DISTRIBUTIONFORMAT$0);
    }
    
    /**
     * Sets ith "distributionFormat" element
     */
    public void setDistributionFormatArray(int i, org.isotc211.x2005.gmd.MDFormatPropertyType distributionFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(DISTRIBUTIONFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distributionFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributionFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType insertNewDistributionFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().insert_element_user(DISTRIBUTIONFORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributionFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType addNewDistributionFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().add_element_user(DISTRIBUTIONFORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "distributionFormat" element
     */
    public void removeDistributionFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTIONFORMAT$0, i);
        }
    }
    
    /**
     * Gets array of all "distributor" elements
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType[] getDistributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTRIBUTOR$2, targetList);
            org.isotc211.x2005.gmd.MDDistributorPropertyType[] result = new org.isotc211.x2005.gmd.MDDistributorPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType getDistributorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().find_element_user(DISTRIBUTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distributor" element
     */
    public int sizeOfDistributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTOR$2);
        }
    }
    
    /**
     * Sets array of all "distributor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDistributorArray(org.isotc211.x2005.gmd.MDDistributorPropertyType[] distributorArray)
    {
        check_orphaned();
        arraySetterHelper(distributorArray, DISTRIBUTOR$2);
    }
    
    /**
     * Sets ith "distributor" element
     */
    public void setDistributorArray(int i, org.isotc211.x2005.gmd.MDDistributorPropertyType distributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().find_element_user(DISTRIBUTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distributor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType insertNewDistributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().insert_element_user(DISTRIBUTOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType addNewDistributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().add_element_user(DISTRIBUTOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "distributor" element
     */
    public void removeDistributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTOR$2, i);
        }
    }
    
    /**
     * Gets array of all "transferOptions" elements
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] getTransferOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSFEROPTIONS$4, targetList);
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] result = new org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "transferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType getTransferOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().find_element_user(TRANSFEROPTIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "transferOptions" element
     */
    public int sizeOfTransferOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFEROPTIONS$4);
        }
    }
    
    /**
     * Sets array of all "transferOptions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTransferOptionsArray(org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] transferOptionsArray)
    {
        check_orphaned();
        arraySetterHelper(transferOptionsArray, TRANSFEROPTIONS$4);
    }
    
    /**
     * Sets ith "transferOptions" element
     */
    public void setTransferOptionsArray(int i, org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType transferOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().find_element_user(TRANSFEROPTIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transferOptions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType insertNewTransferOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().insert_element_user(TRANSFEROPTIONS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType addNewTransferOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().add_element_user(TRANSFEROPTIONS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "transferOptions" element
     */
    public void removeTransferOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFEROPTIONS$4, i);
        }
    }
}
