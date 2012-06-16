/*
 * An XML document type.
 * Localname: MI_Georeferenceable
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGeoreferenceableDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Georeferenceable(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIGeoreferenceableDocumentImpl extends org.isotc211.x2005.gmd.impl.MDGeoreferenceableDocumentImpl implements org.isotc211.x2005.gmi.MIGeoreferenceableDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIGeoreferenceableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIGEOREFERENCEABLE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georeferenceable");
    
    
    /**
     * Gets the "MI_Georeferenceable" element
     */
    public org.isotc211.x2005.gmi.MIGeoreferenceableType getMIGeoreferenceable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeoreferenceableType target = null;
            target = (org.isotc211.x2005.gmi.MIGeoreferenceableType)get_store().find_element_user(MIGEOREFERENCEABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Georeferenceable" element
     */
    public void setMIGeoreferenceable(org.isotc211.x2005.gmi.MIGeoreferenceableType miGeoreferenceable)
    {
        generatedSetterHelperImpl(miGeoreferenceable, MIGEOREFERENCEABLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Georeferenceable" element
     */
    public org.isotc211.x2005.gmi.MIGeoreferenceableType addNewMIGeoreferenceable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeoreferenceableType target = null;
            target = (org.isotc211.x2005.gmi.MIGeoreferenceableType)get_store().add_element_user(MIGEOREFERENCEABLE$0);
            return target;
        }
    }
}
