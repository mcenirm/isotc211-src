/*
 * XML Type:  PolygonPatchType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolygonPatchType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML PolygonPatchType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class PolygonPatchTypeImpl extends net.opengis.gml.x32.impl.AbstractSurfacePatchTypeImpl implements net.opengis.gml.x32.PolygonPatchType
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPatchTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "exterior");
    private static final javax.xml.namespace.QName INTERIOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "interior");
    private static final javax.xml.namespace.QName INTERPOLATION$4 = 
        new javax.xml.namespace.QName("", "interpolation");
    
    
    /**
     * Gets the "exterior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType getExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exterior" element
     */
    public boolean isSetExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERIOR$0) != 0;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
    public void setExterior(net.opengis.gml.x32.AbstractRingPropertyType exterior)
    {
        generatedSetterHelperImpl(exterior, EXTERIOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exterior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType addNewExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "exterior" element
     */
    public void unsetExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERIOR$0, 0);
        }
    }
    
    /**
     * Gets array of all "interior" elements
     */
    public net.opengis.gml.x32.AbstractRingPropertyType[] getInteriorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERIOR$2, targetList);
            net.opengis.gml.x32.AbstractRingPropertyType[] result = new net.opengis.gml.x32.AbstractRingPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType getInteriorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interior" element
     */
    public int sizeOfInteriorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERIOR$2);
        }
    }
    
    /**
     * Sets array of all "interior" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInteriorArray(net.opengis.gml.x32.AbstractRingPropertyType[] interiorArray)
    {
        check_orphaned();
        arraySetterHelper(interiorArray, INTERIOR$2);
    }
    
    /**
     * Sets ith "interior" element
     */
    public void setInteriorArray(int i, net.opengis.gml.x32.AbstractRingPropertyType interior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interior);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType insertNewInterior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().insert_element_user(INTERIOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType addNewInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "interior" element
     */
    public void removeInterior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERIOR$2, i);
        }
    }
    
    /**
     * Gets the "interpolation" attribute
     */
    public net.opengis.gml.x32.SurfaceInterpolationType.Enum getInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$4);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.SurfaceInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    public net.opengis.gml.x32.SurfaceInterpolationType xgetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceInterpolationType target = null;
            target = (net.opengis.gml.x32.SurfaceInterpolationType)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SurfaceInterpolationType)get_default_attribute_value(INTERPOLATION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "interpolation" attribute
     */
    public boolean isSetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERPOLATION$4) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
    public void setInterpolation(net.opengis.gml.x32.SurfaceInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$4);
            }
            target.setEnumValue(interpolation);
        }
    }
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    public void xsetInterpolation(net.opengis.gml.x32.SurfaceInterpolationType interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceInterpolationType target = null;
            target = (net.opengis.gml.x32.SurfaceInterpolationType)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SurfaceInterpolationType)get_store().add_attribute_user(INTERPOLATION$4);
            }
            target.set(interpolation);
        }
    }
    
    /**
     * Unsets the "interpolation" attribute
     */
    public void unsetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERPOLATION$4);
        }
    }
}
