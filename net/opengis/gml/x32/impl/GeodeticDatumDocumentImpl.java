/*
 * An XML document type.
 * Localname: geodeticDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodeticDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one geodeticDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeodeticDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeodeticDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODETICDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geodeticDatum");
    private static final org.apache.xmlbeans.QNameSet GEODETICDATUM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesGeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geodeticDatum"),
    });
    
    
    /**
     * Gets the "geodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType getGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(GEODETICDATUM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geodeticDatum" element
     */
    public void setGeodeticDatum(net.opengis.gml.x32.GeodeticDatumPropertyType geodeticDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(GEODETICDATUM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(GEODETICDATUM$0);
            }
            target.set(geodeticDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "geodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType addNewGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(GEODETICDATUM$0);
            return target;
        }
    }
}
