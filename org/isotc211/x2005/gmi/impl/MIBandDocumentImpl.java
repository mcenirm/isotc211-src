/*
 * An XML document type.
 * Localname: MI_Band
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIBandDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Band(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIBandDocumentImpl extends org.isotc211.x2005.gmd.impl.MDBandDocumentImpl implements org.isotc211.x2005.gmi.MIBandDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIBandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIBAND$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Band");
    
    
    /**
     * Gets the "MI_Band" element
     */
    public org.isotc211.x2005.gmi.MIBandType getMIBand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIBandType target = null;
            target = (org.isotc211.x2005.gmi.MIBandType)get_store().find_element_user(MIBAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Band" element
     */
    public void setMIBand(org.isotc211.x2005.gmi.MIBandType miBand)
    {
        generatedSetterHelperImpl(miBand, MIBAND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Band" element
     */
    public org.isotc211.x2005.gmi.MIBandType addNewMIBand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIBandType target = null;
            target = (org.isotc211.x2005.gmi.MIBandType)get_store().add_element_user(MIBAND$0);
            return target;
        }
    }
}
