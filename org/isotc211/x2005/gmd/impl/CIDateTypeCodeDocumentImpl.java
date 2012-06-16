/*
 * An XML document type.
 * Localname: CI_DateTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIDateTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_DateTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIDateTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.CIDateTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIDateTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIDATETYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_DateTypeCode");
    
    
    /**
     * Gets the "CI_DateTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getCIDateTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(CIDATETYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_DateTypeCode" element
     */
    public void setCIDateTypeCode(org.isotc211.x2005.gco.CodeListValueType ciDateTypeCode)
    {
        generatedSetterHelperImpl(ciDateTypeCode, CIDATETYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_DateTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewCIDateTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(CIDATETYPECODE$0);
            return target;
        }
    }
}
