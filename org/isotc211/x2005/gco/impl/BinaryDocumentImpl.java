/*
 * An XML document type.
 * Localname: Binary
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.BinaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Binary(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class BinaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.BinaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public BinaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Binary");
    
    
    /**
     * Gets the "Binary" element
     */
    public org.isotc211.x2005.gco.BinaryType getBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryType target = null;
            target = (org.isotc211.x2005.gco.BinaryType)get_store().find_element_user(BINARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Binary" element
     */
    public void setBinary(org.isotc211.x2005.gco.BinaryType binary)
    {
        generatedSetterHelperImpl(binary, BINARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Binary" element
     */
    public org.isotc211.x2005.gco.BinaryType addNewBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryType target = null;
            target = (org.isotc211.x2005.gco.BinaryType)get_store().add_element_user(BINARY$0);
            return target;
        }
    }
}
