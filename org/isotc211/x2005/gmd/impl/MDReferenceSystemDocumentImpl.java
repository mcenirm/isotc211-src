/*
 * An XML document type.
 * Localname: MD_ReferenceSystem
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ReferenceSystem(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDReferenceSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ReferenceSystem");
    
    
    /**
     * Gets the "MD_ReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemType getMDReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemType)get_store().find_element_user(MDREFERENCESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ReferenceSystem" element
     */
    public void setMDReferenceSystem(org.isotc211.x2005.gmd.MDReferenceSystemType mdReferenceSystem)
    {
        generatedSetterHelperImpl(mdReferenceSystem, MDREFERENCESYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemType addNewMDReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemType)get_store().add_element_user(MDREFERENCESYSTEM$0);
            return target;
        }
    }
}
