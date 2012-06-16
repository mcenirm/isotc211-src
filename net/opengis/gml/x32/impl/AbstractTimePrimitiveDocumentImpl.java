/*
 * An XML document type.
 * Localname: AbstractTimePrimitive
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimePrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTimePrimitive(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTimePrimitiveDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeObjectDocumentImpl implements net.opengis.gml.x32.AbstractTimePrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimePrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTIMEPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimePrimitive");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMEPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeInstant"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive"),
    });
    
    
    /**
     * Gets the "AbstractTimePrimitive" element
     */
    public net.opengis.gml.x32.AbstractTimePrimitiveType getAbstractTimePrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimePrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimePrimitiveType)get_store().find_element_user(ABSTRACTTIMEPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTimePrimitive" element
     */
    public void setAbstractTimePrimitive(net.opengis.gml.x32.AbstractTimePrimitiveType abstractTimePrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimePrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimePrimitiveType)get_store().find_element_user(ABSTRACTTIMEPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTimePrimitiveType)get_store().add_element_user(ABSTRACTTIMEPRIMITIVE$0);
            }
            target.set(abstractTimePrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTimePrimitive" element
     */
    public net.opengis.gml.x32.AbstractTimePrimitiveType addNewAbstractTimePrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimePrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimePrimitiveType)get_store().add_element_user(ABSTRACTTIMEPRIMITIVE$0);
            return target;
        }
    }
}
