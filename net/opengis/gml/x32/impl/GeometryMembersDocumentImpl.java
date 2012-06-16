/*
 * An XML document type.
 * Localname: geometryMembers
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeometryMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one geometryMembers(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeometryMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeometryMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geometryMembers");
    
    
    /**
     * Gets the "geometryMembers" element
     */
    public net.opengis.gml.x32.GeometryArrayPropertyType getGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryArrayPropertyType)get_store().find_element_user(GEOMETRYMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geometryMembers" element
     */
    public void setGeometryMembers(net.opengis.gml.x32.GeometryArrayPropertyType geometryMembers)
    {
        generatedSetterHelperImpl(geometryMembers, GEOMETRYMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometryMembers" element
     */
    public net.opengis.gml.x32.GeometryArrayPropertyType addNewGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryArrayPropertyType)get_store().add_element_user(GEOMETRYMEMBERS$0);
            return target;
        }
    }
}
