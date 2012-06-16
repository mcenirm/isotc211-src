/*
 * An XML document type.
 * Localname: MD_KeywordTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDKeywordTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_KeywordTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDKeywordTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDKeywordTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDKeywordTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDKEYWORDTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_KeywordTypeCode");
    
    
    /**
     * Gets the "MD_KeywordTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDKeywordTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDKEYWORDTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_KeywordTypeCode" element
     */
    public void setMDKeywordTypeCode(org.isotc211.x2005.gco.CodeListValueType mdKeywordTypeCode)
    {
        generatedSetterHelperImpl(mdKeywordTypeCode, MDKEYWORDTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_KeywordTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDKeywordTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDKEYWORDTYPECODE$0);
            return target;
        }
    }
}
