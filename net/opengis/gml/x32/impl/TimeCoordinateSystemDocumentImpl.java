/*
 * An XML document type.
 * Localname: TimeCoordinateSystem
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCoordinateSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeCoordinateSystem(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeCoordinateSystemDocumentImpl extends net.opengis.gml.x32.impl.TimeReferenceSystemDocumentImpl implements net.opengis.gml.x32.TimeCoordinateSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCoordinateSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECOORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCoordinateSystem");
    
    
    /**
     * Gets the "TimeCoordinateSystem" element
     */
    public net.opengis.gml.x32.TimeCoordinateSystemType getTimeCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCoordinateSystemType target = null;
            target = (net.opengis.gml.x32.TimeCoordinateSystemType)get_store().find_element_user(TIMECOORDINATESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCoordinateSystem" element
     */
    public void setTimeCoordinateSystem(net.opengis.gml.x32.TimeCoordinateSystemType timeCoordinateSystem)
    {
        generatedSetterHelperImpl(timeCoordinateSystem, TIMECOORDINATESYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeCoordinateSystem" element
     */
    public net.opengis.gml.x32.TimeCoordinateSystemType addNewTimeCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCoordinateSystemType target = null;
            target = (net.opengis.gml.x32.TimeCoordinateSystemType)get_store().add_element_user(TIMECOORDINATESYSTEM$0);
            return target;
        }
    }
}
