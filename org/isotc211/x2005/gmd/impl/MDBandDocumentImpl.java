/*
 * An XML document type.
 * Localname: MD_Band
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDBandDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Band(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDBandDocumentImpl extends org.isotc211.x2005.gmd.impl.MDRangeDimensionDocumentImpl implements org.isotc211.x2005.gmd.MDBandDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDBandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDBAND$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Band");
    private static final org.apache.xmlbeans.QNameSet MDBAND$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Band"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Band"),
    });
    
    
    /**
     * Gets the "MD_Band" element
     */
    public org.isotc211.x2005.gmd.MDBandType getMDBand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBandType target = null;
            target = (org.isotc211.x2005.gmd.MDBandType)get_store().find_element_user(MDBAND$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Band" element
     */
    public void setMDBand(org.isotc211.x2005.gmd.MDBandType mdBand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBandType target = null;
            target = (org.isotc211.x2005.gmd.MDBandType)get_store().find_element_user(MDBAND$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDBandType)get_store().add_element_user(MDBAND$0);
            }
            target.set(mdBand);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_Band" element
     */
    public org.isotc211.x2005.gmd.MDBandType addNewMDBand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBandType target = null;
            target = (org.isotc211.x2005.gmd.MDBandType)get_store().add_element_user(MDBAND$0);
            return target;
        }
    }
}
