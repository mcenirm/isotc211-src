/*
 * An XML document type.
 * Localname: Surface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Surface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SurfaceDocumentImpl extends net.opengis.gml.x32.impl.AbstractSurfaceDocumentImpl implements net.opengis.gml.x32.SurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Surface");
    private static final org.apache.xmlbeans.QNameSet SURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolyhedralSurface"),
    });
    
    
    /**
     * Gets the "Surface" element
     */
    public net.opengis.gml.x32.SurfaceType getSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().find_element_user(SURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Surface" element
     */
    public void setSurface(net.opengis.gml.x32.SurfaceType surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().find_element_user(SURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SurfaceType)get_store().add_element_user(SURFACE$0);
            }
            target.set(surface);
        }
    }
    
    /**
     * Appends and returns a new empty "Surface" element
     */
    public net.opengis.gml.x32.SurfaceType addNewSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().add_element_user(SURFACE$0);
            return target;
        }
    }
}
