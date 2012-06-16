/*
 * An XML document type.
 * Localname: LE_ProcessStepReport
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessStepReportDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one LE_ProcessStepReport(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class LEProcessStepReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.LEProcessStepReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public LEProcessStepReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEPROCESSSTEPREPORT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_ProcessStepReport");
    
    
    /**
     * Gets the "LE_ProcessStepReport" element
     */
    public org.isotc211.x2005.gmi.LEProcessStepReportType getLEProcessStepReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepReportType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepReportType)get_store().find_element_user(LEPROCESSSTEPREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LE_ProcessStepReport" element
     */
    public void setLEProcessStepReport(org.isotc211.x2005.gmi.LEProcessStepReportType leProcessStepReport)
    {
        generatedSetterHelperImpl(leProcessStepReport, LEPROCESSSTEPREPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LE_ProcessStepReport" element
     */
    public org.isotc211.x2005.gmi.LEProcessStepReportType addNewLEProcessStepReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepReportType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepReportType)get_store().add_element_user(LEPROCESSSTEPREPORT$0);
            return target;
        }
    }
}
