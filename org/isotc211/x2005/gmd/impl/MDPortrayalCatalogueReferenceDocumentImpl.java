/*
 * An XML document type.
 * Localname: MD_PortrayalCatalogueReference
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_PortrayalCatalogueReference(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDPortrayalCatalogueReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDPortrayalCatalogueReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDPORTRAYALCATALOGUEREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_PortrayalCatalogueReference");
    
    
    /**
     * Gets the "MD_PortrayalCatalogueReference" element
     */
    public org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType getMDPortrayalCatalogueReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType target = null;
            target = (org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType)get_store().find_element_user(MDPORTRAYALCATALOGUEREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_PortrayalCatalogueReference" element
     */
    public void setMDPortrayalCatalogueReference(org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType mdPortrayalCatalogueReference)
    {
        generatedSetterHelperImpl(mdPortrayalCatalogueReference, MDPORTRAYALCATALOGUEREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_PortrayalCatalogueReference" element
     */
    public org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType addNewMDPortrayalCatalogueReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType target = null;
            target = (org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType)get_store().add_element_user(MDPORTRAYALCATALOGUEREFERENCE$0);
            return target;
        }
    }
}
