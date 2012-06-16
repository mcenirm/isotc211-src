/*
 * XML Type:  MD_Keywords_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDKeywordsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Keywords_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDKeywordsTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDKeywordsType
{
    private static final long serialVersionUID = 1L;
    
    public MDKeywordsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORD$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "keyword");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "type");
    private static final javax.xml.namespace.QName THESAURUSNAME$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "thesaurusName");
    
    
    /**
     * Gets array of all "keyword" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORD$0, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "keyword" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getKeywordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keyword" element
     */
    public int sizeOfKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$0);
        }
    }
    
    /**
     * Sets array of all "keyword" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeywordArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] keywordArray)
    {
        check_orphaned();
        arraySetterHelper(keywordArray, KEYWORD$0);
    }
    
    /**
     * Sets ith "keyword" element
     */
    public void setKeywordArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyword);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyword" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(KEYWORD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyword" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(KEYWORD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "keyword" element
     */
    public void removeKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$0, i);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.isotc211.x2005.gmd.MDKeywordTypeCodePropertyType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordTypeCodePropertyType)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.isotc211.x2005.gmd.MDKeywordTypeCodePropertyType type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.isotc211.x2005.gmd.MDKeywordTypeCodePropertyType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordTypeCodePropertyType)get_store().add_element_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$2, 0);
        }
    }
    
    /**
     * Gets the "thesaurusName" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getThesaurusName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(THESAURUSNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "thesaurusName" element
     */
    public boolean isSetThesaurusName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THESAURUSNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "thesaurusName" element
     */
    public void setThesaurusName(org.isotc211.x2005.gmd.CICitationPropertyType thesaurusName)
    {
        generatedSetterHelperImpl(thesaurusName, THESAURUSNAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "thesaurusName" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewThesaurusName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(THESAURUSNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "thesaurusName" element
     */
    public void unsetThesaurusName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THESAURUSNAME$4, 0);
        }
    }
}
