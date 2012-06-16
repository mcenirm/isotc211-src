/*
 * XML Type:  RectifiedGridType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RectifiedGridType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML RectifiedGridType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class RectifiedGridTypeImpl extends net.opengis.gml.x32.impl.GridTypeImpl implements net.opengis.gml.x32.RectifiedGridType
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "origin");
    private static final javax.xml.namespace.QName OFFSETVECTOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "offsetVector");
    
    
    /**
     * Gets the "origin" element
     */
    public net.opengis.gml.x32.PointPropertyType getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(net.opengis.gml.x32.PointPropertyType origin)
    {
        generatedSetterHelperImpl(origin, ORIGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(ORIGIN$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "offsetVector" elements
     */
    public net.opengis.gml.x32.VectorType[] getOffsetVectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFSETVECTOR$2, targetList);
            net.opengis.gml.x32.VectorType[] result = new net.opengis.gml.x32.VectorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "offsetVector" element
     */
    public net.opengis.gml.x32.VectorType getOffsetVectorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(OFFSETVECTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "offsetVector" element
     */
    public int sizeOfOffsetVectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFSETVECTOR$2);
        }
    }
    
    /**
     * Sets array of all "offsetVector" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOffsetVectorArray(net.opengis.gml.x32.VectorType[] offsetVectorArray)
    {
        check_orphaned();
        arraySetterHelper(offsetVectorArray, OFFSETVECTOR$2);
    }
    
    /**
     * Sets ith "offsetVector" element
     */
    public void setOffsetVectorArray(int i, net.opengis.gml.x32.VectorType offsetVector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(OFFSETVECTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offsetVector);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "offsetVector" element
     */
    public net.opengis.gml.x32.VectorType insertNewOffsetVector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().insert_element_user(OFFSETVECTOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "offsetVector" element
     */
    public net.opengis.gml.x32.VectorType addNewOffsetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().add_element_user(OFFSETVECTOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "offsetVector" element
     */
    public void removeOffsetVector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFSETVECTOR$2, i);
        }
    }
}
