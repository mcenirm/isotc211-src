/*
 * An XML document type.
 * Localname: AbstractTimeTopologyPrimitive
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimeTopologyPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTimeTopologyPrimitive(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTimeTopologyPrimitiveDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimePrimitiveDocumentImpl implements net.opengis.gml.x32.AbstractTimeTopologyPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeTopologyPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTIMETOPOLOGYPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMETOPOLOGYPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive"),
    });
    
    
    /**
     * Gets the "AbstractTimeTopologyPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType getAbstractTimeTopologyPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType)get_store().find_element_user(ABSTRACTTIMETOPOLOGYPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTimeTopologyPrimitive" element
     */
    public void setAbstractTimeTopologyPrimitive(net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType abstractTimeTopologyPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType)get_store().find_element_user(ABSTRACTTIMETOPOLOGYPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType)get_store().add_element_user(ABSTRACTTIMETOPOLOGYPRIMITIVE$0);
            }
            target.set(abstractTimeTopologyPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTimeTopologyPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType addNewAbstractTimeTopologyPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType)get_store().add_element_user(ABSTRACTTIMETOPOLOGYPRIMITIVE$0);
            return target;
        }
    }
}
