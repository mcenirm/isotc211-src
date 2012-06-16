/*
 * An XML document type.
 * Localname: MD_MediumFormatCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMediumFormatCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_MediumFormatCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDMediumFormatCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDMediumFormatCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDMediumFormatCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMEDIUMFORMATCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MediumFormatCode");
    
    
    /**
     * Gets the "MD_MediumFormatCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDMediumFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDMEDIUMFORMATCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_MediumFormatCode" element
     */
    public void setMDMediumFormatCode(org.isotc211.x2005.gco.CodeListValueType mdMediumFormatCode)
    {
        generatedSetterHelperImpl(mdMediumFormatCode, MDMEDIUMFORMATCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_MediumFormatCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDMediumFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDMEDIUMFORMATCODE$0);
            return target;
        }
    }
}
