/*
 * An XML document type.
 * Localname: usesGeodeticDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesGeodeticDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesGeodeticDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesGeodeticDatumDocumentImpl extends net.opengis.gml.x32.impl.GeodeticDatumDocumentImpl implements net.opengis.gml.x32.UsesGeodeticDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesGeodeticDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESGEODETICDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesGeodeticDatum");
    
    
    /**
     * Gets the "usesGeodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType getUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(USESGEODETICDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesGeodeticDatum" element
     */
    public void setUsesGeodeticDatum(net.opengis.gml.x32.GeodeticDatumPropertyType usesGeodeticDatum)
    {
        generatedSetterHelperImpl(usesGeodeticDatum, USESGEODETICDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesGeodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType addNewUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(USESGEODETICDATUM$0);
            return target;
        }
    }
}
