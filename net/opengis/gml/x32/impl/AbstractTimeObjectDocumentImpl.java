/*
 * An XML document type.
 * Localname: AbstractTimeObject
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimeObjectDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTimeObject(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTimeObjectDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.AbstractTimeObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTIMEOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeObject");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMEOBJECT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeInstant"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive"),
    });
    
    
    /**
     * Gets the "AbstractTimeObject" element
     */
    public net.opengis.gml.x32.AbstractTimeObjectType getAbstractTimeObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().find_element_user(ABSTRACTTIMEOBJECT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTimeObject" element
     */
    public void setAbstractTimeObject(net.opengis.gml.x32.AbstractTimeObjectType abstractTimeObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().find_element_user(ABSTRACTTIMEOBJECT$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().add_element_user(ABSTRACTTIMEOBJECT$0);
            }
            target.set(abstractTimeObject);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTimeObject" element
     */
    public net.opengis.gml.x32.AbstractTimeObjectType addNewAbstractTimeObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().add_element_user(ABSTRACTTIMEOBJECT$0);
            return target;
        }
    }
}
