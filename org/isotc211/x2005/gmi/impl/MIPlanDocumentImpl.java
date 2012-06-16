/*
 * An XML document type.
 * Localname: MI_Plan
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlanDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Plan(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIPlanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIPlanDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIPlanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIPLAN$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Plan");
    
    
    /**
     * Gets the "MI_Plan" element
     */
    public org.isotc211.x2005.gmi.MIPlanType getMIPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanType)get_store().find_element_user(MIPLAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Plan" element
     */
    public void setMIPlan(org.isotc211.x2005.gmi.MIPlanType miPlan)
    {
        generatedSetterHelperImpl(miPlan, MIPLAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Plan" element
     */
    public org.isotc211.x2005.gmi.MIPlanType addNewMIPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanType)get_store().add_element_user(MIPLAN$0);
            return target;
        }
    }
}
