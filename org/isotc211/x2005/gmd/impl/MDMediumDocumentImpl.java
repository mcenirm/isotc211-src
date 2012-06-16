/*
 * An XML document type.
 * Localname: MD_Medium
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMediumDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Medium(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDMediumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDMediumDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDMediumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMEDIUM$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Medium");
    
    
    /**
     * Gets the "MD_Medium" element
     */
    public org.isotc211.x2005.gmd.MDMediumType getMDMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumType)get_store().find_element_user(MDMEDIUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Medium" element
     */
    public void setMDMedium(org.isotc211.x2005.gmd.MDMediumType mdMedium)
    {
        generatedSetterHelperImpl(mdMedium, MDMEDIUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Medium" element
     */
    public org.isotc211.x2005.gmd.MDMediumType addNewMDMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumType)get_store().add_element_user(MDMEDIUM$0);
            return target;
        }
    }
}
