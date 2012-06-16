/*
 * XML Type:  CurveSegmentArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurveSegmentArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CurveSegmentArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CurveSegmentArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CurveSegmentArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public CurveSegmentArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCURVESEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCURVESEGMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Bezier"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodesicString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcStringByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Geodesic"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineStringSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CubicSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Arc"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OffsetCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Clothoid"),
    });
    
    
    /**
     * Gets array of all "AbstractCurveSegment" elements
     */
    public net.opengis.gml.x32.AbstractCurveSegmentType[] getAbstractCurveSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTCURVESEGMENT$1, targetList);
            net.opengis.gml.x32.AbstractCurveSegmentType[] result = new net.opengis.gml.x32.AbstractCurveSegmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractCurveSegment" element
     */
    public net.opengis.gml.x32.AbstractCurveSegmentType getAbstractCurveSegmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().find_element_user(ABSTRACTCURVESEGMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractCurveSegment" element
     */
    public int sizeOfAbstractCurveSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTCURVESEGMENT$1);
        }
    }
    
    /**
     * Sets array of all "AbstractCurveSegment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractCurveSegmentArray(net.opengis.gml.x32.AbstractCurveSegmentType[] abstractCurveSegmentArray)
    {
        check_orphaned();
        arraySetterHelper(abstractCurveSegmentArray, ABSTRACTCURVESEGMENT$0, ABSTRACTCURVESEGMENT$1);
    }
    
    /**
     * Sets ith "AbstractCurveSegment" element
     */
    public void setAbstractCurveSegmentArray(int i, net.opengis.gml.x32.AbstractCurveSegmentType abstractCurveSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().find_element_user(ABSTRACTCURVESEGMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractCurveSegment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractCurveSegment" element
     */
    public net.opengis.gml.x32.AbstractCurveSegmentType insertNewAbstractCurveSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().insert_element_user(ABSTRACTCURVESEGMENT$1, ABSTRACTCURVESEGMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractCurveSegment" element
     */
    public net.opengis.gml.x32.AbstractCurveSegmentType addNewAbstractCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().add_element_user(ABSTRACTCURVESEGMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractCurveSegment" element
     */
    public void removeAbstractCurveSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTCURVESEGMENT$1, i);
        }
    }
}
