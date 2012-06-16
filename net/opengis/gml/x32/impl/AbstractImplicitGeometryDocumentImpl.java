/*
 * An XML document type.
 * Localname: AbstractImplicitGeometry
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractImplicitGeometryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractImplicitGeometry(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractImplicitGeometryDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometryDocumentImpl implements net.opengis.gml.x32.AbstractImplicitGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractImplicitGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTIMPLICITGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractImplicitGeometry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTIMPLICITGEOMETRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Grid"),
    });
    
    
    /**
     * Gets the "AbstractImplicitGeometry" element
     */
    public net.opengis.gml.x32.AbstractGeometryType getAbstractImplicitGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTIMPLICITGEOMETRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractImplicitGeometry" element
     */
    public void setAbstractImplicitGeometry(net.opengis.gml.x32.AbstractGeometryType abstractImplicitGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTIMPLICITGEOMETRY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeometryType)get_store().add_element_user(ABSTRACTIMPLICITGEOMETRY$0);
            }
            target.set(abstractImplicitGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractImplicitGeometry" element
     */
    public net.opengis.gml.x32.AbstractGeometryType addNewAbstractImplicitGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().add_element_user(ABSTRACTIMPLICITGEOMETRY$0);
            return target;
        }
    }
}
