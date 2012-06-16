/*
 * An XML document type.
 * Localname: MemberName
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.MemberNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one MemberName(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class MemberNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.MemberNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemberNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "MemberName");
    
    
    /**
     * Gets the "MemberName" element
     */
    public org.isotc211.x2005.gco.MemberNameType getMemberName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MemberNameType target = null;
            target = (org.isotc211.x2005.gco.MemberNameType)get_store().find_element_user(MEMBERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MemberName" element
     */
    public void setMemberName(org.isotc211.x2005.gco.MemberNameType memberName)
    {
        generatedSetterHelperImpl(memberName, MEMBERNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MemberName" element
     */
    public org.isotc211.x2005.gco.MemberNameType addNewMemberName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MemberNameType target = null;
            target = (org.isotc211.x2005.gco.MemberNameType)get_store().add_element_user(MEMBERNAME$0);
            return target;
        }
    }
}
