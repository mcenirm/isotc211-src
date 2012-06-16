/*
 * XML Type:  MD_Distributor_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDistributorType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Distributor_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDDistributorTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDDistributorType
{
    private static final long serialVersionUID = 1L;
    
    public MDDistributorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTRIBUTORCONTACT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distributorContact");
    private static final javax.xml.namespace.QName DISTRIBUTIONORDERPROCESS$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distributionOrderProcess");
    private static final javax.xml.namespace.QName DISTRIBUTORFORMAT$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distributorFormat");
    private static final javax.xml.namespace.QName DISTRIBUTORTRANSFEROPTIONS$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distributorTransferOptions");
    
    
    /**
     * Gets the "distributorContact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getDistributorContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(DISTRIBUTORCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "distributorContact" element
     */
    public void setDistributorContact(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType distributorContact)
    {
        generatedSetterHelperImpl(distributorContact, DISTRIBUTORCONTACT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "distributorContact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewDistributorContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(DISTRIBUTORCONTACT$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "distributionOrderProcess" elements
     */
    public org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType[] getDistributionOrderProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTRIBUTIONORDERPROCESS$2, targetList);
            org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType[] result = new org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distributionOrderProcess" element
     */
    public org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType getDistributionOrderProcessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType)get_store().find_element_user(DISTRIBUTIONORDERPROCESS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distributionOrderProcess" element
     */
    public int sizeOfDistributionOrderProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTIONORDERPROCESS$2);
        }
    }
    
    /**
     * Sets array of all "distributionOrderProcess" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDistributionOrderProcessArray(org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType[] distributionOrderProcessArray)
    {
        check_orphaned();
        arraySetterHelper(distributionOrderProcessArray, DISTRIBUTIONORDERPROCESS$2);
    }
    
    /**
     * Sets ith "distributionOrderProcess" element
     */
    public void setDistributionOrderProcessArray(int i, org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType distributionOrderProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType)get_store().find_element_user(DISTRIBUTIONORDERPROCESS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distributionOrderProcess);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributionOrderProcess" element
     */
    public org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType insertNewDistributionOrderProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType)get_store().insert_element_user(DISTRIBUTIONORDERPROCESS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributionOrderProcess" element
     */
    public org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType addNewDistributionOrderProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType)get_store().add_element_user(DISTRIBUTIONORDERPROCESS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "distributionOrderProcess" element
     */
    public void removeDistributionOrderProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTIONORDERPROCESS$2, i);
        }
    }
    
    /**
     * Gets array of all "distributorFormat" elements
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType[] getDistributorFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTRIBUTORFORMAT$4, targetList);
            org.isotc211.x2005.gmd.MDFormatPropertyType[] result = new org.isotc211.x2005.gmd.MDFormatPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distributorFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType getDistributorFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(DISTRIBUTORFORMAT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distributorFormat" element
     */
    public int sizeOfDistributorFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTORFORMAT$4);
        }
    }
    
    /**
     * Sets array of all "distributorFormat" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDistributorFormatArray(org.isotc211.x2005.gmd.MDFormatPropertyType[] distributorFormatArray)
    {
        check_orphaned();
        arraySetterHelper(distributorFormatArray, DISTRIBUTORFORMAT$4);
    }
    
    /**
     * Sets ith "distributorFormat" element
     */
    public void setDistributorFormatArray(int i, org.isotc211.x2005.gmd.MDFormatPropertyType distributorFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(DISTRIBUTORFORMAT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distributorFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributorFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType insertNewDistributorFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().insert_element_user(DISTRIBUTORFORMAT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributorFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType addNewDistributorFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().add_element_user(DISTRIBUTORFORMAT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "distributorFormat" element
     */
    public void removeDistributorFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTORFORMAT$4, i);
        }
    }
    
    /**
     * Gets array of all "distributorTransferOptions" elements
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] getDistributorTransferOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTRIBUTORTRANSFEROPTIONS$6, targetList);
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] result = new org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distributorTransferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType getDistributorTransferOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().find_element_user(DISTRIBUTORTRANSFEROPTIONS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distributorTransferOptions" element
     */
    public int sizeOfDistributorTransferOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTORTRANSFEROPTIONS$6);
        }
    }
    
    /**
     * Sets array of all "distributorTransferOptions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDistributorTransferOptionsArray(org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] distributorTransferOptionsArray)
    {
        check_orphaned();
        arraySetterHelper(distributorTransferOptionsArray, DISTRIBUTORTRANSFEROPTIONS$6);
    }
    
    /**
     * Sets ith "distributorTransferOptions" element
     */
    public void setDistributorTransferOptionsArray(int i, org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType distributorTransferOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().find_element_user(DISTRIBUTORTRANSFEROPTIONS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distributorTransferOptions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributorTransferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType insertNewDistributorTransferOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().insert_element_user(DISTRIBUTORTRANSFEROPTIONS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributorTransferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType addNewDistributorTransferOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType)get_store().add_element_user(DISTRIBUTORTRANSFEROPTIONS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "distributorTransferOptions" element
     */
    public void removeDistributorTransferOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTORTRANSFEROPTIONS$6, i);
        }
    }
}
