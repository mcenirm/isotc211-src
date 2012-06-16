/*
 * An XML document type.
 * Localname: AbstractTimeGeometricPrimitive
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimeGeometricPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTimeGeometricPrimitive(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTimeGeometricPrimitiveDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimePrimitiveDocumentImpl implements net.opengis.gml.x32.AbstractTimeGeometricPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeGeometricPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTIMEGEOMETRICPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMEGEOMETRICPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeInstant"),
    });
    
    
    /**
     * Gets the "AbstractTimeGeometricPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType getAbstractTimeGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType)get_store().find_element_user(ABSTRACTTIMEGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTimeGeometricPrimitive" element
     */
    public void setAbstractTimeGeometricPrimitive(net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType abstractTimeGeometricPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType)get_store().find_element_user(ABSTRACTTIMEGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType)get_store().add_element_user(ABSTRACTTIMEGEOMETRICPRIMITIVE$0);
            }
            target.set(abstractTimeGeometricPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTimeGeometricPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType addNewAbstractTimeGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTimeGeometricPrimitiveType)get_store().add_element_user(ABSTRACTTIMEGEOMETRICPRIMITIVE$0);
            return target;
        }
    }
}
