/*
 * An XML document type.
 * Localname: CI_Series
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CISeriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_Series(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CISeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CISeriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public CISeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CISERIES$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_Series");
    
    
    /**
     * Gets the "CI_Series" element
     */
    public org.isotc211.x2005.gmd.CISeriesType getCISeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CISeriesType target = null;
            target = (org.isotc211.x2005.gmd.CISeriesType)get_store().find_element_user(CISERIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_Series" element
     */
    public void setCISeries(org.isotc211.x2005.gmd.CISeriesType ciSeries)
    {
        generatedSetterHelperImpl(ciSeries, CISERIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_Series" element
     */
    public org.isotc211.x2005.gmd.CISeriesType addNewCISeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CISeriesType target = null;
            target = (org.isotc211.x2005.gmd.CISeriesType)get_store().add_element_user(CISERIES$0);
            return target;
        }
    }
}
