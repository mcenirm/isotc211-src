/*
 * XML Type:  SolidArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SolidArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML SolidArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class SolidArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SolidArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public SolidArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSolid");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSOLID$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSolid"),
    });
    private static final javax.xml.namespace.QName OWNS$2 = 
        new javax.xml.namespace.QName("", "owns");
    
    
    /**
     * Gets array of all "AbstractSolid" elements
     */
    public net.opengis.gml.x32.AbstractSolidType[] getAbstractSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTSOLID$1, targetList);
            net.opengis.gml.x32.AbstractSolidType[] result = new net.opengis.gml.x32.AbstractSolidType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractSolid" element
     */
    public net.opengis.gml.x32.AbstractSolidType getAbstractSolidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSolidType target = null;
            target = (net.opengis.gml.x32.AbstractSolidType)get_store().find_element_user(ABSTRACTSOLID$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractSolid" element
     */
    public int sizeOfAbstractSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTSOLID$1);
        }
    }
    
    /**
     * Sets array of all "AbstractSolid" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractSolidArray(net.opengis.gml.x32.AbstractSolidType[] abstractSolidArray)
    {
        check_orphaned();
        arraySetterHelper(abstractSolidArray, ABSTRACTSOLID$0, ABSTRACTSOLID$1);
    }
    
    /**
     * Sets ith "AbstractSolid" element
     */
    public void setAbstractSolidArray(int i, net.opengis.gml.x32.AbstractSolidType abstractSolid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSolidType target = null;
            target = (net.opengis.gml.x32.AbstractSolidType)get_store().find_element_user(ABSTRACTSOLID$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractSolid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractSolid" element
     */
    public net.opengis.gml.x32.AbstractSolidType insertNewAbstractSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSolidType target = null;
            target = (net.opengis.gml.x32.AbstractSolidType)get_store().insert_element_user(ABSTRACTSOLID$1, ABSTRACTSOLID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractSolid" element
     */
    public net.opengis.gml.x32.AbstractSolidType addNewAbstractSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSolidType target = null;
            target = (net.opengis.gml.x32.AbstractSolidType)get_store().add_element_user(ABSTRACTSOLID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractSolid" element
     */
    public void removeAbstractSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTSOLID$1, i);
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
