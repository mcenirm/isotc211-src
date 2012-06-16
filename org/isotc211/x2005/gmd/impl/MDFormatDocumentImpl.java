/*
 * An XML document type.
 * Localname: MD_Format
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDFormatDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Format(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Format");
    
    
    /**
     * Gets the "MD_Format" element
     */
    public org.isotc211.x2005.gmd.MDFormatType getMDFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatType)get_store().find_element_user(MDFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Format" element
     */
    public void setMDFormat(org.isotc211.x2005.gmd.MDFormatType mdFormat)
    {
        generatedSetterHelperImpl(mdFormat, MDFORMAT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Format" element
     */
    public org.isotc211.x2005.gmd.MDFormatType addNewMDFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatType)get_store().add_element_user(MDFORMAT$0);
            return target;
        }
    }
}
