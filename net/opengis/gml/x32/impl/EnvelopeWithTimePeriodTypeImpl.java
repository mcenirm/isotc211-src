/*
 * XML Type:  EnvelopeWithTimePeriodType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EnvelopeWithTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML EnvelopeWithTimePeriodType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class EnvelopeWithTimePeriodTypeImpl extends net.opengis.gml.x32.impl.EnvelopeTypeImpl implements net.opengis.gml.x32.EnvelopeWithTimePeriodType
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeWithTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "beginPosition");
    private static final javax.xml.namespace.QName ENDPOSITION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "endPosition");
    private static final javax.xml.namespace.QName FRAME$4 = 
        new javax.xml.namespace.QName("", "frame");
    
    
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
     * Gets the "endPosition" element
     */
    public net.opengis.gml.x32.TimePositionType getEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePositionType target = null;
            target = (net.opengis.gml.x32.TimePositionType)get_store().find_element_user(ENDPOSITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endPosition" element
     */
    public void setEndPosition(net.opengis.gml.x32.TimePositionType endPosition)
    {
        generatedSetterHelperImpl(endPosition, ENDPOSITION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.x32.TimePositionType)get_store().add_element_user(ENDPOSITION$2);
            return target;
        }
    }
    
    /**
     * Gets the "frame" attribute
     */
    public java.lang.String getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FRAME$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(FRAME$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$4) != null;
        }
    }
    
    /**
     * Sets the "frame" attribute
     */
    public void setFrame(java.lang.String frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$4);
            }
            target.setStringValue(frame);
        }
    }
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(org.apache.xmlbeans.XmlAnyURI frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(FRAME$4);
            }
            target.set(frame);
        }
    }
    
    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$4);
        }
    }
}
