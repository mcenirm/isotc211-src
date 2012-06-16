/*
 * An XML document type.
 * Localname: LE_ProcessStep
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessStepDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one LE_ProcessStep(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class LEProcessStepDocumentImpl extends org.isotc211.x2005.gmd.impl.LIProcessStepDocumentImpl implements org.isotc211.x2005.gmi.LEProcessStepDocument
{
    private static final long serialVersionUID = 1L;
    
    public LEProcessStepDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEPROCESSSTEP$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_ProcessStep");
    
    
    /**
     * Gets the "LE_ProcessStep" element
     */
    public org.isotc211.x2005.gmi.LEProcessStepType getLEProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepType)get_store().find_element_user(LEPROCESSSTEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LE_ProcessStep" element
     */
    public void setLEProcessStep(org.isotc211.x2005.gmi.LEProcessStepType leProcessStep)
    {
        generatedSetterHelperImpl(leProcessStep, LEPROCESSSTEP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LE_ProcessStep" element
     */
    public org.isotc211.x2005.gmi.LEProcessStepType addNewLEProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepType)get_store().add_element_user(LEPROCESSSTEP$0);
            return target;
        }
    }
}
