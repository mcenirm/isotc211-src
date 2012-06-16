/*
 * An XML document type.
 * Localname: MI_Operation
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIOperationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Operation(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Operation");
    
    
    /**
     * Gets the "MI_Operation" element
     */
    public org.isotc211.x2005.gmi.MIOperationType getMIOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationType)get_store().find_element_user(MIOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Operation" element
     */
    public void setMIOperation(org.isotc211.x2005.gmi.MIOperationType miOperation)
    {
        generatedSetterHelperImpl(miOperation, MIOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Operation" element
     */
    public org.isotc211.x2005.gmi.MIOperationType addNewMIOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationType)get_store().add_element_user(MIOPERATION$0);
            return target;
        }
    }
}
