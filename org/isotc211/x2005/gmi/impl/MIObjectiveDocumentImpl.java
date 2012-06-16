/*
 * An XML document type.
 * Localname: MI_Objective
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIObjectiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Objective(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIObjectiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIObjectiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIObjectiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIOBJECTIVE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Objective");
    
    
    /**
     * Gets the "MI_Objective" element
     */
    public org.isotc211.x2005.gmi.MIObjectiveType getMIObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectiveType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectiveType)get_store().find_element_user(MIOBJECTIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Objective" element
     */
    public void setMIObjective(org.isotc211.x2005.gmi.MIObjectiveType miObjective)
    {
        generatedSetterHelperImpl(miObjective, MIOBJECTIVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Objective" element
     */
    public org.isotc211.x2005.gmi.MIObjectiveType addNewMIObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectiveType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectiveType)get_store().add_element_user(MIOBJECTIVE$0);
            return target;
        }
    }
}
