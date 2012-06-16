/*
 * An XML document type.
 * Localname: AbstractCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractCRSDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.AbstractCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCRS");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCRS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ProjectedCRS"),
    });
    
    
    /**
     * Gets the "AbstractCRS" element
     */
    public net.opengis.gml.x32.AbstractCRSType getAbstractCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCRSType target = null;
            target = (net.opengis.gml.x32.AbstractCRSType)get_store().find_element_user(ABSTRACTCRS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractCRS" element
     */
    public void setAbstractCRS(net.opengis.gml.x32.AbstractCRSType abstractCRS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCRSType target = null;
            target = (net.opengis.gml.x32.AbstractCRSType)get_store().find_element_user(ABSTRACTCRS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCRSType)get_store().add_element_user(ABSTRACTCRS$0);
            }
            target.set(abstractCRS);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractCRS" element
     */
    public net.opengis.gml.x32.AbstractCRSType addNewAbstractCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCRSType target = null;
            target = (net.opengis.gml.x32.AbstractCRSType)get_store().add_element_user(ABSTRACTCRS$0);
            return target;
        }
    }
}
