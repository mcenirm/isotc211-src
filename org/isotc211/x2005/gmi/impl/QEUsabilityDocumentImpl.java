/*
 * An XML document type.
 * Localname: QE_Usability
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.QEUsabilityDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one QE_Usability(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class QEUsabilityDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQElementDocumentImpl implements org.isotc211.x2005.gmi.QEUsabilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public QEUsabilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QEUSABILITY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "QE_Usability");
    
    
    /**
     * Gets the "QE_Usability" element
     */
    public org.isotc211.x2005.gmi.QEUsabilityType getQEUsability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.QEUsabilityType target = null;
            target = (org.isotc211.x2005.gmi.QEUsabilityType)get_store().find_element_user(QEUSABILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QE_Usability" element
     */
    public void setQEUsability(org.isotc211.x2005.gmi.QEUsabilityType qeUsability)
    {
        generatedSetterHelperImpl(qeUsability, QEUSABILITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QE_Usability" element
     */
    public org.isotc211.x2005.gmi.QEUsabilityType addNewQEUsability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.QEUsabilityType target = null;
            target = (org.isotc211.x2005.gmi.QEUsabilityType)get_store().add_element_user(QEUSABILITY$0);
            return target;
        }
    }
}
