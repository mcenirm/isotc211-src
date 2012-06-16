/*
 * XML Type:  BSplineType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BSplineType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML BSplineType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class BSplineTypeImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.x32.BSplineType
{
    private static final long serialVersionUID = 1L;
    
    public BSplineTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    private static final javax.xml.namespace.QName POINTPROPERTY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointProperty");
    private static final javax.xml.namespace.QName POINTREP$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointRep");
    private static final javax.xml.namespace.QName POSLIST$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "posList");
    private static final javax.xml.namespace.QName COORDINATES$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinates");
    private static final javax.xml.namespace.QName DEGREE$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "degree");
    private static final javax.xml.namespace.QName KNOT$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "knot");
    private static final javax.xml.namespace.QName INTERPOLATION$14 = 
        new javax.xml.namespace.QName("", "interpolation");
    private static final javax.xml.namespace.QName ISPOLYNOMIAL$16 = 
        new javax.xml.namespace.QName("", "isPolynomial");
    private static final javax.xml.namespace.QName KNOTTYPE$18 = 
        new javax.xml.namespace.QName("", "knotType");
    
    
    /**
     * Gets array of all "pos" elements
     */
    public net.opengis.gml.x32.DirectPositionType[] getPosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POS$0, targetList);
            net.opengis.gml.x32.DirectPositionType[] result = new net.opengis.gml.x32.DirectPositionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType getPosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pos" element
     */
    public int sizeOfPosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POS$0);
        }
    }
    
    /**
     * Sets array of all "pos" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPosArray(net.opengis.gml.x32.DirectPositionType[] posArray)
    {
        check_orphaned();
        arraySetterHelper(posArray, POS$0);
    }
    
    /**
     * Sets ith "pos" element
     */
    public void setPosArray(int i, net.opengis.gml.x32.DirectPositionType pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pos);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType insertNewPos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().insert_element_user(POS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(POS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pos" element
     */
    public void removePos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POS$0, i);
        }
    }
    
    /**
     * Gets array of all "pointProperty" elements
     */
    public net.opengis.gml.x32.PointPropertyType[] getPointPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POINTPROPERTY$2, targetList);
            net.opengis.gml.x32.PointPropertyType[] result = new net.opengis.gml.x32.PointPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pointProperty" element
     */
    public net.opengis.gml.x32.PointPropertyType getPointPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pointProperty" element
     */
    public int sizeOfPointPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTPROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "pointProperty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPointPropertyArray(net.opengis.gml.x32.PointPropertyType[] pointPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(pointPropertyArray, POINTPROPERTY$2);
    }
    
    /**
     * Sets ith "pointProperty" element
     */
    public void setPointPropertyArray(int i, net.opengis.gml.x32.PointPropertyType pointProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pointProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointProperty" element
     */
    public net.opengis.gml.x32.PointPropertyType insertNewPointProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().insert_element_user(POINTPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointProperty" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(POINTPROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "pointProperty" element
     */
    public void removePointProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTPROPERTY$2, i);
        }
    }
    
    /**
     * Gets array of all "pointRep" elements
     */
    public net.opengis.gml.x32.PointPropertyType[] getPointRepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POINTREP$4, targetList);
            net.opengis.gml.x32.PointPropertyType[] result = new net.opengis.gml.x32.PointPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pointRep" element
     */
    public net.opengis.gml.x32.PointPropertyType getPointRepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTREP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pointRep" element
     */
    public int sizeOfPointRepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTREP$4);
        }
    }
    
    /**
     * Sets array of all "pointRep" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPointRepArray(net.opengis.gml.x32.PointPropertyType[] pointRepArray)
    {
        check_orphaned();
        arraySetterHelper(pointRepArray, POINTREP$4);
    }
    
    /**
     * Sets ith "pointRep" element
     */
    public void setPointRepArray(int i, net.opengis.gml.x32.PointPropertyType pointRep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTREP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pointRep);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointRep" element
     */
    public net.opengis.gml.x32.PointPropertyType insertNewPointRep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().insert_element_user(POINTREP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointRep" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewPointRep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(POINTREP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "pointRep" element
     */
    public void removePointRep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTREP$4, i);
        }
    }
    
    /**
     * Gets the "posList" element
     */
    public net.opengis.gml.x32.DirectPositionListType getPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionListType target = null;
            target = (net.opengis.gml.x32.DirectPositionListType)get_store().find_element_user(POSLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "posList" element
     */
    public boolean isSetPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "posList" element
     */
    public void setPosList(net.opengis.gml.x32.DirectPositionListType posList)
    {
        generatedSetterHelperImpl(posList, POSLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "posList" element
     */
    public net.opengis.gml.x32.DirectPositionListType addNewPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionListType target = null;
            target = (net.opengis.gml.x32.DirectPositionListType)get_store().add_element_user(POSLIST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "posList" element
     */
    public void unsetPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSLIST$6, 0);
        }
    }
    
    /**
     * Gets the "coordinates" element
     */
    public net.opengis.gml.x32.CoordinatesType getCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().find_element_user(COORDINATES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "coordinates" element
     */
    public boolean isSetCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATES$8) != 0;
        }
    }
    
    /**
     * Sets the "coordinates" element
     */
    public void setCoordinates(net.opengis.gml.x32.CoordinatesType coordinates)
    {
        generatedSetterHelperImpl(coordinates, COORDINATES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinates" element
     */
    public net.opengis.gml.x32.CoordinatesType addNewCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().add_element_user(COORDINATES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "coordinates" element
     */
    public void unsetCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATES$8, 0);
        }
    }
    
    /**
     * Gets the "degree" element
     */
    public java.math.BigInteger getDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "degree" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(DEGREE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "degree" element
     */
    public void setDegree(java.math.BigInteger degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEGREE$10);
            }
            target.setBigIntegerValue(degree);
        }
    }
    
    /**
     * Sets (as xml) the "degree" element
     */
    public void xsetDegree(org.apache.xmlbeans.XmlNonNegativeInteger degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(DEGREE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(DEGREE$10);
            }
            target.set(degree);
        }
    }
    
    /**
     * Gets array of all "knot" elements
     */
    public net.opengis.gml.x32.KnotPropertyType[] getKnotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KNOT$12, targetList);
            net.opengis.gml.x32.KnotPropertyType[] result = new net.opengis.gml.x32.KnotPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "knot" element
     */
    public net.opengis.gml.x32.KnotPropertyType getKnotArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.KnotPropertyType target = null;
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().find_element_user(KNOT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "knot" element
     */
    public int sizeOfKnotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KNOT$12);
        }
    }
    
    /**
     * Sets array of all "knot" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKnotArray(net.opengis.gml.x32.KnotPropertyType[] knotArray)
    {
        check_orphaned();
        arraySetterHelper(knotArray, KNOT$12);
    }
    
    /**
     * Sets ith "knot" element
     */
    public void setKnotArray(int i, net.opengis.gml.x32.KnotPropertyType knot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.KnotPropertyType target = null;
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().find_element_user(KNOT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(knot);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "knot" element
     */
    public net.opengis.gml.x32.KnotPropertyType insertNewKnot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.KnotPropertyType target = null;
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().insert_element_user(KNOT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "knot" element
     */
    public net.opengis.gml.x32.KnotPropertyType addNewKnot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.KnotPropertyType target = null;
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().add_element_user(KNOT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "knot" element
     */
    public void removeKnot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KNOT$12, i);
        }
    }
    
    /**
     * Gets the "interpolation" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType.Enum getInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$14);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType xgetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_default_attribute_value(INTERPOLATION$14);
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
            return get_store().find_attribute_user(INTERPOLATION$14) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
    public void setInterpolation(net.opengis.gml.x32.CurveInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$14);
            }
            target.setEnumValue(interpolation);
        }
    }
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    public void xsetInterpolation(net.opengis.gml.x32.CurveInterpolationType interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_store().add_attribute_user(INTERPOLATION$14);
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
            get_store().remove_attribute(INTERPOLATION$14);
        }
    }
    
    /**
     * Gets the "isPolynomial" attribute
     */
    public boolean getIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPolynomial" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            return target;
        }
    }
    
    /**
     * True if has "isPolynomial" attribute
     */
    public boolean isSetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISPOLYNOMIAL$16) != null;
        }
    }
    
    /**
     * Sets the "isPolynomial" attribute
     */
    public void setIsPolynomial(boolean isPolynomial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPOLYNOMIAL$16);
            }
            target.setBooleanValue(isPolynomial);
        }
    }
    
    /**
     * Sets (as xml) the "isPolynomial" attribute
     */
    public void xsetIsPolynomial(org.apache.xmlbeans.XmlBoolean isPolynomial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPOLYNOMIAL$16);
            }
            target.set(isPolynomial);
        }
    }
    
    /**
     * Unsets the "isPolynomial" attribute
     */
    public void unsetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISPOLYNOMIAL$16);
        }
    }
    
    /**
     * Gets the "knotType" attribute
     */
    public net.opengis.gml.x32.KnotTypesType.Enum getKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KNOTTYPE$18);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.KnotTypesType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "knotType" attribute
     */
    public net.opengis.gml.x32.KnotTypesType xgetKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.KnotTypesType target = null;
            target = (net.opengis.gml.x32.KnotTypesType)get_store().find_attribute_user(KNOTTYPE$18);
            return target;
        }
    }
    
    /**
     * True if has "knotType" attribute
     */
    public boolean isSetKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KNOTTYPE$18) != null;
        }
    }
    
    /**
     * Sets the "knotType" attribute
     */
    public void setKnotType(net.opengis.gml.x32.KnotTypesType.Enum knotType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KNOTTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KNOTTYPE$18);
            }
            target.setEnumValue(knotType);
        }
    }
    
    /**
     * Sets (as xml) the "knotType" attribute
     */
    public void xsetKnotType(net.opengis.gml.x32.KnotTypesType knotType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.KnotTypesType target = null;
            target = (net.opengis.gml.x32.KnotTypesType)get_store().find_attribute_user(KNOTTYPE$18);
            if (target == null)
            {
                target = (net.opengis.gml.x32.KnotTypesType)get_store().add_attribute_user(KNOTTYPE$18);
            }
            target.set(knotType);
        }
    }
    
    /**
     * Unsets the "knotType" attribute
     */
    public void unsetKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KNOTTYPE$18);
        }
    }
}
