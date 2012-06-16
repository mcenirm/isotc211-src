/*
 * XML Type:  TopoPointType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoPointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoPointType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoPointTypeImpl extends net.opengis.gml.x32.impl.AbstractTopologyTypeImpl implements net.opengis.gml.x32.TopoPointType
{
    private static final long serialVersionUID = 1L;
    
    public TopoPointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDNODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedNode");
    
    
    /**
     * Gets the "directedNode" element
     */
    public net.opengis.gml.x32.DirectedNodePropertyType getDirectedNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedNodePropertyType)get_store().find_element_user(DIRECTEDNODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedNode" element
     */
    public void setDirectedNode(net.opengis.gml.x32.DirectedNodePropertyType directedNode)
    {
        generatedSetterHelperImpl(directedNode, DIRECTEDNODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedNode" element
     */
    public net.opengis.gml.x32.DirectedNodePropertyType addNewDirectedNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedNodePropertyType)get_store().add_element_user(DIRECTEDNODE$0);
            return target;
        }
    }
}
