/*
 * XML Type:  MI_RangeElementDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIRangeElementDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_RangeElementDescription_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIRangeElementDescriptionTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIRangeElementDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public MIRangeElementDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "name");
    private static final javax.xml.namespace.QName DEFINITION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "definition");
    private static final javax.xml.namespace.QName RANGEELEMENT$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "rangeElement");
    
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.isotc211.x2005.gco.CharacterStringPropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "definition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DEFINITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definition" element
     */
    public void setDefinition(org.isotc211.x2005.gco.CharacterStringPropertyType definition)
    {
        generatedSetterHelperImpl(definition, DEFINITION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DEFINITION$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "rangeElement" elements
     */
    public org.isotc211.x2005.gco.RecordPropertyType[] getRangeElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RANGEELEMENT$4, targetList);
            org.isotc211.x2005.gco.RecordPropertyType[] result = new org.isotc211.x2005.gco.RecordPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rangeElement" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType getRangeElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().find_element_user(RANGEELEMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rangeElement" element
     */
    public int sizeOfRangeElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANGEELEMENT$4);
        }
    }
    
    /**
     * Sets array of all "rangeElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRangeElementArray(org.isotc211.x2005.gco.RecordPropertyType[] rangeElementArray)
    {
        check_orphaned();
        arraySetterHelper(rangeElementArray, RANGEELEMENT$4);
    }
    
    /**
     * Sets ith "rangeElement" element
     */
    public void setRangeElementArray(int i, org.isotc211.x2005.gco.RecordPropertyType rangeElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().find_element_user(RANGEELEMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rangeElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rangeElement" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType insertNewRangeElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().insert_element_user(RANGEELEMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rangeElement" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType addNewRangeElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().add_element_user(RANGEELEMENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "rangeElement" element
     */
    public void removeRangeElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANGEELEMENT$4, i);
        }
    }
}
