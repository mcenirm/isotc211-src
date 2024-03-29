/*
 * XML Type:  AbstractCurveSegmentType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCurveSegmentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractCurveSegmentType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractCurveSegmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractCurveSegmentType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCurveSegmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMDERIVATIVESATSTART$0 = 
        new javax.xml.namespace.QName("", "numDerivativesAtStart");
    private static final javax.xml.namespace.QName NUMDERIVATIVESATEND$2 = 
        new javax.xml.namespace.QName("", "numDerivativesAtEnd");
    private static final javax.xml.namespace.QName NUMDERIVATIVEINTERIOR$4 = 
        new javax.xml.namespace.QName("", "numDerivativeInterior");
    
    
    /**
     * Gets the "numDerivativesAtStart" attribute
     */
    public java.math.BigInteger getNumDerivativesAtStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMDERIVATIVESATSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMDERIVATIVESATSTART$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numDerivativesAtStart" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumDerivativesAtStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMDERIVATIVESATSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMDERIVATIVESATSTART$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "numDerivativesAtStart" attribute
     */
    public boolean isSetNumDerivativesAtStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMDERIVATIVESATSTART$0) != null;
        }
    }
    
    /**
     * Sets the "numDerivativesAtStart" attribute
     */
    public void setNumDerivativesAtStart(java.math.BigInteger numDerivativesAtStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMDERIVATIVESATSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMDERIVATIVESATSTART$0);
            }
            target.setBigIntegerValue(numDerivativesAtStart);
        }
    }
    
    /**
     * Sets (as xml) the "numDerivativesAtStart" attribute
     */
    public void xsetNumDerivativesAtStart(org.apache.xmlbeans.XmlInteger numDerivativesAtStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMDERIVATIVESATSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMDERIVATIVESATSTART$0);
            }
            target.set(numDerivativesAtStart);
        }
    }
    
    /**
     * Unsets the "numDerivativesAtStart" attribute
     */
    public void unsetNumDerivativesAtStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMDERIVATIVESATSTART$0);
        }
    }
    
    /**
     * Gets the "numDerivativesAtEnd" attribute
     */
    public java.math.BigInteger getNumDerivativesAtEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMDERIVATIVESATEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMDERIVATIVESATEND$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numDerivativesAtEnd" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumDerivativesAtEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMDERIVATIVESATEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMDERIVATIVESATEND$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "numDerivativesAtEnd" attribute
     */
    public boolean isSetNumDerivativesAtEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMDERIVATIVESATEND$2) != null;
        }
    }
    
    /**
     * Sets the "numDerivativesAtEnd" attribute
     */
    public void setNumDerivativesAtEnd(java.math.BigInteger numDerivativesAtEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMDERIVATIVESATEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMDERIVATIVESATEND$2);
            }
            target.setBigIntegerValue(numDerivativesAtEnd);
        }
    }
    
    /**
     * Sets (as xml) the "numDerivativesAtEnd" attribute
     */
    public void xsetNumDerivativesAtEnd(org.apache.xmlbeans.XmlInteger numDerivativesAtEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMDERIVATIVESATEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMDERIVATIVESATEND$2);
            }
            target.set(numDerivativesAtEnd);
        }
    }
    
    /**
     * Unsets the "numDerivativesAtEnd" attribute
     */
    public void unsetNumDerivativesAtEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMDERIVATIVESATEND$2);
        }
    }
    
    /**
     * Gets the "numDerivativeInterior" attribute
     */
    public java.math.BigInteger getNumDerivativeInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMDERIVATIVEINTERIOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMDERIVATIVEINTERIOR$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numDerivativeInterior" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumDerivativeInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMDERIVATIVEINTERIOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMDERIVATIVEINTERIOR$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "numDerivativeInterior" attribute
     */
    public boolean isSetNumDerivativeInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMDERIVATIVEINTERIOR$4) != null;
        }
    }
    
    /**
     * Sets the "numDerivativeInterior" attribute
     */
    public void setNumDerivativeInterior(java.math.BigInteger numDerivativeInterior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMDERIVATIVEINTERIOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMDERIVATIVEINTERIOR$4);
            }
            target.setBigIntegerValue(numDerivativeInterior);
        }
    }
    
    /**
     * Sets (as xml) the "numDerivativeInterior" attribute
     */
    public void xsetNumDerivativeInterior(org.apache.xmlbeans.XmlInteger numDerivativeInterior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMDERIVATIVEINTERIOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMDERIVATIVEINTERIOR$4);
            }
            target.set(numDerivativeInterior);
        }
    }
    
    /**
     * Unsets the "numDerivativeInterior" attribute
     */
    public void unsetNumDerivativeInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMDERIVATIVEINTERIOR$4);
        }
    }
}
