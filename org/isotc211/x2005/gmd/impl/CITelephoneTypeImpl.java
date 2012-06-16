/*
 * XML Type:  CI_Telephone_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CITelephoneType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_Telephone_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CITelephoneTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CITelephoneType
{
    private static final long serialVersionUID = 1L;
    
    public CITelephoneTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOICE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "voice");
    private static final javax.xml.namespace.QName FACSIMILE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "facsimile");
    
    
    /**
     * Gets array of all "voice" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getVoiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VOICE$0, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "voice" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getVoiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(VOICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "voice" element
     */
    public int sizeOfVoiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOICE$0);
        }
    }
    
    /**
     * Sets array of all "voice" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVoiceArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] voiceArray)
    {
        check_orphaned();
        arraySetterHelper(voiceArray, VOICE$0);
    }
    
    /**
     * Sets ith "voice" element
     */
    public void setVoiceArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType voice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(VOICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(voice);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "voice" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewVoice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(VOICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "voice" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewVoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(VOICE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "voice" element
     */
    public void removeVoice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOICE$0, i);
        }
    }
    
    /**
     * Gets array of all "facsimile" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getFacsimileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FACSIMILE$2, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "facsimile" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFacsimileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FACSIMILE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "facsimile" element
     */
    public int sizeOfFacsimileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACSIMILE$2);
        }
    }
    
    /**
     * Sets array of all "facsimile" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFacsimileArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] facsimileArray)
    {
        check_orphaned();
        arraySetterHelper(facsimileArray, FACSIMILE$2);
    }
    
    /**
     * Sets ith "facsimile" element
     */
    public void setFacsimileArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType facsimile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FACSIMILE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(facsimile);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "facsimile" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewFacsimile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(FACSIMILE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "facsimile" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FACSIMILE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "facsimile" element
     */
    public void removeFacsimile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACSIMILE$2, i);
        }
    }
}
