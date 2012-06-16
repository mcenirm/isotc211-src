/*
 * XML Type:  MD_RangeDimension_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDRangeDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_RangeDimension_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDRangeDimensionTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDRangeDimensionType
{
    private static final long serialVersionUID = 1L;
    
    public MDRangeDimensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCEIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "sequenceIdentifier");
    private static final javax.xml.namespace.QName DESCRIPTOR$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "descriptor");
    
    
    /**
     * Gets the "sequenceIdentifier" element
     */
    public org.isotc211.x2005.gco.MemberNamePropertyType getSequenceIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MemberNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.MemberNamePropertyType)get_store().find_element_user(SEQUENCEIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sequenceIdentifier" element
     */
    public boolean isSetSequenceIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCEIDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "sequenceIdentifier" element
     */
    public void setSequenceIdentifier(org.isotc211.x2005.gco.MemberNamePropertyType sequenceIdentifier)
    {
        generatedSetterHelperImpl(sequenceIdentifier, SEQUENCEIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequenceIdentifier" element
     */
    public org.isotc211.x2005.gco.MemberNamePropertyType addNewSequenceIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MemberNamePropertyType target = null;
            target = (org.isotc211.x2005.gco.MemberNamePropertyType)get_store().add_element_user(SEQUENCEIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sequenceIdentifier" element
     */
    public void unsetSequenceIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCEIDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "descriptor" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "descriptor" element
     */
    public boolean isSetDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTOR$2) != 0;
        }
    }
    
    /**
     * Sets the "descriptor" element
     */
    public void setDescriptor(org.isotc211.x2005.gco.CharacterStringPropertyType descriptor)
    {
        generatedSetterHelperImpl(descriptor, DESCRIPTOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptor" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "descriptor" element
     */
    public void unsetDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTOR$2, 0);
        }
    }
}
