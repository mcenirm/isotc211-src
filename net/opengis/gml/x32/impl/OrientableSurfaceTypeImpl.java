/*
 * XML Type:  OrientableSurfaceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OrientableSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML OrientableSurfaceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class OrientableSurfaceTypeImpl extends net.opengis.gml.x32.impl.AbstractSurfaceTypeImpl implements net.opengis.gml.x32.OrientableSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public OrientableSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseSurface");
    private static final javax.xml.namespace.QName ORIENTATION$2 = 
        new javax.xml.namespace.QName("", "orientation");
    
    
    /**
     * Gets the "baseSurface" element
     */
    public net.opengis.gml.x32.SurfacePropertyType getBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(BASESURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseSurface" element
     */
    public void setBaseSurface(net.opengis.gml.x32.SurfacePropertyType baseSurface)
    {
        generatedSetterHelperImpl(baseSurface, BASESURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseSurface" element
     */
    public net.opengis.gml.x32.SurfacePropertyType addNewBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().add_element_user(BASESURFACE$0);
            return target;
        }
    }
    
    /**
     * Gets the "orientation" attribute
     */
    public net.opengis.gml.x32.SignType.Enum getOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORIENTATION$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.SignType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "orientation" attribute
     */
    public net.opengis.gml.x32.SignType xgetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SignType target = null;
            target = (net.opengis.gml.x32.SignType)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SignType)get_default_attribute_value(ORIENTATION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "orientation" attribute
     */
    public boolean isSetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIENTATION$2) != null;
        }
    }
    
    /**
     * Sets the "orientation" attribute
     */
    public void setOrientation(net.opengis.gml.x32.SignType.Enum orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$2);
            }
            target.setEnumValue(orientation);
        }
    }
    
    /**
     * Sets (as xml) the "orientation" attribute
     */
    public void xsetOrientation(net.opengis.gml.x32.SignType orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SignType target = null;
            target = (net.opengis.gml.x32.SignType)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SignType)get_store().add_attribute_user(ORIENTATION$2);
            }
            target.set(orientation);
        }
    }
    
    /**
     * Unsets the "orientation" attribute
     */
    public void unsetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIENTATION$2);
        }
    }
}
