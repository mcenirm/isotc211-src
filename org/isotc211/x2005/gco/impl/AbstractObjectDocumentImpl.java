/*
 * An XML document type.
 * Localname: AbstractObject
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.AbstractObjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one AbstractObject(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class AbstractObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.AbstractObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "AbstractObject");
    
    
    /**
     * Gets the "AbstractObject" element
     */
    public org.isotc211.x2005.gco.AbstractObjectType getAbstractObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.AbstractObjectType target = null;
            target = (org.isotc211.x2005.gco.AbstractObjectType)get_store().find_element_user(ABSTRACTOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractObject" element
     */
    public void setAbstractObject(org.isotc211.x2005.gco.AbstractObjectType abstractObject)
    {
        generatedSetterHelperImpl(abstractObject, ABSTRACTOBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AbstractObject" element
     */
    public org.isotc211.x2005.gco.AbstractObjectType addNewAbstractObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.AbstractObjectType target = null;
            target = (org.isotc211.x2005.gco.AbstractObjectType)get_store().add_element_user(ABSTRACTOBJECT$0);
            return target;
        }
    }
}
