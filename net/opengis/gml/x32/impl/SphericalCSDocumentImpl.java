/*
 * An XML document type.
 * Localname: sphericalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SphericalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one sphericalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SphericalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SphericalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public SphericalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPHERICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sphericalCS");
    private static final org.apache.xmlbeans.QNameSet SPHERICALCS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSphericalCS"),
    });
    
    
    /**
     * Gets the "sphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType getSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(SPHERICALCS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sphericalCS" element
     */
    public void setSphericalCS(net.opengis.gml.x32.SphericalCSPropertyType sphericalCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(SPHERICALCS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(SPHERICALCS$0);
            }
            target.set(sphericalCS);
        }
    }
    
    /**
     * Appends and returns a new empty "sphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType addNewSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(SPHERICALCS$0);
            return target;
        }
    }
}
