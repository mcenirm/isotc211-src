/*
 * An XML document type.
 * Localname: MD_RangeDimension
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDRangeDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_RangeDimension(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDRangeDimensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDRangeDimensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDRangeDimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDRANGEDIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_RangeDimension");
    private static final org.apache.xmlbeans.QNameSet MDRANGEDIMENSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Band"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_RangeDimension"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Band"),
    });
    
    
    /**
     * Gets the "MD_RangeDimension" element
     */
    public org.isotc211.x2005.gmd.MDRangeDimensionType getMDRangeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRangeDimensionType target = null;
            target = (org.isotc211.x2005.gmd.MDRangeDimensionType)get_store().find_element_user(MDRANGEDIMENSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_RangeDimension" element
     */
    public void setMDRangeDimension(org.isotc211.x2005.gmd.MDRangeDimensionType mdRangeDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRangeDimensionType target = null;
            target = (org.isotc211.x2005.gmd.MDRangeDimensionType)get_store().find_element_user(MDRANGEDIMENSION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDRangeDimensionType)get_store().add_element_user(MDRANGEDIMENSION$0);
            }
            target.set(mdRangeDimension);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_RangeDimension" element
     */
    public org.isotc211.x2005.gmd.MDRangeDimensionType addNewMDRangeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRangeDimensionType target = null;
            target = (org.isotc211.x2005.gmd.MDRangeDimensionType)get_store().add_element_user(MDRANGEDIMENSION$0);
            return target;
        }
    }
}
