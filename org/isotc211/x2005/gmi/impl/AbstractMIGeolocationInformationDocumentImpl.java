/*
 * An XML document type.
 * Localname: AbstractMI_GeolocationInformation
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.AbstractMIGeolocationInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one AbstractMI_GeolocationInformation(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class AbstractMIGeolocationInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.AbstractMIGeolocationInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMIGeolocationInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTMIGEOLOCATIONINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "AbstractMI_GeolocationInformation");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTMIGEOLOCATIONINFORMATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "AbstractMI_GeolocationInformation"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_GCPCollection"),
    });
    
    
    /**
     * Gets the "AbstractMI_GeolocationInformation" element
     */
    public org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType getAbstractMIGeolocationInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType target = null;
            target = (org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType)get_store().find_element_user(ABSTRACTMIGEOLOCATIONINFORMATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractMI_GeolocationInformation" element
     */
    public void setAbstractMIGeolocationInformation(org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType abstractMIGeolocationInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType target = null;
            target = (org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType)get_store().find_element_user(ABSTRACTMIGEOLOCATIONINFORMATION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType)get_store().add_element_user(ABSTRACTMIGEOLOCATIONINFORMATION$0);
            }
            target.set(abstractMIGeolocationInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractMI_GeolocationInformation" element
     */
    public org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType addNewAbstractMIGeolocationInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType target = null;
            target = (org.isotc211.x2005.gmi.AbstractMIGeolocationInformationType)get_store().add_element_user(ABSTRACTMIGEOLOCATIONINFORMATION$0);
            return target;
        }
    }
}
