/*
 * An XML document type.
 * Localname: TimeClock
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeClockDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeClock(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeClockDocumentImpl extends net.opengis.gml.x32.impl.TimeReferenceSystemDocumentImpl implements net.opengis.gml.x32.TimeClockDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeClockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECLOCK$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeClock");
    
    
    /**
     * Gets the "TimeClock" element
     */
    public net.opengis.gml.x32.TimeClockType getTimeClock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeClockType target = null;
            target = (net.opengis.gml.x32.TimeClockType)get_store().find_element_user(TIMECLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeClock" element
     */
    public void setTimeClock(net.opengis.gml.x32.TimeClockType timeClock)
    {
        generatedSetterHelperImpl(timeClock, TIMECLOCK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeClock" element
     */
    public net.opengis.gml.x32.TimeClockType addNewTimeClock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeClockType target = null;
            target = (net.opengis.gml.x32.TimeClockType)get_store().add_element_user(TIMECLOCK$0);
            return target;
        }
    }
}
