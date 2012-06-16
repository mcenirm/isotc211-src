/*
 * An XML document type.
 * Localname: coordinateSystemRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinateSystemRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one coordinateSystemRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CoordinateSystemRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystemRef");
    
    
    /**
     * Gets the "coordinateSystemRef" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType getCoordinateSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(COORDINATESYSTEMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateSystemRef" element
     */
    public void setCoordinateSystemRef(net.opengis.gml.x32.CoordinateSystemPropertyType coordinateSystemRef)
    {
        generatedSetterHelperImpl(coordinateSystemRef, COORDINATESYSTEMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateSystemRef" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType addNewCoordinateSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(COORDINATESYSTEMREF$0);
            return target;
        }
    }
}
