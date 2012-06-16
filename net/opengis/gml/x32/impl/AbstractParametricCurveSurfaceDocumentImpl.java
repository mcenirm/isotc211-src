/*
 * An XML document type.
 * Localname: AbstractParametricCurveSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractParametricCurveSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractParametricCurveSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractParametricCurveSurfaceDocumentImpl extends net.opengis.gml.x32.impl.AbstractSurfacePatchDocumentImpl implements net.opengis.gml.x32.AbstractParametricCurveSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractParametricCurveSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTPARAMETRICCURVESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractParametricCurveSurface");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTPARAMETRICCURVESURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractParametricCurveSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cone"),
    });
    
    
    /**
     * Gets the "AbstractParametricCurveSurface" element
     */
    public net.opengis.gml.x32.AbstractParametricCurveSurfaceType getAbstractParametricCurveSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractParametricCurveSurfaceType)get_store().find_element_user(ABSTRACTPARAMETRICCURVESURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractParametricCurveSurface" element
     */
    public void setAbstractParametricCurveSurface(net.opengis.gml.x32.AbstractParametricCurveSurfaceType abstractParametricCurveSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractParametricCurveSurfaceType)get_store().find_element_user(ABSTRACTPARAMETRICCURVESURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractParametricCurveSurfaceType)get_store().add_element_user(ABSTRACTPARAMETRICCURVESURFACE$0);
            }
            target.set(abstractParametricCurveSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractParametricCurveSurface" element
     */
    public net.opengis.gml.x32.AbstractParametricCurveSurfaceType addNewAbstractParametricCurveSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractParametricCurveSurfaceType)get_store().add_element_user(ABSTRACTPARAMETRICCURVESURFACE$0);
            return target;
        }
    }
}
