/*
 * An XML document type.
 * Localname: CI_Address
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIAddressDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_Address(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CIAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_Address");
    
    
    /**
     * Gets the "CI_Address" element
     */
    public org.isotc211.x2005.gmd.CIAddressType getCIAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIAddressType target = null;
            target = (org.isotc211.x2005.gmd.CIAddressType)get_store().find_element_user(CIADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_Address" element
     */
    public void setCIAddress(org.isotc211.x2005.gmd.CIAddressType ciAddress)
    {
        generatedSetterHelperImpl(ciAddress, CIADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_Address" element
     */
    public org.isotc211.x2005.gmd.CIAddressType addNewCIAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIAddressType target = null;
            target = (org.isotc211.x2005.gmd.CIAddressType)get_store().add_element_user(CIADDRESS$0);
            return target;
        }
    }
}
