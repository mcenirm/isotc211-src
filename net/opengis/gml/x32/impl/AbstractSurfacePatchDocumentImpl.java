/*
 * An XML document type.
 * Localname: AbstractSurfacePatch
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractSurfacePatchDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractSurfacePatch(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractSurfacePatchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractSurfacePatchDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSurfacePatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSURFACEPATCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurfacePatch");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSURFACEPATCH$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolygonPatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Rectangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractParametricCurveSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Triangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurfacePatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cone"),
    });
    
    
    /**
     * Gets the "AbstractSurfacePatch" element
     */
    public net.opengis.gml.x32.AbstractSurfacePatchType getAbstractSurfacePatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().find_element_user(ABSTRACTSURFACEPATCH$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractSurfacePatch" element
     */
    public void setAbstractSurfacePatch(net.opengis.gml.x32.AbstractSurfacePatchType abstractSurfacePatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().find_element_user(ABSTRACTSURFACEPATCH$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().add_element_user(ABSTRACTSURFACEPATCH$0);
            }
            target.set(abstractSurfacePatch);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractSurfacePatch" element
     */
    public net.opengis.gml.x32.AbstractSurfacePatchType addNewAbstractSurfacePatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().add_element_user(ABSTRACTSURFACEPATCH$0);
            return target;
        }
    }
}
