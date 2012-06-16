/*
 * XML Type:  DQ_DataQuality_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQDataQualityType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML DQ_DataQuality_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class DQDataQualityTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.DQDataQualityType
{
    private static final long serialVersionUID = 1L;
    
    public DQDataQualityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "scope");
    private static final javax.xml.namespace.QName REPORT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "report");
    private static final javax.xml.namespace.QName LINEAGE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "lineage");
    
    
    /**
     * Gets the "scope" element
     */
    public org.isotc211.x2005.gmd.DQScopePropertyType getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQScopePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQScopePropertyType)get_store().find_element_user(SCOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    public void setScope(org.isotc211.x2005.gmd.DQScopePropertyType scope)
    {
        generatedSetterHelperImpl(scope, SCOPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scope" element
     */
    public org.isotc211.x2005.gmd.DQScopePropertyType addNewScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQScopePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQScopePropertyType)get_store().add_element_user(SCOPE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "report" elements
     */
    public org.isotc211.x2005.gmd.DQElementPropertyType[] getReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORT$2, targetList);
            org.isotc211.x2005.gmd.DQElementPropertyType[] result = new org.isotc211.x2005.gmd.DQElementPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "report" element
     */
    public org.isotc211.x2005.gmd.DQElementPropertyType getReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().find_element_user(REPORT$2, i);
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
    public void setReportArray(org.isotc211.x2005.gmd.DQElementPropertyType[] reportArray)
    {
        check_orphaned();
        arraySetterHelper(reportArray, REPORT$2);
    }
    
    /**
     * Sets ith "report" element
     */
    public void setReportArray(int i, org.isotc211.x2005.gmd.DQElementPropertyType report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().find_element_user(REPORT$2, i);
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
    public org.isotc211.x2005.gmd.DQElementPropertyType insertNewReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().insert_element_user(REPORT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "report" element
     */
    public org.isotc211.x2005.gmd.DQElementPropertyType addNewReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQElementPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQElementPropertyType)get_store().add_element_user(REPORT$2);
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
     * Gets the "lineage" element
     */
    public org.isotc211.x2005.gmd.LILineagePropertyType getLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LILineagePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LILineagePropertyType)get_store().find_element_user(LINEAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lineage" element
     */
    public boolean isSetLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINEAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "lineage" element
     */
    public void setLineage(org.isotc211.x2005.gmd.LILineagePropertyType lineage)
    {
        generatedSetterHelperImpl(lineage, LINEAGE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lineage" element
     */
    public org.isotc211.x2005.gmd.LILineagePropertyType addNewLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LILineagePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LILineagePropertyType)get_store().add_element_user(LINEAGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "lineage" element
     */
    public void unsetLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINEAGE$4, 0);
        }
    }
}
