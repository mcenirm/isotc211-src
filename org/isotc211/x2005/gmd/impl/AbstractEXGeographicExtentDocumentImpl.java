/*
 * An XML document type.
 * Localname: AbstractEX_GeographicExtent
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractEXGeographicExtentDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractEX_GeographicExtent(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractEXGeographicExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractEXGeographicExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractEXGeographicExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTEXGEOGRAPHICEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractEX_GeographicExtent");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTEXGEOGRAPHICEXTENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_GeographicBoundingBox"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_BoundingPolygon"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractEX_GeographicExtent"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_GeographicDescription"),
    });
    
    
    /**
     * Gets the "AbstractEX_GeographicExtent" element
     */
    public org.isotc211.x2005.gmd.AbstractEXGeographicExtentType getAbstractEXGeographicExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractEXGeographicExtentType target = null;
            target = (org.isotc211.x2005.gmd.AbstractEXGeographicExtentType)get_store().find_element_user(ABSTRACTEXGEOGRAPHICEXTENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractEX_GeographicExtent" element
     */
    public void setAbstractEXGeographicExtent(org.isotc211.x2005.gmd.AbstractEXGeographicExtentType abstractEXGeographicExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractEXGeographicExtentType target = null;
            target = (org.isotc211.x2005.gmd.AbstractEXGeographicExtentType)get_store().find_element_user(ABSTRACTEXGEOGRAPHICEXTENT$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractEXGeographicExtentType)get_store().add_element_user(ABSTRACTEXGEOGRAPHICEXTENT$0);
            }
            target.set(abstractEXGeographicExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractEX_GeographicExtent" element
     */
    public org.isotc211.x2005.gmd.AbstractEXGeographicExtentType addNewAbstractEXGeographicExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractEXGeographicExtentType target = null;
            target = (org.isotc211.x2005.gmd.AbstractEXGeographicExtentType)get_store().add_element_user(ABSTRACTEXGEOGRAPHICEXTENT$0);
            return target;
        }
    }
}
