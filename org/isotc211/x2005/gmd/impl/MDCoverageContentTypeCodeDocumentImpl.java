/*
 * An XML document type.
 * Localname: MD_CoverageContentTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDCoverageContentTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_CoverageContentTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDCoverageContentTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDCoverageContentTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDCoverageContentTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDCOVERAGECONTENTTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CoverageContentTypeCode");
    
    
    /**
     * Gets the "MD_CoverageContentTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDCoverageContentTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDCOVERAGECONTENTTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_CoverageContentTypeCode" element
     */
    public void setMDCoverageContentTypeCode(org.isotc211.x2005.gco.CodeListValueType mdCoverageContentTypeCode)
    {
        generatedSetterHelperImpl(mdCoverageContentTypeCode, MDCOVERAGECONTENTTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_CoverageContentTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDCoverageContentTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDCOVERAGECONTENTTYPECODE$0);
            return target;
        }
    }
}
