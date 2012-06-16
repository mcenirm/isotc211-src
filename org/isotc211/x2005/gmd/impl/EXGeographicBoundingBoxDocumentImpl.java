/*
 * An XML document type.
 * Localname: EX_GeographicBoundingBox
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXGeographicBoundingBoxDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one EX_GeographicBoundingBox(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class EXGeographicBoundingBoxDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractEXGeographicExtentDocumentImpl implements org.isotc211.x2005.gmd.EXGeographicBoundingBoxDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXGeographicBoundingBoxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXGEOGRAPHICBOUNDINGBOX$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_GeographicBoundingBox");
    
    
    /**
     * Gets the "EX_GeographicBoundingBox" element
     */
    public org.isotc211.x2005.gmd.EXGeographicBoundingBoxType getEXGeographicBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicBoundingBoxType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType)get_store().find_element_user(EXGEOGRAPHICBOUNDINGBOX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EX_GeographicBoundingBox" element
     */
    public void setEXGeographicBoundingBox(org.isotc211.x2005.gmd.EXGeographicBoundingBoxType exGeographicBoundingBox)
    {
        generatedSetterHelperImpl(exGeographicBoundingBox, EXGEOGRAPHICBOUNDINGBOX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EX_GeographicBoundingBox" element
     */
    public org.isotc211.x2005.gmd.EXGeographicBoundingBoxType addNewEXGeographicBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicBoundingBoxType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType)get_store().add_element_user(EXGEOGRAPHICBOUNDINGBOX$0);
            return target;
        }
    }
}
