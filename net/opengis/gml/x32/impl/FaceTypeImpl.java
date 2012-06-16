/*
 * XML Type:  FaceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML FaceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class FaceTypeImpl extends net.opengis.gml.x32.impl.AbstractTopoPrimitiveTypeImpl implements net.opengis.gml.x32.FaceType
{
    private static final long serialVersionUID = 1L;
    
    public FaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISOLATED$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "isolated");
    private static final javax.xml.namespace.QName DIRECTEDEDGE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedEdge");
    private static final javax.xml.namespace.QName DIRECTEDTOPOSOLID$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedTopoSolid");
    private static final javax.xml.namespace.QName SURFACEPROPERTY$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceProperty");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$8 = 
        new javax.xml.namespace.QName("", "aggregationType");
    private static final javax.xml.namespace.QName UNIVERSAL$10 = 
        new javax.xml.namespace.QName("", "universal");
    
    
    /**
     * Gets array of all "isolated" elements
     */
    public net.opengis.gml.x32.NodePropertyType[] getIsolatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ISOLATED$0, targetList);
            net.opengis.gml.x32.NodePropertyType[] result = new net.opengis.gml.x32.NodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "isolated" element
     */
    public net.opengis.gml.x32.NodePropertyType getIsolatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodePropertyType target = null;
            target = (net.opengis.gml.x32.NodePropertyType)get_store().find_element_user(ISOLATED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "isolated" element
     */
    public int sizeOfIsolatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISOLATED$0);
        }
    }
    
    /**
     * Sets array of all "isolated" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIsolatedArray(net.opengis.gml.x32.NodePropertyType[] isolatedArray)
    {
        check_orphaned();
        arraySetterHelper(isolatedArray, ISOLATED$0);
    }
    
    /**
     * Sets ith "isolated" element
     */
    public void setIsolatedArray(int i, net.opengis.gml.x32.NodePropertyType isolated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodePropertyType target = null;
            target = (net.opengis.gml.x32.NodePropertyType)get_store().find_element_user(ISOLATED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(isolated);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isolated" element
     */
    public net.opengis.gml.x32.NodePropertyType insertNewIsolated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodePropertyType target = null;
            target = (net.opengis.gml.x32.NodePropertyType)get_store().insert_element_user(ISOLATED$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isolated" element
     */
    public net.opengis.gml.x32.NodePropertyType addNewIsolated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodePropertyType target = null;
            target = (net.opengis.gml.x32.NodePropertyType)get_store().add_element_user(ISOLATED$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "isolated" element
     */
    public void removeIsolated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISOLATED$0, i);
        }
    }
    
    /**
     * Gets array of all "directedEdge" elements
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType[] getDirectedEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDEDGE$2, targetList);
            net.opengis.gml.x32.DirectedEdgePropertyType[] result = new net.opengis.gml.x32.DirectedEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType getDirectedEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().find_element_user(DIRECTEDEDGE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedEdge" element
     */
    public int sizeOfDirectedEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDEDGE$2);
        }
    }
    
    /**
     * Sets array of all "directedEdge" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedEdgeArray(net.opengis.gml.x32.DirectedEdgePropertyType[] directedEdgeArray)
    {
        check_orphaned();
        arraySetterHelper(directedEdgeArray, DIRECTEDEDGE$2);
    }
    
    /**
     * Sets ith "directedEdge" element
     */
    public void setDirectedEdgeArray(int i, net.opengis.gml.x32.DirectedEdgePropertyType directedEdge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().find_element_user(DIRECTEDEDGE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(directedEdge);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType insertNewDirectedEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().insert_element_user(DIRECTEDEDGE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType addNewDirectedEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().add_element_user(DIRECTEDEDGE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedEdge" element
     */
    public void removeDirectedEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDEDGE$2, i);
        }
    }
    
    /**
     * Gets array of all "directedTopoSolid" elements
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType[] getDirectedTopoSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDTOPOSOLID$4, targetList);
            net.opengis.gml.x32.DirectedTopoSolidPropertyType[] result = new net.opengis.gml.x32.DirectedTopoSolidPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType getDirectedTopoSolidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedTopoSolid" element
     */
    public int sizeOfDirectedTopoSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDTOPOSOLID$4);
        }
    }
    
    /**
     * Sets array of all "directedTopoSolid" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedTopoSolidArray(net.opengis.gml.x32.DirectedTopoSolidPropertyType[] directedTopoSolidArray)
    {
        check_orphaned();
        arraySetterHelper(directedTopoSolidArray, DIRECTEDTOPOSOLID$4);
    }
    
    /**
     * Sets ith "directedTopoSolid" element
     */
    public void setDirectedTopoSolidArray(int i, net.opengis.gml.x32.DirectedTopoSolidPropertyType directedTopoSolid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(directedTopoSolid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType insertNewDirectedTopoSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().insert_element_user(DIRECTEDTOPOSOLID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType addNewDirectedTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().add_element_user(DIRECTEDTOPOSOLID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedTopoSolid" element
     */
    public void removeDirectedTopoSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDTOPOSOLID$4, i);
        }
    }
    
    /**
     * Gets the "surfaceProperty" element
     */
    public net.opengis.gml.x32.SurfacePropertyType getSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(SURFACEPROPERTY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "surfaceProperty" element
     */
    public boolean isSetSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEPROPERTY$6) != 0;
        }
    }
    
    /**
     * Sets the "surfaceProperty" element
     */
    public void setSurfaceProperty(net.opengis.gml.x32.SurfacePropertyType surfaceProperty)
    {
        generatedSetterHelperImpl(surfaceProperty, SURFACEPROPERTY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceProperty" element
     */
    public net.opengis.gml.x32.SurfacePropertyType addNewSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().add_element_user(SURFACEPROPERTY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "surfaceProperty" element
     */
    public void unsetSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEPROPERTY$6, 0);
        }
    }
    
    /**
     * Gets the "aggregationType" attribute
     */
    public net.opengis.gml.x32.AggregationType.Enum getAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$8);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$8);
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
            return get_store().find_attribute_user(AGGREGATIONTYPE$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATIONTYPE$8);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$8);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AggregationType)get_store().add_attribute_user(AGGREGATIONTYPE$8);
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
            get_store().remove_attribute(AGGREGATIONTYPE$8);
        }
    }
    
    /**
     * Gets the "universal" attribute
     */
    public boolean getUniversal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIVERSAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIVERSAL$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "universal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUniversal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIVERSAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UNIVERSAL$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "universal" attribute
     */
    public boolean isSetUniversal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIVERSAL$10) != null;
        }
    }
    
    /**
     * Sets the "universal" attribute
     */
    public void setUniversal(boolean universal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIVERSAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIVERSAL$10);
            }
            target.setBooleanValue(universal);
        }
    }
    
    /**
     * Sets (as xml) the "universal" attribute
     */
    public void xsetUniversal(org.apache.xmlbeans.XmlBoolean universal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIVERSAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNIVERSAL$10);
            }
            target.set(universal);
        }
    }
    
    /**
     * Unsets the "universal" attribute
     */
    public void unsetUniversal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIVERSAL$10);
        }
    }
}
