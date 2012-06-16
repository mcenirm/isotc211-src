/*
 * An XML document type.
 * Localname: MD_CellGeometryCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDCellGeometryCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_CellGeometryCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDCellGeometryCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDCellGeometryCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDCellGeometryCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDCELLGEOMETRYCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CellGeometryCode");
    
    
    /**
     * Gets the "MD_CellGeometryCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDCellGeometryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDCELLGEOMETRYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_CellGeometryCode" element
     */
    public void setMDCellGeometryCode(org.isotc211.x2005.gco.CodeListValueType mdCellGeometryCode)
    {
        generatedSetterHelperImpl(mdCellGeometryCode, MDCELLGEOMETRYCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_CellGeometryCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDCellGeometryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDCELLGEOMETRYCODE$0);
            return target;
        }
    }
}
