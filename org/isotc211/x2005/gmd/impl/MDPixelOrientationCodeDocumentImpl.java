/*
 * An XML document type.
 * Localname: MD_PixelOrientationCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDPixelOrientationCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_PixelOrientationCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDPixelOrientationCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDPixelOrientationCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDPixelOrientationCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDPIXELORIENTATIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_PixelOrientationCode");
    
    
    /**
     * Gets the "MD_PixelOrientationCode" element
     */
    public org.isotc211.x2005.gmd.MDPixelOrientationCodeType.Enum getMDPixelOrientationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDPIXELORIENTATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MD_PixelOrientationCode" element
     */
    public org.isotc211.x2005.gmd.MDPixelOrientationCodeType xgetMDPixelOrientationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPixelOrientationCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDPixelOrientationCodeType)get_store().find_element_user(MDPIXELORIENTATIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MD_PixelOrientationCode" element
     */
    public void setMDPixelOrientationCode(org.isotc211.x2005.gmd.MDPixelOrientationCodeType.Enum mdPixelOrientationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDPIXELORIENTATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MDPIXELORIENTATIONCODE$0);
            }
            target.setEnumValue(mdPixelOrientationCode);
        }
    }
    
    /**
     * Sets (as xml) the "MD_PixelOrientationCode" element
     */
    public void xsetMDPixelOrientationCode(org.isotc211.x2005.gmd.MDPixelOrientationCodeType mdPixelOrientationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPixelOrientationCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDPixelOrientationCodeType)get_store().find_element_user(MDPIXELORIENTATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDPixelOrientationCodeType)get_store().add_element_user(MDPIXELORIENTATIONCODE$0);
            }
            target.set(mdPixelOrientationCode);
        }
    }
}
