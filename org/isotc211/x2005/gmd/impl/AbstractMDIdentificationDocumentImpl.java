/*
 * An XML document type.
 * Localname: AbstractMD_Identification
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractMDIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractMD_Identification(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractMDIdentificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractMDIdentificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMDIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTMDIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractMD_Identification");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTMDIDENTIFICATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ServiceIdentification"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractMD_Identification"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DataIdentification"),
    });
    
    
    /**
     * Gets the "AbstractMD_Identification" element
     */
    public org.isotc211.x2005.gmd.AbstractMDIdentificationType getAbstractMDIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDIdentificationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDIdentificationType)get_store().find_element_user(ABSTRACTMDIDENTIFICATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractMD_Identification" element
     */
    public void setAbstractMDIdentification(org.isotc211.x2005.gmd.AbstractMDIdentificationType abstractMDIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDIdentificationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDIdentificationType)get_store().find_element_user(ABSTRACTMDIDENTIFICATION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractMDIdentificationType)get_store().add_element_user(ABSTRACTMDIDENTIFICATION$0);
            }
            target.set(abstractMDIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractMD_Identification" element
     */
    public org.isotc211.x2005.gmd.AbstractMDIdentificationType addNewAbstractMDIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractMDIdentificationType target = null;
            target = (org.isotc211.x2005.gmd.AbstractMDIdentificationType)get_store().add_element_user(ABSTRACTMDIDENTIFICATION$0);
            return target;
        }
    }
}
