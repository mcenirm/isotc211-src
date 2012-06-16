/*
 * An XML document type.
 * Localname: MD_ImagingConditionCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDImagingConditionCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ImagingConditionCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDImagingConditionCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDImagingConditionCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDImagingConditionCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDIMAGINGCONDITIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ImagingConditionCode");
    
    
    /**
     * Gets the "MD_ImagingConditionCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDImagingConditionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDIMAGINGCONDITIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ImagingConditionCode" element
     */
    public void setMDImagingConditionCode(org.isotc211.x2005.gco.CodeListValueType mdImagingConditionCode)
    {
        generatedSetterHelperImpl(mdImagingConditionCode, MDIMAGINGCONDITIONCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ImagingConditionCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDImagingConditionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDIMAGINGCONDITIONCODE$0);
            return target;
        }
    }
}
