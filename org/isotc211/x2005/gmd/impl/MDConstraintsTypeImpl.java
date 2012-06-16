/*
 * XML Type:  MD_Constraints_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Constraints_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDConstraintsTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDConstraintsType
{
    private static final long serialVersionUID = 1L;
    
    public MDConstraintsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USELIMITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "useLimitation");
    
    
    /**
     * Gets array of all "useLimitation" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getUseLimitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USELIMITATION$0, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "useLimitation" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getUseLimitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(USELIMITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "useLimitation" element
     */
    public int sizeOfUseLimitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USELIMITATION$0);
        }
    }
    
    /**
     * Sets array of all "useLimitation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUseLimitationArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] useLimitationArray)
    {
        check_orphaned();
        arraySetterHelper(useLimitationArray, USELIMITATION$0);
    }
    
    /**
     * Sets ith "useLimitation" element
     */
    public void setUseLimitationArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType useLimitation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(USELIMITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(useLimitation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useLimitation" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewUseLimitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(USELIMITATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useLimitation" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewUseLimitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(USELIMITATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "useLimitation" element
     */
    public void removeUseLimitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USELIMITATION$0, i);
        }
    }
}
