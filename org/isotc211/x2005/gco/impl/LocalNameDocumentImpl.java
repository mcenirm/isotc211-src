/*
 * An XML document type.
 * Localname: LocalName
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.LocalNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one LocalName(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class LocalNameDocumentImpl extends org.isotc211.x2005.gco.impl.AbstractGenericNameDocumentImpl implements org.isotc211.x2005.gco.LocalNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocalNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "LocalName");
    
    
    /**
     * Gets the "LocalName" element
     */
    public net.opengis.gml.x32.CodeType getLocalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(LOCALNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocalName" element
     */
    public void setLocalName(net.opengis.gml.x32.CodeType localName)
    {
        generatedSetterHelperImpl(localName, LOCALNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocalName" element
     */
    public net.opengis.gml.x32.CodeType addNewLocalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(LOCALNAME$0);
            return target;
        }
    }
}
