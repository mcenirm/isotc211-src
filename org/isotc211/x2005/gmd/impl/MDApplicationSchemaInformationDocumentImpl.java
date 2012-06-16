/*
 * An XML document type.
 * Localname: MD_ApplicationSchemaInformation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDApplicationSchemaInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ApplicationSchemaInformation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDApplicationSchemaInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDApplicationSchemaInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDApplicationSchemaInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDAPPLICATIONSCHEMAINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ApplicationSchemaInformation");
    
    
    /**
     * Gets the "MD_ApplicationSchemaInformation" element
     */
    public org.isotc211.x2005.gmd.MDApplicationSchemaInformationType getMDApplicationSchemaInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDApplicationSchemaInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType)get_store().find_element_user(MDAPPLICATIONSCHEMAINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ApplicationSchemaInformation" element
     */
    public void setMDApplicationSchemaInformation(org.isotc211.x2005.gmd.MDApplicationSchemaInformationType mdApplicationSchemaInformation)
    {
        generatedSetterHelperImpl(mdApplicationSchemaInformation, MDAPPLICATIONSCHEMAINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ApplicationSchemaInformation" element
     */
    public org.isotc211.x2005.gmd.MDApplicationSchemaInformationType addNewMDApplicationSchemaInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDApplicationSchemaInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType)get_store().add_element_user(MDAPPLICATIONSCHEMAINFORMATION$0);
            return target;
        }
    }
}
