/*
 * An XML document type.
 * Localname: TimeCalendarEra
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCalendarEraDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeCalendarEra(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeCalendarEraDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TimeCalendarEraDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarEraDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECALENDARERA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCalendarEra");
    
    
    /**
     * Gets the "TimeCalendarEra" element
     */
    public net.opengis.gml.x32.TimeCalendarEraType getTimeCalendarEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarEraType target = null;
            target = (net.opengis.gml.x32.TimeCalendarEraType)get_store().find_element_user(TIMECALENDARERA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCalendarEra" element
     */
    public void setTimeCalendarEra(net.opengis.gml.x32.TimeCalendarEraType timeCalendarEra)
    {
        generatedSetterHelperImpl(timeCalendarEra, TIMECALENDARERA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeCalendarEra" element
     */
    public net.opengis.gml.x32.TimeCalendarEraType addNewTimeCalendarEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarEraType target = null;
            target = (net.opengis.gml.x32.TimeCalendarEraType)get_store().add_element_user(TIMECALENDARERA$0);
            return target;
        }
    }
}
