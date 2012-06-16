/*
 * An XML document type.
 * Localname: MI_EnvironmentalRecord
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIEnvironmentalRecordDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_EnvironmentalRecord(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIEnvironmentalRecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIEnvironmentalRecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIEnvironmentalRecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIENVIRONMENTALRECORD$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_EnvironmentalRecord");
    
    
    /**
     * Gets the "MI_EnvironmentalRecord" element
     */
    public org.isotc211.x2005.gmi.MIEnvironmentalRecordType getMIEnvironmentalRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEnvironmentalRecordType target = null;
            target = (org.isotc211.x2005.gmi.MIEnvironmentalRecordType)get_store().find_element_user(MIENVIRONMENTALRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_EnvironmentalRecord" element
     */
    public void setMIEnvironmentalRecord(org.isotc211.x2005.gmi.MIEnvironmentalRecordType miEnvironmentalRecord)
    {
        generatedSetterHelperImpl(miEnvironmentalRecord, MIENVIRONMENTALRECORD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_EnvironmentalRecord" element
     */
    public org.isotc211.x2005.gmi.MIEnvironmentalRecordType addNewMIEnvironmentalRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEnvironmentalRecordType target = null;
            target = (org.isotc211.x2005.gmi.MIEnvironmentalRecordType)get_store().add_element_user(MIENVIRONMENTALRECORD$0);
            return target;
        }
    }
}
