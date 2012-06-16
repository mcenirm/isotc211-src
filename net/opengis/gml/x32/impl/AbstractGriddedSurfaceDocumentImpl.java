/*
 * An XML document type.
 * Localname: AbstractGriddedSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGriddedSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGriddedSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGriddedSurfaceDocumentImpl extends net.opengis.gml.x32.impl.AbstractParametricCurveSurfaceDocumentImpl implements net.opengis.gml.x32.AbstractGriddedSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGriddedSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGRIDDEDSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGriddedSurface");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGRIDDEDSURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cone"),
    });
    
    
    /**
     * Gets the "AbstractGriddedSurface" element
     */
    public net.opengis.gml.x32.AbstractGriddedSurfaceType getAbstractGriddedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGriddedSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractGriddedSurfaceType)get_store().find_element_user(ABSTRACTGRIDDEDSURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGriddedSurface" element
     */
    public void setAbstractGriddedSurface(net.opengis.gml.x32.AbstractGriddedSurfaceType abstractGriddedSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGriddedSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractGriddedSurfaceType)get_store().find_element_user(ABSTRACTGRIDDEDSURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGriddedSurfaceType)get_store().add_element_user(ABSTRACTGRIDDEDSURFACE$0);
            }
            target.set(abstractGriddedSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGriddedSurface" element
     */
    public net.opengis.gml.x32.AbstractGriddedSurfaceType addNewAbstractGriddedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGriddedSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractGriddedSurfaceType)get_store().add_element_user(ABSTRACTGRIDDEDSURFACE$0);
            return target;
        }
    }
}
