/*
 * An XML document type.
 * Localname: LE_Source
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LESourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one LE_Source(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class LESourceDocumentImpl extends org.isotc211.x2005.gmd.impl.LISourceDocumentImpl implements org.isotc211.x2005.gmi.LESourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public LESourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_Source");
    
    
    /**
     * Gets the "LE_Source" element
     */
    public org.isotc211.x2005.gmi.LESourceType getLESource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LESourceType target = null;
            target = (org.isotc211.x2005.gmi.LESourceType)get_store().find_element_user(LESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LE_Source" element
     */
    public void setLESource(org.isotc211.x2005.gmi.LESourceType leSource)
    {
        generatedSetterHelperImpl(leSource, LESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LE_Source" element
     */
    public org.isotc211.x2005.gmi.LESourceType addNewLESource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LESourceType target = null;
            target = (org.isotc211.x2005.gmi.LESourceType)get_store().add_element_user(LESOURCE$0);
            return target;
        }
    }
}
