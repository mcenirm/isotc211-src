/*
 * An XML document type.
 * Localname: ScopedName
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.ScopedNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one ScopedName(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class ScopedNameDocumentImpl extends org.isotc211.x2005.gco.impl.AbstractGenericNameDocumentImpl implements org.isotc211.x2005.gco.ScopedNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScopedNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPEDNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "ScopedName");
    
    
    /**
     * Gets the "ScopedName" element
     */
    public net.opengis.gml.x32.CodeType getScopedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(SCOPEDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ScopedName" element
     */
    public void setScopedName(net.opengis.gml.x32.CodeType scopedName)
    {
        generatedSetterHelperImpl(scopedName, SCOPEDNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ScopedName" element
     */
    public net.opengis.gml.x32.CodeType addNewScopedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(SCOPEDNAME$0);
            return target;
        }
    }
}
