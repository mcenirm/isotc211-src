/*
 * An XML document type.
 * Localname: MD_MetadataExtensionInformation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMetadataExtensionInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_MetadataExtensionInformation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDMetadataExtensionInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDMetadataExtensionInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDMetadataExtensionInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMETADATAEXTENSIONINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MetadataExtensionInformation");
    
    
    /**
     * Gets the "MD_MetadataExtensionInformation" element
     */
    public org.isotc211.x2005.gmd.MDMetadataExtensionInformationType getMDMetadataExtensionInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataExtensionInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataExtensionInformationType)get_store().find_element_user(MDMETADATAEXTENSIONINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_MetadataExtensionInformation" element
     */
    public void setMDMetadataExtensionInformation(org.isotc211.x2005.gmd.MDMetadataExtensionInformationType mdMetadataExtensionInformation)
    {
        generatedSetterHelperImpl(mdMetadataExtensionInformation, MDMETADATAEXTENSIONINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_MetadataExtensionInformation" element
     */
    public org.isotc211.x2005.gmd.MDMetadataExtensionInformationType addNewMDMetadataExtensionInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMetadataExtensionInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDMetadataExtensionInformationType)get_store().add_element_user(MDMETADATAEXTENSIONINFORMATION$0);
            return target;
        }
    }
}
