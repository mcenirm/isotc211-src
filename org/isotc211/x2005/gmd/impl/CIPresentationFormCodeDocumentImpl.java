/*
 * An XML document type.
 * Localname: CI_PresentationFormCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIPresentationFormCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_PresentationFormCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIPresentationFormCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.CIPresentationFormCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIPresentationFormCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIPRESENTATIONFORMCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_PresentationFormCode");
    
    
    /**
     * Gets the "CI_PresentationFormCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getCIPresentationFormCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(CIPRESENTATIONFORMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_PresentationFormCode" element
     */
    public void setCIPresentationFormCode(org.isotc211.x2005.gco.CodeListValueType ciPresentationFormCode)
    {
        generatedSetterHelperImpl(ciPresentationFormCode, CIPRESENTATIONFORMCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_PresentationFormCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewCIPresentationFormCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(CIPRESENTATIONFORMCODE$0);
            return target;
        }
    }
}
