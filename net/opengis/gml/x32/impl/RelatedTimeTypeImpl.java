/*
 * XML Type:  RelatedTimeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RelatedTimeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML RelatedTimeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class RelatedTimeTypeImpl extends net.opengis.gml.x32.impl.TimePrimitivePropertyTypeImpl implements net.opengis.gml.x32.RelatedTimeType
{
    private static final long serialVersionUID = 1L;
    
    public RelatedTimeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIVEPOSITION$0 = 
        new javax.xml.namespace.QName("", "relativePosition");
    
    
    /**
     * Gets the "relativePosition" attribute
     */
    public net.opengis.gml.x32.RelatedTimeType.RelativePosition.Enum getRelativePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEPOSITION$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.RelatedTimeType.RelativePosition.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "relativePosition" attribute
     */
    public net.opengis.gml.x32.RelatedTimeType.RelativePosition xgetRelativePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RelatedTimeType.RelativePosition target = null;
            target = (net.opengis.gml.x32.RelatedTimeType.RelativePosition)get_store().find_attribute_user(RELATIVEPOSITION$0);
            return target;
        }
    }
    
    /**
     * True if has "relativePosition" attribute
     */
    public boolean isSetRelativePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATIVEPOSITION$0) != null;
        }
    }
    
    /**
     * Sets the "relativePosition" attribute
     */
    public void setRelativePosition(net.opengis.gml.x32.RelatedTimeType.RelativePosition.Enum relativePosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEPOSITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIVEPOSITION$0);
            }
            target.setEnumValue(relativePosition);
        }
    }
    
    /**
     * Sets (as xml) the "relativePosition" attribute
     */
    public void xsetRelativePosition(net.opengis.gml.x32.RelatedTimeType.RelativePosition relativePosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RelatedTimeType.RelativePosition target = null;
            target = (net.opengis.gml.x32.RelatedTimeType.RelativePosition)get_store().find_attribute_user(RELATIVEPOSITION$0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.RelatedTimeType.RelativePosition)get_store().add_attribute_user(RELATIVEPOSITION$0);
            }
            target.set(relativePosition);
        }
    }
    
    /**
     * Unsets the "relativePosition" attribute
     */
    public void unsetRelativePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATIVEPOSITION$0);
        }
    }
    /**
     * An XML relativePosition(@).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.RelatedTimeType$RelativePosition.
     */
    public static class RelativePositionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.x32.RelatedTimeType.RelativePosition
    {
        private static final long serialVersionUID = 1L;
        
        public RelativePositionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RelativePositionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
