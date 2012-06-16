/*
 * An XML document type.
 * Localname: TimeCalendar
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCalendarDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeCalendar(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeCalendarDocumentImpl extends net.opengis.gml.x32.impl.TimeReferenceSystemDocumentImpl implements net.opengis.gml.x32.TimeCalendarDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECALENDAR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCalendar");
    
    
    /**
     * Gets the "TimeCalendar" element
     */
    public net.opengis.gml.x32.TimeCalendarType getTimeCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarType target = null;
            target = (net.opengis.gml.x32.TimeCalendarType)get_store().find_element_user(TIMECALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCalendar" element
     */
    public void setTimeCalendar(net.opengis.gml.x32.TimeCalendarType timeCalendar)
    {
        generatedSetterHelperImpl(timeCalendar, TIMECALENDAR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeCalendar" element
     */
    public net.opengis.gml.x32.TimeCalendarType addNewTimeCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarType target = null;
            target = (net.opengis.gml.x32.TimeCalendarType)get_store().add_element_user(TIMECALENDAR$0);
            return target;
        }
    }
}
