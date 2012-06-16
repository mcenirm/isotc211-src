/*
 * An XML document type.
 * Localname: axis
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AxisDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one axis(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AxisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AxisDocument
{
    private static final long serialVersionUID = 1L;
    
    public AxisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axis");
    private static final org.apache.xmlbeans.QNameSet AXIS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesAxis"),
    });
    
    
    /**
     * Gets the "axis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType getAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().find_element_user(AXIS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axis" element
     */
    public void setAxis(net.opengis.gml.x32.CoordinateSystemAxisPropertyType axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().find_element_user(AXIS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().add_element_user(AXIS$0);
            }
            target.set(axis);
        }
    }
    
    /**
     * Appends and returns a new empty "axis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType addNewAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().add_element_user(AXIS$0);
            return target;
        }
    }
}
