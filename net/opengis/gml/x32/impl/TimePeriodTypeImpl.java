/*
 * XML Type:  TimePeriodType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimePeriodType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimePeriodType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimePeriodTypeImpl extends net.opengis.gml.x32.impl.AbstractTimeGeometricPrimitiveTypeImpl implements net.opengis.gml.x32.TimePeriodType
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "beginPosition");
    private static final javax.xml.namespace.QName BEGIN$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "begin");
    private static final javax.xml.namespace.QName ENDPOSITION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "endPosition");
    private static final javax.xml.namespace.QName END$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "end");
    private static final javax.xml.namespace.QName DURATION$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "duration");
    private static final javax.xml.namespace.QName TIMEINTERVAL$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "timeInterval");
    
    
    /**
     * Gets the "beginPosition" element
     */
    public net.opengis.gml.x32.TimePositionType getBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePositionType target = null;
            target = (net.opengis.gml.x32.TimePositionType)get_store().find_element_user(BEGINPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "beginPosition" element
     */
    public boolean isSetBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINPOSITION$0) != 0;
        }
    }
    
    /**
     * Sets the "beginPosition" element
     */
    public void setBeginPosition(net.opengis.gml.x32.TimePositionType beginPosition)
    {
        generatedSetterHelperImpl(beginPosition, BEGINPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "beginPosition" element
     */
    public net.opengis.gml.x32.TimePositionType addNewBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePositionType target = null;
            target = (net.opengis.gml.x32.TimePositionType)get_store().add_element_user(BEGINPOSITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "beginPosition" element
     */
    public void unsetBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINPOSITION$0, 0);
        }
    }
    
    /**
     * Gets the "begin" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType getBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().find_element_user(BEGIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "begin" element
     */
    public boolean isSetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGIN$2) != 0;
        }
    }
    
    /**
     * Sets the "begin" element
     */
    public void setBegin(net.opengis.gml.x32.TimeInstantPropertyType begin)
    {
        generatedSetterHelperImpl(begin, BEGIN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "begin" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType addNewBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().add_element_user(BEGIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "begin" element
     */
    public void unsetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGIN$2, 0);
        }
    }
    
    /**
     * Gets the "endPosition" element
     */
    public net.opengis.gml.x32.TimePositionType getEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePositionType target = null;
            target = (net.opengis.gml.x32.TimePositionType)get_store().find_element_user(ENDPOSITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endPosition" element
     */
    public boolean isSetEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOSITION$4) != 0;
        }
    }
    
    /**
     * Sets the "endPosition" element
     */
    public void setEndPosition(net.opengis.gml.x32.TimePositionType endPosition)
    {
        generatedSetterHelperImpl(endPosition, ENDPOSITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "endPosition" element
     */
    public net.opengis.gml.x32.TimePositionType addNewEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePositionType target = null;
            target = (net.opengis.gml.x32.TimePositionType)get_store().add_element_user(ENDPOSITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "endPosition" element
     */
    public void unsetEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOSITION$4, 0);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().find_element_user(END$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$6) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(net.opengis.gml.x32.TimeInstantPropertyType end)
    {
        generatedSetterHelperImpl(end, END$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().add_element_user(END$6);
            return target;
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$6, 0);
        }
    }
    
    /**
     * Gets the "duration" element
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "duration" element
     */
    public org.apache.xmlbeans.XmlDuration xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "duration" element
     */
    public boolean isSetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "duration" element
     */
    public void setDuration(org.apache.xmlbeans.GDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$8);
            }
            target.setGDurationValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "duration" element
     */
    public void xsetDuration(org.apache.xmlbeans.XmlDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(DURATION$8);
            }
            target.set(duration);
        }
    }
    
    /**
     * Unsets the "duration" element
     */
    public void unsetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATION$8, 0);
        }
    }
    
    /**
     * Gets the "timeInterval" element
     */
    public net.opengis.gml.x32.TimeIntervalLengthType getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.x32.TimeIntervalLengthType)get_store().find_element_user(TIMEINTERVAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeInterval" element
     */
    public boolean isSetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEINTERVAL$10) != 0;
        }
    }
    
    /**
     * Sets the "timeInterval" element
     */
    public void setTimeInterval(net.opengis.gml.x32.TimeIntervalLengthType timeInterval)
    {
        generatedSetterHelperImpl(timeInterval, TIMEINTERVAL$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.x32.TimeIntervalLengthType)get_store().add_element_user(TIMEINTERVAL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "timeInterval" element
     */
    public void unsetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEINTERVAL$10, 0);
        }
    }
}
