/*
 * An XML document type.
 * Localname: RecordType
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.RecordTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one RecordType(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class RecordTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.RecordTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDTYPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "RecordType");
    
    
    /**
     * Gets the "RecordType" element
     */
    public org.isotc211.x2005.gco.RecordTypeType getRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordTypeType target = null;
            target = (org.isotc211.x2005.gco.RecordTypeType)get_store().find_element_user(RECORDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RecordType" element
     */
    public void setRecordType(org.isotc211.x2005.gco.RecordTypeType recordType)
    {
        generatedSetterHelperImpl(recordType, RECORDTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RecordType" element
     */
    public org.isotc211.x2005.gco.RecordTypeType addNewRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordTypeType target = null;
            target = (org.isotc211.x2005.gco.RecordTypeType)get_store().add_element_user(RECORDTYPE$0);
            return target;
        }
    }
}
