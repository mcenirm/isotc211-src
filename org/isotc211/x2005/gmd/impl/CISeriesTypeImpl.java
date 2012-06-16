/*
 * XML Type:  CI_Series_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CISeriesType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_Series_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CISeriesTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CISeriesType
{
    private static final long serialVersionUID = 1L;
    
    public CISeriesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "name");
    private static final javax.xml.namespace.QName ISSUEIDENTIFICATION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "issueIdentification");
    private static final javax.xml.namespace.QName PAGE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "page");
    
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.isotc211.x2005.gco.CharacterStringPropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "issueIdentification" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getIssueIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ISSUEIDENTIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "issueIdentification" element
     */
    public boolean isSetIssueIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUEIDENTIFICATION$2) != 0;
        }
    }
    
    /**
     * Sets the "issueIdentification" element
     */
    public void setIssueIdentification(org.isotc211.x2005.gco.CharacterStringPropertyType issueIdentification)
    {
        generatedSetterHelperImpl(issueIdentification, ISSUEIDENTIFICATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "issueIdentification" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewIssueIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ISSUEIDENTIFICATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "issueIdentification" element
     */
    public void unsetIssueIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUEIDENTIFICATION$2, 0);
        }
    }
    
    /**
     * Gets the "page" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "page" element
     */
    public boolean isSetPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "page" element
     */
    public void setPage(org.isotc211.x2005.gco.CharacterStringPropertyType page)
    {
        generatedSetterHelperImpl(page, PAGE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "page" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(PAGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "page" element
     */
    public void unsetPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGE$4, 0);
        }
    }
}
