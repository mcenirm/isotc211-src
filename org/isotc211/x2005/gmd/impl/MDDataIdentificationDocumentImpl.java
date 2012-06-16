/*
 * An XML document type.
 * Localname: MD_DataIdentification
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDataIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_DataIdentification(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDataIdentificationDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractMDIdentificationDocumentImpl implements org.isotc211.x2005.gmd.MDDataIdentificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDataIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDATAIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DataIdentification");
    
    
    /**
     * Gets the "MD_DataIdentification" element
     */
    public org.isotc211.x2005.gmd.MDDataIdentificationType getMDDataIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDataIdentificationType target = null;
            target = (org.isotc211.x2005.gmd.MDDataIdentificationType)get_store().find_element_user(MDDATAIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_DataIdentification" element
     */
    public void setMDDataIdentification(org.isotc211.x2005.gmd.MDDataIdentificationType mdDataIdentification)
    {
        generatedSetterHelperImpl(mdDataIdentification, MDDATAIDENTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_DataIdentification" element
     */
    public org.isotc211.x2005.gmd.MDDataIdentificationType addNewMDDataIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDataIdentificationType target = null;
            target = (org.isotc211.x2005.gmd.MDDataIdentificationType)get_store().add_element_user(MDDATAIDENTIFICATION$0);
            return target;
        }
    }
}
