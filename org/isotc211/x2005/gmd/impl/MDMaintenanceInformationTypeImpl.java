/*
 * XML Type:  MD_MaintenanceInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMaintenanceInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_MaintenanceInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDMaintenanceInformationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDMaintenanceInformationType
{
    private static final long serialVersionUID = 1L;
    
    public MDMaintenanceInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINTENANCEANDUPDATEFREQUENCY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "maintenanceAndUpdateFrequency");
    private static final javax.xml.namespace.QName DATEOFNEXTUPDATE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dateOfNextUpdate");
    private static final javax.xml.namespace.QName USERDEFINEDMAINTENANCEFREQUENCY$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "userDefinedMaintenanceFrequency");
    private static final javax.xml.namespace.QName UPDATESCOPE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "updateScope");
    private static final javax.xml.namespace.QName UPDATESCOPEDESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "updateScopeDescription");
    private static final javax.xml.namespace.QName MAINTENANCENOTE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "maintenanceNote");
    private static final javax.xml.namespace.QName CONTACT$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "contact");
    
    
    /**
     * Gets the "maintenanceAndUpdateFrequency" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType)get_store().find_element_user(MAINTENANCEANDUPDATEFREQUENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maintenanceAndUpdateFrequency" element
     */
    public void setMaintenanceAndUpdateFrequency(org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType maintenanceAndUpdateFrequency)
    {
        generatedSetterHelperImpl(maintenanceAndUpdateFrequency, MAINTENANCEANDUPDATEFREQUENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maintenanceAndUpdateFrequency" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType addNewMaintenanceAndUpdateFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType)get_store().add_element_user(MAINTENANCEANDUPDATEFREQUENCY$0);
            return target;
        }
    }
    
    /**
     * Gets the "dateOfNextUpdate" element
     */
    public org.isotc211.x2005.gco.DatePropertyType getDateOfNextUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().find_element_user(DATEOFNEXTUPDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dateOfNextUpdate" element
     */
    public boolean isSetDateOfNextUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEOFNEXTUPDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "dateOfNextUpdate" element
     */
    public void setDateOfNextUpdate(org.isotc211.x2005.gco.DatePropertyType dateOfNextUpdate)
    {
        generatedSetterHelperImpl(dateOfNextUpdate, DATEOFNEXTUPDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateOfNextUpdate" element
     */
    public org.isotc211.x2005.gco.DatePropertyType addNewDateOfNextUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().add_element_user(DATEOFNEXTUPDATE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dateOfNextUpdate" element
     */
    public void unsetDateOfNextUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEOFNEXTUPDATE$2, 0);
        }
    }
    
    /**
     * Gets the "userDefinedMaintenanceFrequency" element
     */
    public org.isotc211.x2005.gts.TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gts.TMPeriodDurationPropertyType target = null;
            target = (org.isotc211.x2005.gts.TMPeriodDurationPropertyType)get_store().find_element_user(USERDEFINEDMAINTENANCEFREQUENCY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userDefinedMaintenanceFrequency" element
     */
    public boolean isSetUserDefinedMaintenanceFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERDEFINEDMAINTENANCEFREQUENCY$4) != 0;
        }
    }
    
    /**
     * Sets the "userDefinedMaintenanceFrequency" element
     */
    public void setUserDefinedMaintenanceFrequency(org.isotc211.x2005.gts.TMPeriodDurationPropertyType userDefinedMaintenanceFrequency)
    {
        generatedSetterHelperImpl(userDefinedMaintenanceFrequency, USERDEFINEDMAINTENANCEFREQUENCY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userDefinedMaintenanceFrequency" element
     */
    public org.isotc211.x2005.gts.TMPeriodDurationPropertyType addNewUserDefinedMaintenanceFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gts.TMPeriodDurationPropertyType target = null;
            target = (org.isotc211.x2005.gts.TMPeriodDurationPropertyType)get_store().add_element_user(USERDEFINEDMAINTENANCEFREQUENCY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "userDefinedMaintenanceFrequency" element
     */
    public void unsetUserDefinedMaintenanceFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERDEFINEDMAINTENANCEFREQUENCY$4, 0);
        }
    }
    
    /**
     * Gets array of all "updateScope" elements
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType[] getUpdateScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPDATESCOPE$6, targetList);
            org.isotc211.x2005.gmd.MDScopeCodePropertyType[] result = new org.isotc211.x2005.gmd.MDScopeCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "updateScope" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType getUpdateScopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().find_element_user(UPDATESCOPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "updateScope" element
     */
    public int sizeOfUpdateScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATESCOPE$6);
        }
    }
    
    /**
     * Sets array of all "updateScope" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUpdateScopeArray(org.isotc211.x2005.gmd.MDScopeCodePropertyType[] updateScopeArray)
    {
        check_orphaned();
        arraySetterHelper(updateScopeArray, UPDATESCOPE$6);
    }
    
    /**
     * Sets ith "updateScope" element
     */
    public void setUpdateScopeArray(int i, org.isotc211.x2005.gmd.MDScopeCodePropertyType updateScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().find_element_user(UPDATESCOPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(updateScope);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "updateScope" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType insertNewUpdateScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().insert_element_user(UPDATESCOPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "updateScope" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType addNewUpdateScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().add_element_user(UPDATESCOPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "updateScope" element
     */
    public void removeUpdateScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATESCOPE$6, i);
        }
    }
    
    /**
     * Gets array of all "updateScopeDescription" elements
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] getUpdateScopeDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPDATESCOPEDESCRIPTION$8, targetList);
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] result = new org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "updateScopeDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType getUpdateScopeDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().find_element_user(UPDATESCOPEDESCRIPTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "updateScopeDescription" element
     */
    public int sizeOfUpdateScopeDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATESCOPEDESCRIPTION$8);
        }
    }
    
    /**
     * Sets array of all "updateScopeDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUpdateScopeDescriptionArray(org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] updateScopeDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(updateScopeDescriptionArray, UPDATESCOPEDESCRIPTION$8);
    }
    
    /**
     * Sets ith "updateScopeDescription" element
     */
    public void setUpdateScopeDescriptionArray(int i, org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType updateScopeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().find_element_user(UPDATESCOPEDESCRIPTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(updateScopeDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "updateScopeDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType insertNewUpdateScopeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().insert_element_user(UPDATESCOPEDESCRIPTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "updateScopeDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType addNewUpdateScopeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().add_element_user(UPDATESCOPEDESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "updateScopeDescription" element
     */
    public void removeUpdateScopeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATESCOPEDESCRIPTION$8, i);
        }
    }
    
    /**
     * Gets array of all "maintenanceNote" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getMaintenanceNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAINTENANCENOTE$10, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "maintenanceNote" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getMaintenanceNoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(MAINTENANCENOTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "maintenanceNote" element
     */
    public int sizeOfMaintenanceNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINTENANCENOTE$10);
        }
    }
    
    /**
     * Sets array of all "maintenanceNote" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaintenanceNoteArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] maintenanceNoteArray)
    {
        check_orphaned();
        arraySetterHelper(maintenanceNoteArray, MAINTENANCENOTE$10);
    }
    
    /**
     * Sets ith "maintenanceNote" element
     */
    public void setMaintenanceNoteArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType maintenanceNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(MAINTENANCENOTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(maintenanceNote);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "maintenanceNote" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewMaintenanceNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(MAINTENANCENOTE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "maintenanceNote" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewMaintenanceNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(MAINTENANCENOTE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "maintenanceNote" element
     */
    public void removeMaintenanceNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINTENANCENOTE$10, i);
        }
    }
    
    /**
     * Gets array of all "contact" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACT$12, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(CONTACT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contact" element
     */
    public int sizeOfContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACT$12);
        }
    }
    
    /**
     * Sets array of all "contact" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContactArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] contactArray)
    {
        check_orphaned();
        arraySetterHelper(contactArray, CONTACT$12);
    }
    
    /**
     * Sets ith "contact" element
     */
    public void setContactArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(CONTACT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(CONTACT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(CONTACT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "contact" element
     */
    public void removeContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACT$12, i);
        }
    }
}
