/*
 * An XML document type.
 * Localname: MI_Requirement
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIRequirementDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Requirement(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIRequirementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIRequirementDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIRequirementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIREQUIREMENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Requirement");
    
    
    /**
     * Gets the "MI_Requirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementType getMIRequirement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementType)get_store().find_element_user(MIREQUIREMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Requirement" element
     */
    public void setMIRequirement(org.isotc211.x2005.gmi.MIRequirementType miRequirement)
    {
        generatedSetterHelperImpl(miRequirement, MIREQUIREMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Requirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementType addNewMIRequirement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementType)get_store().add_element_user(MIREQUIREMENT$0);
            return target;
        }
    }
}
