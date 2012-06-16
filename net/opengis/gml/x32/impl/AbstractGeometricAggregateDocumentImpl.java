/*
 * An XML document type.
 * Localname: AbstractGeometricAggregate
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeometricAggregateDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGeometricAggregate(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeometricAggregateDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometryDocumentImpl implements net.opengis.gml.x32.AbstractGeometricAggregateDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeometricAggregateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGEOMETRICAGGREGATE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricAggregate");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGEOMETRICAGGREGATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricAggregate"),
    });
    
    
    /**
     * Gets the "AbstractGeometricAggregate" element
     */
    public net.opengis.gml.x32.AbstractGeometricAggregateType getAbstractGeometricAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.x32.AbstractGeometricAggregateType)get_store().find_element_user(ABSTRACTGEOMETRICAGGREGATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeometricAggregate" element
     */
    public void setAbstractGeometricAggregate(net.opengis.gml.x32.AbstractGeometricAggregateType abstractGeometricAggregate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.x32.AbstractGeometricAggregateType)get_store().find_element_user(ABSTRACTGEOMETRICAGGREGATE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeometricAggregateType)get_store().add_element_user(ABSTRACTGEOMETRICAGGREGATE$0);
            }
            target.set(abstractGeometricAggregate);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeometricAggregate" element
     */
    public net.opengis.gml.x32.AbstractGeometricAggregateType addNewAbstractGeometricAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.x32.AbstractGeometricAggregateType)get_store().add_element_user(ABSTRACTGEOMETRICAGGREGATE$0);
            return target;
        }
    }
}
