/*
 * XML Type:  TopoPrimitiveArrayAssociationType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoPrimitiveArrayAssociationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoPrimitiveArrayAssociationType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoPrimitiveArrayAssociationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoPrimitiveArrayAssociationType
{
    private static final long serialVersionUID = 1L;
    
    public TopoPrimitiveArrayAssociationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTOPOPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTOPOPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Node"),
    });
    private static final javax.xml.namespace.QName OWNS$2 = 
        new javax.xml.namespace.QName("", "owns");
    
    
    /**
     * Gets array of all "AbstractTopoPrimitive" elements
     */
    public net.opengis.gml.x32.AbstractTopoPrimitiveType[] getAbstractTopoPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTTOPOPRIMITIVE$1, targetList);
            net.opengis.gml.x32.AbstractTopoPrimitiveType[] result = new net.opengis.gml.x32.AbstractTopoPrimitiveType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractTopoPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTopoPrimitiveType getAbstractTopoPrimitiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().find_element_user(ABSTRACTTOPOPRIMITIVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractTopoPrimitive" element
     */
    public int sizeOfAbstractTopoPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTTOPOPRIMITIVE$1);
        }
    }
    
    /**
     * Sets array of all "AbstractTopoPrimitive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractTopoPrimitiveArray(net.opengis.gml.x32.AbstractTopoPrimitiveType[] abstractTopoPrimitiveArray)
    {
        check_orphaned();
        arraySetterHelper(abstractTopoPrimitiveArray, ABSTRACTTOPOPRIMITIVE$0, ABSTRACTTOPOPRIMITIVE$1);
    }
    
    /**
     * Sets ith "AbstractTopoPrimitive" element
     */
    public void setAbstractTopoPrimitiveArray(int i, net.opengis.gml.x32.AbstractTopoPrimitiveType abstractTopoPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().find_element_user(ABSTRACTTOPOPRIMITIVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractTopoPrimitive);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractTopoPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTopoPrimitiveType insertNewAbstractTopoPrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().insert_element_user(ABSTRACTTOPOPRIMITIVE$1, ABSTRACTTOPOPRIMITIVE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractTopoPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTopoPrimitiveType addNewAbstractTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().add_element_user(ABSTRACTTOPOPRIMITIVE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractTopoPrimitive" element
     */
    public void removeAbstractTopoPrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTTOPOPRIMITIVE$1, i);
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
