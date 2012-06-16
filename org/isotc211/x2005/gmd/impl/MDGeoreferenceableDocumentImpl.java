/*
 * An XML document type.
 * Localname: MD_Georeferenceable
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeoreferenceableDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Georeferenceable(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDGeoreferenceableDocumentImpl extends org.isotc211.x2005.gmd.impl.MDGridSpatialRepresentationDocumentImpl implements org.isotc211.x2005.gmd.MDGeoreferenceableDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDGeoreferenceableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDGEOREFERENCEABLE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georeferenceable");
    private static final org.apache.xmlbeans.QNameSet MDGEOREFERENCEABLE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georeferenceable"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georeferenceable"),
    });
    
    
    /**
     * Gets the "MD_Georeferenceable" element
     */
    public org.isotc211.x2005.gmd.MDGeoreferenceableType getMDGeoreferenceable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeoreferenceableType target = null;
            target = (org.isotc211.x2005.gmd.MDGeoreferenceableType)get_store().find_element_user(MDGEOREFERENCEABLE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Georeferenceable" element
     */
    public void setMDGeoreferenceable(org.isotc211.x2005.gmd.MDGeoreferenceableType mdGeoreferenceable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeoreferenceableType target = null;
            target = (org.isotc211.x2005.gmd.MDGeoreferenceableType)get_store().find_element_user(MDGEOREFERENCEABLE$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDGeoreferenceableType)get_store().add_element_user(MDGEOREFERENCEABLE$0);
            }
            target.set(mdGeoreferenceable);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_Georeferenceable" element
     */
    public org.isotc211.x2005.gmd.MDGeoreferenceableType addNewMDGeoreferenceable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeoreferenceableType target = null;
            target = (org.isotc211.x2005.gmd.MDGeoreferenceableType)get_store().add_element_user(MDGEOREFERENCEABLE$0);
            return target;
        }
    }
}
