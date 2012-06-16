/*
 * An XML document type.
 * Localname: VerticalCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one VerticalCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.VerticalCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCRS");
    
    
    /**
     * Gets the "VerticalCRS" element
     */
    public net.opengis.gml.x32.VerticalCRSType getVerticalCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCRSType target = null;
            target = (net.opengis.gml.x32.VerticalCRSType)get_store().find_element_user(VERTICALCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerticalCRS" element
     */
    public void setVerticalCRS(net.opengis.gml.x32.VerticalCRSType verticalCRS)
    {
        generatedSetterHelperImpl(verticalCRS, VERTICALCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerticalCRS" element
     */
    public net.opengis.gml.x32.VerticalCRSType addNewVerticalCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCRSType target = null;
            target = (net.opengis.gml.x32.VerticalCRSType)get_store().add_element_user(VERTICALCRS$0);
            return target;
        }
    }
}
