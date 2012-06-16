/*
 * An XML document type.
 * Localname: VerticalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one VerticalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.VerticalCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCS");
    
    
    /**
     * Gets the "VerticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSType getVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSType target = null;
            target = (net.opengis.gml.x32.VerticalCSType)get_store().find_element_user(VERTICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerticalCS" element
     */
    public void setVerticalCS(net.opengis.gml.x32.VerticalCSType verticalCS)
    {
        generatedSetterHelperImpl(verticalCS, VERTICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSType addNewVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSType target = null;
            target = (net.opengis.gml.x32.VerticalCSType)get_store().add_element_user(VERTICALCS$0);
            return target;
        }
    }
}
