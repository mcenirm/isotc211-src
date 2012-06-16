/*
 * XML Type:  LE_Algorithm_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEAlgorithmType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML LE_Algorithm_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class LEAlgorithmTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.LEAlgorithmType
{
    private static final long serialVersionUID = 1L;
    
    public LEAlgorithmTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "citation");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "description");
    
    
    /**
     * Gets the "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(CITATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "citation" element
     */
    public void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation)
    {
        generatedSetterHelperImpl(citation, CITATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(CITATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
}
