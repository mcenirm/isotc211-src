/*
 * An XML document type.
 * Localname: directedEdge
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectedEdgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one directedEdge(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DirectedEdgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DirectedEdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedEdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedEdge");
    
    
    /**
     * Gets the "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType getDirectedEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().find_element_user(DIRECTEDEDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedEdge" element
     */
    public void setDirectedEdge(net.opengis.gml.x32.DirectedEdgePropertyType directedEdge)
    {
        generatedSetterHelperImpl(directedEdge, DIRECTEDEDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType addNewDirectedEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().add_element_user(DIRECTEDEDGE$0);
            return target;
        }
    }
}
