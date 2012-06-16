/*
 * An XML document type.
 * Localname: DS_DataSet
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_DataSet(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSDataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.DSDataSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSDataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSDATASET$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_DataSet");
    
    
    /**
     * Gets the "DS_DataSet" element
     */
    public org.isotc211.x2005.gmd.DSDataSetType getDSDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetType)get_store().find_element_user(DSDATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_DataSet" element
     */
    public void setDSDataSet(org.isotc211.x2005.gmd.DSDataSetType dsDataSet)
    {
        generatedSetterHelperImpl(dsDataSet, DSDATASET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_DataSet" element
     */
    public org.isotc211.x2005.gmd.DSDataSetType addNewDSDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSDataSetType target = null;
            target = (org.isotc211.x2005.gmd.DSDataSetType)get_store().add_element_user(DSDATASET$0);
            return target;
        }
    }
}
