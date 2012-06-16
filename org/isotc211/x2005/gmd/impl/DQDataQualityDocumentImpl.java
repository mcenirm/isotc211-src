/*
 * An XML document type.
 * Localname: DQ_DataQuality
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQDataQualityDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_DataQuality(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQDataQualityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.DQDataQualityDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQDataQualityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQDATAQUALITY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_DataQuality");
    
    
    /**
     * Gets the "DQ_DataQuality" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityType getDQDataQuality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityType)get_store().find_element_user(DQDATAQUALITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_DataQuality" element
     */
    public void setDQDataQuality(org.isotc211.x2005.gmd.DQDataQualityType dqDataQuality)
    {
        generatedSetterHelperImpl(dqDataQuality, DQDATAQUALITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_DataQuality" element
     */
    public org.isotc211.x2005.gmd.DQDataQualityType addNewDQDataQuality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDataQualityType target = null;
            target = (org.isotc211.x2005.gmd.DQDataQualityType)get_store().add_element_user(DQDATAQUALITY$0);
            return target;
        }
    }
}
