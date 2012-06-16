/*
 * XML Type:  MD_SecurityConstraints_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDSecurityConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_SecurityConstraints_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDSecurityConstraintsTypeImpl extends org.isotc211.x2005.gmd.impl.MDConstraintsTypeImpl implements org.isotc211.x2005.gmd.MDSecurityConstraintsType
{
    private static final long serialVersionUID = 1L;
    
    public MDSecurityConstraintsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "classification");
    private static final javax.xml.namespace.QName USERNOTE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "userNote");
    private static final javax.xml.namespace.QName CLASSIFICATIONSYSTEM$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "classificationSystem");
    private static final javax.xml.namespace.QName HANDLINGDESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "handlingDescription");
    
    
    /**
     * Gets the "classification" element
     */
    public org.isotc211.x2005.gmd.MDClassificationCodePropertyType getClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDClassificationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDClassificationCodePropertyType)get_store().find_element_user(CLASSIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "classification" element
     */
    public void setClassification(org.isotc211.x2005.gmd.MDClassificationCodePropertyType classification)
    {
        generatedSetterHelperImpl(classification, CLASSIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "classification" element
     */
    public org.isotc211.x2005.gmd.MDClassificationCodePropertyType addNewClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDClassificationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDClassificationCodePropertyType)get_store().add_element_user(CLASSIFICATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "userNote" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getUserNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(USERNOTE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userNote" element
     */
    public boolean isSetUserNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERNOTE$2) != 0;
        }
    }
    
    /**
     * Sets the "userNote" element
     */
    public void setUserNote(org.isotc211.x2005.gco.CharacterStringPropertyType userNote)
    {
        generatedSetterHelperImpl(userNote, USERNOTE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userNote" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewUserNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(USERNOTE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "userNote" element
     */
    public void unsetUserNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERNOTE$2, 0);
        }
    }
    
    /**
     * Gets the "classificationSystem" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getClassificationSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CLASSIFICATIONSYSTEM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "classificationSystem" element
     */
    public boolean isSetClassificationSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSIFICATIONSYSTEM$4) != 0;
        }
    }
    
    /**
     * Sets the "classificationSystem" element
     */
    public void setClassificationSystem(org.isotc211.x2005.gco.CharacterStringPropertyType classificationSystem)
    {
        generatedSetterHelperImpl(classificationSystem, CLASSIFICATIONSYSTEM$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "classificationSystem" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewClassificationSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CLASSIFICATIONSYSTEM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "classificationSystem" element
     */
    public void unsetClassificationSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSIFICATIONSYSTEM$4, 0);
        }
    }
    
    /**
     * Gets the "handlingDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getHandlingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(HANDLINGDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "handlingDescription" element
     */
    public boolean isSetHandlingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLINGDESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "handlingDescription" element
     */
    public void setHandlingDescription(org.isotc211.x2005.gco.CharacterStringPropertyType handlingDescription)
    {
        generatedSetterHelperImpl(handlingDescription, HANDLINGDESCRIPTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "handlingDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewHandlingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(HANDLINGDESCRIPTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "handlingDescription" element
     */
    public void unsetHandlingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLINGDESCRIPTION$6, 0);
        }
    }
}
