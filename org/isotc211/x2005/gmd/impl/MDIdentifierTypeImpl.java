/*
 * XML Type:  MD_Identifier_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Identifier_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDIdentifierTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public MDIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORITY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "authority");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "code");
    
    
    /**
     * Gets the "authority" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(AUTHORITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authority" element
     */
    public boolean isSetAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORITY$0) != 0;
        }
    }
    
    /**
     * Sets the "authority" element
     */
    public void setAuthority(org.isotc211.x2005.gmd.CICitationPropertyType authority)
    {
        generatedSetterHelperImpl(authority, AUTHORITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authority" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(AUTHORITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "authority" element
     */
    public void unsetAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORITY$0, 0);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.isotc211.x2005.gco.CharacterStringPropertyType code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CODE$2);
            return target;
        }
    }
}
