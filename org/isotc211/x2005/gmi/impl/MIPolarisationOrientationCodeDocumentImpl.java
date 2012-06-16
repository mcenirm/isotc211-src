/*
 * An XML document type.
 * Localname: MI_PolarisationOrientationCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPolarisationOrientationCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_PolarisationOrientationCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIPolarisationOrientationCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MIPolarisationOrientationCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIPolarisationOrientationCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIPOLARISATIONORIENTATIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_PolarisationOrientationCode");
    
    
    /**
     * Gets the "MI_PolarisationOrientationCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMIPolarisationOrientationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MIPOLARISATIONORIENTATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_PolarisationOrientationCode" element
     */
    public void setMIPolarisationOrientationCode(org.isotc211.x2005.gco.CodeListValueType miPolarisationOrientationCode)
    {
        generatedSetterHelperImpl(miPolarisationOrientationCode, MIPOLARISATIONORIENTATIONCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_PolarisationOrientationCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMIPolarisationOrientationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MIPOLARISATIONORIENTATIONCODE$0);
            return target;
        }
    }
}
