/*
 * An XML document type.
 * Localname: LE_Processing
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessingDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one LE_Processing(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class LEProcessingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.LEProcessingDocument
{
    private static final long serialVersionUID = 1L;
    
    public LEProcessingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEPROCESSING$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_Processing");
    
    
    /**
     * Gets the "LE_Processing" element
     */
    public org.isotc211.x2005.gmi.LEProcessingType getLEProcessing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessingType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessingType)get_store().find_element_user(LEPROCESSING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LE_Processing" element
     */
    public void setLEProcessing(org.isotc211.x2005.gmi.LEProcessingType leProcessing)
    {
        generatedSetterHelperImpl(leProcessing, LEPROCESSING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LE_Processing" element
     */
    public org.isotc211.x2005.gmi.LEProcessingType addNewLEProcessing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEProcessingType target = null;
            target = (org.isotc211.x2005.gmi.LEProcessingType)get_store().add_element_user(LEPROCESSING$0);
            return target;
        }
    }
}
