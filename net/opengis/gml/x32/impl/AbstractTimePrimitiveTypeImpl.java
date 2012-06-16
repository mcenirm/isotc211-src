/*
 * XML Type:  AbstractTimePrimitiveType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimePrimitiveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractTimePrimitiveType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractTimePrimitiveTypeImpl extends net.opengis.gml.x32.impl.AbstractTimeObjectTypeImpl implements net.opengis.gml.x32.AbstractTimePrimitiveType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimePrimitiveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "relatedTime");
    
    
    /**
     * Gets array of all "relatedTime" elements
     */
    public net.opengis.gml.x32.RelatedTimeType[] getRelatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDTIME$0, targetList);
            net.opengis.gml.x32.RelatedTimeType[] result = new net.opengis.gml.x32.RelatedTimeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedTime" element
     */
    public net.opengis.gml.x32.RelatedTimeType getRelatedTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RelatedTimeType target = null;
            target = (net.opengis.gml.x32.RelatedTimeType)get_store().find_element_user(RELATEDTIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedTime" element
     */
    public int sizeOfRelatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDTIME$0);
        }
    }
    
    /**
     * Sets array of all "relatedTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedTimeArray(net.opengis.gml.x32.RelatedTimeType[] relatedTimeArray)
    {
        check_orphaned();
        arraySetterHelper(relatedTimeArray, RELATEDTIME$0);
    }
    
    /**
     * Sets ith "relatedTime" element
     */
    public void setRelatedTimeArray(int i, net.opengis.gml.x32.RelatedTimeType relatedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RelatedTimeType target = null;
            target = (net.opengis.gml.x32.RelatedTimeType)get_store().find_element_user(RELATEDTIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedTime" element
     */
    public net.opengis.gml.x32.RelatedTimeType insertNewRelatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RelatedTimeType target = null;
            target = (net.opengis.gml.x32.RelatedTimeType)get_store().insert_element_user(RELATEDTIME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedTime" element
     */
    public net.opengis.gml.x32.RelatedTimeType addNewRelatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RelatedTimeType target = null;
            target = (net.opengis.gml.x32.RelatedTimeType)get_store().add_element_user(RELATEDTIME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedTime" element
     */
    public void removeRelatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDTIME$0, i);
        }
    }
}
