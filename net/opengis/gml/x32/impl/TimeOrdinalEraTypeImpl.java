/*
 * XML Type:  TimeOrdinalEraType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeOrdinalEraType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeOrdinalEraType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeOrdinalEraTypeImpl extends net.opengis.gml.x32.impl.DefinitionTypeImpl implements net.opengis.gml.x32.TimeOrdinalEraType
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalEraTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "relatedTime");
    private static final javax.xml.namespace.QName START$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "start");
    private static final javax.xml.namespace.QName END$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "end");
    private static final javax.xml.namespace.QName EXTENT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "extent");
    private static final javax.xml.namespace.QName MEMBER$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "member");
    private static final javax.xml.namespace.QName GROUP$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "group");
    
    
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
    
    /**
     * Gets the "start" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$2) != 0;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(net.opengis.gml.x32.TimeNodePropertyType start)
    {
        generatedSetterHelperImpl(start, START$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().add_element_user(START$2);
            return target;
        }
    }
    
    /**
     * Unsets the "start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$2, 0);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$4) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(net.opengis.gml.x32.TimeNodePropertyType end)
    {
        generatedSetterHelperImpl(end, END$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public net.opengis.gml.x32.TimeNodePropertyType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeNodePropertyType target = null;
            target = (net.opengis.gml.x32.TimeNodePropertyType)get_store().add_element_user(END$4);
            return target;
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$4, 0);
        }
    }
    
    /**
     * Gets the "extent" element
     */
    public net.opengis.gml.x32.TimePeriodPropertyType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.x32.TimePeriodPropertyType)get_store().find_element_user(EXTENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extent" element
     */
    public boolean isSetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$6) != 0;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(net.opengis.gml.x32.TimePeriodPropertyType extent)
    {
        generatedSetterHelperImpl(extent, EXTENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public net.opengis.gml.x32.TimePeriodPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.x32.TimePeriodPropertyType)get_store().add_element_user(EXTENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "extent" element
     */
    public void unsetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$6, 0);
        }
    }
    
    /**
     * Gets array of all "member" elements
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBER$8, targetList);
            net.opengis.gml.x32.TimeOrdinalEraPropertyType[] result = new net.opengis.gml.x32.TimeOrdinalEraPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().find_element_user(MEMBER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$8);
        }
    }
    
    /**
     * Sets array of all "member" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMemberArray(net.opengis.gml.x32.TimeOrdinalEraPropertyType[] memberArray)
    {
        check_orphaned();
        arraySetterHelper(memberArray, MEMBER$8);
    }
    
    /**
     * Sets ith "member" element
     */
    public void setMemberArray(int i, net.opengis.gml.x32.TimeOrdinalEraPropertyType member)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().find_element_user(MEMBER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(member);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().insert_element_user(MEMBER$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraPropertyType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraPropertyType)get_store().add_element_user(MEMBER$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$8, i);
        }
    }
    
    /**
     * Gets the "group" element
     */
    public net.opengis.gml.x32.ReferenceType getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(GROUP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "group" element
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$10) != 0;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(net.opengis.gml.x32.ReferenceType group)
    {
        generatedSetterHelperImpl(group, GROUP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public net.opengis.gml.x32.ReferenceType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(GROUP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "group" element
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$10, 0);
        }
    }
}
