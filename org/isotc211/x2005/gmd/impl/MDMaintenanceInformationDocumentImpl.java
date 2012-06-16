/*
 * An XML document type.
 * Localname: MD_MaintenanceInformation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMaintenanceInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_MaintenanceInformation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDMaintenanceInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDMaintenanceInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDMaintenanceInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMAINTENANCEINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MaintenanceInformation");
    
    
    /**
     * Gets the "MD_MaintenanceInformation" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationType getMDMaintenanceInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationType)get_store().find_element_user(MDMAINTENANCEINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_MaintenanceInformation" element
     */
    public void setMDMaintenanceInformation(org.isotc211.x2005.gmd.MDMaintenanceInformationType mdMaintenanceInformation)
    {
        generatedSetterHelperImpl(mdMaintenanceInformation, MDMAINTENANCEINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_MaintenanceInformation" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationType addNewMDMaintenanceInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationType)get_store().add_element_user(MDMAINTENANCEINFORMATION$0);
            return target;
        }
    }
}
