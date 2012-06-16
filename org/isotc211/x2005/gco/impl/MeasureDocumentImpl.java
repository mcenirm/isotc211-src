/*
 * An XML document type.
 * Localname: Measure
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.MeasureDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Measure(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class MeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.MeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Measure");
    private static final org.apache.xmlbeans.QNameSet MEASURE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Angle"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Length"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Distance"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Scale"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Measure"),
    });
    
    
    /**
     * Gets the "Measure" element
     */
    public net.opengis.gml.x32.MeasureType getMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(MEASURE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Measure" element
     */
    public void setMeasure(net.opengis.gml.x32.MeasureType measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(MEASURE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(MEASURE$0);
            }
            target.set(measure);
        }
    }
    
    /**
     * Appends and returns a new empty "Measure" element
     */
    public net.opengis.gml.x32.MeasureType addNewMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(MEASURE$0);
            return target;
        }
    }
}
