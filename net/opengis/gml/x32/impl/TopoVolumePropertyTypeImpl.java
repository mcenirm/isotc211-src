/*
 * XML Type:  TopoVolumePropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoVolumePropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoVolumePropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoVolumePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoVolumePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public TopoVolumePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOVOLUME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoVolume");
    private static final javax.xml.namespace.QName OWNS$2 = 
        new javax.xml.namespace.QName("", "owns");
    
    
    /**
     * Gets the "TopoVolume" element
     */
    public net.opengis.gml.x32.TopoVolumeType getTopoVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoVolumeType target = null;
            target = (net.opengis.gml.x32.TopoVolumeType)get_store().find_element_user(TOPOVOLUME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoVolume" element
     */
    public void setTopoVolume(net.opengis.gml.x32.TopoVolumeType topoVolume)
    {
        generatedSetterHelperImpl(topoVolume, TOPOVOLUME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoVolume" element
     */
    public net.opengis.gml.x32.TopoVolumeType addNewTopoVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoVolumeType target = null;
            target = (net.opengis.gml.x32.TopoVolumeType)get_store().add_element_user(TOPOVOLUME$0);
            return target;
        }
    }
    
    /**
     * Gets the "owns" attribute
     */
    public boolean getOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OWNS$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "owns" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OWNS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "owns" attribute
     */
    public boolean isSetOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OWNS$2) != null;
        }
    }
    
    /**
     * Sets the "owns" attribute
     */
    public void setOwns(boolean owns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNS$2);
            }
            target.setBooleanValue(owns);
        }
    }
    
    /**
     * Sets (as xml) the "owns" attribute
     */
    public void xsetOwns(org.apache.xmlbeans.XmlBoolean owns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OWNS$2);
            }
            target.set(owns);
        }
    }
    
    /**
     * Unsets the "owns" attribute
     */
    public void unsetOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OWNS$2);
        }
    }
}
