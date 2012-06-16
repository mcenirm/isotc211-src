/*
 * XML Type:  MD_FeatureCatalogueDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_FeatureCatalogueDescription_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDFeatureCatalogueDescriptionTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractMDContentInformationTypeImpl implements org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public MDFeatureCatalogueDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLIANCECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "complianceCode");
    private static final javax.xml.namespace.QName LANGUAGE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "language");
    private static final javax.xml.namespace.QName INCLUDEDWITHDATASET$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "includedWithDataset");
    private static final javax.xml.namespace.QName FEATURETYPES$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "featureTypes");
    private static final javax.xml.namespace.QName FEATURECATALOGUECITATION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "featureCatalogueCitation");
    
    
    /**
     * Gets the "complianceCode" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getComplianceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(COMPLIANCECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "complianceCode" element
     */
    public boolean isSetComplianceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLIANCECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "complianceCode" element
     */
    public void setComplianceCode(org.isotc211.x2005.gco.BooleanPropertyType complianceCode)
    {
        generatedSetterHelperImpl(complianceCode, COMPLIANCECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complianceCode" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewComplianceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(COMPLIANCECODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "complianceCode" element
     */
    public void unsetComplianceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLIANCECODE$0, 0);
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
            get_store().find_all_element_users(LANGUAGE$2, targetList);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(LANGUAGE$2, i);
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
            return get_store().count_elements(LANGUAGE$2);
        }
    }
    
    /**
     * Sets array of all "language" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLanguageArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] languageArray)
    {
        check_orphaned();
        arraySetterHelper(languageArray, LANGUAGE$2);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(LANGUAGE$2, i);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(LANGUAGE$2, i);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(LANGUAGE$2);
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
            get_store().remove_element(LANGUAGE$2, i);
        }
    }
    
    /**
     * Gets the "includedWithDataset" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getIncludedWithDataset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(INCLUDEDWITHDATASET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includedWithDataset" element
     */
    public void setIncludedWithDataset(org.isotc211.x2005.gco.BooleanPropertyType includedWithDataset)
    {
        generatedSetterHelperImpl(includedWithDataset, INCLUDEDWITHDATASET$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includedWithDataset" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewIncludedWithDataset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(INCLUDEDWITHDATASET$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "featureTypes" elements
     */
    public org.isotc211.x2005.gco.GenericNamePropertyType[] getFeatureTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATURETYPES$6, targetList);
            org.isotc211.x2005.gco.GenericNamePropertyType[] result = new org.isotc211.x2005.gco.GenericNamePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureTypes" element
     */
    public org.isotc211.x2005.gco.GenericNamePropertyType getFeatureTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.GenericNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.GenericNamePropertyType)get_store().find_element_user(FEATURETYPES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureTypes" element
     */
    public int sizeOfFeatureTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURETYPES$6);
        }
    }
    
    /**
     * Sets array of all "featureTypes" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureTypesArray(org.isotc211.x2005.gco.GenericNamePropertyType[] featureTypesArray)
    {
        check_orphaned();
        arraySetterHelper(featureTypesArray, FEATURETYPES$6);
    }
    
    /**
     * Sets ith "featureTypes" element
     */
    public void setFeatureTypesArray(int i, org.isotc211.x2005.gco.GenericNamePropertyType featureTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.GenericNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.GenericNamePropertyType)get_store().find_element_user(FEATURETYPES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(featureTypes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureTypes" element
     */
    public org.isotc211.x2005.gco.GenericNamePropertyType insertNewFeatureTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.GenericNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.GenericNamePropertyType)get_store().insert_element_user(FEATURETYPES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureTypes" element
     */
    public org.isotc211.x2005.gco.GenericNamePropertyType addNewFeatureTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.GenericNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.GenericNamePropertyType)get_store().add_element_user(FEATURETYPES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureTypes" element
     */
    public void removeFeatureTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURETYPES$6, i);
        }
    }
    
    /**
     * Gets array of all "featureCatalogueCitation" elements
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType[] getFeatureCatalogueCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATURECATALOGUECITATION$8, targetList);
            org.isotc211.x2005.gmd.CICitationPropertyType[] result = new org.isotc211.x2005.gmd.CICitationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureCatalogueCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getFeatureCatalogueCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(FEATURECATALOGUECITATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureCatalogueCitation" element
     */
    public int sizeOfFeatureCatalogueCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURECATALOGUECITATION$8);
        }
    }
    
    /**
     * Sets array of all "featureCatalogueCitation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureCatalogueCitationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] featureCatalogueCitationArray)
    {
        check_orphaned();
        arraySetterHelper(featureCatalogueCitationArray, FEATURECATALOGUECITATION$8);
    }
    
    /**
     * Sets ith "featureCatalogueCitation" element
     */
    public void setFeatureCatalogueCitationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType featureCatalogueCitation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(FEATURECATALOGUECITATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(featureCatalogueCitation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureCatalogueCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType insertNewFeatureCatalogueCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().insert_element_user(FEATURECATALOGUECITATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureCatalogueCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewFeatureCatalogueCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(FEATURECATALOGUECITATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureCatalogueCitation" element
     */
    public void removeFeatureCatalogueCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURECATALOGUECITATION$8, i);
        }
    }
}
