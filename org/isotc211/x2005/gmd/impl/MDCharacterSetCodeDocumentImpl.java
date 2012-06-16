/*
 * An XML document type.
 * Localname: MD_CharacterSetCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDCharacterSetCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_CharacterSetCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDCharacterSetCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDCharacterSetCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDCharacterSetCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDCHARACTERSETCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CharacterSetCode");
    
    
    /**
     * Gets the "MD_CharacterSetCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDCharacterSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDCHARACTERSETCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_CharacterSetCode" element
     */
    public void setMDCharacterSetCode(org.isotc211.x2005.gco.CodeListValueType mdCharacterSetCode)
    {
        generatedSetterHelperImpl(mdCharacterSetCode, MDCHARACTERSETCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_CharacterSetCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDCharacterSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDCHARACTERSETCODE$0);
            return target;
        }
    }
}
