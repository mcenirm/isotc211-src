/*
 * An XML document type.
 * Localname: AbstractMD_SpatialRepresentation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractMD_SpatialRepresentation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractMDSpatialRepresentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMDSpatialRepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTMDSPATIALREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractMD_SpatialRepresentation");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTMDSPATIALREPRESENTATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractMD_SpatialRepresentation"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georeferenceable"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_VectorSpatialRepresentation"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Georectified"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georeferenceable"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_GridSpatialRepresentation"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georectified"),
    });
    
    
    /**
     * Gets the "AbstractMD_SpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType getAbstractMDSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType)get_store().find_element_user(ABSTRACTMDSPATIALREPRESENTATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractMD_SpatialRepresentation" element
     */
    public void setAbstractMDSpatialRepresentation(org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType abstractMDSpatialRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType)get_store().find_element_user(ABSTRACTMDSPATIALREPRESENTATION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType)get_store().add_element_user(ABSTRACTMDSPATIALREPRESENTATION$0);
            }
            target.set(abstractMDSpatialRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractMD_SpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType addNewAbstractMDSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType)get_store().add_element_user(ABSTRACTMDSPATIALREPRESENTATION$0);
            return target;
        }
    }
}
