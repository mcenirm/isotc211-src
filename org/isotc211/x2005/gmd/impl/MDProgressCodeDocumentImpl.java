/*
 * An XML document type.
 * Localname: MD_ProgressCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDProgressCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ProgressCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDProgressCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDProgressCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDProgressCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDPROGRESSCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ProgressCode");
    
    
    /**
     * Gets the "MD_ProgressCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDProgressCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDPROGRESSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ProgressCode" element
     */
    public void setMDProgressCode(org.isotc211.x2005.gco.CodeListValueType mdProgressCode)
    {
        generatedSetterHelperImpl(mdProgressCode, MDPROGRESSCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ProgressCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDProgressCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDPROGRESSCODE$0);
            return target;
        }
    }
}
