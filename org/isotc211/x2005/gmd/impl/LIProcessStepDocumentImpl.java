/*
 * An XML document type.
 * Localname: LI_ProcessStep
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LIProcessStepDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one LI_ProcessStep(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class LIProcessStepDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.LIProcessStepDocument
{
    private static final long serialVersionUID = 1L;
    
    public LIProcessStepDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIPROCESSSTEP$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LI_ProcessStep");
    private static final org.apache.xmlbeans.QNameSet LIPROCESSSTEP$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_ProcessStep"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LI_ProcessStep"),
    });
    
    
    /**
     * Gets the "LI_ProcessStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepType getLIProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepType)get_store().find_element_user(LIPROCESSSTEP$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LI_ProcessStep" element
     */
    public void setLIProcessStep(org.isotc211.x2005.gmd.LIProcessStepType liProcessStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepType)get_store().find_element_user(LIPROCESSSTEP$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.LIProcessStepType)get_store().add_element_user(LIPROCESSSTEP$0);
            }
            target.set(liProcessStep);
        }
    }
    
    /**
     * Appends and returns a new empty "LI_ProcessStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepType addNewLIProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepType)get_store().add_element_user(LIPROCESSSTEP$0);
            return target;
        }
    }
}
