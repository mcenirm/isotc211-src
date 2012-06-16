/*
 * XML Type:  CoordinateSystemAxisType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinateSystemAxisType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CoordinateSystemAxisType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CoordinateSystemAxisTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.CoordinateSystemAxisType
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemAxisTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXISABBREV$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axisAbbrev");
    private static final javax.xml.namespace.QName AXISDIRECTION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axisDirection");
    private static final javax.xml.namespace.QName MINIMUMVALUE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "minimumValue");
    private static final javax.xml.namespace.QName MAXIMUMVALUE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "maximumValue");
    private static final javax.xml.namespace.QName RANGEMEANING$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rangeMeaning");
    private static final javax.xml.namespace.QName UOM$10 = 
        new javax.xml.namespace.QName("", "uom");
    
    
    /**
     * Gets the "axisAbbrev" element
     */
    public net.opengis.gml.x32.CodeType getAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(AXISABBREV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisAbbrev" element
     */
    public void setAxisAbbrev(net.opengis.gml.x32.CodeType axisAbbrev)
    {
        generatedSetterHelperImpl(axisAbbrev, AXISABBREV$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisAbbrev" element
     */
    public net.opengis.gml.x32.CodeType addNewAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(AXISABBREV$0);
            return target;
        }
    }
    
    /**
     * Gets the "axisDirection" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getAxisDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(AXISDIRECTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisDirection" element
     */
    public void setAxisDirection(net.opengis.gml.x32.CodeWithAuthorityType axisDirection)
    {
        generatedSetterHelperImpl(axisDirection, AXISDIRECTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisDirection" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewAxisDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(AXISDIRECTION$2);
            return target;
        }
    }
    
    /**
     * Gets the "minimumValue" element
     */
    public double getMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMVALUE$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimumValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMUMVALUE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "minimumValue" element
     */
    public boolean isSetMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMVALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "minimumValue" element
     */
    public void setMinimumValue(double minimumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMVALUE$4);
            }
            target.setDoubleValue(minimumValue);
        }
    }
    
    /**
     * Sets (as xml) the "minimumValue" element
     */
    public void xsetMinimumValue(org.apache.xmlbeans.XmlDouble minimumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINIMUMVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINIMUMVALUE$4);
            }
            target.set(minimumValue);
        }
    }
    
    /**
     * Unsets the "minimumValue" element
     */
    public void unsetMinimumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMVALUE$4, 0);
        }
    }
    
    /**
     * Gets the "maximumValue" element
     */
    public double getMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMVALUE$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximumValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMUMVALUE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "maximumValue" element
     */
    public boolean isSetMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "maximumValue" element
     */
    public void setMaximumValue(double maximumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMVALUE$6);
            }
            target.setDoubleValue(maximumValue);
        }
    }
    
    /**
     * Sets (as xml) the "maximumValue" element
     */
    public void xsetMaximumValue(org.apache.xmlbeans.XmlDouble maximumValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXIMUMVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXIMUMVALUE$6);
            }
            target.set(maximumValue);
        }
    }
    
    /**
     * Unsets the "maximumValue" element
     */
    public void unsetMaximumValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMVALUE$6, 0);
        }
    }
    
    /**
     * Gets the "rangeMeaning" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getRangeMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(RANGEMEANING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rangeMeaning" element
     */
    public boolean isSetRangeMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANGEMEANING$8) != 0;
        }
    }
    
    /**
     * Sets the "rangeMeaning" element
     */
    public void setRangeMeaning(net.opengis.gml.x32.CodeWithAuthorityType rangeMeaning)
    {
        generatedSetterHelperImpl(rangeMeaning, RANGEMEANING$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeMeaning" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewRangeMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(RANGEMEANING$8);
            return target;
        }
    }
    
    /**
     * Unsets the "rangeMeaning" element
     */
    public void unsetRangeMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANGEMEANING$8, 0);
        }
    }
    
    /**
     * Gets the "uom" attribute
     */
    public java.lang.String getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public net.opengis.gml.x32.UomIdentifier xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UomIdentifier target = null;
            target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$10);
            return target;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
    public void setUom(java.lang.String uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$10);
            }
            target.setStringValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(net.opengis.gml.x32.UomIdentifier uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UomIdentifier target = null;
            target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$10);
            if (target == null)
            {
                target = (net.opengis.gml.x32.UomIdentifier)get_store().add_attribute_user(UOM$10);
            }
            target.set(uom);
        }
    }
}
