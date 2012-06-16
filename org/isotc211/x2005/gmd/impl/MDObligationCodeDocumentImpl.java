/*
 * An XML document type.
 * Localname: MD_ObligationCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDObligationCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ObligationCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDObligationCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDObligationCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDObligationCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDOBLIGATIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ObligationCode");
    
    
    /**
     * Gets the "MD_ObligationCode" element
     */
    public org.isotc211.x2005.gmd.MDObligationCodeType.Enum getMDObligationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.isotc211.x2005.gmd.MDObligationCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MD_ObligationCode" element
     */
    public org.isotc211.x2005.gmd.MDObligationCodeType xgetMDObligationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDObligationCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDObligationCodeType)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MD_ObligationCode" element
     */
    public void setMDObligationCode(org.isotc211.x2005.gmd.MDObligationCodeType.Enum mdObligationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MDOBLIGATIONCODE$0);
            }
            target.setEnumValue(mdObligationCode);
        }
    }
    
    /**
     * Sets (as xml) the "MD_ObligationCode" element
     */
    public void xsetMDObligationCode(org.isotc211.x2005.gmd.MDObligationCodeType mdObligationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDObligationCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDObligationCodeType)get_store().find_element_user(MDOBLIGATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDObligationCodeType)get_store().add_element_user(MDOBLIGATIONCODE$0);
            }
            target.set(mdObligationCode);
        }
    }
}
