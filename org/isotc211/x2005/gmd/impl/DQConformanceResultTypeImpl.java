/*
 * XML Type:  DQ_ConformanceResult_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQConformanceResultType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML DQ_ConformanceResult_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class DQConformanceResultTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractDQResultTypeImpl implements org.isotc211.x2005.gmd.DQConformanceResultType
{
    private static final long serialVersionUID = 1L;
    
    public DQConformanceResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "specification");
    private static final javax.xml.namespace.QName EXPLANATION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "explanation");
    private static final javax.xml.namespace.QName PASS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "pass");
    
    
    /**
     * Gets the "specification" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(SPECIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "specification" element
     */
    public void setSpecification(org.isotc211.x2005.gmd.CICitationPropertyType specification)
    {
        generatedSetterHelperImpl(specification, SPECIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "specification" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(SPECIFICATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "explanation" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(EXPLANATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "explanation" element
     */
    public void setExplanation(org.isotc211.x2005.gco.CharacterStringPropertyType explanation)
    {
        generatedSetterHelperImpl(explanation, EXPLANATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "explanation" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(EXPLANATION$2);
            return target;
        }
    }
    
    /**
     * Gets the "pass" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(PASS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pass" element
     */
    public void setPass(org.isotc211.x2005.gco.BooleanPropertyType pass)
    {
        generatedSetterHelperImpl(pass, PASS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pass" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(PASS$4);
            return target;
        }
    }
}
