/*
 * An XML document type.
 * Localname: MI_TransferFunctionTypeCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MITransferFunctionTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_TransferFunctionTypeCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MITransferFunctionTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MITransferFunctionTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MITransferFunctionTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MITRANSFERFUNCTIONTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_TransferFunctionTypeCode");
    
    
    /**
     * Gets the "MI_TransferFunctionTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMITransferFunctionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MITRANSFERFUNCTIONTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_TransferFunctionTypeCode" element
     */
    public void setMITransferFunctionTypeCode(org.isotc211.x2005.gco.CodeListValueType miTransferFunctionTypeCode)
    {
        generatedSetterHelperImpl(miTransferFunctionTypeCode, MITRANSFERFUNCTIONTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_TransferFunctionTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMITransferFunctionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MITRANSFERFUNCTIONTYPECODE$0);
            return target;
        }
    }
}
