/*
 * An XML document type.
 * Localname: coordinateSystemAxisRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinateSystemAxisRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one coordinateSystemAxisRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemAxisRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CoordinateSystemAxisRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemAxisRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEMAXISREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystemAxisRef");
    
    
    /**
     * Gets the "coordinateSystemAxisRef" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType getCoordinateSystemAxisRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().find_element_user(COORDINATESYSTEMAXISREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateSystemAxisRef" element
     */
    public void setCoordinateSystemAxisRef(net.opengis.gml.x32.CoordinateSystemAxisPropertyType coordinateSystemAxisRef)
    {
        generatedSetterHelperImpl(coordinateSystemAxisRef, COORDINATESYSTEMAXISREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateSystemAxisRef" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType addNewCoordinateSystemAxisRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().add_element_user(COORDINATESYSTEMAXISREF$0);
            return target;
        }
    }
}
