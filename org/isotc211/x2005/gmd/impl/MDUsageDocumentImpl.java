/*
 * An XML document type.
 * Localname: MD_Usage
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDUsageDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Usage(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDUsageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDUsageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDUsageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDUSAGE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Usage");
    
    
    /**
     * Gets the "MD_Usage" element
     */
    public org.isotc211.x2005.gmd.MDUsageType getMDUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDUsageType target = null;
            target = (org.isotc211.x2005.gmd.MDUsageType)get_store().find_element_user(MDUSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Usage" element
     */
    public void setMDUsage(org.isotc211.x2005.gmd.MDUsageType mdUsage)
    {
        generatedSetterHelperImpl(mdUsage, MDUSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Usage" element
     */
    public org.isotc211.x2005.gmd.MDUsageType addNewMDUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDUsageType target = null;
            target = (org.isotc211.x2005.gmd.MDUsageType)get_store().add_element_user(MDUSAGE$0);
            return target;
        }
    }
}
