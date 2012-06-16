/*
 * XML Type:  MD_Usage_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDUsageType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Usage_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDUsageTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDUsageType
{
    private static final long serialVersionUID = 1L;
    
    public MDUsageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIFICUSAGE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "specificUsage");
    private static final javax.xml.namespace.QName USAGEDATETIME$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "usageDateTime");
    private static final javax.xml.namespace.QName USERDETERMINEDLIMITATIONS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "userDeterminedLimitations");
    private static final javax.xml.namespace.QName USERCONTACTINFO$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "userContactInfo");
    
    
    /**
     * Gets the "specificUsage" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getSpecificUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(SPECIFICUSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "specificUsage" element
     */
    public void setSpecificUsage(org.isotc211.x2005.gco.CharacterStringPropertyType specificUsage)
    {
        generatedSetterHelperImpl(specificUsage, SPECIFICUSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "specificUsage" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewSpecificUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(SPECIFICUSAGE$0);
            return target;
        }
    }
    
    /**
     * Gets the "usageDateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getUsageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(USAGEDATETIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usageDateTime" element
     */
    public boolean isSetUsageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USAGEDATETIME$2) != 0;
        }
    }
    
    /**
     * Sets the "usageDateTime" element
     */
    public void setUsageDateTime(org.isotc211.x2005.gco.DateTimePropertyType usageDateTime)
    {
        generatedSetterHelperImpl(usageDateTime, USAGEDATETIME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usageDateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewUsageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(USAGEDATETIME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "usageDateTime" element
     */
    public void unsetUsageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USAGEDATETIME$2, 0);
        }
    }
    
    /**
     * Gets the "userDeterminedLimitations" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getUserDeterminedLimitations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(USERDETERMINEDLIMITATIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userDeterminedLimitations" element
     */
    public boolean isSetUserDeterminedLimitations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERDETERMINEDLIMITATIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "userDeterminedLimitations" element
     */
    public void setUserDeterminedLimitations(org.isotc211.x2005.gco.CharacterStringPropertyType userDeterminedLimitations)
    {
        generatedSetterHelperImpl(userDeterminedLimitations, USERDETERMINEDLIMITATIONS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userDeterminedLimitations" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewUserDeterminedLimitations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(USERDETERMINEDLIMITATIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "userDeterminedLimitations" element
     */
    public void unsetUserDeterminedLimitations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERDETERMINEDLIMITATIONS$4, 0);
        }
    }
    
    /**
     * Gets array of all "userContactInfo" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getUserContactInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USERCONTACTINFO$6, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "userContactInfo" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getUserContactInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(USERCONTACTINFO$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "userContactInfo" element
     */
    public int sizeOfUserContactInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERCONTACTINFO$6);
        }
    }
    
    /**
     * Sets array of all "userContactInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUserContactInfoArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] userContactInfoArray)
    {
        check_orphaned();
        arraySetterHelper(userContactInfoArray, USERCONTACTINFO$6);
    }
    
    /**
     * Sets ith "userContactInfo" element
     */
    public void setUserContactInfoArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType userContactInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(USERCONTACTINFO$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(userContactInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "userContactInfo" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewUserContactInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(USERCONTACTINFO$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "userContactInfo" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewUserContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(USERCONTACTINFO$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "userContactInfo" element
     */
    public void removeUserContactInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERCONTACTINFO$6, i);
        }
    }
}
