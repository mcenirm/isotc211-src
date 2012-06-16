/*
 * An XML document type.
 * Localname: pointMembers
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PointMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one pointMembers(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PointMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PointMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointMembers");
    
    
    /**
     * Gets the "pointMembers" element
     */
    public net.opengis.gml.x32.PointArrayPropertyType getPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointArrayPropertyType target = null;
            target = (net.opengis.gml.x32.PointArrayPropertyType)get_store().find_element_user(POINTMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointMembers" element
     */
    public void setPointMembers(net.opengis.gml.x32.PointArrayPropertyType pointMembers)
    {
        generatedSetterHelperImpl(pointMembers, POINTMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointMembers" element
     */
    public net.opengis.gml.x32.PointArrayPropertyType addNewPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointArrayPropertyType target = null;
            target = (net.opengis.gml.x32.PointArrayPropertyType)get_store().add_element_user(POINTMEMBERS$0);
            return target;
        }
    }
}
