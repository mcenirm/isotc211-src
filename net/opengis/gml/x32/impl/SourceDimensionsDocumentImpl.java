/*
 * An XML document type.
 * Localname: sourceDimensions
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SourceDimensionsDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one sourceDimensions(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SourceDimensionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SourceDimensionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDimensionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDIMENSIONS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sourceDimensions");
    
    
    /**
     * Gets the "sourceDimensions" element
     */
    public java.math.BigInteger getSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceDimensions" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceDimensions" element
     */
    public void setSourceDimensions(java.math.BigInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDIMENSIONS$0);
            }
            target.setBigIntegerValue(sourceDimensions);
        }
    }
    
    /**
     * Sets (as xml) the "sourceDimensions" element
     */
    public void xsetSourceDimensions(org.apache.xmlbeans.XmlPositiveInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(SOURCEDIMENSIONS$0);
            }
            target.set(sourceDimensions);
        }
    }
}
