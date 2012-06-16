/*
 * An XML document type.
 * Localname: MD_Georectified
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeorectifiedDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Georectified(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDGeorectifiedDocumentImpl extends org.isotc211.x2005.gmd.impl.MDGridSpatialRepresentationDocumentImpl implements org.isotc211.x2005.gmd.MDGeorectifiedDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDGeorectifiedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDGEORECTIFIED$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georectified");
    private static final org.apache.xmlbeans.QNameSet MDGEORECTIFIED$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georectified"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georectified"),
    });
    
    
    /**
     * Gets the "MD_Georectified" element
     */
    public org.isotc211.x2005.gmd.MDGeorectifiedType getMDGeorectified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeorectifiedType target = null;
            target = (org.isotc211.x2005.gmd.MDGeorectifiedType)get_store().find_element_user(MDGEORECTIFIED$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Georectified" element
     */
    public void setMDGeorectified(org.isotc211.x2005.gmd.MDGeorectifiedType mdGeorectified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeorectifiedType target = null;
            target = (org.isotc211.x2005.gmd.MDGeorectifiedType)get_store().find_element_user(MDGEORECTIFIED$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDGeorectifiedType)get_store().add_element_user(MDGEORECTIFIED$0);
            }
            target.set(mdGeorectified);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_Georectified" element
     */
    public org.isotc211.x2005.gmd.MDGeorectifiedType addNewMDGeorectified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeorectifiedType target = null;
            target = (org.isotc211.x2005.gmd.MDGeorectifiedType)get_store().add_element_user(MDGEORECTIFIED$0);
            return target;
        }
    }
}
