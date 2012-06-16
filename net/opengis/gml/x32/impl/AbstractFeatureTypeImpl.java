/*
 * XML Type:  AbstractFeatureType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractFeatureType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractFeatureType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractFeatureTypeImpl extends net.opengis.gml.x32.impl.AbstractGMLTypeImpl implements net.opengis.gml.x32.AbstractFeatureType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractFeatureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDEDBY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "boundedBy");
    private static final javax.xml.namespace.QName LOCATION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "location"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "priorityLocation"),
    });
    
    
    /**
     * Gets the "boundedBy" element
     */
    public net.opengis.gml.x32.BoundingShapeType getBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "boundedBy" element
     */
    public boolean isNilBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "boundedBy" element
     */
    public boolean isSetBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDEDBY$0) != 0;
        }
    }
    
    /**
     * Sets the "boundedBy" element
     */
    public void setBoundedBy(net.opengis.gml.x32.BoundingShapeType boundedBy)
    {
        generatedSetterHelperImpl(boundedBy, BOUNDEDBY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "boundedBy" element
     */
    public net.opengis.gml.x32.BoundingShapeType addNewBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().add_element_user(BOUNDEDBY$0);
            return target;
        }
    }
    
    /**
     * Nils the "boundedBy" element
     */
    public void setNilBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.BoundingShapeType)get_store().add_element_user(BOUNDEDBY$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "boundedBy" element
     */
    public void unsetBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDEDBY$0, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public net.opengis.gml.x32.LocationPropertyType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LocationPropertyType target = null;
            target = (net.opengis.gml.x32.LocationPropertyType)get_store().find_element_user(LOCATION$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$3) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(net.opengis.gml.x32.LocationPropertyType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LocationPropertyType target = null;
            target = (net.opengis.gml.x32.LocationPropertyType)get_store().find_element_user(LOCATION$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.LocationPropertyType)get_store().add_element_user(LOCATION$2);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public net.opengis.gml.x32.LocationPropertyType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LocationPropertyType target = null;
            target = (net.opengis.gml.x32.LocationPropertyType)get_store().add_element_user(LOCATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$3, 0);
        }
    }
}
