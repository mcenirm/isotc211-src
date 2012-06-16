/*
 * An XML document type.
 * Localname: MD_MaintenanceFrequencyCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_MaintenanceFrequencyCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDMaintenanceFrequencyCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDMaintenanceFrequencyCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMAINTENANCEFREQUENCYCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MaintenanceFrequencyCode");
    
    
    /**
     * Gets the "MD_MaintenanceFrequencyCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDMaintenanceFrequencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDMAINTENANCEFREQUENCYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_MaintenanceFrequencyCode" element
     */
    public void setMDMaintenanceFrequencyCode(org.isotc211.x2005.gco.CodeListValueType mdMaintenanceFrequencyCode)
    {
        generatedSetterHelperImpl(mdMaintenanceFrequencyCode, MDMAINTENANCEFREQUENCYCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_MaintenanceFrequencyCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDMaintenanceFrequencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDMAINTENANCEFREQUENCYCODE$0);
            return target;
        }
    }
}
