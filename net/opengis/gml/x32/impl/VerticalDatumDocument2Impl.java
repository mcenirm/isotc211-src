/*
 * An XML document type.
 * Localname: VerticalDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalDatumDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one VerticalDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalDatumDocument2Impl extends net.opengis.gml.x32.impl.AbstractDatumDocumentImpl implements net.opengis.gml.x32.VerticalDatumDocument2
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalDatum");
    
    
    /**
     * Gets the "VerticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumType getVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumType target = null;
            target = (net.opengis.gml.x32.VerticalDatumType)get_store().find_element_user(VERTICALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerticalDatum" element
     */
    public void setVerticalDatum(net.opengis.gml.x32.VerticalDatumType verticalDatum)
    {
        generatedSetterHelperImpl(verticalDatum, VERTICALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumType addNewVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumType target = null;
            target = (net.opengis.gml.x32.VerticalDatumType)get_store().add_element_user(VERTICALDATUM$0);
            return target;
        }
    }
}
