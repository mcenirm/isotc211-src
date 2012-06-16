/*
 * An XML document type.
 * Localname: CI_OnLineFunctionCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIOnLineFunctionCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_OnLineFunctionCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIOnLineFunctionCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.CIOnLineFunctionCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIOnLineFunctionCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIONLINEFUNCTIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_OnLineFunctionCode");
    
    
    /**
     * Gets the "CI_OnLineFunctionCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getCIOnLineFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(CIONLINEFUNCTIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_OnLineFunctionCode" element
     */
    public void setCIOnLineFunctionCode(org.isotc211.x2005.gco.CodeListValueType ciOnLineFunctionCode)
    {
        generatedSetterHelperImpl(ciOnLineFunctionCode, CIONLINEFUNCTIONCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_OnLineFunctionCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewCIOnLineFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(CIONLINEFUNCTIONCODE$0);
            return target;
        }
    }
}
