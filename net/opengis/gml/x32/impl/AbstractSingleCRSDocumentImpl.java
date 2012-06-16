/*
 * An XML document type.
 * Localname: AbstractSingleCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractSingleCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractSingleCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractSingleCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractCRSDocumentImpl implements net.opengis.gml.x32.AbstractSingleCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSingleCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSINGLECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleCRS");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSINGLECRS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeographicCRS"),
    });
    
    
    /**
     * Gets the "AbstractSingleCRS" element
     */
    public net.opengis.gml.x32.AbstractCRSType getAbstractSingleCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCRSType target = null;
            target = (net.opengis.gml.x32.AbstractCRSType)get_store().find_element_user(ABSTRACTSINGLECRS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractSingleCRS" element
     */
    public void setAbstractSingleCRS(net.opengis.gml.x32.AbstractCRSType abstractSingleCRS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCRSType target = null;
            target = (net.opengis.gml.x32.AbstractCRSType)get_store().find_element_user(ABSTRACTSINGLECRS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCRSType)get_store().add_element_user(ABSTRACTSINGLECRS$0);
            }
            target.set(abstractSingleCRS);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractSingleCRS" element
     */
    public net.opengis.gml.x32.AbstractCRSType addNewAbstractSingleCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCRSType target = null;
            target = (net.opengis.gml.x32.AbstractCRSType)get_store().add_element_user(ABSTRACTSINGLECRS$0);
            return target;
        }
    }
}
