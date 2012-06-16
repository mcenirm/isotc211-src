/*
 * An XML document type.
 * Localname: PolyhedralSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolyhedralSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one PolyhedralSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PolyhedralSurfaceDocumentImpl extends net.opengis.gml.x32.impl.SurfaceDocumentImpl implements net.opengis.gml.x32.PolyhedralSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolyhedralSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYHEDRALSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolyhedralSurface");
    
    
    /**
     * Gets the "PolyhedralSurface" element
     */
    public net.opengis.gml.x32.SurfaceType getPolyhedralSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().find_element_user(POLYHEDRALSURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PolyhedralSurface" element
     */
    public void setPolyhedralSurface(net.opengis.gml.x32.SurfaceType polyhedralSurface)
    {
        generatedSetterHelperImpl(polyhedralSurface, POLYHEDRALSURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PolyhedralSurface" element
     */
    public net.opengis.gml.x32.SurfaceType addNewPolyhedralSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceType target = null;
            target = (net.opengis.gml.x32.SurfaceType)get_store().add_element_user(POLYHEDRALSURFACE$0);
            return target;
        }
    }
}
