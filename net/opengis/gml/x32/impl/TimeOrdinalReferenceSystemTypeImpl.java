/*
 * XML Type:  TimeOrdinalReferenceSystemType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeOrdinalReferenceSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeOrdinalReferenceSystemType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeOrdinalReferenceSystemTypeImpl extends net.opengis.gml.x32.impl.TimeReferenceSystemTypeImpl implements net.opengis.gml.x32.TimeOrdinalReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "component");
    
    
    /**
     * Gets array of all "component" elements
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$0, targetList);
            net.opengis.gml.x32.TimeOrdinalEraPropertyType[] result = new net.opengis.gml.x32.TimeOrdinalEraPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "component" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "component" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComponentArray(net.opengis.gml.x32.TimeOrdinalEraPropertyType[] componentArray)
    {
        check_orphaned();
        arraySetterHelper(componentArray, COMPONENT$0);
    }
    
    /**
     * Sets ith "component" element
     */
    public void setComponentArray(int i, net.opengis.gml.x32.TimeOrdinalEraPropertyType component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().insert_element_user(COMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().add_element_user(COMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$0, i);
        }
    }
}
