/*
 * XML Type:  TimeEdgeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeEdgeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeEdgeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeEdgeTypeImpl extends net.opengis.gml.x32.impl.AbstractTimeTopologyPrimitiveTypeImpl implements net.opengis.gml.x32.TimeEdgeType
{
    private static final long serialVersionUID = 1L;
    
    public TimeEdgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "end");
    private static final javax.xml.namespace.QName EXTENT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "extent");
    
    
    /**
     * Gets the "start" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(net.opengis.gml.x32.TimeNodePropertyType start)
    {
        generatedSetterHelperImpl(start, START$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().add_element_user(START$0);
            return target;
        }
    }
    
    /**
     * Gets the "end" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(net.opengis.gml.x32.TimeNodePropertyType end)
    {
        generatedSetterHelperImpl(end, END$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().add_element_user(END$2);
            return target;
        }
    }
    
    /**
     * Gets the "extent" element
     */
    public net.opengis.gml.x32.TimePeriodPropertyType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.x32.TimePeriodPropertyType)get_store().find_element_user(EXTENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extent" element
     */
    public boolean isSetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$4) != 0;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(net.opengis.gml.x32.TimePeriodPropertyType extent)
    {
        generatedSetterHelperImpl(extent, EXTENT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public net.opengis.gml.x32.TimePeriodPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.x32.TimePeriodPropertyType)get_store().add_element_user(EXTENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "extent" element
     */
    public void unsetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$4, 0);
        }
    }
}
