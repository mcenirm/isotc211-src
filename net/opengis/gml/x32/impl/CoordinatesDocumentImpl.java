/*
 * An XML document type.
 * Localname: coordinates
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinatesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one coordinates(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoordinatesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CoordinatesDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinatesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinates");
    
    
    /**
     * Gets the "coordinates" element
     */
    public net.opengis.gml.x32.CoordinatesType getCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().find_element_user(COORDINATES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinates" element
     */
    public void setCoordinates(net.opengis.gml.x32.CoordinatesType coordinates)
    {
        generatedSetterHelperImpl(coordinates, COORDINATES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinates" element
     */
    public net.opengis.gml.x32.CoordinatesType addNewCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().add_element_user(COORDINATES$0);
            return target;
        }
    }
}
