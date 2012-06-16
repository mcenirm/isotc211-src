/*
 * XML Type:  GeometryArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeometryArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GeometryArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GeometryArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeometryArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public GeometryArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGEOMETRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    private static final javax.xml.namespace.QName OWNS$2 = 
        new javax.xml.namespace.QName("", "owns");
    
    
    /**
     * Gets array of all "AbstractGeometry" elements
     */
    public net.opengis.gml.x32.AbstractGeometryType[] getAbstractGeometryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTGEOMETRY$1, targetList);
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
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTGEOMETRY$1, i);
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
            return get_store().count_elements(ABSTRACTGEOMETRY$1);
        }
    }
    
    /**
     * Sets array of all "AbstractGeometry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractGeometryArray(net.opengis.gml.x32.AbstractGeometryType[] abstractGeometryArray)
    {
        check_orphaned();
        arraySetterHelper(abstractGeometryArray, ABSTRACTGEOMETRY$0, ABSTRACTGEOMETRY$1);
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
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTGEOMETRY$1, i);
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
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().insert_element_user(ABSTRACTGEOMETRY$1, ABSTRACTGEOMETRY$0, i);
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
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().add_element_user(ABSTRACTGEOMETRY$0);
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
            get_store().remove_element(ABSTRACTGEOMETRY$1, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OWNS$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OWNS$2);
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
            return get_store().find_attribute_user(OWNS$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNS$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OWNS$2);
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
            get_store().remove_attribute(OWNS$2);
        }
    }
}
