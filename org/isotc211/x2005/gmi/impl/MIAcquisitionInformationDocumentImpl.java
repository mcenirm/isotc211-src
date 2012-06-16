/*
 * An XML document type.
 * Localname: MI_AcquisitionInformation
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIAcquisitionInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_AcquisitionInformation(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIAcquisitionInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIAcquisitionInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIAcquisitionInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIACQUISITIONINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_AcquisitionInformation");
    
    
    /**
     * Gets the "MI_AcquisitionInformation" element
     */
    public org.isotc211.x2005.gmi.MIAcquisitionInformationType getMIAcquisitionInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIAcquisitionInformationType target = null;
            target = (org.isotc211.x2005.gmi.MIAcquisitionInformationType)get_store().find_element_user(MIACQUISITIONINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_AcquisitionInformation" element
     */
    public void setMIAcquisitionInformation(org.isotc211.x2005.gmi.MIAcquisitionInformationType miAcquisitionInformation)
    {
        generatedSetterHelperImpl(miAcquisitionInformation, MIACQUISITIONINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_AcquisitionInformation" element
     */
    public org.isotc211.x2005.gmi.MIAcquisitionInformationType addNewMIAcquisitionInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIAcquisitionInformationType target = null;
            target = (org.isotc211.x2005.gmi.MIAcquisitionInformationType)get_store().add_element_user(MIACQUISITIONINFORMATION$0);
            return target;
        }
    }
}
