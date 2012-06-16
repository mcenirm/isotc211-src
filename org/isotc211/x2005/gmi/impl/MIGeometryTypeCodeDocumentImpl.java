/*
 * An XML document type.
 * Localname: MI_GeometryTypeCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGeometryTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_GeometryTypeCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIGeometryTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MIGeometryTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIGeometryTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIGEOMETRYTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_GeometryTypeCode");
    
    
    /**
     * Gets the "MI_GeometryTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMIGeometryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MIGEOMETRYTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_GeometryTypeCode" element
     */
    public void setMIGeometryTypeCode(org.isotc211.x2005.gco.CodeListValueType miGeometryTypeCode)
    {
        generatedSetterHelperImpl(miGeometryTypeCode, MIGEOMETRYTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_GeometryTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMIGeometryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MIGEOMETRYTYPECODE$0);
            return target;
        }
    }
}
