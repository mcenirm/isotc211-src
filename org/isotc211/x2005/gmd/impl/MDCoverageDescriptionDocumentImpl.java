/*
 * An XML document type.
 * Localname: MD_CoverageDescription
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDCoverageDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_CoverageDescription(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDCoverageDescriptionDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractMDContentInformationDocumentImpl implements org.isotc211.x2005.gmd.MDCoverageDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDCoverageDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDCOVERAGEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CoverageDescription");
    private static final org.apache.xmlbeans.QNameSet MDCOVERAGEDESCRIPTION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CoverageDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_CoverageDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ImageDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ImageDescription"),
    });
    
    
    /**
     * Gets the "MD_CoverageDescription" element
     */
    public org.isotc211.x2005.gmd.MDCoverageDescriptionType getMDCoverageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCoverageDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDCoverageDescriptionType)get_store().find_element_user(MDCOVERAGEDESCRIPTION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_CoverageDescription" element
     */
    public void setMDCoverageDescription(org.isotc211.x2005.gmd.MDCoverageDescriptionType mdCoverageDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCoverageDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDCoverageDescriptionType)get_store().find_element_user(MDCOVERAGEDESCRIPTION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDCoverageDescriptionType)get_store().add_element_user(MDCOVERAGEDESCRIPTION$0);
            }
            target.set(mdCoverageDescription);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_CoverageDescription" element
     */
    public org.isotc211.x2005.gmd.MDCoverageDescriptionType addNewMDCoverageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCoverageDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDCoverageDescriptionType)get_store().add_element_user(MDCOVERAGEDESCRIPTION$0);
            return target;
        }
    }
}
