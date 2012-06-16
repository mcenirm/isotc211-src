/*
 * An XML document type.
 * Localname: CI_ResponsibleParty
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIResponsiblePartyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_ResponsibleParty(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIResponsiblePartyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CIResponsiblePartyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIResponsiblePartyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRESPONSIBLEPARTY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_ResponsibleParty");
    
    
    /**
     * Gets the "CI_ResponsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyType getCIResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyType)get_store().find_element_user(CIRESPONSIBLEPARTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_ResponsibleParty" element
     */
    public void setCIResponsibleParty(org.isotc211.x2005.gmd.CIResponsiblePartyType ciResponsibleParty)
    {
        generatedSetterHelperImpl(ciResponsibleParty, CIRESPONSIBLEPARTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_ResponsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyType addNewCIResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyType)get_store().add_element_user(CIRESPONSIBLEPARTY$0);
            return target;
        }
    }
}
