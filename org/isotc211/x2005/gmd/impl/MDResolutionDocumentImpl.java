/*
 * An XML document type.
 * Localname: MD_Resolution
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDResolutionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Resolution(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDResolutionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDResolutionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDResolutionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDRESOLUTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Resolution");
    
    
    /**
     * Gets the "MD_Resolution" element
     */
    public org.isotc211.x2005.gmd.MDResolutionType getMDResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDResolutionType target = null;
            target = (org.isotc211.x2005.gmd.MDResolutionType)get_store().find_element_user(MDRESOLUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Resolution" element
     */
    public void setMDResolution(org.isotc211.x2005.gmd.MDResolutionType mdResolution)
    {
        generatedSetterHelperImpl(mdResolution, MDRESOLUTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Resolution" element
     */
    public org.isotc211.x2005.gmd.MDResolutionType addNewMDResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDResolutionType target = null;
            target = (org.isotc211.x2005.gmd.MDResolutionType)get_store().add_element_user(MDRESOLUTION$0);
            return target;
        }
    }
}
