/*
 * XML Type:  ValueArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ValueArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ValueArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ValueArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public ValueArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractValue");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Category"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Boolean"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ValueArray"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Quantity"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Count"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BooleanList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractValue"),
    });
    private static final javax.xml.namespace.QName ABSTRACTGEOMETRY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGEOMETRY$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeometricComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Grid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSolid"),
    });
    private static final javax.xml.namespace.QName ABSTRACTTIMEOBJECT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeObject");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMEOBJECT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeInstant"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive"),
    });
    private static final javax.xml.namespace.QName NULL$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Null");
    private static final javax.xml.namespace.QName OWNS$8 = 
        new javax.xml.namespace.QName("", "owns");
    
    
    /**
     * Gets array of all "AbstractValue" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAbstractValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTVALUE$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractValue" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTVALUE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractValue" element
     */
    public int sizeOfAbstractValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTVALUE$1);
        }
    }
    
    /**
     * Sets array of all "AbstractValue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractValueArray(org.apache.xmlbeans.XmlObject[] abstractValueArray)
    {
        check_orphaned();
        arraySetterHelper(abstractValueArray, ABSTRACTVALUE$0, ABSTRACTVALUE$1);
    }
    
    /**
     * Sets ith "AbstractValue" element
     */
    public void setAbstractValueArray(int i, org.apache.xmlbeans.XmlObject abstractValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTVALUE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractValue" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAbstractValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ABSTRACTVALUE$1, ABSTRACTVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractValue" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractValue" element
     */
    public void removeAbstractValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTVALUE$1, i);
        }
    }
    
    /**
     * Gets array of all "AbstractGeometry" elements
     */
    public net.opengis.gml.x32.AbstractGeometryType[] getAbstractGeometryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTGEOMETRY$3, targetList);
            net.opengis.gml.x32.AbstractGeometryType[] result = new net.opengis.gml.x32.AbstractGeometryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractGeometry" element
     */
    public net.opengis.gml.x32.AbstractGeometryType getAbstractGeometryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTGEOMETRY$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractGeometry" element
     */
    public int sizeOfAbstractGeometryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTGEOMETRY$3);
        }
    }
    
    /**
     * Sets array of all "AbstractGeometry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractGeometryArray(net.opengis.gml.x32.AbstractGeometryType[] abstractGeometryArray)
    {
        check_orphaned();
        arraySetterHelper(abstractGeometryArray, ABSTRACTGEOMETRY$2, ABSTRACTGEOMETRY$3);
    }
    
    /**
     * Sets ith "AbstractGeometry" element
     */
    public void setAbstractGeometryArray(int i, net.opengis.gml.x32.AbstractGeometryType abstractGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTGEOMETRY$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractGeometry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractGeometry" element
     */
    public net.opengis.gml.x32.AbstractGeometryType insertNewAbstractGeometry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().insert_element_user(ABSTRACTGEOMETRY$3, ABSTRACTGEOMETRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractGeometry" element
     */
    public net.opengis.gml.x32.AbstractGeometryType addNewAbstractGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().add_element_user(ABSTRACTGEOMETRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractGeometry" element
     */
    public void removeAbstractGeometry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTGEOMETRY$3, i);
        }
    }
    
    /**
     * Gets array of all "AbstractTimeObject" elements
     */
    public net.opengis.gml.x32.AbstractTimeObjectType[] getAbstractTimeObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTTIMEOBJECT$5, targetList);
            net.opengis.gml.x32.AbstractTimeObjectType[] result = new net.opengis.gml.x32.AbstractTimeObjectType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractTimeObject" element
     */
    public net.opengis.gml.x32.AbstractTimeObjectType getAbstractTimeObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().find_element_user(ABSTRACTTIMEOBJECT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractTimeObject" element
     */
    public int sizeOfAbstractTimeObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTTIMEOBJECT$5);
        }
    }
    
    /**
     * Sets array of all "AbstractTimeObject" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractTimeObjectArray(net.opengis.gml.x32.AbstractTimeObjectType[] abstractTimeObjectArray)
    {
        check_orphaned();
        arraySetterHelper(abstractTimeObjectArray, ABSTRACTTIMEOBJECT$4, ABSTRACTTIMEOBJECT$5);
    }
    
    /**
     * Sets ith "AbstractTimeObject" element
     */
    public void setAbstractTimeObjectArray(int i, net.opengis.gml.x32.AbstractTimeObjectType abstractTimeObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().find_element_user(ABSTRACTTIMEOBJECT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractTimeObject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractTimeObject" element
     */
    public net.opengis.gml.x32.AbstractTimeObjectType insertNewAbstractTimeObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().insert_element_user(ABSTRACTTIMEOBJECT$5, ABSTRACTTIMEOBJECT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractTimeObject" element
     */
    public net.opengis.gml.x32.AbstractTimeObjectType addNewAbstractTimeObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeObjectType target = null;
            target = (net.opengis.gml.x32.AbstractTimeObjectType)get_store().add_element_user(ABSTRACTTIMEOBJECT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractTimeObject" element
     */
    public void removeAbstractTimeObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTTIMEOBJECT$5, i);
        }
    }
    
    /**
     * Gets array of all "Null" elements
     */
    public java.lang.Object[] getNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NULL$6, targetList);
            java.lang.Object[] result = new java.lang.Object[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getObjectValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Null" element
     */
    public java.lang.Object getNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Null" elements
     */
    public net.opengis.gml.x32.NilReasonType[] xgetNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NULL$6, targetList);
            net.opengis.gml.x32.NilReasonType[] result = new net.opengis.gml.x32.NilReasonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Null" element
     */
    public net.opengis.gml.x32.NilReasonType xgetNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_element_user(NULL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Null" element
     */
    public int sizeOfNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$6);
        }
    }
    
    /**
     * Sets array of all "Null" element
     */
    public void setNullArray(java.lang.Object[] xnullArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            unionArraySetterHelper(xnullArray, NULL$6);
        }
    }
    
    /**
     * Sets ith "Null" element
     */
    public void setNullArray(int i, java.lang.Object xnull)
    {
        generatedSetterHelperImpl(xnull, NULL$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Sets (as xml) array of all "Null" element
     */
    public void xsetNullArray(net.opengis.gml.x32.NilReasonType[]xnullArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xnullArray, NULL$6);
        }
    }
    
    /**
     * Sets (as xml) ith "Null" element
     */
    public void xsetNullArray(int i, net.opengis.gml.x32.NilReasonType xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_element_user(NULL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xnull);
        }
    }
    
    /**
     * Inserts the value as the ith "Null" element
     */
    public void insertNull(int i, java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NULL$6, i);
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Appends the value as the last "Null" element
     */
    public void addNull(java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NULL$6);
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Null" element
     */
    public net.opengis.gml.x32.NilReasonType insertNewNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().insert_element_user(NULL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Null" element
     */
    public net.opengis.gml.x32.NilReasonType addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().add_element_user(NULL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Null" element
     */
    public void removeNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$6, i);
        }
    }
    
    /**
     * Gets the "owns" attribute
     */
    public boolean getOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OWNS$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "owns" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OWNS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "owns" attribute
     */
    public boolean isSetOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OWNS$8) != null;
        }
    }
    
    /**
     * Sets the "owns" attribute
     */
    public void setOwns(boolean owns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNS$8);
            }
            target.setBooleanValue(owns);
        }
    }
    
    /**
     * Sets (as xml) the "owns" attribute
     */
    public void xsetOwns(org.apache.xmlbeans.XmlBoolean owns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OWNS$8);
            }
            target.set(owns);
        }
    }
    
    /**
     * Unsets the "owns" attribute
     */
    public void unsetOwns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OWNS$8);
        }
    }
}
