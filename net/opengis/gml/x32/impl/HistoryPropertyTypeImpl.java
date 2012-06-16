/*
 * XML Type:  HistoryPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.HistoryPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML HistoryPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class HistoryPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.HistoryPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public HistoryPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTIMESLICE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMESLICE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice"),
    });
    private static final javax.xml.namespace.QName OWNS$2 = 
        new javax.xml.namespace.QName("", "owns");
    
    
    /**
     * Gets array of all "AbstractTimeSlice" elements
     */
    public net.opengis.gml.x32.AbstractTimeSliceType[] getAbstractTimeSliceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTTIMESLICE$1, targetList);
            net.opengis.gml.x32.AbstractTimeSliceType[] result = new net.opengis.gml.x32.AbstractTimeSliceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractTimeSlice" element
     */
    public net.opengis.gml.x32.AbstractTimeSliceType getAbstractTimeSliceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().find_element_user(ABSTRACTTIMESLICE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractTimeSlice" element
     */
    public int sizeOfAbstractTimeSliceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTTIMESLICE$1);
        }
    }
    
    /**
     * Sets array of all "AbstractTimeSlice" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractTimeSliceArray(net.opengis.gml.x32.AbstractTimeSliceType[] abstractTimeSliceArray)
    {
        check_orphaned();
        arraySetterHelper(abstractTimeSliceArray, ABSTRACTTIMESLICE$0, ABSTRACTTIMESLICE$1);
    }
    
    /**
     * Sets ith "AbstractTimeSlice" element
     */
    public void setAbstractTimeSliceArray(int i, net.opengis.gml.x32.AbstractTimeSliceType abstractTimeSlice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().find_element_user(ABSTRACTTIMESLICE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractTimeSlice);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractTimeSlice" element
     */
    public net.opengis.gml.x32.AbstractTimeSliceType insertNewAbstractTimeSlice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().insert_element_user(ABSTRACTTIMESLICE$1, ABSTRACTTIMESLICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractTimeSlice" element
     */
    public net.opengis.gml.x32.AbstractTimeSliceType addNewAbstractTimeSlice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().add_element_user(ABSTRACTTIMESLICE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractTimeSlice" element
     */
    public void removeAbstractTimeSlice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTTIMESLICE$1, i);
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
