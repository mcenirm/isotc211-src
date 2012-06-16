/*
 * XML Type:  MD_LegalConstraints_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDLegalConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_LegalConstraints_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDLegalConstraintsTypeImpl extends org.isotc211.x2005.gmd.impl.MDConstraintsTypeImpl implements org.isotc211.x2005.gmd.MDLegalConstraintsType
{
    private static final long serialVersionUID = 1L;
    
    public MDLegalConstraintsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSCONSTRAINTS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "accessConstraints");
    private static final javax.xml.namespace.QName USECONSTRAINTS$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "useConstraints");
    private static final javax.xml.namespace.QName OTHERCONSTRAINTS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "otherConstraints");
    
    
    /**
     * Gets array of all "accessConstraints" elements
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] getAccessConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCESSCONSTRAINTS$0, targetList);
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] result = new org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "accessConstraints" element
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType getAccessConstraintsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().find_element_user(ACCESSCONSTRAINTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "accessConstraints" element
     */
    public int sizeOfAccessConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSCONSTRAINTS$0);
        }
    }
    
    /**
     * Sets array of all "accessConstraints" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAccessConstraintsArray(org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] accessConstraintsArray)
    {
        check_orphaned();
        arraySetterHelper(accessConstraintsArray, ACCESSCONSTRAINTS$0);
    }
    
    /**
     * Sets ith "accessConstraints" element
     */
    public void setAccessConstraintsArray(int i, org.isotc211.x2005.gmd.MDRestrictionCodePropertyType accessConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().find_element_user(ACCESSCONSTRAINTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accessConstraints);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "accessConstraints" element
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType insertNewAccessConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().insert_element_user(ACCESSCONSTRAINTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "accessConstraints" element
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType addNewAccessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().add_element_user(ACCESSCONSTRAINTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "accessConstraints" element
     */
    public void removeAccessConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSCONSTRAINTS$0, i);
        }
    }
    
    /**
     * Gets array of all "useConstraints" elements
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] getUseConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USECONSTRAINTS$2, targetList);
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] result = new org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "useConstraints" element
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType getUseConstraintsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().find_element_user(USECONSTRAINTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "useConstraints" element
     */
    public int sizeOfUseConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USECONSTRAINTS$2);
        }
    }
    
    /**
     * Sets array of all "useConstraints" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUseConstraintsArray(org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] useConstraintsArray)
    {
        check_orphaned();
        arraySetterHelper(useConstraintsArray, USECONSTRAINTS$2);
    }
    
    /**
     * Sets ith "useConstraints" element
     */
    public void setUseConstraintsArray(int i, org.isotc211.x2005.gmd.MDRestrictionCodePropertyType useConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().find_element_user(USECONSTRAINTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(useConstraints);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useConstraints" element
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType insertNewUseConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().insert_element_user(USECONSTRAINTS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useConstraints" element
     */
    public org.isotc211.x2005.gmd.MDRestrictionCodePropertyType addNewUseConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRestrictionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRestrictionCodePropertyType)get_store().add_element_user(USECONSTRAINTS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "useConstraints" element
     */
    public void removeUseConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USECONSTRAINTS$2, i);
        }
    }
    
    /**
     * Gets array of all "otherConstraints" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getOtherConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHERCONSTRAINTS$4, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "otherConstraints" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getOtherConstraintsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(OTHERCONSTRAINTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "otherConstraints" element
     */
    public int sizeOfOtherConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERCONSTRAINTS$4);
        }
    }
    
    /**
     * Sets array of all "otherConstraints" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOtherConstraintsArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] otherConstraintsArray)
    {
        check_orphaned();
        arraySetterHelper(otherConstraintsArray, OTHERCONSTRAINTS$4);
    }
    
    /**
     * Sets ith "otherConstraints" element
     */
    public void setOtherConstraintsArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType otherConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(OTHERCONSTRAINTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(otherConstraints);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "otherConstraints" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewOtherConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(OTHERCONSTRAINTS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "otherConstraints" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewOtherConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(OTHERCONSTRAINTS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "otherConstraints" element
     */
    public void removeOtherConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERCONSTRAINTS$4, i);
        }
    }
}
