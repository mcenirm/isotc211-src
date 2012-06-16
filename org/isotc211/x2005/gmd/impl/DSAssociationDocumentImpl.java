/*
 * An XML document type.
 * Localname: DS_Association
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_Association(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.DSAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Association");
    
    
    /**
     * Gets the "DS_Association" element
     */
    public org.isotc211.x2005.gmd.DSAssociationType getDSAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAssociationType target = null;
            target = (org.isotc211.x2005.gmd.DSAssociationType)get_store().find_element_user(DSASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_Association" element
     */
    public void setDSAssociation(org.isotc211.x2005.gmd.DSAssociationType dsAssociation)
    {
        generatedSetterHelperImpl(dsAssociation, DSASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_Association" element
     */
    public org.isotc211.x2005.gmd.DSAssociationType addNewDSAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAssociationType target = null;
            target = (org.isotc211.x2005.gmd.DSAssociationType)get_store().add_element_user(DSASSOCIATION$0);
            return target;
        }
    }
}
