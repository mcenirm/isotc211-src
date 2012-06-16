/*
 * An XML document type.
 * Localname: ellipsoidalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EllipsoidalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ellipsoidalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EllipsoidalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EllipsoidalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoidalCS");
    private static final org.apache.xmlbeans.QNameSet ELLIPSOIDALCS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoidalCS"),
    });
    
    
    /**
     * Gets the "ellipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType getEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().find_element_user(ELLIPSOIDALCS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoidalCS" element
     */
    public void setEllipsoidalCS(net.opengis.gml.x32.EllipsoidalCSPropertyType ellipsoidalCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().find_element_user(ELLIPSOIDALCS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().add_element_user(ELLIPSOIDALCS$0);
            }
            target.set(ellipsoidalCS);
        }
    }
    
    /**
     * Appends and returns a new empty "ellipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType addNewEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().add_element_user(ELLIPSOIDALCS$0);
            return target;
        }
    }
}
