/*
 * XML Type:  DQ_Scope_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQScopeType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML DQ_Scope_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class DQScopeTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.DQScopeType
{
    private static final long serialVersionUID = 1L;
    
    public DQScopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEVEL$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "level");
    private static final javax.xml.namespace.QName EXTENT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "extent");
    private static final javax.xml.namespace.QName LEVELDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "levelDescription");
    
    
    /**
     * Gets the "level" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().find_element_user(LEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "level" element
     */
    public void setLevel(org.isotc211.x2005.gmd.MDScopeCodePropertyType level)
    {
        generatedSetterHelperImpl(level, LEVEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "level" element
     */
    public org.isotc211.x2005.gmd.MDScopeCodePropertyType addNewLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeCodePropertyType)get_store().add_element_user(LEVEL$0);
            return target;
        }
    }
    
    /**
     * Gets the "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(EXTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extent" element
     */
    public boolean isSetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(org.isotc211.x2005.gmd.EXExtentPropertyType extent)
    {
        generatedSetterHelperImpl(extent, EXTENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().add_element_user(EXTENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extent" element
     */
    public void unsetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$2, 0);
        }
    }
    
    /**
     * Gets array of all "levelDescription" elements
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] getLevelDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LEVELDESCRIPTION$4, targetList);
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] result = new org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "levelDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType getLevelDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().find_element_user(LEVELDESCRIPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "levelDescription" element
     */
    public int sizeOfLevelDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEVELDESCRIPTION$4);
        }
    }
    
    /**
     * Sets array of all "levelDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLevelDescriptionArray(org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] levelDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(levelDescriptionArray, LEVELDESCRIPTION$4);
    }
    
    /**
     * Sets ith "levelDescription" element
     */
    public void setLevelDescriptionArray(int i, org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType levelDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().find_element_user(LEVELDESCRIPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(levelDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "levelDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType insertNewLevelDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().insert_element_user(LEVELDESCRIPTION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "levelDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType addNewLevelDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType)get_store().add_element_user(LEVELDESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "levelDescription" element
     */
    public void removeLevelDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEVELDESCRIPTION$4, i);
        }
    }
}
