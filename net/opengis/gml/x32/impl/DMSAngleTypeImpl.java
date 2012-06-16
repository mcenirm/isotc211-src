/*
 * XML Type:  DMSAngleType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DMSAngleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DMSAngleType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DMSAngleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DMSAngleType
{
    private static final long serialVersionUID = 1L;
    
    public DMSAngleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEGREES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "degrees");
    private static final javax.xml.namespace.QName DECIMALMINUTES$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "decimalMinutes");
    private static final javax.xml.namespace.QName MINUTES$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "minutes");
    private static final javax.xml.namespace.QName SECONDS$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "seconds");
    
    
    /**
     * Gets the "degrees" element
     */
    public net.opengis.gml.x32.DegreesType getDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DegreesType target = null;
            target = (net.opengis.gml.x32.DegreesType)get_store().find_element_user(DEGREES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "degrees" element
     */
    public void setDegrees(net.opengis.gml.x32.DegreesType degrees)
    {
        generatedSetterHelperImpl(degrees, DEGREES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "degrees" element
     */
    public net.opengis.gml.x32.DegreesType addNewDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DegreesType target = null;
            target = (net.opengis.gml.x32.DegreesType)get_store().add_element_user(DEGREES$0);
            return target;
        }
    }
    
    /**
     * Gets the "decimalMinutes" element
     */
    public java.math.BigDecimal getDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimalMinutes" element
     */
    public net.opengis.gml.x32.DecimalMinutesType xgetDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DecimalMinutesType target = null;
            target = (net.opengis.gml.x32.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "decimalMinutes" element
     */
    public boolean isSetDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMALMINUTES$2) != 0;
        }
    }
    
    /**
     * Sets the "decimalMinutes" element
     */
    public void setDecimalMinutes(java.math.BigDecimal decimalMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMALMINUTES$2);
            }
            target.setBigDecimalValue(decimalMinutes);
        }
    }
    
    /**
     * Sets (as xml) the "decimalMinutes" element
     */
    public void xsetDecimalMinutes(net.opengis.gml.x32.DecimalMinutesType decimalMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DecimalMinutesType target = null;
            target = (net.opengis.gml.x32.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DecimalMinutesType)get_store().add_element_user(DECIMALMINUTES$2);
            }
            target.set(decimalMinutes);
        }
    }
    
    /**
     * Unsets the "decimalMinutes" element
     */
    public void unsetDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMALMINUTES$2, 0);
        }
    }
    
    /**
     * Gets the "minutes" element
     */
    public int getMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minutes" element
     */
    public net.opengis.gml.x32.ArcMinutesType xgetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcMinutesType target = null;
            target = (net.opengis.gml.x32.ArcMinutesType)get_store().find_element_user(MINUTES$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "minutes" element
     */
    public boolean isSetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINUTES$4) != 0;
        }
    }
    
    /**
     * Sets the "minutes" element
     */
    public void setMinutes(int minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTES$4);
            }
            target.setIntValue(minutes);
        }
    }
    
    /**
     * Sets (as xml) the "minutes" element
     */
    public void xsetMinutes(net.opengis.gml.x32.ArcMinutesType minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcMinutesType target = null;
            target = (net.opengis.gml.x32.ArcMinutesType)get_store().find_element_user(MINUTES$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcMinutesType)get_store().add_element_user(MINUTES$4);
            }
            target.set(minutes);
        }
    }
    
    /**
     * Unsets the "minutes" element
     */
    public void unsetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINUTES$4, 0);
        }
    }
    
    /**
     * Gets the "seconds" element
     */
    public java.math.BigDecimal getSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "seconds" element
     */
    public net.opengis.gml.x32.ArcSecondsType xgetSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcSecondsType target = null;
            target = (net.opengis.gml.x32.ArcSecondsType)get_store().find_element_user(SECONDS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "seconds" element
     */
    public boolean isSetSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDS$6) != 0;
        }
    }
    
    /**
     * Sets the "seconds" element
     */
    public void setSeconds(java.math.BigDecimal seconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDS$6);
            }
            target.setBigDecimalValue(seconds);
        }
    }
    
    /**
     * Sets (as xml) the "seconds" element
     */
    public void xsetSeconds(net.opengis.gml.x32.ArcSecondsType seconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcSecondsType target = null;
            target = (net.opengis.gml.x32.ArcSecondsType)get_store().find_element_user(SECONDS$6, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcSecondsType)get_store().add_element_user(SECONDS$6);
            }
            target.set(seconds);
        }
    }
    
    /**
     * Unsets the "seconds" element
     */
    public void unsetSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDS$6, 0);
        }
    }
}
