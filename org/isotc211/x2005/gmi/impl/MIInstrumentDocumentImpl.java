/*
 * An XML document type.
 * Localname: MI_Instrument
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIInstrumentDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Instrument(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIInstrumentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIInstrumentDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIInstrumentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIINSTRUMENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Instrument");
    
    
    /**
     * Gets the "MI_Instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentType getMIInstrument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentType)get_store().find_element_user(MIINSTRUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Instrument" element
     */
    public void setMIInstrument(org.isotc211.x2005.gmi.MIInstrumentType miInstrument)
    {
        generatedSetterHelperImpl(miInstrument, MIINSTRUMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentType addNewMIInstrument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentType)get_store().add_element_user(MIINSTRUMENT$0);
            return target;
        }
    }
}
