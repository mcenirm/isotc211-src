/*
 * XML Type:  CylinderType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CylinderType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CylinderType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CylinderTypeImpl extends net.opengis.gml.x32.impl.AbstractGriddedSurfaceTypeImpl implements net.opengis.gml.x32.CylinderType
{
    private static final long serialVersionUID = 1L;
    
    public CylinderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HORIZONTALCURVETYPE$0 = 
        new javax.xml.namespace.QName("", "horizontalCurveType");
    private static final javax.xml.namespace.QName VERTICALCURVETYPE$2 = 
        new javax.xml.namespace.QName("", "verticalCurveType");
    
    
    /**
     * Gets the "horizontalCurveType" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType.Enum getHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORIZONTALCURVETYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "horizontalCurveType" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType xgetHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_default_attribute_value(HORIZONTALCURVETYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "horizontalCurveType" attribute
     */
    public boolean isSetHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORIZONTALCURVETYPE$0) != null;
        }
    }
    
    /**
     * Sets the "horizontalCurveType" attribute
     */
    public void setHorizontalCurveType(net.opengis.gml.x32.CurveInterpolationType.Enum horizontalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALCURVETYPE$0);
            }
            target.setEnumValue(horizontalCurveType);
        }
    }
    
    /**
     * Sets (as xml) the "horizontalCurveType" attribute
     */
    public void xsetHorizontalCurveType(net.opengis.gml.x32.CurveInterpolationType horizontalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_store().add_attribute_user(HORIZONTALCURVETYPE$0);
            }
            target.set(horizontalCurveType);
        }
    }
    
    /**
     * Unsets the "horizontalCurveType" attribute
     */
    public void unsetHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORIZONTALCURVETYPE$0);
        }
    }
    
    /**
     * Gets the "verticalCurveType" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType.Enum getVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERTICALCURVETYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "verticalCurveType" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType xgetVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_default_attribute_value(VERTICALCURVETYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "verticalCurveType" attribute
     */
    public boolean isSetVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTICALCURVETYPE$2) != null;
        }
    }
    
    /**
     * Sets the "verticalCurveType" attribute
     */
    public void setVerticalCurveType(net.opengis.gml.x32.CurveInterpolationType.Enum verticalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALCURVETYPE$2);
            }
            target.setEnumValue(verticalCurveType);
        }
    }
    
    /**
     * Sets (as xml) the "verticalCurveType" attribute
     */
    public void xsetVerticalCurveType(net.opengis.gml.x32.CurveInterpolationType verticalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_store().add_attribute_user(VERTICALCURVETYPE$2);
            }
            target.set(verticalCurveType);
        }
    }
    
    /**
     * Unsets the "verticalCurveType" attribute
     */
    public void unsetVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTICALCURVETYPE$2);
        }
    }
}
