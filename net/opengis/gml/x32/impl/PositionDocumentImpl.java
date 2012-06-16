/*
 * An XML document type.
 * Localname: position
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PositionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one position(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public PositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "position");
    
    
    /**
     * Gets the "position" element
     */
    public net.opengis.gml.x32.PointPropertyType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "position" element
     */
    public void setPosition(net.opengis.gml.x32.PointPropertyType position)
    {
        generatedSetterHelperImpl(position, POSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "position" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(POSITION$0);
            return target;
        }
    }
}
