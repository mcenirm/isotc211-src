/*
 * An XML document type.
 * Localname: usesVerticalDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesVerticalDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesVerticalDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesVerticalDatumDocumentImpl extends net.opengis.gml.x32.impl.VerticalDatumDocumentImpl implements net.opengis.gml.x32.UsesVerticalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesVerticalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESVERTICALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesVerticalDatum");
    
    
    /**
     * Gets the "usesVerticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType getUsesVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().find_element_user(USESVERTICALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesVerticalDatum" element
     */
    public void setUsesVerticalDatum(net.opengis.gml.x32.VerticalDatumPropertyType usesVerticalDatum)
    {
        generatedSetterHelperImpl(usesVerticalDatum, USESVERTICALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesVerticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType addNewUsesVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().add_element_user(USESVERTICALDATUM$0);
            return target;
        }
    }
}
