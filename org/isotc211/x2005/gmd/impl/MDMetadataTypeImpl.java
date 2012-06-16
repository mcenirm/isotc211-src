/*
 * XML Type:  MD_Metadata_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMetadataType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Metadata_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDMetadataTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public MDMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "fileIdentifier");
    private static final javax.xml.namespace.QName LANGUAGE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "language");
    private static final javax.xml.namespace.QName CHARACTERSET$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "characterSet");
    private static final javax.xml.namespace.QName PARENTIDENTIFIER$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "parentIdentifier");
    private static final javax.xml.namespace.QName HIERARCHYLEVEL$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "hierarchyLevel");
    private static final javax.xml.namespace.QName HIERARCHYLEVELNAME$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "hierarchyLevelName");
    private static final javax.xml.namespace.QName CONTACT$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "contact");
    private static final javax.xml.namespace.QName DATESTAMP$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dateStamp");
    private static final javax.xml.namespace.QName METADATASTANDARDNAME$16 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "metadataStandardName");
    private static final javax.xml.namespace.QName METADATASTANDARDVERSION$18 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "metadataStandardVersion");
    private static final javax.xml.namespace.QName DATASETURI$20 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dataSetURI");
    private static final javax.xml.namespace.QName LOCALE$22 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "locale");
    private static final javax.xml.namespace.QName SPATIALREPRESENTATIONINFO$24 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "spatialRepresentationInfo");
    private static final javax.xml.namespace.QName REFERENCESYSTEMINFO$26 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "referenceSystemInfo");
    private static final javax.xml.namespace.QName METADATAEXTENSIONINFO$28 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "metadataExtensionInfo");
    private static final javax.xml.namespace.QName IDENTIFICATIONINFO$30 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "identificationInfo");
    private static final javax.xml.namespace.QName CONTENTINFO$32 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "contentInfo");
    private static final javax.xml.namespace.QName DISTRIBUTIONINFO$34 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "distributionInfo");
    private static final javax.xml.namespace.QName DATAQUALITYINFO$36 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dataQualityInfo");
    private static final javax.xml.namespace.QName PORTRAYALCATALOGUEINFO$38 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "portrayalCatalogueInfo");
    private static final javax.xml.namespace.QName METADATACONSTRAINTS$40 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "metadataConstraints");
    private static final javax.xml.namespace.QName APPLICATIONSCHEMAINFO$42 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "applicationSchemaInfo");
    private static final javax.xml.namespace.QName METADATAMAINTENANCE$44 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "metadataMaintenance");
    private static final javax.xml.namespace.QName SERIES$46 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "series");
    private static final javax.xml.namespace.QName DESCRIBES$48 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "describes");
    private static final javax.xml.namespace.QName PROPERTYTYPE$50 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "propertyType");
    private static final javax.xml.namespace.QName FEATURETYPE$52 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "featureType");
    private static final javax.xml.namespace.QName FEATUREATTRIBUTE$54 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "featureAttribute");
    
    
    /**
     * Gets the "fileIdentifier" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFileIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FILEIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileIdentifier" element
     */
    public boolean isSetFileIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEIDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "fileIdentifier" element
     */
    public void setFileIdentifier(org.isotc211.x2005.gco.CharacterStringPropertyType fileIdentifier)
    {
        generatedSetterHelperImpl(fileIdentifier, FILEIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fileIdentifier" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFileIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FILEIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fileIdentifier" element
     */
    public void unsetFileIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEIDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "language" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(LANGUAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(org.isotc211.x2005.gco.CharacterStringPropertyType language)
    {
        generatedSetterHelperImpl(language, LANGUAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "language" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(LANGUAGE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$2, 0);
        }
    }
    
    /**
     * Gets the "characterSet" element
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType getCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().find_element_user(CHARACTERSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "characterSet" element
     */
    public boolean isSetCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERSET$4) != 0;
        }
    }
    
    /**
     * Sets the "characterSet" element
     */
    public void setCharacterSet(org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType characterSet)
    {
        generatedSetterHelperImpl(characterSet, CHARACTERSET$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "characterSet" element
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType addNewCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().add_element_user(CHARACTERSET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "characterSet" element
     */
    public void unsetCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERSET$4, 0);
        }
    }
    
    /**
     * Gets the "parentIdentifier" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getParentIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PARENTIDENTIFIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parentIdentifier" element
     */
    public boolean isSetParentIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTIDENTIFIER$6) != 0;
        }
    }
    
    /**
     * Sets the "parentIdentifier" element
     */
    public void setParentIdentifier(org.isotc211.x2005.gco.CharacterStringPropertyType parentIdentifier)
    {
        generatedSetterHelperImpl(parentIdentifier, PARENTIDENTIFIER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parentIdentifier" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewParentIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(PARENTIDENTIFIER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "parentIdentifier" element
     */
    public void unsetParentIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTIDENTIFIER$6, 0);
        }
    }
    
    /**
     * Gets array of all "hierarchyLevel" elements
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType[] getHierarchyLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHYLEVEL$8, targetList);
            org.isotc211.x2005.gmd.MDScopeCodePropertyType[] result = new org.isotc211.x2005.gmd.MDScopeCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hierarchyLevel" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType getHierarchyLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().find_element_user(HIERARCHYLEVEL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hierarchyLevel" element
     */
    public int sizeOfHierarchyLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHYLEVEL$8);
        }
    }
    
    /**
     * Sets array of all "hierarchyLevel" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setHierarchyLevelArray(org.isotc211.x2005.gmd.MDScopeCodePropertyType[] hierarchyLevelArray)
    {
        check_orphaned();
        arraySetterHelper(hierarchyLevelArray, HIERARCHYLEVEL$8);
    }
    
    /**
     * Sets ith "hierarchyLevel" element
     */
    public void setHierarchyLevelArray(int i, org.isotc211.x2005.gmd.MDScopeCodePropertyType hierarchyLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().find_element_user(HIERARCHYLEVEL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchyLevel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hierarchyLevel" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType insertNewHierarchyLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().insert_element_user(HIERARCHYLEVEL$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hierarchyLevel" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType addNewHierarchyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().add_element_user(HIERARCHYLEVEL$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "hierarchyLevel" element
     */
    public void removeHierarchyLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHYLEVEL$8, i);
        }
    }
    
    /**
     * Gets array of all "hierarchyLevelName" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getHierarchyLevelNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHYLEVELNAME$10, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hierarchyLevelName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getHierarchyLevelNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(HIERARCHYLEVELNAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hierarchyLevelName" element
     */
    public int sizeOfHierarchyLevelNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHYLEVELNAME$10);
        }
    }
    
    /**
     * Sets array of all "hierarchyLevelName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setHierarchyLevelNameArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] hierarchyLevelNameArray)
    {
        check_orphaned();
        arraySetterHelper(hierarchyLevelNameArray, HIERARCHYLEVELNAME$10);
    }
    
    /**
     * Sets ith "hierarchyLevelName" element
     */
    public void setHierarchyLevelNameArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType hierarchyLevelName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(HIERARCHYLEVELNAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchyLevelName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hierarchyLevelName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewHierarchyLevelName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(HIERARCHYLEVELNAME$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hierarchyLevelName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewHierarchyLevelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(HIERARCHYLEVELNAME$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "hierarchyLevelName" element
     */
    public void removeHierarchyLevelName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHYLEVELNAME$10, i);
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
    
    /**
     * Gets the "dateStamp" element
     */
    public org.isotc211.x2005.gco.DatePropertyType getDateStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().find_element_user(DATESTAMP$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dateStamp" element
     */
    public void setDateStamp(org.isotc211.x2005.gco.DatePropertyType dateStamp)
    {
        generatedSetterHelperImpl(dateStamp, DATESTAMP$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateStamp" element
     */
    public org.isotc211.x2005.gco.DatePropertyType addNewDateStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().add_element_user(DATESTAMP$14);
            return target;
        }
    }
    
    /**
     * Gets the "metadataStandardName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getMetadataStandardName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(METADATASTANDARDNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "metadataStandardName" element
     */
    public boolean isSetMetadataStandardName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTANDARDNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "metadataStandardName" element
     */
    public void setMetadataStandardName(org.isotc211.x2005.gco.CharacterStringPropertyType metadataStandardName)
    {
        generatedSetterHelperImpl(metadataStandardName, METADATASTANDARDNAME$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "metadataStandardName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewMetadataStandardName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(METADATASTANDARDNAME$16);
            return target;
        }
    }
    
    /**
     * Unsets the "metadataStandardName" element
     */
    public void unsetMetadataStandardName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTANDARDNAME$16, 0);
        }
    }
    
    /**
     * Gets the "metadataStandardVersion" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getMetadataStandardVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(METADATASTANDARDVERSION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "metadataStandardVersion" element
     */
    public boolean isSetMetadataStandardVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTANDARDVERSION$18) != 0;
        }
    }
    
    /**
     * Sets the "metadataStandardVersion" element
     */
    public void setMetadataStandardVersion(org.isotc211.x2005.gco.CharacterStringPropertyType metadataStandardVersion)
    {
        generatedSetterHelperImpl(metadataStandardVersion, METADATASTANDARDVERSION$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "metadataStandardVersion" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewMetadataStandardVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(METADATASTANDARDVERSION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "metadataStandardVersion" element
     */
    public void unsetMetadataStandardVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTANDARDVERSION$18, 0);
        }
    }
    
    /**
     * Gets the "dataSetURI" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDataSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DATASETURI$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSetURI" element
     */
    public boolean isSetDataSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETURI$20) != 0;
        }
    }
    
    /**
     * Sets the "dataSetURI" element
     */
    public void setDataSetURI(org.isotc211.x2005.gco.CharacterStringPropertyType dataSetURI)
    {
        generatedSetterHelperImpl(dataSetURI, DATASETURI$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSetURI" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDataSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DATASETURI$20);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSetURI" element
     */
    public void unsetDataSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETURI$20, 0);
        }
    }
    
    /**
     * Gets array of all "locale" elements
     */
    public org.isotc211.x2005.gmd.PTLocalePropertyType[] getLocaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCALE$22, targetList);
            org.isotc211.x2005.gmd.PTLocalePropertyType[] result = new org.isotc211.x2005.gmd.PTLocalePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "locale" element
     */
    public org.isotc211.x2005.gmd.PTLocalePropertyType getLocaleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocalePropertyType target = null;
            target = (org.isotc211.x2005.gmd.PTLocalePropertyType)get_store().find_element_user(LOCALE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "locale" element
     */
    public int sizeOfLocaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALE$22);
        }
    }
    
    /**
     * Sets array of all "locale" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocaleArray(org.isotc211.x2005.gmd.PTLocalePropertyType[] localeArray)
    {
        check_orphaned();
        arraySetterHelper(localeArray, LOCALE$22);
    }
    
    /**
     * Sets ith "locale" element
     */
    public void setLocaleArray(int i, org.isotc211.x2005.gmd.PTLocalePropertyType locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocalePropertyType target = null;
            target = (org.isotc211.x2005.gmd.PTLocalePropertyType)get_store().find_element_user(LOCALE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locale);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locale" element
     */
    public org.isotc211.x2005.gmd.PTLocalePropertyType insertNewLocale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocalePropertyType target = null;
            target = (org.isotc211.x2005.gmd.PTLocalePropertyType)get_store().insert_element_user(LOCALE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locale" element
     */
    public org.isotc211.x2005.gmd.PTLocalePropertyType addNewLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocalePropertyType target = null;
            target = (org.isotc211.x2005.gmd.PTLocalePropertyType)get_store().add_element_user(LOCALE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "locale" element
     */
    public void removeLocale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALE$22, i);
        }
    }
    
    /**
     * Gets array of all "spatialRepresentationInfo" elements
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType[] getSpatialRepresentationInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPATIALREPRESENTATIONINFO$24, targetList);
            org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType[] result = new org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "spatialRepresentationInfo" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType getSpatialRepresentationInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType)get_store().find_element_user(SPATIALREPRESENTATIONINFO$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "spatialRepresentationInfo" element
     */
    public int sizeOfSpatialRepresentationInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPATIALREPRESENTATIONINFO$24);
        }
    }
    
    /**
     * Sets array of all "spatialRepresentationInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpatialRepresentationInfoArray(org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType[] spatialRepresentationInfoArray)
    {
        check_orphaned();
        arraySetterHelper(spatialRepresentationInfoArray, SPATIALREPRESENTATIONINFO$24);
    }
    
    /**
     * Sets ith "spatialRepresentationInfo" element
     */
    public void setSpatialRepresentationInfoArray(int i, org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType spatialRepresentationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType)get_store().find_element_user(SPATIALREPRESENTATIONINFO$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(spatialRepresentationInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spatialRepresentationInfo" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType insertNewSpatialRepresentationInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType)get_store().insert_element_user(SPATIALREPRESENTATIONINFO$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spatialRepresentationInfo" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType addNewSpatialRepresentationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType)get_store().add_element_user(SPATIALREPRESENTATIONINFO$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "spatialRepresentationInfo" element
     */
    public void removeSpatialRepresentationInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPATIALREPRESENTATIONINFO$24, i);
        }
    }
    
    /**
     * Gets array of all "referenceSystemInfo" elements
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType[] getReferenceSystemInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCESYSTEMINFO$26, targetList);
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType[] result = new org.isotc211.x2005.gmd.MDReferenceSystemPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "referenceSystemInfo" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType getReferenceSystemInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().find_element_user(REFERENCESYSTEMINFO$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "referenceSystemInfo" element
     */
    public int sizeOfReferenceSystemInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCESYSTEMINFO$26);
        }
    }
    
    /**
     * Sets array of all "referenceSystemInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReferenceSystemInfoArray(org.isotc211.x2005.gmd.MDReferenceSystemPropertyType[] referenceSystemInfoArray)
    {
        check_orphaned();
        arraySetterHelper(referenceSystemInfoArray, REFERENCESYSTEMINFO$26);
    }
    
    /**
     * Sets ith "referenceSystemInfo" element
     */
    public void setReferenceSystemInfoArray(int i, org.isotc211.x2005.gmd.MDReferenceSystemPropertyType referenceSystemInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().find_element_user(REFERENCESYSTEMINFO$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(referenceSystemInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "referenceSystemInfo" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType insertNewReferenceSystemInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().insert_element_user(REFERENCESYSTEMINFO$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "referenceSystemInfo" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType addNewReferenceSystemInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().add_element_user(REFERENCESYSTEMINFO$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "referenceSystemInfo" element
     */
    public void removeReferenceSystemInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCESYSTEMINFO$26, i);
        }
    }
    
    /**
     * Gets array of all "metadataExtensionInfo" elements
     */
    public org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType[] getMetadataExtensionInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAEXTENSIONINFO$28, targetList);
            org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType[] result = new org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "metadataExtensionInfo" element
     */
    public org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType getMetadataExtensionInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType)get_store().find_element_user(METADATAEXTENSIONINFO$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "metadataExtensionInfo" element
     */
    public int sizeOfMetadataExtensionInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAEXTENSIONINFO$28);
        }
    }
    
    /**
     * Sets array of all "metadataExtensionInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMetadataExtensionInfoArray(org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType[] metadataExtensionInfoArray)
    {
        check_orphaned();
        arraySetterHelper(metadataExtensionInfoArray, METADATAEXTENSIONINFO$28);
    }
    
    /**
     * Sets ith "metadataExtensionInfo" element
     */
    public void setMetadataExtensionInfoArray(int i, org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType metadataExtensionInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType)get_store().find_element_user(METADATAEXTENSIONINFO$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataExtensionInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metadataExtensionInfo" element
     */
    public org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType insertNewMetadataExtensionInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType)get_store().insert_element_user(METADATAEXTENSIONINFO$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metadataExtensionInfo" element
     */
    public org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType addNewMetadataExtensionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType)get_store().add_element_user(METADATAEXTENSIONINFO$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "metadataExtensionInfo" element
     */
    public void removeMetadataExtensionInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAEXTENSIONINFO$28, i);
        }
    }
    
    /**
     * Gets array of all "identificationInfo" elements
     */
    public org.isotc211.x2005.gmd.MDIdentificationPropertyType[] getIdentificationInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATIONINFO$30, targetList);
            org.isotc211.x2005.gmd.MDIdentificationPropertyType[] result = new org.isotc211.x2005.gmd.MDIdentificationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identificationInfo" element
     */
    public org.isotc211.x2005.gmd.MDIdentificationPropertyType getIdentificationInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentificationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentificationPropertyType)get_store().find_element_user(IDENTIFICATIONINFO$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identificationInfo" element
     */
    public int sizeOfIdentificationInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATIONINFO$30);
        }
    }
    
    /**
     * Sets array of all "identificationInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentificationInfoArray(org.isotc211.x2005.gmd.MDIdentificationPropertyType[] identificationInfoArray)
    {
        check_orphaned();
        arraySetterHelper(identificationInfoArray, IDENTIFICATIONINFO$30);
    }
    
    /**
     * Sets ith "identificationInfo" element
     */
    public void setIdentificationInfoArray(int i, org.isotc211.x2005.gmd.MDIdentificationPropertyType identificationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentificationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentificationPropertyType)get_store().find_element_user(IDENTIFICATIONINFO$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificationInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identificationInfo" element
     */
    public org.isotc211.x2005.gmd.MDIdentificationPropertyType insertNewIdentificationInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentificationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentificationPropertyType)get_store().insert_element_user(IDENTIFICATIONINFO$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identificationInfo" element
     */
    public org.isotc211.x2005.gmd.MDIdentificationPropertyType addNewIdentificationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentificationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentificationPropertyType)get_store().add_element_user(IDENTIFICATIONINFO$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "identificationInfo" element
     */
    public void removeIdentificationInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATIONINFO$30, i);
        }
    }
    
    /**
     * Gets array of all "contentInfo" elements
     */
    public org.isotc211.x2005.gmd.MDContentInformationPropertyType[] getContentInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENTINFO$32, targetList);
            org.isotc211.x2005.gmd.MDContentInformationPropertyType[] result = new org.isotc211.x2005.gmd.MDContentInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contentInfo" element
     */
    public org.isotc211.x2005.gmd.MDContentInformationPropertyType getContentInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDContentInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDContentInformationPropertyType)get_store().find_element_user(CONTENTINFO$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contentInfo" element
     */
    public int sizeOfContentInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTINFO$32);
        }
    }
    
    /**
     * Sets array of all "contentInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContentInfoArray(org.isotc211.x2005.gmd.MDContentInformationPropertyType[] contentInfoArray)
    {
        check_orphaned();
        arraySetterHelper(contentInfoArray, CONTENTINFO$32);
    }
    
    /**
     * Sets ith "contentInfo" element
     */
    public void setContentInfoArray(int i, org.isotc211.x2005.gmd.MDContentInformationPropertyType contentInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDContentInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDContentInformationPropertyType)get_store().find_element_user(CONTENTINFO$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contentInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contentInfo" element
     */
    public org.isotc211.x2005.gmd.MDContentInformationPropertyType insertNewContentInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDContentInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDContentInformationPropertyType)get_store().insert_element_user(CONTENTINFO$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contentInfo" element
     */
    public org.isotc211.x2005.gmd.MDContentInformationPropertyType addNewContentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDContentInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDContentInformationPropertyType)get_store().add_element_user(CONTENTINFO$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "contentInfo" element
     */
    public void removeContentInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTINFO$32, i);
        }
    }
    
    /**
     * Gets the "distributionInfo" element
     */
    public org.isotc211.x2005.gmd.MDDistributionPropertyType getDistributionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributionPropertyType)get_store().find_element_user(DISTRIBUTIONINFO$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distributionInfo" element
     */
    public boolean isSetDistributionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTIONINFO$34) != 0;
        }
    }
    
    /**
     * Sets the "distributionInfo" element
     */
    public void setDistributionInfo(org.isotc211.x2005.gmd.MDDistributionPropertyType distributionInfo)
    {
        generatedSetterHelperImpl(distributionInfo, DISTRIBUTIONINFO$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "distributionInfo" element
     */
    public org.isotc211.x2005.gmd.MDDistributionPropertyType addNewDistributionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributionPropertyType)get_store().add_element_user(DISTRIBUTIONINFO$34);
            return target;
        }
    }
    
    /**
     * Unsets the "distributionInfo" element
     */
    public void unsetDistributionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTIONINFO$34, 0);
        }
    }
    
    /**
     * Gets array of all "dataQualityInfo" elements
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType[] getDataQualityInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAQUALITYINFO$36, targetList);
            org.isotc211.x2005.gmd.DQDataQualityPropertyType[] result = new org.isotc211.x2005.gmd.DQDataQualityPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataQualityInfo" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType getDataQualityInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().find_element_user(DATAQUALITYINFO$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataQualityInfo" element
     */
    public int sizeOfDataQualityInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAQUALITYINFO$36);
        }
    }
    
    /**
     * Sets array of all "dataQualityInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDataQualityInfoArray(org.isotc211.x2005.gmd.DQDataQualityPropertyType[] dataQualityInfoArray)
    {
        check_orphaned();
        arraySetterHelper(dataQualityInfoArray, DATAQUALITYINFO$36);
    }
    
    /**
     * Sets ith "dataQualityInfo" element
     */
    public void setDataQualityInfoArray(int i, org.isotc211.x2005.gmd.DQDataQualityPropertyType dataQualityInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().find_element_user(DATAQUALITYINFO$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataQualityInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataQualityInfo" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType insertNewDataQualityInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().insert_element_user(DATAQUALITYINFO$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataQualityInfo" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityPropertyType addNewDataQualityInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityPropertyType)get_store().add_element_user(DATAQUALITYINFO$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataQualityInfo" element
     */
    public void removeDataQualityInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAQUALITYINFO$36, i);
        }
    }
    
    /**
     * Gets array of all "portrayalCatalogueInfo" elements
     */
    public org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType[] getPortrayalCatalogueInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PORTRAYALCATALOGUEINFO$38, targetList);
            org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType[] result = new org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "portrayalCatalogueInfo" element
     */
    public org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType getPortrayalCatalogueInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType)get_store().find_element_user(PORTRAYALCATALOGUEINFO$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "portrayalCatalogueInfo" element
     */
    public int sizeOfPortrayalCatalogueInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTRAYALCATALOGUEINFO$38);
        }
    }
    
    /**
     * Sets array of all "portrayalCatalogueInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPortrayalCatalogueInfoArray(org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType[] portrayalCatalogueInfoArray)
    {
        check_orphaned();
        arraySetterHelper(portrayalCatalogueInfoArray, PORTRAYALCATALOGUEINFO$38);
    }
    
    /**
     * Sets ith "portrayalCatalogueInfo" element
     */
    public void setPortrayalCatalogueInfoArray(int i, org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType portrayalCatalogueInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType)get_store().find_element_user(PORTRAYALCATALOGUEINFO$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portrayalCatalogueInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "portrayalCatalogueInfo" element
     */
    public org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType insertNewPortrayalCatalogueInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType)get_store().insert_element_user(PORTRAYALCATALOGUEINFO$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "portrayalCatalogueInfo" element
     */
    public org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType addNewPortrayalCatalogueInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType)get_store().add_element_user(PORTRAYALCATALOGUEINFO$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "portrayalCatalogueInfo" element
     */
    public void removePortrayalCatalogueInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTRAYALCATALOGUEINFO$38, i);
        }
    }
    
    /**
     * Gets array of all "metadataConstraints" elements
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType[] getMetadataConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATACONSTRAINTS$40, targetList);
            org.isotc211.x2005.gmd.MDConstraintsPropertyType[] result = new org.isotc211.x2005.gmd.MDConstraintsPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "metadataConstraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType getMetadataConstraintsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().find_element_user(METADATACONSTRAINTS$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "metadataConstraints" element
     */
    public int sizeOfMetadataConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATACONSTRAINTS$40);
        }
    }
    
    /**
     * Sets array of all "metadataConstraints" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMetadataConstraintsArray(org.isotc211.x2005.gmd.MDConstraintsPropertyType[] metadataConstraintsArray)
    {
        check_orphaned();
        arraySetterHelper(metadataConstraintsArray, METADATACONSTRAINTS$40);
    }
    
    /**
     * Sets ith "metadataConstraints" element
     */
    public void setMetadataConstraintsArray(int i, org.isotc211.x2005.gmd.MDConstraintsPropertyType metadataConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().find_element_user(METADATACONSTRAINTS$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataConstraints);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metadataConstraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType insertNewMetadataConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().insert_element_user(METADATACONSTRAINTS$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metadataConstraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType addNewMetadataConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().add_element_user(METADATACONSTRAINTS$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "metadataConstraints" element
     */
    public void removeMetadataConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATACONSTRAINTS$40, i);
        }
    }
    
    /**
     * Gets array of all "applicationSchemaInfo" elements
     */
    public org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType[] getApplicationSchemaInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(APPLICATIONSCHEMAINFO$42, targetList);
            org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType[] result = new org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "applicationSchemaInfo" element
     */
    public org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType getApplicationSchemaInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType)get_store().find_element_user(APPLICATIONSCHEMAINFO$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "applicationSchemaInfo" element
     */
    public int sizeOfApplicationSchemaInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLICATIONSCHEMAINFO$42);
        }
    }
    
    /**
     * Sets array of all "applicationSchemaInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setApplicationSchemaInfoArray(org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType[] applicationSchemaInfoArray)
    {
        check_orphaned();
        arraySetterHelper(applicationSchemaInfoArray, APPLICATIONSCHEMAINFO$42);
    }
    
    /**
     * Sets ith "applicationSchemaInfo" element
     */
    public void setApplicationSchemaInfoArray(int i, org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType applicationSchemaInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType)get_store().find_element_user(APPLICATIONSCHEMAINFO$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(applicationSchemaInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "applicationSchemaInfo" element
     */
    public org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType insertNewApplicationSchemaInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType)get_store().insert_element_user(APPLICATIONSCHEMAINFO$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "applicationSchemaInfo" element
     */
    public org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType addNewApplicationSchemaInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType)get_store().add_element_user(APPLICATIONSCHEMAINFO$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "applicationSchemaInfo" element
     */
    public void removeApplicationSchemaInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLICATIONSCHEMAINFO$42, i);
        }
    }
    
    /**
     * Gets the "metadataMaintenance" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType getMetadataMaintenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType)get_store().find_element_user(METADATAMAINTENANCE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "metadataMaintenance" element
     */
    public boolean isSetMetadataMaintenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAMAINTENANCE$44) != 0;
        }
    }
    
    /**
     * Sets the "metadataMaintenance" element
     */
    public void setMetadataMaintenance(org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType metadataMaintenance)
    {
        generatedSetterHelperImpl(metadataMaintenance, METADATAMAINTENANCE$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "metadataMaintenance" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType addNewMetadataMaintenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType)get_store().add_element_user(METADATAMAINTENANCE$44);
            return target;
        }
    }
    
    /**
     * Unsets the "metadataMaintenance" element
     */
    public void unsetMetadataMaintenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAMAINTENANCE$44, 0);
        }
    }
    
    /**
     * Gets array of all "series" elements
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType[] getSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIES$46, targetList);
            org.isotc211.x2005.gmd.DSAggregatePropertyType[] result = new org.isotc211.x2005.gmd.DSAggregatePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "series" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType getSeriesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(SERIES$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "series" element
     */
    public int sizeOfSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIES$46);
        }
    }
    
    /**
     * Sets array of all "series" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSeriesArray(org.isotc211.x2005.gmd.DSAggregatePropertyType[] seriesArray)
    {
        check_orphaned();
        arraySetterHelper(seriesArray, SERIES$46);
    }
    
    /**
     * Sets ith "series" element
     */
    public void setSeriesArray(int i, org.isotc211.x2005.gmd.DSAggregatePropertyType series)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().find_element_user(SERIES$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(series);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "series" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType insertNewSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().insert_element_user(SERIES$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "series" element
     */
    public org.isotc211.x2005.gmd.DSAggregatePropertyType addNewSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAggregatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAggregatePropertyType)get_store().add_element_user(SERIES$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "series" element
     */
    public void removeSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIES$46, i);
        }
    }
    
    /**
     * Gets array of all "describes" elements
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType[] getDescribesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIBES$48, targetList);
            org.isotc211.x2005.gmd.DSDataSetPropertyType[] result = new org.isotc211.x2005.gmd.DSDataSetPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "describes" element
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType getDescribesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().find_element_user(DESCRIBES$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "describes" element
     */
    public int sizeOfDescribesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIBES$48);
        }
    }
    
    /**
     * Sets array of all "describes" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDescribesArray(org.isotc211.x2005.gmd.DSDataSetPropertyType[] describesArray)
    {
        check_orphaned();
        arraySetterHelper(describesArray, DESCRIBES$48);
    }
    
    /**
     * Sets ith "describes" element
     */
    public void setDescribesArray(int i, org.isotc211.x2005.gmd.DSDataSetPropertyType describes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().find_element_user(DESCRIBES$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(describes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "describes" element
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType insertNewDescribes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().insert_element_user(DESCRIBES$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "describes" element
     */
    public org.isotc211.x2005.gmd.DSDataSetPropertyType addNewDescribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetPropertyType)get_store().add_element_user(DESCRIBES$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "describes" element
     */
    public void removeDescribes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIBES$48, i);
        }
    }
    
    /**
     * Gets array of all "propertyType" elements
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType[] getPropertyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTYTYPE$50, targetList);
            org.isotc211.x2005.gco.ObjectReferencePropertyType[] result = new org.isotc211.x2005.gco.ObjectReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "propertyType" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType getPropertyTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(PROPERTYTYPE$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "propertyType" element
     */
    public int sizeOfPropertyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYTYPE$50);
        }
    }
    
    /**
     * Sets array of all "propertyType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyTypeArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] propertyTypeArray)
    {
        check_orphaned();
        arraySetterHelper(propertyTypeArray, PROPERTYTYPE$50);
    }
    
    /**
     * Sets ith "propertyType" element
     */
    public void setPropertyTypeArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType propertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(PROPERTYTYPE$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(propertyType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "propertyType" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewPropertyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().insert_element_user(PROPERTYTYPE$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "propertyType" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType addNewPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().add_element_user(PROPERTYTYPE$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "propertyType" element
     */
    public void removePropertyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYTYPE$50, i);
        }
    }
    
    /**
     * Gets array of all "featureType" elements
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeatureTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATURETYPE$52, targetList);
            org.isotc211.x2005.gco.ObjectReferencePropertyType[] result = new org.isotc211.x2005.gco.ObjectReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureType" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType getFeatureTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATURETYPE$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureType" element
     */
    public int sizeOfFeatureTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURETYPE$52);
        }
    }
    
    /**
     * Sets array of all "featureType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureTypeArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featureTypeArray)
    {
        check_orphaned();
        arraySetterHelper(featureTypeArray, FEATURETYPE$52);
    }
    
    /**
     * Sets ith "featureType" element
     */
    public void setFeatureTypeArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType featureType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATURETYPE$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(featureType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureType" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatureType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().insert_element_user(FEATURETYPE$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureType" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().add_element_user(FEATURETYPE$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureType" element
     */
    public void removeFeatureType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURETYPE$52, i);
        }
    }
    
    /**
     * Gets array of all "featureAttribute" elements
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeatureAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATUREATTRIBUTE$54, targetList);
            org.isotc211.x2005.gco.ObjectReferencePropertyType[] result = new org.isotc211.x2005.gco.ObjectReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureAttribute" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType getFeatureAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATUREATTRIBUTE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureAttribute" element
     */
    public int sizeOfFeatureAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREATTRIBUTE$54);
        }
    }
    
    /**
     * Sets array of all "featureAttribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureAttributeArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featureAttributeArray)
    {
        check_orphaned();
        arraySetterHelper(featureAttributeArray, FEATUREATTRIBUTE$54);
    }
    
    /**
     * Sets ith "featureAttribute" element
     */
    public void setFeatureAttributeArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType featureAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATUREATTRIBUTE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(featureAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureAttribute" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatureAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().insert_element_user(FEATUREATTRIBUTE$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureAttribute" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatureAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().add_element_user(FEATUREATTRIBUTE$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureAttribute" element
     */
    public void removeFeatureAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREATTRIBUTE$54, i);
        }
    }
}
