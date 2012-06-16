/*
 * An XML document type.
 * Localname: MD_FeatureCatalogueDescription
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_FeatureCatalogueDescription(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDFeatureCatalogueDescriptionDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractMDContentInformationDocumentImpl implements org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDFeatureCatalogueDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDFEATURECATALOGUEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_FeatureCatalogueDescription");
    
    
    /**
     * Gets the "MD_FeatureCatalogueDescription" element
     */
    public org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType getMDFeatureCatalogueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType)get_store().find_element_user(MDFEATURECATALOGUEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_FeatureCatalogueDescription" element
     */
    public void setMDFeatureCatalogueDescription(org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType mdFeatureCatalogueDescription)
    {
        generatedSetterHelperImpl(mdFeatureCatalogueDescription, MDFEATURECATALOGUEDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_FeatureCatalogueDescription" element
     */
    public org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType addNewMDFeatureCatalogueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType)get_store().add_element_user(MDFEATURECATALOGUEDESCRIPTION$0);
            return target;
        }
    }
}
