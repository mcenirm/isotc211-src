/*
 * An XML document type.
 * Localname: LE_Algorithm
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEAlgorithmDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one LE_Algorithm(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class LEAlgorithmDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.LEAlgorithmDocument
{
    private static final long serialVersionUID = 1L;
    
    public LEAlgorithmDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEALGORITHM$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_Algorithm");
    
    
    /**
     * Gets the "LE_Algorithm" element
     */
    public org.isotc211.x2005.gmi.LEAlgorithmType getLEAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEAlgorithmType target = null;
            target = (org.isotc211.x2005.gmi.LEAlgorithmType)get_store().find_element_user(LEALGORITHM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LE_Algorithm" element
     */
    public void setLEAlgorithm(org.isotc211.x2005.gmi.LEAlgorithmType leAlgorithm)
    {
        generatedSetterHelperImpl(leAlgorithm, LEALGORITHM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LE_Algorithm" element
     */
    public org.isotc211.x2005.gmi.LEAlgorithmType addNewLEAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEAlgorithmType target = null;
            target = (org.isotc211.x2005.gmi.LEAlgorithmType)get_store().add_element_user(LEALGORITHM$0);
            return target;
        }
    }
}
