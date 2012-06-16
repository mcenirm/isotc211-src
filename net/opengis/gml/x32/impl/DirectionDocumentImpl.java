/*
 * An XML document type.
 * Localname: direction
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one direction(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DirectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DirectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "direction");
    
    
    /**
     * Gets the "direction" element
     */
    public net.opengis.gml.x32.DirectionPropertyType getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectionPropertyType target = null;
            target = (net.opengis.gml.x32.DirectionPropertyType)get_store().find_element_user(DIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "direction" element
     */
    public void setDirection(net.opengis.gml.x32.DirectionPropertyType direction)
    {
        generatedSetterHelperImpl(direction, DIRECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "direction" element
     */
    public net.opengis.gml.x32.DirectionPropertyType addNewDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectionPropertyType target = null;
            target = (net.opengis.gml.x32.DirectionPropertyType)get_store().add_element_user(DIRECTION$0);
            return target;
        }
    }
}
