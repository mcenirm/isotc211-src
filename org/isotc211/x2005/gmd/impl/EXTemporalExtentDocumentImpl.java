/*
 * An XML document type.
 * Localname: EX_TemporalExtent
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXTemporalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one EX_TemporalExtent(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class EXTemporalExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.EXTemporalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXTemporalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTEMPORALEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_TemporalExtent");
    private static final org.apache.xmlbeans.QNameSet EXTEMPORALEXTENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_TemporalExtent"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_SpatialTemporalExtent"),
    });
    
    
    /**
     * Gets the "EX_TemporalExtent" element
     */
    public org.isotc211.x2005.gmd.EXTemporalExtentType getEXTemporalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXTemporalExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXTemporalExtentType)get_store().find_element_user(EXTEMPORALEXTENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EX_TemporalExtent" element
     */
    public void setEXTemporalExtent(org.isotc211.x2005.gmd.EXTemporalExtentType exTemporalExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXTemporalExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXTemporalExtentType)get_store().find_element_user(EXTEMPORALEXTENT$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.EXTemporalExtentType)get_store().add_element_user(EXTEMPORALEXTENT$0);
            }
            target.set(exTemporalExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "EX_TemporalExtent" element
     */
    public org.isotc211.x2005.gmd.EXTemporalExtentType addNewEXTemporalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXTemporalExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXTemporalExtentType)get_store().add_element_user(EXTEMPORALEXTENT$0);
            return target;
        }
    }
}
