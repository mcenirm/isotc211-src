/*
 * An XML document type.
 * Localname: TimeEdge
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeEdgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeEdge(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeEdgeDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeTopologyPrimitiveDocumentImpl implements net.opengis.gml.x32.TimeEdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeEdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeEdge");
    
    
    /**
     * Gets the "TimeEdge" element
     */
    public net.opengis.gml.x32.TimeEdgeType getTimeEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgeType target = null;
            target = (net.opengis.gml.x32.TimeEdgeType)get_store().find_element_user(TIMEEDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeEdge" element
     */
    public void setTimeEdge(net.opengis.gml.x32.TimeEdgeType timeEdge)
    {
        generatedSetterHelperImpl(timeEdge, TIMEEDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeEdge" element
     */
    public net.opengis.gml.x32.TimeEdgeType addNewTimeEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgeType target = null;
            target = (net.opengis.gml.x32.TimeEdgeType)get_store().add_element_user(TIMEEDGE$0);
            return target;
        }
    }
}
