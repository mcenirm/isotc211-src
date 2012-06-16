/*
 * An XML document type.
 * Localname: TimePeriod
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimePeriodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimePeriod(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimePeriodDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeGeometricPrimitiveDocumentImpl implements net.opengis.gml.x32.TimePeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPERIOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimePeriod");
    
    
    /**
     * Gets the "TimePeriod" element
     */
    public net.opengis.gml.x32.TimePeriodType getTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodType target = null;
            target = (net.opengis.gml.x32.TimePeriodType)get_store().find_element_user(TIMEPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimePeriod" element
     */
    public void setTimePeriod(net.opengis.gml.x32.TimePeriodType timePeriod)
    {
        generatedSetterHelperImpl(timePeriod, TIMEPERIOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimePeriod" element
     */
    public net.opengis.gml.x32.TimePeriodType addNewTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodType target = null;
            target = (net.opengis.gml.x32.TimePeriodType)get_store().add_element_user(TIMEPERIOD$0);
            return target;
        }
    }
}
