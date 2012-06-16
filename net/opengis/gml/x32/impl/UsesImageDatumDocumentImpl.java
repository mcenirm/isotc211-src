/*
 * An XML document type.
 * Localname: usesImageDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesImageDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesImageDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesImageDatumDocumentImpl extends net.opengis.gml.x32.impl.ImageDatumDocumentImpl implements net.opengis.gml.x32.UsesImageDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesImageDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESIMAGEDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesImageDatum");
    
    
    /**
     * Gets the "usesImageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumPropertyType getUsesImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().find_element_user(USESIMAGEDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesImageDatum" element
     */
    public void setUsesImageDatum(net.opengis.gml.x32.ImageDatumPropertyType usesImageDatum)
    {
        generatedSetterHelperImpl(usesImageDatum, USESIMAGEDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesImageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumPropertyType addNewUsesImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().add_element_user(USESIMAGEDATUM$0);
            return target;
        }
    }
}
