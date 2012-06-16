/*
 * XML Type:  EdgeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EdgeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML EdgeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class EdgeTypeImpl extends net.opengis.gml.x32.impl.AbstractTopoPrimitiveTypeImpl implements net.opengis.gml.x32.EdgeType
{
    private static final long serialVersionUID = 1L;
    
    public EdgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "container");
    private static final javax.xml.namespace.QName DIRECTEDNODE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedNode");
    private static final javax.xml.namespace.QName DIRECTEDFACE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedFace");
    private static final javax.xml.namespace.QName CURVEPROPERTY$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveProperty");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$8 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets the "container" element
     */
    public net.opengis.gml.x32.TopoSolidPropertyType getContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.TopoSolidPropertyType)get_store().find_element_user(CONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "container" element
     */
    public boolean isSetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINER$0) != 0;
        }
    }
    
    /**
     * Sets the "container" element
     */
    public void setContainer(net.opengis.gml.x32.TopoSolidPropertyType container)
    {
        generatedSetterHelperImpl(container, CONTAINER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "container" element
     */
    public net.opengis.gml.x32.TopoSolidPropertyType addNewContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.TopoSolidPropertyType)get_store().add_element_user(CONTAINER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "container" element
     */
    public void unsetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINER$0, 0);
        }
    }
    
    /**
     * Gets array of all "directedNode" elements
     */
    public net.opengis.gml.x32.DirectedNodePropertyType[] getDirectedNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDNODE$2, targetList);
            net.opengis.gml.x32.DirectedNodePropertyType[] result = new net.opengis.gml.x32.DirectedNodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedNode" element
     */
    public net.opengis.gml.x32.DirectedNodePropertyType getDirectedNodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedNodePropertyType)get_store().find_element_user(DIRECTEDNODE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedNode" element
     */
    public int sizeOfDirectedNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDNODE$2);
        }
    }
    
    /**
     * Sets array of all "directedNode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedNodeArray(net.opengis.gml.x32.DirectedNodePropertyType[] directedNodeArray)
    {
        check_orphaned();
        arraySetterHelper(directedNodeArray, DIRECTEDNODE$2);
    }
    
    /**
     * Sets ith "directedNode" element
     */
    public void setDirectedNodeArray(int i, net.opengis.gml.x32.DirectedNodePropertyType directedNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedNodePropertyType)get_store().find_element_user(DIRECTEDNODE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(directedNode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedNode" element
     */
    public net.opengis.gml.x32.DirectedNodePropertyType insertNewDirectedNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedNodePropertyType)get_store().insert_element_user(DIRECTEDNODE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedNode" element
     */
    public net.opengis.gml.x32.DirectedNodePropertyType addNewDirectedNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedNodePropertyType)get_store().add_element_user(DIRECTEDNODE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedNode" element
     */
    public void removeDirectedNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDNODE$2, i);
        }
    }
    
    /**
     * Gets array of all "directedFace" elements
     */
    public net.opengis.gml.x32.DirectedFacePropertyType[] getDirectedFaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDFACE$4, targetList);
            net.opengis.gml.x32.DirectedFacePropertyType[] result = new net.opengis.gml.x32.DirectedFacePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType getDirectedFaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedFace" element
     */
    public int sizeOfDirectedFaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDFACE$4);
        }
    }
    
    /**
     * Sets array of all "directedFace" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedFaceArray(net.opengis.gml.x32.DirectedFacePropertyType[] directedFaceArray)
    {
        check_orphaned();
        arraySetterHelper(directedFaceArray, DIRECTEDFACE$4);
    }
    
    /**
     * Sets ith "directedFace" element
     */
    public void setDirectedFaceArray(int i, net.opengis.gml.x32.DirectedFacePropertyType directedFace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(directedFace);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType insertNewDirectedFace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().insert_element_user(DIRECTEDFACE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType addNewDirectedFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().add_element_user(DIRECTEDFACE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedFace" element
     */
    public void removeDirectedFace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDFACE$4, i);
        }
    }
    
    /**
     * Gets the "curveProperty" element
     */
    public net.opengis.gml.x32.CurvePropertyType getCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(CURVEPROPERTY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "curveProperty" element
     */
    public boolean isSetCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVEPROPERTY$6) != 0;
        }
    }
    
    /**
     * Sets the "curveProperty" element
     */
    public void setCurveProperty(net.opengis.gml.x32.CurvePropertyType curveProperty)
    {
        generatedSetterHelperImpl(curveProperty, CURVEPROPERTY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveProperty" element
     */
    public net.opengis.gml.x32.CurvePropertyType addNewCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().add_element_user(CURVEPROPERTY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "curveProperty" element
     */
    public void unsetCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVEPROPERTY$6, 0);
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
}
