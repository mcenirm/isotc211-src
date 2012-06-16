/*
 * XML Type:  AbstractParametricCurveSurfaceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractParametricCurveSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractParametricCurveSurfaceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractParametricCurveSurfaceTypeImpl extends net.opengis.gml.x32.impl.AbstractSurfacePatchTypeImpl implements net.opengis.gml.x32.AbstractParametricCurveSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractParametricCurveSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$0 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets the "aggregationType" attribute
     */
    public net.opengis.gml.x32.AggregationType.Enum getAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.AggregationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "aggregationType" attribute
     */
    public net.opengis.gml.x32.AggregationType xgetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AggregationType target = null;
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "aggregationType" attribute
     */
    public boolean isSetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGGREGATIONTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "aggregationType" attribute
     */
    public void setAggregationType(net.opengis.gml.x32.AggregationType.Enum aggregationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATIONTYPE$0);
            }
            target.setEnumValue(aggregationType);
        }
    }
    
    /**
     * Sets (as xml) the "aggregationType" attribute
     */
    public void xsetAggregationType(net.opengis.gml.x32.AggregationType aggregationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AggregationType target = null;
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AggregationType)get_store().add_attribute_user(AGGREGATIONTYPE$0);
            }
            target.set(aggregationType);
        }
    }
    
    /**
     * Unsets the "aggregationType" attribute
     */
    public void unsetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGGREGATIONTYPE$0);
        }
    }
}
