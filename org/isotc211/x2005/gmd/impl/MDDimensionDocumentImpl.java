/*
 * An XML document type.
 * Localname: MD_Dimension
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Dimension(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDimensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDDimensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Dimension");
    
    
    /**
     * Gets the "MD_Dimension" element
     */
    public org.isotc211.x2005.gmd.MDDimensionType getMDDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionType)get_store().find_element_user(MDDIMENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Dimension" element
     */
    public void setMDDimension(org.isotc211.x2005.gmd.MDDimensionType mdDimension)
    {
        generatedSetterHelperImpl(mdDimension, MDDIMENSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Dimension" element
     */
    public org.isotc211.x2005.gmd.MDDimensionType addNewMDDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionType)get_store().add_element_user(MDDIMENSION$0);
            return target;
        }
    }
}
