/*
 * An XML document type.
 * Localname: MD_BrowseGraphic
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDBrowseGraphicDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_BrowseGraphic(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDBrowseGraphicDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDBrowseGraphicDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDBrowseGraphicDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDBROWSEGRAPHIC$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_BrowseGraphic");
    
    
    /**
     * Gets the "MD_BrowseGraphic" element
     */
    public org.isotc211.x2005.gmd.MDBrowseGraphicType getMDBrowseGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBrowseGraphicType target = null;
            target = (org.isotc211.x2005.gmd.MDBrowseGraphicType)get_store().find_element_user(MDBROWSEGRAPHIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_BrowseGraphic" element
     */
    public void setMDBrowseGraphic(org.isotc211.x2005.gmd.MDBrowseGraphicType mdBrowseGraphic)
    {
        generatedSetterHelperImpl(mdBrowseGraphic, MDBROWSEGRAPHIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_BrowseGraphic" element
     */
    public org.isotc211.x2005.gmd.MDBrowseGraphicType addNewMDBrowseGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBrowseGraphicType target = null;
            target = (org.isotc211.x2005.gmd.MDBrowseGraphicType)get_store().add_element_user(MDBROWSEGRAPHIC$0);
            return target;
        }
    }
}
