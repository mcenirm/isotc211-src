/*
 * An XML document type.
 * Localname: DS_AssociationTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSAssociationTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_AssociationTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSAssociationTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.DSAssociationTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSAssociationTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSASSOCIATIONTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_AssociationTypeCode");
    
    
    /**
     * Gets the "DS_AssociationTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getDSAssociationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(DSASSOCIATIONTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_AssociationTypeCode" element
     */
    public void setDSAssociationTypeCode(org.isotc211.x2005.gco.CodeListValueType dsAssociationTypeCode)
    {
        generatedSetterHelperImpl(dsAssociationTypeCode, DSASSOCIATIONTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_AssociationTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewDSAssociationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(DSASSOCIATIONTYPECODE$0);
            return target;
        }
    }
}
