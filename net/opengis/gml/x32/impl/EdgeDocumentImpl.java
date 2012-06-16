/*
 * An XML document type.
 * Localname: Edge
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EdgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Edge(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EdgeDocumentImpl extends net.opengis.gml.x32.impl.AbstractTopoPrimitiveDocumentImpl implements net.opengis.gml.x32.EdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Edge");
    
    
    /**
     * Gets the "Edge" element
     */
    public net.opengis.gml.x32.EdgeType getEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EdgeType target = null;
            target = (net.opengis.gml.x32.EdgeType)get_store().find_element_user(EDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Edge" element
     */
    public void setEdge(net.opengis.gml.x32.EdgeType edge)
    {
        generatedSetterHelperImpl(edge, EDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Edge" element
     */
    public net.opengis.gml.x32.EdgeType addNewEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EdgeType target = null;
            target = (net.opengis.gml.x32.EdgeType)get_store().add_element_user(EDGE$0);
            return target;
        }
    }
}
