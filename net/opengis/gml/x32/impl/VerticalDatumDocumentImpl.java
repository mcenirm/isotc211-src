/*
 * An XML document type.
 * Localname: verticalDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one verticalDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.VerticalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalDatum");
    private static final org.apache.xmlbeans.QNameSet VERTICALDATUM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesVerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalDatum"),
    });
    
    
    /**
     * Gets the "verticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType getVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().find_element_user(VERTICALDATUM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalDatum" element
     */
    public void setVerticalDatum(net.opengis.gml.x32.VerticalDatumPropertyType verticalDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().find_element_user(VERTICALDATUM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().add_element_user(VERTICALDATUM$0);
            }
            target.set(verticalDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "verticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType addNewVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().add_element_user(VERTICALDATUM$0);
            return target;
        }
    }
}
