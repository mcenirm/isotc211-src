/*
 * XML Type:  TypeName_Type
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.TypeNameType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML TypeName_Type(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class TypeNameTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gco.TypeNameType
{
    private static final long serialVersionUID = 1L;
    
    public TypeNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "aName");
    
    
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
}
