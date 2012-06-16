/*
 * XML Type:  PT_FreeText_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.PTFreeTextType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML PT_FreeText_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class PTFreeTextTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.PTFreeTextType
{
    private static final long serialVersionUID = 1L;
    
    public PTFreeTextTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTGROUP$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "textGroup");
    
    
    /**
     * Gets array of all "textGroup" elements
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] getTextGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTGROUP$0, targetList);
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] result = new org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "textGroup" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType getTextGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().find_element_user(TEXTGROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "textGroup" element
     */
    public int sizeOfTextGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTGROUP$0);
        }
    }
    
    /**
     * Sets array of all "textGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTextGroupArray(org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] textGroupArray)
    {
        check_orphaned();
        arraySetterHelper(textGroupArray, TEXTGROUP$0);
    }
    
    /**
     * Sets ith "textGroup" element
     */
    public void setTextGroupArray(int i, org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType textGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().find_element_user(TEXTGROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "textGroup" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType insertNewTextGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().insert_element_user(TEXTGROUP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "textGroup" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType addNewTextGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType)get_store().add_element_user(TEXTGROUP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "textGroup" element
     */
    public void removeTextGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTGROUP$0, i);
        }
    }
}
