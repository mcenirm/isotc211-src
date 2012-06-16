/*
 * An XML document type.
 * Localname: MD_SpatialRepresentationTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_SpatialRepresentationTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDSpatialRepresentationTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDSpatialRepresentationTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDSPATIALREPRESENTATIONTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_SpatialRepresentationTypeCode");
    
    
    /**
     * Gets the "MD_SpatialRepresentationTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDSpatialRepresentationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDSPATIALREPRESENTATIONTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_SpatialRepresentationTypeCode" element
     */
    public void setMDSpatialRepresentationTypeCode(org.isotc211.x2005.gco.CodeListValueType mdSpatialRepresentationTypeCode)
    {
        generatedSetterHelperImpl(mdSpatialRepresentationTypeCode, MDSPATIALREPRESENTATIONTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_SpatialRepresentationTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDSpatialRepresentationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDSPATIALREPRESENTATIONTYPECODE$0);
            return target;
        }
    }
}
