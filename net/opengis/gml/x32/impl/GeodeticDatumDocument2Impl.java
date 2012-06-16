/*
 * An XML document type.
 * Localname: GeodeticDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodeticDatumDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GeodeticDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeodeticDatumDocument2Impl extends net.opengis.gml.x32.impl.AbstractDatumDocumentImpl implements net.opengis.gml.x32.GeodeticDatumDocument2
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODETICDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticDatum");
    
    
    /**
     * Gets the "GeodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumType getGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumType)get_store().find_element_user(GEODETICDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeodeticDatum" element
     */
    public void setGeodeticDatum(net.opengis.gml.x32.GeodeticDatumType geodeticDatum)
    {
        generatedSetterHelperImpl(geodeticDatum, GEODETICDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumType addNewGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumType)get_store().add_element_user(GEODETICDATUM$0);
            return target;
        }
    }
}
