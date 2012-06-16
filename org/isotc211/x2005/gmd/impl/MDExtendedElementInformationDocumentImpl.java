/*
 * An XML document type.
 * Localname: MD_ExtendedElementInformation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDExtendedElementInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ExtendedElementInformation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDExtendedElementInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDExtendedElementInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDExtendedElementInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDEXTENDEDELEMENTINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ExtendedElementInformation");
    
    
    /**
     * Gets the "MD_ExtendedElementInformation" element
     */
    public org.isotc211.x2005.gmd.MDExtendedElementInformationType getMDExtendedElementInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDExtendedElementInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDExtendedElementInformationType)get_store().find_element_user(MDEXTENDEDELEMENTINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ExtendedElementInformation" element
     */
    public void setMDExtendedElementInformation(org.isotc211.x2005.gmd.MDExtendedElementInformationType mdExtendedElementInformation)
    {
        generatedSetterHelperImpl(mdExtendedElementInformation, MDEXTENDEDELEMENTINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ExtendedElementInformation" element
     */
    public org.isotc211.x2005.gmd.MDExtendedElementInformationType addNewMDExtendedElementInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDExtendedElementInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDExtendedElementInformationType)get_store().add_element_user(MDEXTENDEDELEMENTINFORMATION$0);
            return target;
        }
    }
}
