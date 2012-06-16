/*
 * An XML document type.
 * Localname: MultiplicityRange
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.MultiplicityRangeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one MultiplicityRange(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class MultiplicityRangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.MultiplicityRangeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiplicityRangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPLICITYRANGE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "MultiplicityRange");
    
    
    /**
     * Gets the "MultiplicityRange" element
     */
    public org.isotc211.x2005.gco.MultiplicityRangeType getMultiplicityRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityRangeType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityRangeType)get_store().find_element_user(MULTIPLICITYRANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiplicityRange" element
     */
    public void setMultiplicityRange(org.isotc211.x2005.gco.MultiplicityRangeType multiplicityRange)
    {
        generatedSetterHelperImpl(multiplicityRange, MULTIPLICITYRANGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiplicityRange" element
     */
    public org.isotc211.x2005.gco.MultiplicityRangeType addNewMultiplicityRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityRangeType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityRangeType)get_store().add_element_user(MULTIPLICITYRANGE$0);
            return target;
        }
    }
}
