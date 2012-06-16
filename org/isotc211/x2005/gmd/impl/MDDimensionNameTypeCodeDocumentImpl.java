/*
 * An XML document type.
 * Localname: MD_DimensionNameTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDimensionNameTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_DimensionNameTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDimensionNameTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDDimensionNameTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDimensionNameTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDIMENSIONNAMETYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DimensionNameTypeCode");
    
    
    /**
     * Gets the "MD_DimensionNameTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDDimensionNameTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDDIMENSIONNAMETYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_DimensionNameTypeCode" element
     */
    public void setMDDimensionNameTypeCode(org.isotc211.x2005.gco.CodeListValueType mdDimensionNameTypeCode)
    {
        generatedSetterHelperImpl(mdDimensionNameTypeCode, MDDIMENSIONNAMETYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_DimensionNameTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDDimensionNameTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDDIMENSIONNAMETYPECODE$0);
            return target;
        }
    }
}
