/*
 * An XML document type.
 * Localname: CI_Contact
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIContactDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_Contact(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CIContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CICONTACT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_Contact");
    
    
    /**
     * Gets the "CI_Contact" element
     */
    public org.isotc211.x2005.gmd.CIContactType getCIContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIContactType target = null;
            target = (org.isotc211.x2005.gmd.CIContactType)get_store().find_element_user(CICONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_Contact" element
     */
    public void setCIContact(org.isotc211.x2005.gmd.CIContactType ciContact)
    {
        generatedSetterHelperImpl(ciContact, CICONTACT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_Contact" element
     */
    public org.isotc211.x2005.gmd.CIContactType addNewCIContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIContactType target = null;
            target = (org.isotc211.x2005.gmd.CIContactType)get_store().add_element_user(CICONTACT$0);
            return target;
        }
    }
}
