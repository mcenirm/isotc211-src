/*
 * An XML document type.
 * Localname: Record
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.RecordDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Record(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class RecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.RecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORD$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Record");
    
    
    /**
     * Gets the "Record" element
     */
    public org.apache.xmlbeans.XmlObject getRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Record" element
     */
    public void setRecord(org.apache.xmlbeans.XmlObject record)
    {
        generatedSetterHelperImpl(record, RECORD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Record" element
     */
    public org.apache.xmlbeans.XmlObject addNewRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(RECORD$0);
            return target;
        }
    }
}
