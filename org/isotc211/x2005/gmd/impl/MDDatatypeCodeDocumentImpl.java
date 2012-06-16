/*
 * An XML document type.
 * Localname: MD_DatatypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDatatypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_DatatypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDatatypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDDatatypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDatatypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDATATYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DatatypeCode");
    
    
    /**
     * Gets the "MD_DatatypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDDatatypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDDATATYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_DatatypeCode" element
     */
    public void setMDDatatypeCode(org.isotc211.x2005.gco.CodeListValueType mdDatatypeCode)
    {
        generatedSetterHelperImpl(mdDatatypeCode, MDDATATYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_DatatypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDDatatypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDDATATYPECODE$0);
            return target;
        }
    }
}
