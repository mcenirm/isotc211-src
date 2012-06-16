/*
 * XML Type:  PT_LocaleContainer_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.PTLocaleContainerType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML PT_LocaleContainer_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class PTLocaleContainerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.PTLocaleContainerType
{
    private static final long serialVersionUID = 1L;
    
    public PTLocaleContainerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "description");
    private static final javax.xml.namespace.QName LOCALE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "locale");
    private static final javax.xml.namespace.QName DATE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "date");
    private static final javax.xml.namespace.QName RESPONSIBLEPARTY$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "responsibleParty");
    private static final javax.xml.namespace.QName LOCALISEDSTRING$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "localisedString");
    
    
    /**
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "locale" element
     */
    public org.isotc211.x2005.gmd.PTLocalePropertyType getLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocalePropertyType target = null;
            target = (org.isotc211.x2005.gmd.PTLocalePropertyType)get_store().find_element_user(LOCALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locale" element
     */
    public void setLocale(org.isotc211.x2005.gmd.PTLocalePropertyType locale)
    {
        generatedSetterHelperImpl(locale, LOCALE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locale" element
     */
    public org.isotc211.x2005.gmd.PTLocalePropertyType addNewLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocalePropertyType target = null;
            target = (org.isotc211.x2005.gmd.PTLocalePropertyType)get_store().add_element_user(LOCALE$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "date" elements
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType[] getDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATE$4, targetList);
            org.isotc211.x2005.gmd.CIDatePropertyType[] result = new org.isotc211.x2005.gmd.CIDatePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "date" element
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType getDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().find_element_user(DATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "date" element
     */
    public int sizeOfDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$4);
        }
    }
    
    /**
     * Sets array of all "date" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDateArray(org.isotc211.x2005.gmd.CIDatePropertyType[] dateArray)
    {
        check_orphaned();
        arraySetterHelper(dateArray, DATE$4);
    }
    
    /**
     * Sets ith "date" element
     */
    public void setDateArray(int i, org.isotc211.x2005.gmd.CIDatePropertyType date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().find_element_user(DATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(date);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType insertNewDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().insert_element_user(DATE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().add_element_user(DATE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "date" element
     */
    public void removeDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$4, i);
        }
    }
    
    /**
     * Gets array of all "responsibleParty" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getResponsiblePartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESPONSIBLEPARTY$6, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "responsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getResponsiblePartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(RESPONSIBLEPARTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "responsibleParty" element
     */
    public int sizeOfResponsiblePartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSIBLEPARTY$6);
        }
    }
    
    /**
     * Sets array of all "responsibleParty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResponsiblePartyArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] responsiblePartyArray)
    {
        check_orphaned();
        arraySetterHelper(responsiblePartyArray, RESPONSIBLEPARTY$6);
    }
    
    /**
     * Sets ith "responsibleParty" element
     */
    public void setResponsiblePartyArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType responsibleParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(RESPONSIBLEPARTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(responsibleParty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "responsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewResponsibleParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(RESPONSIBLEPARTY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "responsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(RESPONSIBLEPARTY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "responsibleParty" element
     */
    public void removeResponsibleParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSIBLEPARTY$6, i);
        }
    }
    
    /**
     * Gets array of all "localisedString" elements
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] getLocalisedStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCALISEDSTRING$8, targetList);
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] result = new org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "localisedString" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType getLocalisedStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().find_element_user(LOCALISEDSTRING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "localisedString" element
     */
    public int sizeOfLocalisedStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALISEDSTRING$8);
        }
    }
    
    /**
     * Sets array of all "localisedString" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocalisedStringArray(org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] localisedStringArray)
    {
        check_orphaned();
        arraySetterHelper(localisedStringArray, LOCALISEDSTRING$8);
    }
    
    /**
     * Sets ith "localisedString" element
     */
    public void setLocalisedStringArray(int i, org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType localisedString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().find_element_user(LOCALISEDSTRING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(localisedString);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "localisedString" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType insertNewLocalisedString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().insert_element_user(LOCALISEDSTRING$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "localisedString" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType addNewLocalisedString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().add_element_user(LOCALISEDSTRING$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "localisedString" element
     */
    public void removeLocalisedString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALISEDSTRING$8, i);
        }
    }
}
