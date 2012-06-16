/*
 * An XML document type.
 * Localname: MD_StandardOrderProcess
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDStandardOrderProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_StandardOrderProcess(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDStandardOrderProcessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDStandardOrderProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDStandardOrderProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDSTANDARDORDERPROCESS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_StandardOrderProcess");
    
    
    /**
     * Gets the "MD_StandardOrderProcess" element
     */
    public org.isotc211.x2005.gmd.MDStandardOrderProcessType getMDStandardOrderProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDStandardOrderProcessType target = null;
            target = (org.isotc211.x2005.gmd.MDStandardOrderProcessType)get_store().find_element_user(MDSTANDARDORDERPROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_StandardOrderProcess" element
     */
    public void setMDStandardOrderProcess(org.isotc211.x2005.gmd.MDStandardOrderProcessType mdStandardOrderProcess)
    {
        generatedSetterHelperImpl(mdStandardOrderProcess, MDSTANDARDORDERPROCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_StandardOrderProcess" element
     */
    public org.isotc211.x2005.gmd.MDStandardOrderProcessType addNewMDStandardOrderProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDStandardOrderProcessType target = null;
            target = (org.isotc211.x2005.gmd.MDStandardOrderProcessType)get_store().add_element_user(MDSTANDARDORDERPROCESS$0);
            return target;
        }
    }
}
