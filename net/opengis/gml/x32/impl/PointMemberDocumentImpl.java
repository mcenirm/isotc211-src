/*
 * An XML document type.
 * Localname: pointMember
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PointMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one pointMember(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PointMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PointMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointMember");
    
    
    /**
     * Gets the "pointMember" element
     */
    public net.opengis.gml.x32.PointPropertyType getPointMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointMember" element
     */
    public void setPointMember(net.opengis.gml.x32.PointPropertyType pointMember)
    {
        generatedSetterHelperImpl(pointMember, POINTMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointMember" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewPointMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(POINTMEMBER$0);
            return target;
        }
    }
}
