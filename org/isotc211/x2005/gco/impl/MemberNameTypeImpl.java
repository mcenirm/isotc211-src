/*
 * XML Type:  MemberName_Type
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.MemberNameType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML MemberName_Type(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class MemberNameTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gco.MemberNameType
{
    private static final long serialVersionUID = 1L;
    
    public MemberNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "aName");
    private static final javax.xml.namespace.QName ATTRIBUTETYPE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "attributeType");
    
    
    /**
     * Gets the "aName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getAName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ANAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "aName" element
     */
    public void setAName(org.isotc211.x2005.gco.CharacterStringPropertyType aName)
    {
        generatedSetterHelperImpl(aName, ANAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "aName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewAName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ANAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "attributeType" element
     */
    public org.isotc211.x2005.gco.TypeNamePropertyType getAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.TypeNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.TypeNamePropertyType)get_store().find_element_user(ATTRIBUTETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attributeType" element
     */
    public void setAttributeType(org.isotc211.x2005.gco.TypeNamePropertyType attributeType)
    {
        generatedSetterHelperImpl(attributeType, ATTRIBUTETYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "attributeType" element
     */
    public org.isotc211.x2005.gco.TypeNamePropertyType addNewAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.TypeNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.TypeNamePropertyType)get_store().add_element_user(ATTRIBUTETYPE$2);
            return target;
        }
    }
}
