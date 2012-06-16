/*
 * An XML document type.
 * Localname: TypeName
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.TypeNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one TypeName(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class TypeNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.TypeNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPENAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "TypeName");
    
    
    /**
     * Gets the "TypeName" element
     */
    public org.isotc211.x2005.gco.TypeNameType getTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.TypeNameType target = null;
            target = (org.isotc211.x2005.gco.TypeNameType)get_store().find_element_user(TYPENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TypeName" element
     */
    public void setTypeName(org.isotc211.x2005.gco.TypeNameType typeName)
    {
        generatedSetterHelperImpl(typeName, TYPENAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TypeName" element
     */
    public org.isotc211.x2005.gco.TypeNameType addNewTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.TypeNameType target = null;
            target = (org.isotc211.x2005.gco.TypeNameType)get_store().add_element_user(TYPENAME$0);
            return target;
        }
    }
}
