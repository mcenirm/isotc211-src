/*
 * XML Type:  DegreesType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DegreesType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DegreesType(@http://www.opengis.net/gml/3.2).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.x32.DegreesType.
 */
public class DegreesTypeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements net.opengis.gml.x32.DegreesType
{
    private static final long serialVersionUID = 1L;
    
    public DegreesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected DegreesTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName DIRECTION$0 = 
        new javax.xml.namespace.QName("", "direction");
    
    
    /**
     * Gets the "direction" attribute
     */
    public net.opengis.gml.x32.DegreesType.Direction.Enum getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.DegreesType.Direction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "direction" attribute
     */
    public net.opengis.gml.x32.DegreesType.Direction xgetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DegreesType.Direction target = null;
            target = (net.opengis.gml.x32.DegreesType.Direction)get_store().find_attribute_user(DIRECTION$0);
            return target;
        }
    }
    
    /**
     * True if has "direction" attribute
     */
    public boolean isSetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTION$0) != null;
        }
    }
    
    /**
     * Sets the "direction" attribute
     */
    public void setDirection(net.opengis.gml.x32.DegreesType.Direction.Enum direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTION$0);
            }
            target.setEnumValue(direction);
        }
    }
    
    /**
     * Sets (as xml) the "direction" attribute
     */
    public void xsetDirection(net.opengis.gml.x32.DegreesType.Direction direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DegreesType.Direction target = null;
            target = (net.opengis.gml.x32.DegreesType.Direction)get_store().find_attribute_user(DIRECTION$0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DegreesType.Direction)get_store().add_attribute_user(DIRECTION$0);
            }
            target.set(direction);
        }
    }
    
    /**
     * Unsets the "direction" attribute
     */
    public void unsetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTION$0);
        }
    }
    /**
     * An XML direction(@).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.DegreesType$Direction.
     */
    public static class DirectionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.x32.DegreesType.Direction
    {
        private static final long serialVersionUID = 1L;
        
        public DirectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DirectionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
