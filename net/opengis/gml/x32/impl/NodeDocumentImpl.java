/*
 * An XML document type.
 * Localname: Node
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.NodeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Node(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class NodeDocumentImpl extends net.opengis.gml.x32.impl.AbstractTopoPrimitiveDocumentImpl implements net.opengis.gml.x32.NodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public NodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Node");
    
    
    /**
     * Gets the "Node" element
     */
    public net.opengis.gml.x32.NodeType getNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodeType target = null;
            target = (net.opengis.gml.x32.NodeType)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Node" element
     */
    public void setNode(net.opengis.gml.x32.NodeType node)
    {
        generatedSetterHelperImpl(node, NODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Node" element
     */
    public net.opengis.gml.x32.NodeType addNewNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodeType target = null;
            target = (net.opengis.gml.x32.NodeType)get_store().add_element_user(NODE$0);
            return target;
        }
    }
}
