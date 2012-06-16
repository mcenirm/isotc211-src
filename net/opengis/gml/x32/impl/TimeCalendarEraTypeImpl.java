/*
 * XML Type:  TimeCalendarEraType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCalendarEraType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeCalendarEraType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeCalendarEraTypeImpl extends net.opengis.gml.x32.impl.DefinitionTypeImpl implements net.opengis.gml.x32.TimeCalendarEraType
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarEraTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCEEVENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "referenceEvent");
    private static final javax.xml.namespace.QName REFERENCEDATE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "referenceDate");
    private static final javax.xml.namespace.QName JULIANREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "julianReference");
    private static final javax.xml.namespace.QName EPOCHOFUSE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "epochOfUse");
    
    
    /**
     * Gets the "referenceEvent" element
     */
    public net.opengis.gml.x32.StringOrRefType getReferenceEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(REFERENCEEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "referenceEvent" element
     */
    public void setReferenceEvent(net.opengis.gml.x32.StringOrRefType referenceEvent)
    {
        generatedSetterHelperImpl(referenceEvent, REFERENCEEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceEvent" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewReferenceEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(REFERENCEEVENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "referenceDate" element
     */
    public java.util.Calendar getReferenceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceDate" element
     */
    public net.opengis.gml.x32.CalDate xgetReferenceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CalDate target = null;
            target = (net.opengis.gml.x32.CalDate)get_store().find_element_user(REFERENCEDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "referenceDate" element
     */
    public void setReferenceDate(java.util.Calendar referenceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEDATE$2);
            }
            target.setCalendarValue(referenceDate);
        }
    }
    
    /**
     * Sets (as xml) the "referenceDate" element
     */
    public void xsetReferenceDate(net.opengis.gml.x32.CalDate referenceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CalDate target = null;
            target = (net.opengis.gml.x32.CalDate)get_store().find_element_user(REFERENCEDATE$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CalDate)get_store().add_element_user(REFERENCEDATE$2);
            }
            target.set(referenceDate);
        }
    }
    
    /**
     * Gets the "julianReference" element
     */
    public java.math.BigDecimal getJulianReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JULIANREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "julianReference" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetJulianReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(JULIANREFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "julianReference" element
     */
    public void setJulianReference(java.math.BigDecimal julianReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JULIANREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JULIANREFERENCE$4);
            }
            target.setBigDecimalValue(julianReference);
        }
    }
    
    /**
     * Sets (as xml) the "julianReference" element
     */
    public void xsetJulianReference(org.apache.xmlbeans.XmlDecimal julianReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(JULIANREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(JULIANREFERENCE$4);
            }
            target.set(julianReference);
        }
    }
    
    /**
     * Gets the "epochOfUse" element
     */
    public net.opengis.gml.x32.TimePeriodPropertyType getEpochOfUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.x32.TimePeriodPropertyType)get_store().find_element_user(EPOCHOFUSE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "epochOfUse" element
     */
    public void setEpochOfUse(net.opengis.gml.x32.TimePeriodPropertyType epochOfUse)
    {
        generatedSetterHelperImpl(epochOfUse, EPOCHOFUSE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "epochOfUse" element
     */
    public net.opengis.gml.x32.TimePeriodPropertyType addNewEpochOfUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.x32.TimePeriodPropertyType)get_store().add_element_user(EPOCHOFUSE$6);
            return target;
        }
    }
}
