/*
 * An XML document type.
 * Localname: MI_GCP
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGCPDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_GCP(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIGCPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIGCPDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIGCPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIGCP$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_GCP");
    
    
    /**
     * Gets the "MI_GCP" element
     */
    public org.isotc211.x2005.gmi.MIGCPType getMIGCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPType)get_store().find_element_user(MIGCP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_GCP" element
     */
    public void setMIGCP(org.isotc211.x2005.gmi.MIGCPType migcp)
    {
        generatedSetterHelperImpl(migcp, MIGCP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_GCP" element
     */
    public org.isotc211.x2005.gmi.MIGCPType addNewMIGCP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPType)get_store().add_element_user(MIGCP$0);
            return target;
        }
    }
}
