/*
 * XML Type:  TimeCalendarType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCalendarType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeCalendarType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeCalendarTypeImpl extends net.opengis.gml.x32.impl.TimeReferenceSystemTypeImpl implements net.opengis.gml.x32.TimeCalendarType
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCEFRAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "referenceFrame");
    
    
    /**
     * Gets array of all "referenceFrame" elements
     */
    public net.opengis.gml.x32.TimeCalendarEraPropertyType[] getReferenceFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCEFRAME$0, targetList);
            net.opengis.gml.x32.TimeCalendarEraPropertyType[] result = new net.opengis.gml.x32.TimeCalendarEraPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "referenceFrame" element
     */
    public net.opengis.gml.x32.TimeCalendarEraPropertyType getReferenceFrameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCalendarEraPropertyType)get_store().find_element_user(REFERENCEFRAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "referenceFrame" element
     */
    public int sizeOfReferenceFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEFRAME$0);
        }
    }
    
    /**
     * Sets array of all "referenceFrame" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReferenceFrameArray(net.opengis.gml.x32.TimeCalendarEraPropertyType[] referenceFrameArray)
    {
        check_orphaned();
        arraySetterHelper(referenceFrameArray, REFERENCEFRAME$0);
    }
    
    /**
     * Sets ith "referenceFrame" element
     */
    public void setReferenceFrameArray(int i, net.opengis.gml.x32.TimeCalendarEraPropertyType referenceFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCalendarEraPropertyType)get_store().find_element_user(REFERENCEFRAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(referenceFrame);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "referenceFrame" element
     */
    public net.opengis.gml.x32.TimeCalendarEraPropertyType insertNewReferenceFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCalendarEraPropertyType)get_store().insert_element_user(REFERENCEFRAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "referenceFrame" element
     */
    public net.opengis.gml.x32.TimeCalendarEraPropertyType addNewReferenceFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCalendarEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCalendarEraPropertyType)get_store().add_element_user(REFERENCEFRAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "referenceFrame" element
     */
    public void removeReferenceFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEFRAME$0, i);
        }
    }
}
