/*
 * XML Type:  TimeNodeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeNodeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeNodeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeNodeTypeImpl extends net.opengis.gml.x32.impl.AbstractTimeTopologyPrimitiveTypeImpl implements net.opengis.gml.x32.TimeNodeType
{
    private static final long serialVersionUID = 1L;
    
    public TimeNodeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREVIOUSEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "previousEdge");
    private static final javax.xml.namespace.QName NEXTEDGE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "nextEdge");
    private static final javax.xml.namespace.QName POSITION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "position");
    
    
    /**
     * Gets array of all "previousEdge" elements
     */
    public net.opengis.gml.x32.TimeEdgePropertyType[] getPreviousEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREVIOUSEDGE$0, targetList);
            net.opengis.gml.x32.TimeEdgePropertyType[] result = new net.opengis.gml.x32.TimeEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "previousEdge" element
     */
    public net.opengis.gml.x32.TimeEdgePropertyType getPreviousEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().find_element_user(PREVIOUSEDGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "previousEdge" element
     */
    public int sizeOfPreviousEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSEDGE$0);
        }
    }
    
    /**
     * Sets array of all "previousEdge" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPreviousEdgeArray(net.opengis.gml.x32.TimeEdgePropertyType[] previousEdgeArray)
    {
        check_orphaned();
        arraySetterHelper(previousEdgeArray, PREVIOUSEDGE$0);
    }
    
    /**
     * Sets ith "previousEdge" element
     */
    public void setPreviousEdgeArray(int i, net.opengis.gml.x32.TimeEdgePropertyType previousEdge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().find_element_user(PREVIOUSEDGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(previousEdge);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "previousEdge" element
     */
    public net.opengis.gml.x32.TimeEdgePropertyType insertNewPreviousEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().insert_element_user(PREVIOUSEDGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "previousEdge" element
     */
    public net.opengis.gml.x32.TimeEdgePropertyType addNewPreviousEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().add_element_user(PREVIOUSEDGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "previousEdge" element
     */
    public void removePreviousEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSEDGE$0, i);
        }
    }
    
    /**
     * Gets array of all "nextEdge" elements
     */
    public net.opengis.gml.x32.TimeEdgePropertyType[] getNextEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NEXTEDGE$2, targetList);
            net.opengis.gml.x32.TimeEdgePropertyType[] result = new net.opengis.gml.x32.TimeEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nextEdge" element
     */
    public net.opengis.gml.x32.TimeEdgePropertyType getNextEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().find_element_user(NEXTEDGE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nextEdge" element
     */
    public int sizeOfNextEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTEDGE$2);
        }
    }
    
    /**
     * Sets array of all "nextEdge" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNextEdgeArray(net.opengis.gml.x32.TimeEdgePropertyType[] nextEdgeArray)
    {
        check_orphaned();
        arraySetterHelper(nextEdgeArray, NEXTEDGE$2);
    }
    
    /**
     * Sets ith "nextEdge" element
     */
    public void setNextEdgeArray(int i, net.opengis.gml.x32.TimeEdgePropertyType nextEdge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().find_element_user(NEXTEDGE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nextEdge);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nextEdge" element
     */
    public net.opengis.gml.x32.TimeEdgePropertyType insertNewNextEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().insert_element_user(NEXTEDGE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nextEdge" element
     */
    public net.opengis.gml.x32.TimeEdgePropertyType addNewNextEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.x32.TimeEdgePropertyType)get_store().add_element_user(NEXTEDGE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "nextEdge" element
     */
    public void removeNextEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTEDGE$2, i);
        }
    }
    
    /**
     * Gets the "position" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().find_element_user(POSITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$4) != 0;
        }
    }
    
    /**
     * Sets the "position" element
     */
    public void setPosition(net.opengis.gml.x32.TimeInstantPropertyType position)
    {
        generatedSetterHelperImpl(position, POSITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "position" element
     */
    public net.opengis.gml.x32.TimeInstantPropertyType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.x32.TimeInstantPropertyType)get_store().add_element_user(POSITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$4, 0);
        }
    }
}
