/*
 * An XML document type.
 * Localname: MD_GeometricObjectTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeometricObjectTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_GeometricObjectTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDGeometricObjectTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDGeometricObjectTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDGeometricObjectTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDGEOMETRICOBJECTTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_GeometricObjectTypeCode");
    
    
    /**
     * Gets the "MD_GeometricObjectTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDGeometricObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDGEOMETRICOBJECTTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_GeometricObjectTypeCode" element
     */
    public void setMDGeometricObjectTypeCode(org.isotc211.x2005.gco.CodeListValueType mdGeometricObjectTypeCode)
    {
        generatedSetterHelperImpl(mdGeometricObjectTypeCode, MDGEOMETRICOBJECTTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_GeometricObjectTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDGeometricObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDGEOMETRICOBJECTTYPECODE$0);
            return target;
        }
    }
}
