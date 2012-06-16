/*
 * XML Type:  ArcByBulgeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArcByBulgeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ArcByBulgeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ArcByBulgeTypeImpl extends net.opengis.gml.x32.impl.ArcStringByBulgeTypeImpl implements net.opengis.gml.x32.ArcByBulgeType
{
    private static final long serialVersionUID = 1L;
    
    public ArcByBulgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    private static final javax.xml.namespace.QName POINTPROPERTY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointProperty");
    private static final javax.xml.namespace.QName POINTREP$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointRep");
    private static final javax.xml.namespace.QName BULGE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "bulge");
    private static final javax.xml.namespace.QName NORMAL$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "normal");
    private static final javax.xml.namespace.QName NUMARC$10 = 
        new javax.xml.namespace.QName("", "numArc");
    
    
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
     * Gets array of all "bulge" elements
     */
    public double[] getBulgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BULGE$6, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "bulge" element
     */
    public double getBulgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULGE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "bulge" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetBulgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BULGE$6, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "bulge" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBulgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BULGE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bulge" element
     */
    public int sizeOfBulgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULGE$6);
        }
    }
    
    /**
     * Sets array of all "bulge" element
     */
    public void setBulgeArray(double[] bulgeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bulgeArray, BULGE$6);
        }
    }
    
    /**
     * Sets ith "bulge" element
     */
    public void setBulgeArray(int i, double bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULGE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(bulge);
        }
    }
    
    /**
     * Sets (as xml) array of all "bulge" element
     */
    public void xsetBulgeArray(org.apache.xmlbeans.XmlDouble[]bulgeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bulgeArray, BULGE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "bulge" element
     */
    public void xsetBulgeArray(int i, org.apache.xmlbeans.XmlDouble bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BULGE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bulge);
        }
    }
    
    /**
     * Inserts the value as the ith "bulge" element
     */
    public void insertBulge(int i, double bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BULGE$6, i);
            target.setDoubleValue(bulge);
        }
    }
    
    /**
     * Appends the value as the last "bulge" element
     */
    public void addBulge(double bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULGE$6);
            target.setDoubleValue(bulge);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bulge" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewBulge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(BULGE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bulge" element
     */
    public org.apache.xmlbeans.XmlDouble addNewBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BULGE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "bulge" element
     */
    public void removeBulge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULGE$6, i);
        }
    }
    
    /**
     * Gets array of all "normal" elements
     */
    public net.opengis.gml.x32.VectorType[] getNormalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NORMAL$8, targetList);
            net.opengis.gml.x32.VectorType[] result = new net.opengis.gml.x32.VectorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "normal" element
     */
    public net.opengis.gml.x32.VectorType getNormalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(NORMAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "normal" element
     */
    public int sizeOfNormalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NORMAL$8);
        }
    }
    
    /**
     * Sets array of all "normal" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNormalArray(net.opengis.gml.x32.VectorType[] normalArray)
    {
        check_orphaned();
        arraySetterHelper(normalArray, NORMAL$8);
    }
    
    /**
     * Sets ith "normal" element
     */
    public void setNormalArray(int i, net.opengis.gml.x32.VectorType normal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(NORMAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(normal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "normal" element
     */
    public net.opengis.gml.x32.VectorType insertNewNormal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().insert_element_user(NORMAL$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "normal" element
     */
    public net.opengis.gml.x32.VectorType addNewNormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().add_element_user(NORMAL$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "normal" element
     */
    public void removeNormal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NORMAL$8, i);
        }
    }
    
    /**
     * Gets the "numArc" attribute
     */
    public java.math.BigInteger getNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMARC$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numArc" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMARC$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "numArc" attribute
     */
    public boolean isSetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMARC$10) != null;
        }
    }
    
    /**
     * Sets the "numArc" attribute
     */
    public void setNumArc(java.math.BigInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMARC$10);
            }
            target.setBigIntegerValue(numArc);
        }
    }
    
    /**
     * Sets (as xml) the "numArc" attribute
     */
    public void xsetNumArc(org.apache.xmlbeans.XmlInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMARC$10);
            }
            target.set(numArc);
        }
    }
    
    /**
     * Unsets the "numArc" attribute
     */
    public void unsetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMARC$10);
        }
    }
}
