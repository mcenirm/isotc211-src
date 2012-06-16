/*
 * An XML document type.
 * Localname: Triangle
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TriangleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Triangle(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TriangleDocumentImpl extends net.opengis.gml.x32.impl.AbstractSurfacePatchDocumentImpl implements net.opengis.gml.x32.TriangleDocument
{
    private static final long serialVersionUID = 1L;
    
    public TriangleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Triangle");
    
    
    /**
     * Gets the "Triangle" element
     */
    public net.opengis.gml.x32.TriangleType getTriangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TriangleType target = null;
            target = (net.opengis.gml.x32.TriangleType)get_store().find_element_user(TRIANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Triangle" element
     */
    public void setTriangle(net.opengis.gml.x32.TriangleType triangle)
    {
        generatedSetterHelperImpl(triangle, TRIANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Triangle" element
     */
    public net.opengis.gml.x32.TriangleType addNewTriangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TriangleType target = null;
            target = (net.opengis.gml.x32.TriangleType)get_store().add_element_user(TRIANGLE$0);
            return target;
        }
    }
}
