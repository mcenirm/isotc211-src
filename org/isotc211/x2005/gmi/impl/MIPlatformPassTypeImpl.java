/*
 * XML Type:  MI_PlatformPass_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlatformPassType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_PlatformPass_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIPlatformPassTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIPlatformPassType
{
    private static final long serialVersionUID = 1L;
    
    public MIPlatformPassTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName EXTENT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "extent");
    private static final javax.xml.namespace.QName RELATEDEVENT$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "relatedEvent");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "extent" element
     */
    public org.isotc211.x2005.gss.GMObjectPropertyType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMObjectPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMObjectPropertyType)get_store().find_element_user(EXTENT$2, 0);
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
            return get_store().count_elements(EXTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(org.isotc211.x2005.gss.GMObjectPropertyType extent)
    {
        generatedSetterHelperImpl(extent, EXTENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public org.isotc211.x2005.gss.GMObjectPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMObjectPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMObjectPropertyType)get_store().add_element_user(EXTENT$2);
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
            get_store().remove_element(EXTENT$2, 0);
        }
    }
    
    /**
     * Gets array of all "relatedEvent" elements
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType[] getRelatedEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDEVENT$4, targetList);
            org.isotc211.x2005.gmi.MIEventPropertyType[] result = new org.isotc211.x2005.gmi.MIEventPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedEvent" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType getRelatedEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().find_element_user(RELATEDEVENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedEvent" element
     */
    public int sizeOfRelatedEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDEVENT$4);
        }
    }
    
    /**
     * Sets array of all "relatedEvent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedEventArray(org.isotc211.x2005.gmi.MIEventPropertyType[] relatedEventArray)
    {
        check_orphaned();
        arraySetterHelper(relatedEventArray, RELATEDEVENT$4);
    }
    
    /**
     * Sets ith "relatedEvent" element
     */
    public void setRelatedEventArray(int i, org.isotc211.x2005.gmi.MIEventPropertyType relatedEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().find_element_user(RELATEDEVENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedEvent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedEvent" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType insertNewRelatedEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().insert_element_user(RELATEDEVENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedEvent" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType addNewRelatedEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().add_element_user(RELATEDEVENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedEvent" element
     */
    public void removeRelatedEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDEVENT$4, i);
        }
    }
}
