/*
 * An XML document type.
 * Localname: CI_RoleCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIRoleCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_RoleCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIRoleCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.CIRoleCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIRoleCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIROLECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_RoleCode");
    
    
    /**
     * Gets the "CI_RoleCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getCIRoleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(CIROLECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_RoleCode" element
     */
    public void setCIRoleCode(org.isotc211.x2005.gco.CodeListValueType ciRoleCode)
    {
        generatedSetterHelperImpl(ciRoleCode, CIROLECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_RoleCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewCIRoleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(CIROLECODE$0);
            return target;
        }
    }
}
