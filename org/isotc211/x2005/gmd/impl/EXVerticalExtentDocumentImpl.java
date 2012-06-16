/*
 * An XML document type.
 * Localname: EX_VerticalExtent
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXVerticalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one EX_VerticalExtent(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class EXVerticalExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.EXVerticalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXVerticalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXVERTICALEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_VerticalExtent");
    
    
    /**
     * Gets the "EX_VerticalExtent" element
     */
    public org.isotc211.x2005.gmd.EXVerticalExtentType getEXVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXVerticalExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXVerticalExtentType)get_store().find_element_user(EXVERTICALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EX_VerticalExtent" element
     */
    public void setEXVerticalExtent(org.isotc211.x2005.gmd.EXVerticalExtentType exVerticalExtent)
    {
        generatedSetterHelperImpl(exVerticalExtent, EXVERTICALEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EX_VerticalExtent" element
     */
    public org.isotc211.x2005.gmd.EXVerticalExtentType addNewEXVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXVerticalExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXVerticalExtentType)get_store().add_element_user(EXVERTICALEXTENT$0);
            return target;
        }
    }
}
