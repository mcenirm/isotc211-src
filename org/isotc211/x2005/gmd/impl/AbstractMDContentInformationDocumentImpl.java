/*
 * An XML document type.
 * Localname: AbstractMD_ContentInformation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractMDContentInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractMD_ContentInformation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractMDContentInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractMDContentInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMDContentInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTMDCONTENTINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractMD_ContentInformation");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTMDCONTENTINFORMATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_FeatureCatalogueDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CoverageDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_CoverageDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ImageDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractMD_ContentInformation"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ImageDescription"),
    });
    
    
    /**
     * Gets the "AbstractMD_ContentInformation" element
     */
    public org.isotc211.x2005.gmd.AbstractMDContentInformationType getAbstractMDContentInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDContentInformationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDContentInformationType)get_store().find_element_user(ABSTRACTMDCONTENTINFORMATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractMD_ContentInformation" element
     */
    public void setAbstractMDContentInformation(org.isotc211.x2005.gmd.AbstractMDContentInformationType abstractMDContentInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDContentInformationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDContentInformationType)get_store().find_element_user(ABSTRACTMDCONTENTINFORMATION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractMDContentInformationType)get_store().add_element_user(ABSTRACTMDCONTENTINFORMATION$0);
            }
            target.set(abstractMDContentInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractMD_ContentInformation" element
     */
    public org.isotc211.x2005.gmd.AbstractMDContentInformationType addNewAbstractMDContentInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDContentInformationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDContentInformationType)get_store().add_element_user(ABSTRACTMDCONTENTINFORMATION$0);
            return target;
        }
    }
}
