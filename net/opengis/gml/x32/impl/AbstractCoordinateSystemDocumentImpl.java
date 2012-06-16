/*
 * An XML document type.
 * Localname: AbstractCoordinateSystem
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCoordinateSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractCoordinateSystem(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractCoordinateSystemDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.AbstractCoordinateSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoordinateSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCOORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateSystem");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCOORDINATESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffineCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CartesianCS"),
    });
    
    
    /**
     * Gets the "AbstractCoordinateSystem" element
     */
    public net.opengis.gml.x32.AbstractCoordinateSystemType getAbstractCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateSystemType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateSystemType)get_store().find_element_user(ABSTRACTCOORDINATESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractCoordinateSystem" element
     */
    public void setAbstractCoordinateSystem(net.opengis.gml.x32.AbstractCoordinateSystemType abstractCoordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateSystemType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateSystemType)get_store().find_element_user(ABSTRACTCOORDINATESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCoordinateSystemType)get_store().add_element_user(ABSTRACTCOORDINATESYSTEM$0);
            }
            target.set(abstractCoordinateSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractCoordinateSystem" element
     */
    public net.opengis.gml.x32.AbstractCoordinateSystemType addNewAbstractCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateSystemType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateSystemType)get_store().add_element_user(ABSTRACTCOORDINATESYSTEM$0);
            return target;
        }
    }
}
