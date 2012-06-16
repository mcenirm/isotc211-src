/*
 * An XML document type.
 * Localname: CI_Date
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_Date(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CIDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIDATE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_Date");
    
    
    /**
     * Gets the "CI_Date" element
     */
    public org.isotc211.x2005.gmd.CIDateType getCIDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDateType target = null;
            target = (org.isotc211.x2005.gmd.CIDateType)get_store().find_element_user(CIDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_Date" element
     */
    public void setCIDate(org.isotc211.x2005.gmd.CIDateType ciDate)
    {
        generatedSetterHelperImpl(ciDate, CIDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_Date" element
     */
    public org.isotc211.x2005.gmd.CIDateType addNewCIDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDateType target = null;
            target = (org.isotc211.x2005.gmd.CIDateType)get_store().add_element_user(CIDATE$0);
            return target;
        }
    }
}
