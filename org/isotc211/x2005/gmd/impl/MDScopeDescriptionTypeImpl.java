/*
 * XML Type:  MD_ScopeDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDScopeDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_ScopeDescription_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDScopeDescriptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDScopeDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public MDScopeDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "attributes");
    private static final javax.xml.namespace.QName FEATURES$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "features");
    private static final javax.xml.namespace.QName FEATUREINSTANCES$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "featureInstances");
    private static final javax.xml.namespace.QName ATTRIBUTEINSTANCES$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "attributeInstances");
    private static final javax.xml.namespace.QName DATASET$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dataset");
    private static final javax.xml.namespace.QName OTHER$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "other");
    
    
    /**
     * Gets array of all "attributes" elements
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType[] getAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTES$0, targetList);
            org.isotc211.x2005.gco.ObjectReferencePropertyType[] result = new org.isotc211.x2005.gco.ObjectReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attributes" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType getAttributesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(ATTRIBUTES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attributes" element
     */
    public int sizeOfAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0);
        }
    }
    
    /**
     * Sets array of all "attributes" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] attributesArray)
    {
        check_orphaned();
        arraySetterHelper(attributesArray, ATTRIBUTES$0);
    }
    
    /**
     * Sets ith "attributes" element
     */
    public void setAttributesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(ATTRIBUTES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributes" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().insert_element_user(ATTRIBUTES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributes" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attributes" element
     */
    public void removeAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, i);
        }
    }
    
    /**
     * Gets array of all "features" elements
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeaturesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATURES$2, targetList);
            org.isotc211.x2005.gco.ObjectReferencePropertyType[] result = new org.isotc211.x2005.gco.ObjectReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "features" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType getFeaturesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATURES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "features" element
     */
    public int sizeOfFeaturesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURES$2);
        }
    }
    
    /**
     * Sets array of all "features" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeaturesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featuresArray)
    {
        check_orphaned();
        arraySetterHelper(featuresArray, FEATURES$2);
    }
    
    /**
     * Sets ith "features" element
     */
    public void setFeaturesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType features)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATURES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(features);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "features" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().insert_element_user(FEATURES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "features" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().add_element_user(FEATURES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "features" element
     */
    public void removeFeatures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURES$2, i);
        }
    }
    
    /**
     * Gets array of all "featureInstances" elements
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeatureInstancesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATUREINSTANCES$4, targetList);
            org.isotc211.x2005.gco.ObjectReferencePropertyType[] result = new org.isotc211.x2005.gco.ObjectReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureInstances" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType getFeatureInstancesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATUREINSTANCES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureInstances" element
     */
    public int sizeOfFeatureInstancesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREINSTANCES$4);
        }
    }
    
    /**
     * Sets array of all "featureInstances" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureInstancesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featureInstancesArray)
    {
        check_orphaned();
        arraySetterHelper(featureInstancesArray, FEATUREINSTANCES$4);
    }
    
    /**
     * Sets ith "featureInstances" element
     */
    public void setFeatureInstancesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType featureInstances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(FEATUREINSTANCES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(featureInstances);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureInstances" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatureInstances(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().insert_element_user(FEATUREINSTANCES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureInstances" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatureInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().add_element_user(FEATUREINSTANCES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureInstances" element
     */
    public void removeFeatureInstances(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREINSTANCES$4, i);
        }
    }
    
    /**
     * Gets array of all "attributeInstances" elements
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType[] getAttributeInstancesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEINSTANCES$6, targetList);
            org.isotc211.x2005.gco.ObjectReferencePropertyType[] result = new org.isotc211.x2005.gco.ObjectReferencePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attributeInstances" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType getAttributeInstancesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(ATTRIBUTEINSTANCES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attributeInstances" element
     */
    public int sizeOfAttributeInstancesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEINSTANCES$6);
        }
    }
    
    /**
     * Sets array of all "attributeInstances" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeInstancesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] attributeInstancesArray)
    {
        check_orphaned();
        arraySetterHelper(attributeInstancesArray, ATTRIBUTEINSTANCES$6);
    }
    
    /**
     * Sets ith "attributeInstances" element
     */
    public void setAttributeInstancesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType attributeInstances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().find_element_user(ATTRIBUTEINSTANCES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeInstances);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeInstances" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewAttributeInstances(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().insert_element_user(ATTRIBUTEINSTANCES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributeInstances" element
     */
    public org.isotc211.x2005.gco.ObjectReferencePropertyType addNewAttributeInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.ObjectReferencePropertyType target = null;
            target = (org.isotc211.x2005.gco.ObjectReferencePropertyType)get_store().add_element_user(ATTRIBUTEINSTANCES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "attributeInstances" element
     */
    public void removeAttributeInstances(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEINSTANCES$6, i);
        }
    }
    
    /**
     * Gets the "dataset" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDataset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DATASET$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataset" element
     */
    public boolean isSetDataset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASET$8) != 0;
        }
    }
    
    /**
     * Sets the "dataset" element
     */
    public void setDataset(org.isotc211.x2005.gco.CharacterStringPropertyType dataset)
    {
        generatedSetterHelperImpl(dataset, DATASET$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataset" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDataset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DATASET$8);
            return target;
        }
    }
    
    /**
     * Unsets the "dataset" element
     */
    public void unsetDataset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASET$8, 0);
        }
    }
    
    /**
     * Gets the "other" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(OTHER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "other" element
     */
    public boolean isSetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHER$10) != 0;
        }
    }
    
    /**
     * Sets the "other" element
     */
    public void setOther(org.isotc211.x2005.gco.CharacterStringPropertyType other)
    {
        generatedSetterHelperImpl(other, OTHER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "other" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(OTHER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "other" element
     */
    public void unsetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHER$10, 0);
        }
    }
}
