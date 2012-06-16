/*
 * An XML document type.
 * Localname: timeInterval
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeIntervalDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one timeInterval(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeIntervalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TimeIntervalDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeIntervalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINTERVAL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "timeInterval");
    
    
    /**
     * Gets the "timeInterval" element
     */
    public net.opengis.gml.x32.TimeIntervalLengthType getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.x32.TimeIntervalLengthType)get_store().find_element_user(TIMEINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timeInterval" element
     */
    public void setTimeInterval(net.opengis.gml.x32.TimeIntervalLengthType timeInterval)
    {
        generatedSetterHelperImpl(timeInterval, TIMEINTERVAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeInterval" element
     */
    public net.opengis.gml.x32.TimeIntervalLengthType addNewTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.x32.TimeIntervalLengthType)get_store().add_element_user(TIMEINTERVAL$0);
            return target;
        }
    }
}
