/*
 * XML Type:  MD_DataIdentification_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDataIdentificationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_DataIdentification_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDDataIdentificationTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractMDIdentificationTypeImpl implements org.isotc211.x2005.gmd.MDDataIdentificationType
{
    private static final long serialVersionUID = 1L;
    
    public MDDataIdentificationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPATIALREPRESENTATIONTYPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "spatialRepresentationType");
    private static final javax.xml.namespace.QName SPATIALRESOLUTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "spatialResolution");
    private static final javax.xml.namespace.QName LANGUAGE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "language");
    private static final javax.xml.namespace.QName CHARACTERSET$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "characterSet");
    private static final javax.xml.namespace.QName TOPICCATEGORY$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "topicCategory");
    private static final javax.xml.namespace.QName ENVIRONMENTDESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "environmentDescription");
    private static final javax.xml.namespace.QName EXTENT$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "extent");
    private static final javax.xml.namespace.QName SUPPLEMENTALINFORMATION$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "supplementalInformation");
    
    
    /**
     * Gets array of all "spatialRepresentationType" elements
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType[] getSpatialRepresentationTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPATIALREPRESENTATIONTYPE$0, targetList);
            org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType[] result = new org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "spatialRepresentationType" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType getSpatialRepresentationTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType)get_store().find_element_user(SPATIALREPRESENTATIONTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "spatialRepresentationType" element
     */
    public int sizeOfSpatialRepresentationTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPATIALREPRESENTATIONTYPE$0);
        }
    }
    
    /**
     * Sets array of all "spatialRepresentationType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpatialRepresentationTypeArray(org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType[] spatialRepresentationTypeArray)
    {
        check_orphaned();
        arraySetterHelper(spatialRepresentationTypeArray, SPATIALREPRESENTATIONTYPE$0);
    }
    
    /**
     * Sets ith "spatialRepresentationType" element
     */
    public void setSpatialRepresentationTypeArray(int i, org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType spatialRepresentationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType)get_store().find_element_user(SPATIALREPRESENTATIONTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(spatialRepresentationType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spatialRepresentationType" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType insertNewSpatialRepresentationType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType)get_store().insert_element_user(SPATIALREPRESENTATIONTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spatialRepresentationType" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType addNewSpatialRepresentationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType)get_store().add_element_user(SPATIALREPRESENTATIONTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "spatialRepresentationType" element
     */
    public void removeSpatialRepresentationType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPATIALREPRESENTATIONTYPE$0, i);
        }
    }
    
    /**
     * Gets array of all "spatialResolution" elements
     */
    public org.isotc211.x2005.gmd.MDResolutionPropertyType[] getSpatialResolutionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPATIALRESOLUTION$2, targetList);
            org.isotc211.x2005.gmd.MDResolutionPropertyType[] result = new org.isotc211.x2005.gmd.MDResolutionPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "spatialResolution" element
     */
    public org.isotc211.x2005.gmd.MDResolutionPropertyType getSpatialResolutionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDResolutionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDResolutionPropertyType)get_store().find_element_user(SPATIALRESOLUTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "spatialResolution" element
     */
    public int sizeOfSpatialResolutionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPATIALRESOLUTION$2);
        }
    }
    
    /**
     * Sets array of all "spatialResolution" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpatialResolutionArray(org.isotc211.x2005.gmd.MDResolutionPropertyType[] spatialResolutionArray)
    {
        check_orphaned();
        arraySetterHelper(spatialResolutionArray, SPATIALRESOLUTION$2);
    }
    
    /**
     * Sets ith "spatialResolution" element
     */
    public void setSpatialResolutionArray(int i, org.isotc211.x2005.gmd.MDResolutionPropertyType spatialResolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDResolutionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDResolutionPropertyType)get_store().find_element_user(SPATIALRESOLUTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(spatialResolution);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spatialResolution" element
     */
    public org.isotc211.x2005.gmd.MDResolutionPropertyType insertNewSpatialResolution(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDResolutionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDResolutionPropertyType)get_store().insert_element_user(SPATIALRESOLUTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spatialResolution" element
     */
    public org.isotc211.x2005.gmd.MDResolutionPropertyType addNewSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDResolutionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDResolutionPropertyType)get_store().add_element_user(SPATIALRESOLUTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "spatialResolution" element
     */
    public void removeSpatialResolution(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPATIALRESOLUTION$2, i);
        }
    }
    
    /**
     * Gets array of all "language" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getLanguageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANGUAGE$4, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "language" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getLanguageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(LANGUAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "language" element
     */
    public int sizeOfLanguageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$4);
        }
    }
    
    /**
     * Sets array of all "language" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLanguageArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] languageArray)
    {
        check_orphaned();
        arraySetterHelper(languageArray, LANGUAGE$4);
    }
    
    /**
     * Sets ith "language" element
     */
    public void setLanguageArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(LANGUAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(language);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "language" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewLanguage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(LANGUAGE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "language" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(LANGUAGE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "language" element
     */
    public void removeLanguage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$4, i);
        }
    }
    
    /**
     * Gets array of all "characterSet" elements
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType[] getCharacterSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHARACTERSET$6, targetList);
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType[] result = new org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "characterSet" element
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType getCharacterSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().find_element_user(CHARACTERSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "characterSet" element
     */
    public int sizeOfCharacterSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERSET$6);
        }
    }
    
    /**
     * Sets array of all "characterSet" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCharacterSetArray(org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType[] characterSetArray)
    {
        check_orphaned();
        arraySetterHelper(characterSetArray, CHARACTERSET$6);
    }
    
    /**
     * Sets ith "characterSet" element
     */
    public void setCharacterSetArray(int i, org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType characterSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().find_element_user(CHARACTERSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(characterSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "characterSet" element
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType insertNewCharacterSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().insert_element_user(CHARACTERSET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "characterSet" element
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType addNewCharacterSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().add_element_user(CHARACTERSET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "characterSet" element
     */
    public void removeCharacterSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERSET$6, i);
        }
    }
    
    /**
     * Gets array of all "topicCategory" elements
     */
    public org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType[] getTopicCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOPICCATEGORY$8, targetList);
            org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType[] result = new org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "topicCategory" element
     */
    public org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType getTopicCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType)get_store().find_element_user(TOPICCATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "topicCategory" element
     */
    public int sizeOfTopicCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPICCATEGORY$8);
        }
    }
    
    /**
     * Sets array of all "topicCategory" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTopicCategoryArray(org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType[] topicCategoryArray)
    {
        check_orphaned();
        arraySetterHelper(topicCategoryArray, TOPICCATEGORY$8);
    }
    
    /**
     * Sets ith "topicCategory" element
     */
    public void setTopicCategoryArray(int i, org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType topicCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType)get_store().find_element_user(TOPICCATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(topicCategory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topicCategory" element
     */
    public org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType insertNewTopicCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType)get_store().insert_element_user(TOPICCATEGORY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topicCategory" element
     */
    public org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType addNewTopicCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType)get_store().add_element_user(TOPICCATEGORY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "topicCategory" element
     */
    public void removeTopicCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPICCATEGORY$8, i);
        }
    }
    
    /**
     * Gets the "environmentDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getEnvironmentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ENVIRONMENTDESCRIPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "environmentDescription" element
     */
    public boolean isSetEnvironmentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVIRONMENTDESCRIPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "environmentDescription" element
     */
    public void setEnvironmentDescription(org.isotc211.x2005.gco.CharacterStringPropertyType environmentDescription)
    {
        generatedSetterHelperImpl(environmentDescription, ENVIRONMENTDESCRIPTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "environmentDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewEnvironmentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ENVIRONMENTDESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "environmentDescription" element
     */
    public void unsetEnvironmentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVIRONMENTDESCRIPTION$10, 0);
        }
    }
    
    /**
     * Gets array of all "extent" elements
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType[] getExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENT$12, targetList);
            org.isotc211.x2005.gmd.EXExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType getExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(EXTENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extent" element
     */
    public int sizeOfExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$12);
        }
    }
    
    /**
     * Sets array of all "extent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExtentArray(org.isotc211.x2005.gmd.EXExtentPropertyType[] extentArray)
    {
        check_orphaned();
        arraySetterHelper(extentArray, EXTENT$12);
    }
    
    /**
     * Sets ith "extent" element
     */
    public void setExtentArray(int i, org.isotc211.x2005.gmd.EXExtentPropertyType extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(EXTENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType insertNewExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().insert_element_user(EXTENT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().add_element_user(EXTENT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "extent" element
     */
    public void removeExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$12, i);
        }
    }
    
    /**
     * Gets the "supplementalInformation" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getSupplementalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(SUPPLEMENTALINFORMATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "supplementalInformation" element
     */
    public boolean isSetSupplementalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLEMENTALINFORMATION$14) != 0;
        }
    }
    
    /**
     * Sets the "supplementalInformation" element
     */
    public void setSupplementalInformation(org.isotc211.x2005.gco.CharacterStringPropertyType supplementalInformation)
    {
        generatedSetterHelperImpl(supplementalInformation, SUPPLEMENTALINFORMATION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "supplementalInformation" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewSupplementalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(SUPPLEMENTALINFORMATION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "supplementalInformation" element
     */
    public void unsetSupplementalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLEMENTALINFORMATION$14, 0);
        }
    }
}
