/*
 * An XML document type.
 * Localname: Circle
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CircleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Circle(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CircleDocumentImpl extends net.opengis.gml.x32.impl.ArcDocumentImpl implements net.opengis.gml.x32.CircleDocument
{
    private static final long serialVersionUID = 1L;
    
    public CircleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Circle");
    
    
    /**
     * Gets the "Circle" element
     */
    public net.opengis.gml.x32.CircleType getCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CircleType target = null;
            target = (net.opengis.gml.x32.CircleType)get_store().find_element_user(CIRCLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Circle" element
     */
    public void setCircle(net.opengis.gml.x32.CircleType circle)
    {
        generatedSetterHelperImpl(circle, CIRCLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Circle" element
     */
    public net.opengis.gml.x32.CircleType addNewCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CircleType target = null;
            target = (net.opengis.gml.x32.CircleType)get_store().add_element_user(CIRCLE$0);
            return target;
        }
    }
}
