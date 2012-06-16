/*
 * XML Type:  TimeCoordinateSystemType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCoordinateSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeCoordinateSystemType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeCoordinateSystemTypeImpl extends net.opengis.gml.x32.impl.TimeReferenceSystemTypeImpl implements net.opengis.gml.x32.TimeCoordinateSystemType
{
    private static final long serialVersionUID = 1L;
    
    public TimeCoordinateSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "originPosition");
    private static final javax.xml.namespace.QName ORIGIN$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "origin");
    private static final javax.xml.namespace.QName INTERVAL$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "interval");
    
    
    /**
     * Gets the "originPosition" element
     */
    public net.opengis.gml.x32.TimePositionType getOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePositionType target = null;
            target = (net.opengis.gml.x32.TimePositionType)get_store().find_element_user(ORIGINPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originPosition" element
     */
    public boolean isSetOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINPOSITION$0) != 0;
        }
    }
    
    /**
     * Sets the "originPosition" element
     */
    public void setOriginPosition(net.opengis.gml.x32.TimePositionType originPosition)
    {
        generatedSetterHelperImpl(originPosition, ORIGINPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "originPosition" element
     */
    public net.opengis.gml.x32.TimePositionType addNewOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePositionType target = null;
            target = (net.opengis.gml.x32.TimePositionType)get_store().add_element_user(ORIGINPOSITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "originPosition" element
     */
    public void unsetOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINPOSITION$0, 0);
        }
    }
    
    /**
     * Gets the "origin" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().find_element_user(ORIGIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "origin" element
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGIN$2) != 0;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(net.opengis.gml.x32.TimeInstantPropertyType origin)
    {
        generatedSetterHelperImpl(origin, ORIGIN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().add_element_user(ORIGIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "origin" element
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGIN$2, 0);
        }
    }
    
    /**
     * Gets the "interval" element
     */
    public net.opengis.gml.x32.TimeIntervalLengthType getInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.x32.TimeIntervalLengthType)get_store().find_element_user(INTERVAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interval" element
     */
    public void setInterval(net.opengis.gml.x32.TimeIntervalLengthType interval)
    {
        generatedSetterHelperImpl(interval, INTERVAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "interval" element
     */
    public net.opengis.gml.x32.TimeIntervalLengthType addNewInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.x32.TimeIntervalLengthType)get_store().add_element_user(INTERVAL$4);
            return target;
        }
    }
}
