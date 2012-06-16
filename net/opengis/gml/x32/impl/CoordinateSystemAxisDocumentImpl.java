/*
 * An XML document type.
 * Localname: CoordinateSystemAxis
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinateSystemAxisDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CoordinateSystemAxis(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemAxisDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.CoordinateSystemAxisDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemAxisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEMAXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CoordinateSystemAxis");
    
    
    /**
     * Gets the "CoordinateSystemAxis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisType getCoordinateSystemAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisType)get_store().find_element_user(COORDINATESYSTEMAXIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoordinateSystemAxis" element
     */
    public void setCoordinateSystemAxis(net.opengis.gml.x32.CoordinateSystemAxisType coordinateSystemAxis)
    {
        generatedSetterHelperImpl(coordinateSystemAxis, COORDINATESYSTEMAXIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CoordinateSystemAxis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisType addNewCoordinateSystemAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisType)get_store().add_element_user(COORDINATESYSTEMAXIS$0);
            return target;
        }
    }
}
