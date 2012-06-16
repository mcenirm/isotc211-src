/*
 * An XML document type.
 * Localname: TopoSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TopoSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoSurfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoSurface");
    
    
    /**
     * Gets the "TopoSurface" element
     */
    public net.opengis.gml.x32.TopoSurfaceType getTopoSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSurfaceType target = null;
            target = (net.opengis.gml.x32.TopoSurfaceType)get_store().find_element_user(TOPOSURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoSurface" element
     */
    public void setTopoSurface(net.opengis.gml.x32.TopoSurfaceType topoSurface)
    {
        generatedSetterHelperImpl(topoSurface, TOPOSURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoSurface" element
     */
    public net.opengis.gml.x32.TopoSurfaceType addNewTopoSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSurfaceType target = null;
            target = (net.opengis.gml.x32.TopoSurfaceType)get_store().add_element_user(TOPOSURFACE$0);
            return target;
        }
    }
}
