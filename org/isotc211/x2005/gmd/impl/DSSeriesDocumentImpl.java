/*
 * An XML document type.
 * Localname: DS_Series
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_Series(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSSeriesDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDSAggregateDocumentImpl implements org.isotc211.x2005.gmd.DSSeriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSSERIES$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Series");
    private static final org.apache.xmlbeans.QNameSet DSSERIES$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Series"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Sensor"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Platform"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_ProductionSeries"),
    });
    
    
    /**
     * Gets the "DS_Series" element
     */
    public org.isotc211.x2005.gmd.DSSeriesType getDSSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSSeriesType target = null;
            target = (org.isotc211.x2005.gmd.DSSeriesType)get_store().find_element_user(DSSERIES$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_Series" element
     */
    public void setDSSeries(org.isotc211.x2005.gmd.DSSeriesType dsSeries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSSeriesType target = null;
            target = (org.isotc211.x2005.gmd.DSSeriesType)get_store().find_element_user(DSSERIES$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.DSSeriesType)get_store().add_element_user(DSSERIES$0);
            }
            target.set(dsSeries);
        }
    }
    
    /**
     * Appends and returns a new empty "DS_Series" element
     */
    public org.isotc211.x2005.gmd.DSSeriesType addNewDSSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSSeriesType target = null;
            target = (org.isotc211.x2005.gmd.DSSeriesType)get_store().add_element_user(DSSERIES$0);
            return target;
        }
    }
}
