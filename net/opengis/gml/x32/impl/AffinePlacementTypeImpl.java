/*
 * XML Type:  AffinePlacementType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AffinePlacementType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AffinePlacementType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AffinePlacementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AffinePlacementType
{
    private static final long serialVersionUID = 1L;
    
    public AffinePlacementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "location");
    private static final javax.xml.namespace.QName REFDIRECTION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "refDirection");
    private static final javax.xml.namespace.QName INDIMENSION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "inDimension");
    private static final javax.xml.namespace.QName OUTDIMENSION$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "outDimension");
    
    
    /**
     * Gets the "location" element
     */
    public net.opengis.gml.x32.DirectPositionType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(net.opengis.gml.x32.DirectPositionType location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public net.opengis.gml.x32.DirectPositionType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "refDirection" elements
     */
    public net.opengis.gml.x32.VectorType[] getRefDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFDIRECTION$2, targetList);
            net.opengis.gml.x32.VectorType[] result = new net.opengis.gml.x32.VectorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "refDirection" element
     */
    public net.opengis.gml.x32.VectorType getRefDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(REFDIRECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "refDirection" element
     */
    public int sizeOfRefDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFDIRECTION$2);
        }
    }
    
    /**
     * Sets array of all "refDirection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRefDirectionArray(net.opengis.gml.x32.VectorType[] refDirectionArray)
    {
        check_orphaned();
        arraySetterHelper(refDirectionArray, REFDIRECTION$2);
    }
    
    /**
     * Sets ith "refDirection" element
     */
    public void setRefDirectionArray(int i, net.opengis.gml.x32.VectorType refDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(REFDIRECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(refDirection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "refDirection" element
     */
    public net.opengis.gml.x32.VectorType insertNewRefDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().insert_element_user(REFDIRECTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "refDirection" element
     */
    public net.opengis.gml.x32.VectorType addNewRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().add_element_user(REFDIRECTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "refDirection" element
     */
    public void removeRefDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFDIRECTION$2, i);
        }
    }
    
    /**
     * Gets the "inDimension" element
     */
    public java.math.BigInteger getInDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIMENSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "inDimension" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetInDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INDIMENSION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "inDimension" element
     */
    public void setInDimension(java.math.BigInteger inDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIMENSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIMENSION$4);
            }
            target.setBigIntegerValue(inDimension);
        }
    }
    
    /**
     * Sets (as xml) the "inDimension" element
     */
    public void xsetInDimension(org.apache.xmlbeans.XmlPositiveInteger inDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INDIMENSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(INDIMENSION$4);
            }
            target.set(inDimension);
        }
    }
    
    /**
     * Gets the "outDimension" element
     */
    public java.math.BigInteger getOutDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDIMENSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "outDimension" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetOutDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(OUTDIMENSION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "outDimension" element
     */
    public void setOutDimension(java.math.BigInteger outDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDIMENSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTDIMENSION$6);
            }
            target.setBigIntegerValue(outDimension);
        }
    }
    
    /**
     * Sets (as xml) the "outDimension" element
     */
    public void xsetOutDimension(org.apache.xmlbeans.XmlPositiveInteger outDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(OUTDIMENSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(OUTDIMENSION$6);
            }
            target.set(outDimension);
        }
    }
}
