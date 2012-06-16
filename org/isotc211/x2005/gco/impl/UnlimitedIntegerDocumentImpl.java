/*
 * An XML document type.
 * Localname: UnlimitedInteger
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.UnlimitedIntegerDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one UnlimitedInteger(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class UnlimitedIntegerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.UnlimitedIntegerDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnlimitedIntegerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNLIMITEDINTEGER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "UnlimitedInteger");
    
    
    /**
     * Gets the "UnlimitedInteger" element
     */
    public org.isotc211.x2005.gco.UnlimitedIntegerType getUnlimitedInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnlimitedIntegerType target = null;
            target = (org.isotc211.x2005.gco.UnlimitedIntegerType)get_store().find_element_user(UNLIMITEDINTEGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "UnlimitedInteger" element
     */
    public boolean isNilUnlimitedInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnlimitedIntegerType target = null;
            target = (org.isotc211.x2005.gco.UnlimitedIntegerType)get_store().find_element_user(UNLIMITEDINTEGER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "UnlimitedInteger" element
     */
    public void setUnlimitedInteger(org.isotc211.x2005.gco.UnlimitedIntegerType unlimitedInteger)
    {
        generatedSetterHelperImpl(unlimitedInteger, UNLIMITEDINTEGER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UnlimitedInteger" element
     */
    public org.isotc211.x2005.gco.UnlimitedIntegerType addNewUnlimitedInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnlimitedIntegerType target = null;
            target = (org.isotc211.x2005.gco.UnlimitedIntegerType)get_store().add_element_user(UNLIMITEDINTEGER$0);
            return target;
        }
    }
    
    /**
     * Nils the "UnlimitedInteger" element
     */
    public void setNilUnlimitedInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnlimitedIntegerType target = null;
            target = (org.isotc211.x2005.gco.UnlimitedIntegerType)get_store().find_element_user(UNLIMITEDINTEGER$0, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gco.UnlimitedIntegerType)get_store().add_element_user(UNLIMITEDINTEGER$0);
            }
            target.setNil();
        }
    }
}
