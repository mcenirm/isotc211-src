/*
 * An XML document type.
 * Localname: geometryMember
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeometryMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one geometryMember(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeometryMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeometryMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geometryMember");
    
    
    /**
     * Gets the "geometryMember" element
     */
    public net.opengis.gml.x32.GeometryPropertyType getGeometryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().find_element_user(GEOMETRYMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geometryMember" element
     */
    public void setGeometryMember(net.opengis.gml.x32.GeometryPropertyType geometryMember)
    {
        generatedSetterHelperImpl(geometryMember, GEOMETRYMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometryMember" element
     */
    public net.opengis.gml.x32.GeometryPropertyType addNewGeometryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().add_element_user(GEOMETRYMEMBER$0);
            return target;
        }
    }
}
