/*
 * An XML document type.
 * Localname: Rectangle
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RectangleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Rectangle(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RectangleDocumentImpl extends net.opengis.gml.x32.impl.AbstractSurfacePatchDocumentImpl implements net.opengis.gml.x32.RectangleDocument
{
    private static final long serialVersionUID = 1L;
    
    public RectangleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Rectangle");
    
    
    /**
     * Gets the "Rectangle" element
     */
    public net.opengis.gml.x32.RectangleType getRectangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RectangleType target = null;
            target = (net.opengis.gml.x32.RectangleType)get_store().find_element_user(RECTANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Rectangle" element
     */
    public void setRectangle(net.opengis.gml.x32.RectangleType rectangle)
    {
        generatedSetterHelperImpl(rectangle, RECTANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Rectangle" element
     */
    public net.opengis.gml.x32.RectangleType addNewRectangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RectangleType target = null;
            target = (net.opengis.gml.x32.RectangleType)get_store().add_element_user(RECTANGLE$0);
            return target;
        }
    }
}
