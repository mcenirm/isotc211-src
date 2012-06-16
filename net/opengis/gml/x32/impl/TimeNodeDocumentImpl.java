/*
 * An XML document type.
 * Localname: TimeNode
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeNodeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeNode(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeNodeDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeTopologyPrimitiveDocumentImpl implements net.opengis.gml.x32.TimeNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMENODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeNode");
    
    
    /**
     * Gets the "TimeNode" element
     */
    public net.opengis.gml.x32.TimeNodeType getTimeNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodeType target = null;
            target = (net.opengis.gml.x32.TimeNodeType)get_store().find_element_user(TIMENODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeNode" element
     */
    public void setTimeNode(net.opengis.gml.x32.TimeNodeType timeNode)
    {
        generatedSetterHelperImpl(timeNode, TIMENODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeNode" element
     */
    public net.opengis.gml.x32.TimeNodeType addNewTimeNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodeType target = null;
            target = (net.opengis.gml.x32.TimeNodeType)get_store().add_element_user(TIMENODE$0);
            return target;
        }
    }
}
