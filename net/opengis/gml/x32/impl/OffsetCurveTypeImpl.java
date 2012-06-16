/*
 * XML Type:  OffsetCurveType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OffsetCurveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML OffsetCurveType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class OffsetCurveTypeImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.x32.OffsetCurveType
{
    private static final long serialVersionUID = 1L;
    
    public OffsetCurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFSETBASE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "offsetBase");
    private static final javax.xml.namespace.QName DISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "distance");
    private static final javax.xml.namespace.QName REFDIRECTION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "refDirection");
    
    
    /**
     * Gets the "offsetBase" element
     */
    public net.opengis.gml.x32.CurvePropertyType getOffsetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(OFFSETBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "offsetBase" element
     */
    public void setOffsetBase(net.opengis.gml.x32.CurvePropertyType offsetBase)
    {
        generatedSetterHelperImpl(offsetBase, OFFSETBASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "offsetBase" element
     */
    public net.opengis.gml.x32.CurvePropertyType addNewOffsetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().add_element_user(OFFSETBASE$0);
            return target;
        }
    }
    
    /**
     * Gets the "distance" element
     */
    public net.opengis.gml.x32.LengthType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "distance" element
     */
    public void setDistance(net.opengis.gml.x32.LengthType distance)
    {
        generatedSetterHelperImpl(distance, DISTANCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "distance" element
     */
    public net.opengis.gml.x32.LengthType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(DISTANCE$2);
            return target;
        }
    }
    
    /**
     * Gets the "refDirection" element
     */
    public net.opengis.gml.x32.VectorType getRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(REFDIRECTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "refDirection" element
     */
    public boolean isSetRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFDIRECTION$4) != 0;
        }
    }
    
    /**
     * Sets the "refDirection" element
     */
    public void setRefDirection(net.opengis.gml.x32.VectorType refDirection)
    {
        generatedSetterHelperImpl(refDirection, REFDIRECTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "refDirection" element
     */
    public net.opengis.gml.x32.VectorType addNewRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().add_element_user(REFDIRECTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "refDirection" element
     */
    public void unsetRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFDIRECTION$4, 0);
        }
    }
}
