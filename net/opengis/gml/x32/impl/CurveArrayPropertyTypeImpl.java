/*
 * XML Type:  CurveArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurveArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CurveArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CurveArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CurveArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public CurveArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCURVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Curve"),
    });
    private static final javax.xml.namespace.QName OWNS$2 = 
        new javax.xml.namespace.QName("", "owns");
    
    
    /**
     * Gets array of all "AbstractCurve" elements
     */
    public net.opengis.gml.x32.AbstractCurveType[] getAbstractCurveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTCURVE$1, targetList);
            net.opengis.gml.x32.AbstractCurveType[] result = new net.opengis.gml.x32.AbstractCurveType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractCurve" element
     */
    public net.opengis.gml.x32.AbstractCurveType getAbstractCurveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveType target = null;
            target = (net.opengis.gml.x32.AbstractCurveType)get_store().find_element_user(ABSTRACTCURVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractCurve" element
     */
    public int sizeOfAbstractCurveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTCURVE$1);
        }
    }
    
    /**
     * Sets array of all "AbstractCurve" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractCurveArray(net.opengis.gml.x32.AbstractCurveType[] abstractCurveArray)
    {
        check_orphaned();
        arraySetterHelper(abstractCurveArray, ABSTRACTCURVE$0, ABSTRACTCURVE$1);
    }
    
    /**
     * Sets ith "AbstractCurve" element
     */
    public void setAbstractCurveArray(int i, net.opengis.gml.x32.AbstractCurveType abstractCurve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveType target = null;
            target = (net.opengis.gml.x32.AbstractCurveType)get_store().find_element_user(ABSTRACTCURVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractCurve);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractCurve" element
     */
    public net.opengis.gml.x32.AbstractCurveType insertNewAbstractCurve(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveType target = null;
            target = (net.opengis.gml.x32.AbstractCurveType)get_store().insert_element_user(ABSTRACTCURVE$1, ABSTRACTCURVE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractCurve" element
     */
    public net.opengis.gml.x32.AbstractCurveType addNewAbstractCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveType target = null;
            target = (net.opengis.gml.x32.AbstractCurveType)get_store().add_element_user(ABSTRACTCURVE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractCurve" element
     */
    public void removeAbstractCurve(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTCURVE$1, i);
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
