/*
 * An XML document type.
 * Localname: MI_BandDefinition
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIBandDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_BandDefinition(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIBandDefinitionDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MIBandDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIBandDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIBANDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_BandDefinition");
    
    
    /**
     * Gets the "MI_BandDefinition" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMIBandDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MIBANDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_BandDefinition" element
     */
    public void setMIBandDefinition(org.isotc211.x2005.gco.CodeListValueType miBandDefinition)
    {
        generatedSetterHelperImpl(miBandDefinition, MIBANDDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_BandDefinition" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMIBandDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MIBANDDEFINITION$0);
            return target;
        }
    }
}
