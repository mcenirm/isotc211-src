/*
 * An XML document type.
 * Localname: AbstractGenericName
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.AbstractGenericNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one AbstractGenericName(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class AbstractGenericNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.AbstractGenericNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGenericNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERICNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "AbstractGenericName");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGENERICNAME$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "ScopedName"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "AbstractGenericName"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "LocalName"),
    });
    
    
    /**
     * Gets the "AbstractGenericName" element
     */
    public net.opengis.gml.x32.CodeType getAbstractGenericName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ABSTRACTGENERICNAME$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGenericName" element
     */
    public void setAbstractGenericName(net.opengis.gml.x32.CodeType abstractGenericName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ABSTRACTGENERICNAME$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ABSTRACTGENERICNAME$0);
            }
            target.set(abstractGenericName);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGenericName" element
     */
    public net.opengis.gml.x32.CodeType addNewAbstractGenericName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ABSTRACTGENERICNAME$0);
            return target;
        }
    }
}
