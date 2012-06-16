/*
 * An XML document type.
 * Localname: EX_BoundingPolygon
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXBoundingPolygonDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one EX_BoundingPolygon(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class EXBoundingPolygonDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractEXGeographicExtentDocumentImpl implements org.isotc211.x2005.gmd.EXBoundingPolygonDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXBoundingPolygonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXBOUNDINGPOLYGON$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_BoundingPolygon");
    
    
    /**
     * Gets the "EX_BoundingPolygon" element
     */
    public org.isotc211.x2005.gmd.EXBoundingPolygonType getEXBoundingPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXBoundingPolygonType target = null;
            target = (org.isotc211.x2005.gmd.EXBoundingPolygonType)get_store().find_element_user(EXBOUNDINGPOLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EX_BoundingPolygon" element
     */
    public void setEXBoundingPolygon(org.isotc211.x2005.gmd.EXBoundingPolygonType exBoundingPolygon)
    {
        generatedSetterHelperImpl(exBoundingPolygon, EXBOUNDINGPOLYGON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EX_BoundingPolygon" element
     */
    public org.isotc211.x2005.gmd.EXBoundingPolygonType addNewEXBoundingPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXBoundingPolygonType target = null;
            target = (org.isotc211.x2005.gmd.EXBoundingPolygonType)get_store().add_element_user(EXBOUNDINGPOLYGON$0);
            return target;
        }
    }
}
