/*
 * An XML document type.
 * Localname: EX_Extent
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXExtentDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one EX_Extent(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class EXExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.EXExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_Extent");
    
    
    /**
     * Gets the "EX_Extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentType getEXExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentType)get_store().find_element_user(EXEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EX_Extent" element
     */
    public void setEXExtent(org.isotc211.x2005.gmd.EXExtentType exExtent)
    {
        generatedSetterHelperImpl(exExtent, EXEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EX_Extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentType addNewEXExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentType)get_store().add_element_user(EXEXTENT$0);
            return target;
        }
    }
}
