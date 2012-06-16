/*
 * An XML document type.
 * Localname: ellipsoid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EllipsoidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ellipsoid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EllipsoidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EllipsoidDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoid");
    private static final org.apache.xmlbeans.QNameSet ELLIPSOID$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEllipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoid"),
    });
    
    
    /**
     * Gets the "ellipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType getEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().find_element_user(ELLIPSOID$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoid" element
     */
    public void setEllipsoid(net.opengis.gml.x32.EllipsoidPropertyType ellipsoid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().find_element_user(ELLIPSOID$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().add_element_user(ELLIPSOID$0);
            }
            target.set(ellipsoid);
        }
    }
    
    /**
     * Appends and returns a new empty "ellipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType addNewEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().add_element_user(ELLIPSOID$0);
            return target;
        }
    }
}
