/*
 * XML Type:  BezierType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BezierType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML BezierType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class BezierTypeImpl extends net.opengis.gml.x32.impl.BSplineTypeImpl implements net.opengis.gml.x32.BezierType
{
    private static final long serialVersionUID = 1L;
    
    public BezierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KNOT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "knot");
    private static final javax.xml.namespace.QName ISPOLYNOMIAL$2 = 
        new javax.xml.namespace.QName("", "isPolynomial");
    
    
    /**
     * Gets array of all "knot" elements
     */
    public net.opengis.gml.x32.KnotPropertyType[] getKnotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KNOT$0, targetList);
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
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().find_element_user(KNOT$0, i);
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
            return get_store().count_elements(KNOT$0);
        }
    }
    
    /**
     * Sets array of all "knot" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKnotArray(net.opengis.gml.x32.KnotPropertyType[] knotArray)
    {
        check_orphaned();
        arraySetterHelper(knotArray, KNOT$0);
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
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().find_element_user(KNOT$0, i);
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
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().insert_element_user(KNOT$0, i);
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
            target = (net.opengis.gml.x32.KnotPropertyType)get_store().add_element_user(KNOT$0);
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
            get_store().remove_element(KNOT$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISPOLYNOMIAL$2);
            }
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISPOLYNOMIAL$2);
            }
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
            return get_store().find_attribute_user(ISPOLYNOMIAL$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPOLYNOMIAL$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPOLYNOMIAL$2);
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
            get_store().remove_attribute(ISPOLYNOMIAL$2);
        }
    }
}
