/*
 * An XML document type.
 * Localname: PT_LocaleContainer
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.PTLocaleContainerDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one PT_LocaleContainer(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class PTLocaleContainerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.PTLocaleContainerDocument
{
    private static final long serialVersionUID = 1L;
    
    public PTLocaleContainerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PTLOCALECONTAINER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "PT_LocaleContainer");
    
    
    /**
     * Gets the "PT_LocaleContainer" element
     */
    public org.isotc211.x2005.gmd.PTLocaleContainerType getPTLocaleContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocaleContainerType target = null;
            target = (org.isotc211.x2005.gmd.PTLocaleContainerType)get_store().find_element_user(PTLOCALECONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PT_LocaleContainer" element
     */
    public void setPTLocaleContainer(org.isotc211.x2005.gmd.PTLocaleContainerType ptLocaleContainer)
    {
        generatedSetterHelperImpl(ptLocaleContainer, PTLOCALECONTAINER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PT_LocaleContainer" element
     */
    public org.isotc211.x2005.gmd.PTLocaleContainerType addNewPTLocaleContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocaleContainerType target = null;
            target = (org.isotc211.x2005.gmd.PTLocaleContainerType)get_store().add_element_user(PTLOCALECONTAINER$0);
            return target;
        }
    }
}
