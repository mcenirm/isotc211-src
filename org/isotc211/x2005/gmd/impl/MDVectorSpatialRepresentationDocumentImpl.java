/*
 * An XML document type.
 * Localname: MD_VectorSpatialRepresentation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDVectorSpatialRepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_VectorSpatialRepresentation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDVectorSpatialRepresentationDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractMDSpatialRepresentationDocumentImpl implements org.isotc211.x2005.gmd.MDVectorSpatialRepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDVectorSpatialRepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDVECTORSPATIALREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_VectorSpatialRepresentation");
    
    
    /**
     * Gets the "MD_VectorSpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType getMDVectorSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType)get_store().find_element_user(MDVECTORSPATIALREPRESENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_VectorSpatialRepresentation" element
     */
    public void setMDVectorSpatialRepresentation(org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType mdVectorSpatialRepresentation)
    {
        generatedSetterHelperImpl(mdVectorSpatialRepresentation, MDVECTORSPATIALREPRESENTATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_VectorSpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType addNewMDVectorSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType target = null;
            target = (org.isotc211.x2005.gmd.MDVectorSpatialRepresentationType)get_store().add_element_user(MDVECTORSPATIALREPRESENTATION$0);
            return target;
        }
    }
}
