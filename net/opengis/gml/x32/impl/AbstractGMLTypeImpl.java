/*
 * XML Type:  AbstractGMLType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGMLType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractGMLType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractGMLTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractGMLType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGMLTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "metaDataProperty");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "description");
    private static final javax.xml.namespace.QName DESCRIPTIONREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "descriptionReference");
    private static final javax.xml.namespace.QName IDENTIFIER$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "identifier");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "name");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "id");
    
    
    /**
     * Gets array of all "metaDataProperty" elements
     */
    public net.opengis.gml.x32.MetaDataPropertyType[] getMetaDataPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAPROPERTY$0, targetList);
            net.opengis.gml.x32.MetaDataPropertyType[] result = new net.opengis.gml.x32.MetaDataPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "metaDataProperty" element
     */
    public net.opengis.gml.x32.MetaDataPropertyType getMetaDataPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MetaDataPropertyType target = null;
            target = (net.opengis.gml.x32.MetaDataPropertyType)get_store().find_element_user(METADATAPROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "metaDataProperty" element
     */
    public int sizeOfMetaDataPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAPROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "metaDataProperty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMetaDataPropertyArray(net.opengis.gml.x32.MetaDataPropertyType[] metaDataPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(metaDataPropertyArray, METADATAPROPERTY$0);
    }
    
    /**
     * Sets ith "metaDataProperty" element
     */
    public void setMetaDataPropertyArray(int i, net.opengis.gml.x32.MetaDataPropertyType metaDataProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MetaDataPropertyType target = null;
            target = (net.opengis.gml.x32.MetaDataPropertyType)get_store().find_element_user(METADATAPROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metaDataProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metaDataProperty" element
     */
    public net.opengis.gml.x32.MetaDataPropertyType insertNewMetaDataProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MetaDataPropertyType target = null;
            target = (net.opengis.gml.x32.MetaDataPropertyType)get_store().insert_element_user(METADATAPROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metaDataProperty" element
     */
    public net.opengis.gml.x32.MetaDataPropertyType addNewMetaDataProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MetaDataPropertyType target = null;
            target = (net.opengis.gml.x32.MetaDataPropertyType)get_store().add_element_user(METADATAPROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "metaDataProperty" element
     */
    public void removeMetaDataProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAPROPERTY$0, i);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public net.opengis.gml.x32.StringOrRefType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(net.opengis.gml.x32.StringOrRefType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "descriptionReference" element
     */
    public net.opengis.gml.x32.ReferenceType getDescriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(DESCRIPTIONREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "descriptionReference" element
     */
    public boolean isSetDescriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTIONREFERENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "descriptionReference" element
     */
    public void setDescriptionReference(net.opengis.gml.x32.ReferenceType descriptionReference)
    {
        generatedSetterHelperImpl(descriptionReference, DESCRIPTIONREFERENCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptionReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewDescriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(DESCRIPTIONREFERENCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "descriptionReference" element
     */
    public void unsetDescriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTIONREFERENCE$4, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(IDENTIFIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$6) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(net.opengis.gml.x32.CodeWithAuthorityType identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(IDENTIFIER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$6, 0);
        }
    }
    
    /**
     * Gets array of all "name" elements
     */
    public net.opengis.gml.x32.CodeType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$8, targetList);
            net.opengis.gml.x32.CodeType[] result = new net.opengis.gml.x32.CodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public net.opengis.gml.x32.CodeType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(NAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$8);
        }
    }
    
    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNameArray(net.opengis.gml.x32.CodeType[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$8);
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, net.opengis.gml.x32.CodeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(NAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public net.opengis.gml.x32.CodeType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().insert_element_user(NAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public net.opengis.gml.x32.CodeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(NAME$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$8, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
}
