/*
 * An XML document type.
 * Localname: TimeReferenceSystem
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeReferenceSystem(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeReferenceSystemDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.TimeReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeReferenceSystem");
    private static final org.apache.xmlbeans.QNameSet TIMEREFERENCESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeClock"),
    });
    
    
    /**
     * Gets the "TimeReferenceSystem" element
     */
    public net.opengis.gml.x32.TimeReferenceSystemType getTimeReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeReferenceSystemType target = null;
            target = (net.opengis.gml.x32.TimeReferenceSystemType)get_store().find_element_user(TIMEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeReferenceSystem" element
     */
    public void setTimeReferenceSystem(net.opengis.gml.x32.TimeReferenceSystemType timeReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeReferenceSystemType target = null;
            target = (net.opengis.gml.x32.TimeReferenceSystemType)get_store().find_element_user(TIMEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.TimeReferenceSystemType)get_store().add_element_user(TIMEREFERENCESYSTEM$0);
            }
            target.set(timeReferenceSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeReferenceSystem" element
     */
    public net.opengis.gml.x32.TimeReferenceSystemType addNewTimeReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeReferenceSystemType target = null;
            target = (net.opengis.gml.x32.TimeReferenceSystemType)get_store().add_element_user(TIMEREFERENCESYSTEM$0);
            return target;
        }
    }
}
