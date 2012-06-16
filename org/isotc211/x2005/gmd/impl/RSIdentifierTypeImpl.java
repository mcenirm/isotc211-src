/*
 * XML Type:  RS_Identifier_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.RSIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML RS_Identifier_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class RSIdentifierTypeImpl extends org.isotc211.x2005.gmd.impl.MDIdentifierTypeImpl implements org.isotc211.x2005.gmd.RSIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public RSIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODESPACE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "codeSpace");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "version");
    
    
    /**
     * Gets the "codeSpace" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CODESPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "codeSpace" element
     */
    public boolean isSetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODESPACE$0) != 0;
        }
    }
    
    /**
     * Sets the "codeSpace" element
     */
    public void setCodeSpace(org.isotc211.x2005.gco.CharacterStringPropertyType codeSpace)
    {
        generatedSetterHelperImpl(codeSpace, CODESPACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "codeSpace" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CODESPACE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "codeSpace" element
     */
    public void unsetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODESPACE$0, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(org.isotc211.x2005.gco.CharacterStringPropertyType version)
    {
        generatedSetterHelperImpl(version, VERSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(VERSION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$2, 0);
        }
    }
}
