/*
 * An XML document type.
 * Localname: RS_Identifier
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.RSIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one RS_Identifier(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class RSIdentifierDocumentImpl extends org.isotc211.x2005.gmd.impl.MDIdentifierDocumentImpl implements org.isotc211.x2005.gmd.RSIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public RSIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RSIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "RS_Identifier");
    
    
    /**
     * Gets the "RS_Identifier" element
     */
    public org.isotc211.x2005.gmd.RSIdentifierType getRSIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.RSIdentifierType target = null;
            target = (org.isotc211.x2005.gmd.RSIdentifierType)get_store().find_element_user(RSIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RS_Identifier" element
     */
    public void setRSIdentifier(org.isotc211.x2005.gmd.RSIdentifierType rsIdentifier)
    {
        generatedSetterHelperImpl(rsIdentifier, RSIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RS_Identifier" element
     */
    public org.isotc211.x2005.gmd.RSIdentifierType addNewRSIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.RSIdentifierType target = null;
            target = (org.isotc211.x2005.gmd.RSIdentifierType)get_store().add_element_user(RSIDENTIFIER$0);
            return target;
        }
    }
}
