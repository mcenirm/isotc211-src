/*
 * An XML document type.
 * Localname: MD_DigitalTransferOptions
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDigitalTransferOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_DigitalTransferOptions(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDigitalTransferOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDDigitalTransferOptionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDigitalTransferOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDIGITALTRANSFEROPTIONS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DigitalTransferOptions");
    
    
    /**
     * Gets the "MD_DigitalTransferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsType getMDDigitalTransferOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType)get_store().find_element_user(MDDIGITALTRANSFEROPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_DigitalTransferOptions" element
     */
    public void setMDDigitalTransferOptions(org.isotc211.x2005.gmd.MDDigitalTransferOptionsType mdDigitalTransferOptions)
    {
        generatedSetterHelperImpl(mdDigitalTransferOptions, MDDIGITALTRANSFEROPTIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_DigitalTransferOptions" element
     */
    public org.isotc211.x2005.gmd.MDDigitalTransferOptionsType addNewMDDigitalTransferOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDigitalTransferOptionsType target = null;
            target = (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType)get_store().add_element_user(MDDIGITALTRANSFEROPTIONS$0);
            return target;
        }
    }
}
