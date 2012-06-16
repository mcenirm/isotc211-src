/*
 * XML Type:  TopoSolidType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoSolidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoSolidType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoSolidTypeImpl extends net.opengis.gml.x32.impl.AbstractTopoPrimitiveTypeImpl implements net.opengis.gml.x32.TopoSolidType
{
    private static final long serialVersionUID = 1L;
    
    public TopoSolidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISOLATED$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "isolated");
    private static final javax.xml.namespace.QName DIRECTEDFACE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedFace");
    private static final javax.xml.namespace.QName SOLIDPROPERTY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "solidProperty");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$6 = 
        new javax.xml.namespace.QName("", "aggregationType");
    private static final javax.xml.namespace.QName UNIVERSAL$8 = 
        new javax.xml.namespace.QName("", "universal");
    
    
    /**
     * Gets array of all "isolated" elements
     */
    public net.opengis.gml.x32.NodeOrEdgePropertyType[] getIsolatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ISOLATED$0, targetList);
            net.opengis.gml.x32.NodeOrEdgePropertyType[] result = new net.opengis.gml.x32.NodeOrEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "isolated" element
     */
    public net.opengis.gml.x32.NodeOrEdgePropertyType getIsolatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodeOrEdgePropertyType target = null;
            target = (net.opengis.gml.x32.NodeOrEdgePropertyType)get_store().find_element_user(ISOLATED$0, i);
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
    public void setIsolatedArray(net.opengis.gml.x32.NodeOrEdgePropertyType[] isolatedArray)
    {
        check_orphaned();
        arraySetterHelper(isolatedArray, ISOLATED$0);
    }
    
    /**
     * Sets ith "isolated" element
     */
    public void setIsolatedArray(int i, net.opengis.gml.x32.NodeOrEdgePropertyType isolated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodeOrEdgePropertyType target = null;
            target = (net.opengis.gml.x32.NodeOrEdgePropertyType)get_store().find_element_user(ISOLATED$0, i);
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
    public net.opengis.gml.x32.NodeOrEdgePropertyType insertNewIsolated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodeOrEdgePropertyType target = null;
            target = (net.opengis.gml.x32.NodeOrEdgePropertyType)get_store().insert_element_user(ISOLATED$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isolated" element
     */
    public net.opengis.gml.x32.NodeOrEdgePropertyType addNewIsolated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NodeOrEdgePropertyType target = null;
            target = (net.opengis.gml.x32.NodeOrEdgePropertyType)get_store().add_element_user(ISOLATED$0);
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
     * Gets array of all "directedFace" elements
     */
    public net.opengis.gml.x32.DirectedFacePropertyType[] getDirectedFaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDFACE$2, targetList);
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
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$2, i);
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
            return get_store().count_elements(DIRECTEDFACE$2);
        }
    }
    
    /**
     * Sets array of all "directedFace" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedFaceArray(net.opengis.gml.x32.DirectedFacePropertyType[] directedFaceArray)
    {
        check_orphaned();
        arraySetterHelper(directedFaceArray, DIRECTEDFACE$2);
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
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$2, i);
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
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().insert_element_user(DIRECTEDFACE$2, i);
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
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().add_element_user(DIRECTEDFACE$2);
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
            get_store().remove_element(DIRECTEDFACE$2, i);
        }
    }
    
    /**
     * Gets the "solidProperty" element
     */
    public net.opengis.gml.x32.SolidPropertyType getSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().find_element_user(SOLIDPROPERTY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "solidProperty" element
     */
    public boolean isSetSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLIDPROPERTY$4) != 0;
        }
    }
    
    /**
     * Sets the "solidProperty" element
     */
    public void setSolidProperty(net.opengis.gml.x32.SolidPropertyType solidProperty)
    {
        generatedSetterHelperImpl(solidProperty, SOLIDPROPERTY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidProperty" element
     */
    public net.opengis.gml.x32.SolidPropertyType addNewSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().add_element_user(SOLIDPROPERTY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "solidProperty" element
     */
    public void unsetSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLIDPROPERTY$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$6);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$6);
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
            return get_store().find_attribute_user(AGGREGATIONTYPE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATIONTYPE$6);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$6);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AggregationType)get_store().add_attribute_user(AGGREGATIONTYPE$6);
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
            get_store().remove_attribute(AGGREGATIONTYPE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIVERSAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIVERSAL$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIVERSAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UNIVERSAL$8);
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
            return get_store().find_attribute_user(UNIVERSAL$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIVERSAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIVERSAL$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIVERSAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNIVERSAL$8);
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
            get_store().remove_attribute(UNIVERSAL$8);
        }
    }
}
