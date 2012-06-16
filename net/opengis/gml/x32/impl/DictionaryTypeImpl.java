/*
 * XML Type:  DictionaryType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DictionaryType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DictionaryType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DictionaryTypeImpl extends net.opengis.gml.x32.impl.DefinitionTypeImpl implements net.opengis.gml.x32.DictionaryType
{
    private static final long serialVersionUID = 1L;
    
    public DictionaryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARYENTRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dictionaryEntry");
    private static final org.apache.xmlbeans.QNameSet DICTIONARYENTRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "definitionMember"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dictionaryEntry"),
    });
    private static final javax.xml.namespace.QName INDIRECTENTRY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "indirectEntry");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$4 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "dictionaryEntry" elements
     */
    public net.opengis.gml.x32.DictionaryEntryType[] getDictionaryEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DICTIONARYENTRY$1, targetList);
            net.opengis.gml.x32.DictionaryEntryType[] result = new net.opengis.gml.x32.DictionaryEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dictionaryEntry" element
     */
    public net.opengis.gml.x32.DictionaryEntryType getDictionaryEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dictionaryEntry" element
     */
    public int sizeOfDictionaryEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DICTIONARYENTRY$1);
        }
    }
    
    /**
     * Sets array of all "dictionaryEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDictionaryEntryArray(net.opengis.gml.x32.DictionaryEntryType[] dictionaryEntryArray)
    {
        check_orphaned();
        arraySetterHelper(dictionaryEntryArray, DICTIONARYENTRY$0, DICTIONARYENTRY$1);
    }
    
    /**
     * Sets ith "dictionaryEntry" element
     */
    public void setDictionaryEntryArray(int i, net.opengis.gml.x32.DictionaryEntryType dictionaryEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dictionaryEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dictionaryEntry" element
     */
    public net.opengis.gml.x32.DictionaryEntryType insertNewDictionaryEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().insert_element_user(DICTIONARYENTRY$1, DICTIONARYENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dictionaryEntry" element
     */
    public net.opengis.gml.x32.DictionaryEntryType addNewDictionaryEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().add_element_user(DICTIONARYENTRY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dictionaryEntry" element
     */
    public void removeDictionaryEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DICTIONARYENTRY$1, i);
        }
    }
    
    /**
     * Gets array of all "indirectEntry" elements
     */
    public net.opengis.gml.x32.IndirectEntryType[] getIndirectEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INDIRECTENTRY$2, targetList);
            net.opengis.gml.x32.IndirectEntryType[] result = new net.opengis.gml.x32.IndirectEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "indirectEntry" element
     */
    public net.opengis.gml.x32.IndirectEntryType getIndirectEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IndirectEntryType target = null;
            target = (net.opengis.gml.x32.IndirectEntryType)get_store().find_element_user(INDIRECTENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "indirectEntry" element
     */
    public int sizeOfIndirectEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIRECTENTRY$2);
        }
    }
    
    /**
     * Sets array of all "indirectEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIndirectEntryArray(net.opengis.gml.x32.IndirectEntryType[] indirectEntryArray)
    {
        check_orphaned();
        arraySetterHelper(indirectEntryArray, INDIRECTENTRY$2);
    }
    
    /**
     * Sets ith "indirectEntry" element
     */
    public void setIndirectEntryArray(int i, net.opengis.gml.x32.IndirectEntryType indirectEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IndirectEntryType target = null;
            target = (net.opengis.gml.x32.IndirectEntryType)get_store().find_element_user(INDIRECTENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(indirectEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "indirectEntry" element
     */
    public net.opengis.gml.x32.IndirectEntryType insertNewIndirectEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IndirectEntryType target = null;
            target = (net.opengis.gml.x32.IndirectEntryType)get_store().insert_element_user(INDIRECTENTRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "indirectEntry" element
     */
    public net.opengis.gml.x32.IndirectEntryType addNewIndirectEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IndirectEntryType target = null;
            target = (net.opengis.gml.x32.IndirectEntryType)get_store().add_element_user(INDIRECTENTRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "indirectEntry" element
     */
    public void removeIndirectEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIRECTENTRY$2, i);
        }
    }
    
    /**
     * Gets the "aggregationType" attribute
     */
    public net.opengis.gml.x32.AggregationType.Enum getAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.AggregationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "aggregationType" attribute
     */
    public net.opengis.gml.x32.AggregationType xgetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AggregationType target = null;
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "aggregationType" attribute
     */
    public boolean isSetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGGREGATIONTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "aggregationType" attribute
     */
    public void setAggregationType(net.opengis.gml.x32.AggregationType.Enum aggregationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATIONTYPE$4);
            }
            target.setEnumValue(aggregationType);
        }
    }
    
    /**
     * Sets (as xml) the "aggregationType" attribute
     */
    public void xsetAggregationType(net.opengis.gml.x32.AggregationType aggregationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AggregationType target = null;
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$4);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AggregationType)get_store().add_attribute_user(AGGREGATIONTYPE$4);
            }
            target.set(aggregationType);
        }
    }
    
    /**
     * Unsets the "aggregationType" attribute
     */
    public void unsetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGGREGATIONTYPE$4);
        }
    }
}
