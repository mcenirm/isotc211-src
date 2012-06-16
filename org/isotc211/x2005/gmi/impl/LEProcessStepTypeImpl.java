/*
 * XML Type:  LE_ProcessStep_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML LE_ProcessStep_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class LEProcessStepTypeImpl extends org.isotc211.x2005.gmd.impl.LIProcessStepTypeImpl implements org.isotc211.x2005.gmi.LEProcessStepType
{
    private static final long serialVersionUID = 1L;
    
    public LEProcessStepTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "output");
    private static final javax.xml.namespace.QName REPORT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "report");
    private static final javax.xml.namespace.QName PROCESSINGINFORMATION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "processingInformation");
    
    
    /**
     * Gets array of all "output" elements
     */
    public org.isotc211.x2005.gmi.LESourcePropertyType[] getOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUT$0, targetList);
            org.isotc211.x2005.gmi.LESourcePropertyType[] result = new org.isotc211.x2005.gmi.LESourcePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "output" element
     */
    public org.isotc211.x2005.gmi.LESourcePropertyType getOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LESourcePropertyType target = null;
            target = (org.isotc211.x2005.gmi.LESourcePropertyType)get_store().find_element_user(OUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "output" element
     */
    public int sizeOfOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUT$0);
        }
    }
    
    /**
     * Sets array of all "output" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOutputArray(org.isotc211.x2005.gmi.LESourcePropertyType[] outputArray)
    {
        check_orphaned();
        arraySetterHelper(outputArray, OUTPUT$0);
    }
    
    /**
     * Sets ith "output" element
     */
    public void setOutputArray(int i, org.isotc211.x2005.gmi.LESourcePropertyType output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LESourcePropertyType target = null;
            target = (org.isotc211.x2005.gmi.LESourcePropertyType)get_store().find_element_user(OUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(output);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "output" element
     */
    public org.isotc211.x2005.gmi.LESourcePropertyType insertNewOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LESourcePropertyType target = null;
            target = (org.isotc211.x2005.gmi.LESourcePropertyType)get_store().insert_element_user(OUTPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "output" element
     */
    public org.isotc211.x2005.gmi.LESourcePropertyType addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LESourcePropertyType target = null;
            target = (org.isotc211.x2005.gmi.LESourcePropertyType)get_store().add_element_user(OUTPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "output" element
     */
    public void removeOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUT$0, i);
        }
    }
    
    /**
     * Gets array of all "report" elements
     */
    public org.isotc211.x2005.gmi.LEProcessStepReportPropertyType[] getReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORT$2, targetList);
            org.isotc211.x2005.gmi.LEProcessStepReportPropertyType[] result = new org.isotc211.x2005.gmi.LEProcessStepReportPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "report" element
     */
    public org.isotc211.x2005.gmi.LEProcessStepReportPropertyType getReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepReportPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepReportPropertyType)get_store().find_element_user(REPORT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "report" element
     */
    public int sizeOfReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORT$2);
        }
    }
    
    /**
     * Sets array of all "report" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReportArray(org.isotc211.x2005.gmi.LEProcessStepReportPropertyType[] reportArray)
    {
        check_orphaned();
        arraySetterHelper(reportArray, REPORT$2);
    }
    
    /**
     * Sets ith "report" element
     */
    public void setReportArray(int i, org.isotc211.x2005.gmi.LEProcessStepReportPropertyType report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepReportPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepReportPropertyType)get_store().find_element_user(REPORT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(report);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "report" element
     */
    public org.isotc211.x2005.gmi.LEProcessStepReportPropertyType insertNewReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepReportPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepReportPropertyType)get_store().insert_element_user(REPORT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "report" element
     */
    public org.isotc211.x2005.gmi.LEProcessStepReportPropertyType addNewReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessStepReportPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessStepReportPropertyType)get_store().add_element_user(REPORT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "report" element
     */
    public void removeReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORT$2, i);
        }
    }
    
    /**
     * Gets the "processingInformation" element
     */
    public org.isotc211.x2005.gmi.LEProcessingPropertyType getProcessingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessingPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessingPropertyType)get_store().find_element_user(PROCESSINGINFORMATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processingInformation" element
     */
    public boolean isSetProcessingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSINGINFORMATION$4) != 0;
        }
    }
    
    /**
     * Sets the "processingInformation" element
     */
    public void setProcessingInformation(org.isotc211.x2005.gmi.LEProcessingPropertyType processingInformation)
    {
        generatedSetterHelperImpl(processingInformation, PROCESSINGINFORMATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "processingInformation" element
     */
    public org.isotc211.x2005.gmi.LEProcessingPropertyType addNewProcessingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessingPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessingPropertyType)get_store().add_element_user(PROCESSINGINFORMATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "processingInformation" element
     */
    public void unsetProcessingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSINGINFORMATION$4, 0);
        }
    }
}
