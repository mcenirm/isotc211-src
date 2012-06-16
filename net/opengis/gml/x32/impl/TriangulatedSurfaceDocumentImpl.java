/*
 * An XML document type.
 * Localname: TriangulatedSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TriangulatedSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TriangulatedSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TriangulatedSurfaceDocumentImpl extends net.opengis.gml.x32.impl.SurfaceDocumentImpl implements net.opengis.gml.x32.TriangulatedSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TriangulatedSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIANGULATEDSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface");
    private static final org.apache.xmlbeans.QNameSet TRIANGULATEDSURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Tin"),
    });
    
    
    /**
     * Gets the "TriangulatedSurface" element
     */
    public net.opengis.gml.x32.SurfaceType getTriangulatedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().find_element_user(TRIANGULATEDSURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TriangulatedSurface" element
     */
    public void setTriangulatedSurface(net.opengis.gml.x32.SurfaceType triangulatedSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().find_element_user(TRIANGULATEDSURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SurfaceType)get_store().add_element_user(TRIANGULATEDSURFACE$0);
            }
            target.set(triangulatedSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "TriangulatedSurface" element
     */
    public net.opengis.gml.x32.SurfaceType addNewTriangulatedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().add_element_user(TRIANGULATEDSURFACE$0);
            return target;
        }
    }
}
