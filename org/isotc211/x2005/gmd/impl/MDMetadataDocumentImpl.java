/*
 * An XML document type.
 * Localname: MD_Metadata
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Metadata(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Metadata");
    private static final org.apache.xmlbeans.QNameSet MDMETADATA$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Metadata"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Metadata"),
    });
    
    
    /**
     * Gets the "MD_Metadata" element
     */
    public org.isotc211.x2005.gmd.MDMetadataType getMDMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataType)get_store().find_element_user(MDMETADATA$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Metadata" element
     */
    public void setMDMetadata(org.isotc211.x2005.gmd.MDMetadataType mdMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataType)get_store().find_element_user(MDMETADATA$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDMetadataType)get_store().add_element_user(MDMETADATA$0);
            }
            target.set(mdMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_Metadata" element
     */
    public org.isotc211.x2005.gmd.MDMetadataType addNewMDMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataType)get_store().add_element_user(MDMETADATA$0);
            return target;
        }
    }
}
