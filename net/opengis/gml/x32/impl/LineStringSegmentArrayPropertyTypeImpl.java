/*
 * XML Type:  LineStringSegmentArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.LineStringSegmentArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML LineStringSegmentArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class LineStringSegmentArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.LineStringSegmentArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public LineStringSegmentArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRINGSEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineStringSegment");
    
    
    /**
     * Gets array of all "LineStringSegment" elements
     */
    public net.opengis.gml.x32.LineStringSegmentType[] getLineStringSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINESTRINGSEGMENT$0, targetList);
            net.opengis.gml.x32.LineStringSegmentType[] result = new net.opengis.gml.x32.LineStringSegmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LineStringSegment" element
     */
    public net.opengis.gml.x32.LineStringSegmentType getLineStringSegmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentType)get_store().find_element_user(LINESTRINGSEGMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LineStringSegment" element
     */
    public int sizeOfLineStringSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINESTRINGSEGMENT$0);
        }
    }
    
    /**
     * Sets array of all "LineStringSegment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLineStringSegmentArray(net.opengis.gml.x32.LineStringSegmentType[] lineStringSegmentArray)
    {
        check_orphaned();
        arraySetterHelper(lineStringSegmentArray, LINESTRINGSEGMENT$0);
    }
    
    /**
     * Sets ith "LineStringSegment" element
     */
    public void setLineStringSegmentArray(int i, net.opengis.gml.x32.LineStringSegmentType lineStringSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentType)get_store().find_element_user(LINESTRINGSEGMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lineStringSegment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LineStringSegment" element
     */
    public net.opengis.gml.x32.LineStringSegmentType insertNewLineStringSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentType)get_store().insert_element_user(LINESTRINGSEGMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LineStringSegment" element
     */
    public net.opengis.gml.x32.LineStringSegmentType addNewLineStringSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentType)get_store().add_element_user(LINESTRINGSEGMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LineStringSegment" element
     */
    public void removeLineStringSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINESTRINGSEGMENT$0, i);
        }
    }
}
