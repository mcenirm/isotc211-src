/*
 * An XML document type.
 * Localname: MD_GridSpatialRepresentation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGridSpatialRepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_GridSpatialRepresentation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDGridSpatialRepresentationDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractMDSpatialRepresentationDocumentImpl implements org.isotc211.x2005.gmd.MDGridSpatialRepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDGridSpatialRepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDGRIDSPATIALREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_GridSpatialRepresentation");
    private static final org.apache.xmlbeans.QNameSet MDGRIDSPATIALREPRESENTATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georeferenceable"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georectified"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georeferenceable"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_GridSpatialRepresentation"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georectified"),
    });
    
    
    /**
     * Gets the "MD_GridSpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.MDGridSpatialRepresentationType getMDGridSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGridSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType)get_store().find_element_user(MDGRIDSPATIALREPRESENTATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_GridSpatialRepresentation" element
     */
    public void setMDGridSpatialRepresentation(org.isotc211.x2005.gmd.MDGridSpatialRepresentationType mdGridSpatialRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGridSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType)get_store().find_element_user(MDGRIDSPATIALREPRESENTATION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType)get_store().add_element_user(MDGRIDSPATIALREPRESENTATION$0);
            }
            target.set(mdGridSpatialRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_GridSpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.MDGridSpatialRepresentationType addNewMDGridSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGridSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType)get_store().add_element_user(MDGRIDSPATIALREPRESENTATION$0);
            return target;
        }
    }
}
