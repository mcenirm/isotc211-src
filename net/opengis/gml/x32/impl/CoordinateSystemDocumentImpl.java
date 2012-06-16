/*
 * An XML document type.
 * Localname: coordinateSystem
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinateSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one coordinateSystem(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CoordinateSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystem");
    private static final org.apache.xmlbeans.QNameSet COORDINATESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCS"),
    });
    
    
    /**
     * Gets the "coordinateSystem" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(COORDINATESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateSystem" element
     */
    public void setCoordinateSystem(net.opengis.gml.x32.CoordinateSystemPropertyType coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(COORDINATESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(COORDINATESYSTEM$0);
            }
            target.set(coordinateSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "coordinateSystem" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType addNewCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(COORDINATESYSTEM$0);
            return target;
        }
    }
}
