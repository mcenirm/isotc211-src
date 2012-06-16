/*
 * An XML document type.
 * Localname: CI_Telephone
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CITelephoneDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_Telephone(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CITelephoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CITelephoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public CITelephoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITELEPHONE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_Telephone");
    
    
    /**
     * Gets the "CI_Telephone" element
     */
    public org.isotc211.x2005.gmd.CITelephoneType getCITelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CITelephoneType target = null;
            target = (org.isotc211.x2005.gmd.CITelephoneType)get_store().find_element_user(CITELEPHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_Telephone" element
     */
    public void setCITelephone(org.isotc211.x2005.gmd.CITelephoneType ciTelephone)
    {
        generatedSetterHelperImpl(ciTelephone, CITELEPHONE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_Telephone" element
     */
    public org.isotc211.x2005.gmd.CITelephoneType addNewCITelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CITelephoneType target = null;
            target = (org.isotc211.x2005.gmd.CITelephoneType)get_store().add_element_user(CITELEPHONE$0);
            return target;
        }
    }
}
