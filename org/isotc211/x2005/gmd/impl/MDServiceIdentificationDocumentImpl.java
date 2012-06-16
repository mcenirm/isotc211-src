/*
 * An XML document type.
 * Localname: MD_ServiceIdentification
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDServiceIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ServiceIdentification(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDServiceIdentificationDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractMDIdentificationDocumentImpl implements org.isotc211.x2005.gmd.MDServiceIdentificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDServiceIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDSERVICEIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ServiceIdentification");
    
    
    /**
     * Gets the "MD_ServiceIdentification" element
     */
    public org.isotc211.x2005.gmd.MDServiceIdentificationType getMDServiceIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDServiceIdentificationType target = null;
            target = (org.isotc211.x2005.gmd.MDServiceIdentificationType)get_store().find_element_user(MDSERVICEIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ServiceIdentification" element
     */
    public void setMDServiceIdentification(org.isotc211.x2005.gmd.MDServiceIdentificationType mdServiceIdentification)
    {
        generatedSetterHelperImpl(mdServiceIdentification, MDSERVICEIDENTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ServiceIdentification" element
     */
    public org.isotc211.x2005.gmd.MDServiceIdentificationType addNewMDServiceIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDServiceIdentificationType target = null;
            target = (org.isotc211.x2005.gmd.MDServiceIdentificationType)get_store().add_element_user(MDSERVICEIDENTIFICATION$0);
            return target;
        }
    }
}
