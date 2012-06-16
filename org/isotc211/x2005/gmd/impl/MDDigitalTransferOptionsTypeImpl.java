/*
 * XML Type:  MD_DigitalTransferOptions_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDigitalTransferOptionsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_DigitalTransferOptions_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDDigitalTransferOptionsTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDDigitalTransferOptionsType
{
    private static final long serialVersionUID = 1L;
    
    public MDDigitalTransferOptionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITSOFDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "unitsOfDistribution");
    private static final javax.xml.namespace.QName TRANSFERSIZE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "transferSize");
    private static final javax.xml.namespace.QName ONLINE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "onLine");
    private static final javax.xml.namespace.QName OFFLINE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "offLine");
    
    
    /**
     * Gets the "unitsOfDistribution" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getUnitsOfDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(UNITSOFDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "unitsOfDistribution" element
     */
    public boolean isSetUnitsOfDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITSOFDISTRIBUTION$0) != 0;
        }
    }
    
    /**
     * Sets the "unitsOfDistribution" element
     */
    public void setUnitsOfDistribution(org.isotc211.x2005.gco.CharacterStringPropertyType unitsOfDistribution)
    {
        generatedSetterHelperImpl(unitsOfDistribution, UNITSOFDISTRIBUTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unitsOfDistribution" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewUnitsOfDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(UNITSOFDISTRIBUTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "unitsOfDistribution" element
     */
    public void unsetUnitsOfDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITSOFDISTRIBUTION$0, 0);
        }
    }
    
    /**
     * Gets the "transferSize" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getTransferSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(TRANSFERSIZE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transferSize" element
     */
    public boolean isSetTransferSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFERSIZE$2) != 0;
        }
    }
    
    /**
     * Sets the "transferSize" element
     */
    public void setTransferSize(org.isotc211.x2005.gco.RealPropertyType transferSize)
    {
        generatedSetterHelperImpl(transferSize, TRANSFERSIZE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transferSize" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewTransferSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(TRANSFERSIZE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "transferSize" element
     */
    public void unsetTransferSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFERSIZE$2, 0);
        }
    }
    
    /**
     * Gets array of all "onLine" elements
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType[] getOnLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ONLINE$4, targetList);
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType[] result = new org.isotc211.x2005.gmd.CIOnlineResourcePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "onLine" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType getOnLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().find_element_user(ONLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "onLine" element
     */
    public int sizeOfOnLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONLINE$4);
        }
    }
    
    /**
     * Sets array of all "onLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOnLineArray(org.isotc211.x2005.gmd.CIOnlineResourcePropertyType[] onLineArray)
    {
        check_orphaned();
        arraySetterHelper(onLineArray, ONLINE$4);
    }
    
    /**
     * Sets ith "onLine" element
     */
    public void setOnLineArray(int i, org.isotc211.x2005.gmd.CIOnlineResourcePropertyType onLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().find_element_user(ONLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(onLine);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "onLine" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType insertNewOnLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().insert_element_user(ONLINE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "onLine" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType addNewOnLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().add_element_user(ONLINE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "onLine" element
     */
    public void removeOnLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONLINE$4, i);
        }
    }
    
    /**
     * Gets the "offLine" element
     */
    public org.isotc211.x2005.gmd.MDMediumPropertyType getOffLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumPropertyType)get_store().find_element_user(OFFLINE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offLine" element
     */
    public boolean isSetOffLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFLINE$6) != 0;
        }
    }
    
    /**
     * Sets the "offLine" element
     */
    public void setOffLine(org.isotc211.x2005.gmd.MDMediumPropertyType offLine)
    {
        generatedSetterHelperImpl(offLine, OFFLINE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "offLine" element
     */
    public org.isotc211.x2005.gmd.MDMediumPropertyType addNewOffLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumPropertyType)get_store().add_element_user(OFFLINE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "offLine" element
     */
    public void unsetOffLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFLINE$6, 0);
        }
    }
}
