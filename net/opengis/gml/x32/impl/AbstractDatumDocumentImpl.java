/*
 * An XML document type.
 * Localname: AbstractDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractDatumDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.AbstractDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDatum");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDATUM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticDatum"),
    });
    
    
    /**
     * Gets the "AbstractDatum" element
     */
    public net.opengis.gml.x32.AbstractDatumType getAbstractDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractDatumType target = null;
            target = (net.opengis.gml.x32.AbstractDatumType)get_store().find_element_user(ABSTRACTDATUM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDatum" element
     */
    public void setAbstractDatum(net.opengis.gml.x32.AbstractDatumType abstractDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractDatumType target = null;
            target = (net.opengis.gml.x32.AbstractDatumType)get_store().find_element_user(ABSTRACTDATUM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractDatumType)get_store().add_element_user(ABSTRACTDATUM$0);
            }
            target.set(abstractDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDatum" element
     */
    public net.opengis.gml.x32.AbstractDatumType addNewAbstractDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractDatumType target = null;
            target = (net.opengis.gml.x32.AbstractDatumType)get_store().add_element_user(ABSTRACTDATUM$0);
            return target;
        }
    }
}
