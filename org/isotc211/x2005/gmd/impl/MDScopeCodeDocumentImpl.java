/*
 * An XML document type.
 * Localname: MD_ScopeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDScopeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ScopeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDScopeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDScopeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDScopeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDSCOPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ScopeCode");
    
    
    /**
     * Gets the "MD_ScopeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDScopeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDSCOPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ScopeCode" element
     */
    public void setMDScopeCode(org.isotc211.x2005.gco.CodeListValueType mdScopeCode)
    {
        generatedSetterHelperImpl(mdScopeCode, MDSCOPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ScopeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDScopeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDSCOPECODE$0);
            return target;
        }
    }
}
