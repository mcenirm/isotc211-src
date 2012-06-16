/*
 * An XML document type.
 * Localname: MI_Metadata
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Metadata(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIMetadataDocumentImpl extends org.isotc211.x2005.gmd.impl.MDMetadataDocumentImpl implements org.isotc211.x2005.gmi.MIMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Metadata");
    
    
    /**
     * Gets the "MI_Metadata" element
     */
    public org.isotc211.x2005.gmi.MIMetadataType getMIMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIMetadataType target = null;
            target = (org.isotc211.x2005.gmi.MIMetadataType)get_store().find_element_user(MIMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Metadata" element
     */
    public void setMIMetadata(org.isotc211.x2005.gmi.MIMetadataType miMetadata)
    {
        generatedSetterHelperImpl(miMetadata, MIMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Metadata" element
     */
    public org.isotc211.x2005.gmi.MIMetadataType addNewMIMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIMetadataType target = null;
            target = (org.isotc211.x2005.gmi.MIMetadataType)get_store().add_element_user(MIMETADATA$0);
            return target;
        }
    }
}
