/*
 * An XML document type.
 * Localname: LanguageCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LanguageCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one LanguageCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class LanguageCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.LanguageCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LanguageCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LanguageCode");
    
    
    /**
     * Gets the "LanguageCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(LANGUAGECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LanguageCode" element
     */
    public void setLanguageCode(org.isotc211.x2005.gco.CodeListValueType languageCode)
    {
        generatedSetterHelperImpl(languageCode, LANGUAGECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LanguageCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(LANGUAGECODE$0);
            return target;
        }
    }
}
