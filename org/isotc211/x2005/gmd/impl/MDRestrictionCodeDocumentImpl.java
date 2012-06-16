/*
 * An XML document type.
 * Localname: MD_RestrictionCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDRestrictionCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_RestrictionCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDRestrictionCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDRestrictionCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDRestrictionCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDRESTRICTIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_RestrictionCode");
    
    
    /**
     * Gets the "MD_RestrictionCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDRestrictionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDRESTRICTIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_RestrictionCode" element
     */
    public void setMDRestrictionCode(org.isotc211.x2005.gco.CodeListValueType mdRestrictionCode)
    {
        generatedSetterHelperImpl(mdRestrictionCode, MDRESTRICTIONCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_RestrictionCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDRestrictionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDRESTRICTIONCODE$0);
            return target;
        }
    }
}
