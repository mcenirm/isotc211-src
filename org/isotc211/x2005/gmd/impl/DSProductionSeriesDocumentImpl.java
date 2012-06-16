/*
 * An XML document type.
 * Localname: DS_ProductionSeries
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSProductionSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_ProductionSeries(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSProductionSeriesDocumentImpl extends org.isotc211.x2005.gmd.impl.DSSeriesDocumentImpl implements org.isotc211.x2005.gmd.DSProductionSeriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSProductionSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSPRODUCTIONSERIES$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_ProductionSeries");
    
    
    /**
     * Gets the "DS_ProductionSeries" element
     */
    public org.isotc211.x2005.gmd.DSProductionSeriesType getDSProductionSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSProductionSeriesType target = null;
            target = (org.isotc211.x2005.gmd.DSProductionSeriesType)get_store().find_element_user(DSPRODUCTIONSERIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_ProductionSeries" element
     */
    public void setDSProductionSeries(org.isotc211.x2005.gmd.DSProductionSeriesType dsProductionSeries)
    {
        generatedSetterHelperImpl(dsProductionSeries, DSPRODUCTIONSERIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_ProductionSeries" element
     */
    public org.isotc211.x2005.gmd.DSProductionSeriesType addNewDSProductionSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSProductionSeriesType target = null;
            target = (org.isotc211.x2005.gmd.DSProductionSeriesType)get_store().add_element_user(DSPRODUCTIONSERIES$0);
            return target;
        }
    }
}
