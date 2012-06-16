/*
 * An XML document type.
 * Localname: EX_SpatialTemporalExtent
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXSpatialTemporalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one EX_SpatialTemporalExtent(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class EXSpatialTemporalExtentDocumentImpl extends org.isotc211.x2005.gmd.impl.EXTemporalExtentDocumentImpl implements org.isotc211.x2005.gmd.EXSpatialTemporalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXSpatialTemporalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXSPATIALTEMPORALEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_SpatialTemporalExtent");
    
    
    /**
     * Gets the "EX_SpatialTemporalExtent" element
     */
    public org.isotc211.x2005.gmd.EXSpatialTemporalExtentType getEXSpatialTemporalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXSpatialTemporalExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXSpatialTemporalExtentType)get_store().find_element_user(EXSPATIALTEMPORALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EX_SpatialTemporalExtent" element
     */
    public void setEXSpatialTemporalExtent(org.isotc211.x2005.gmd.EXSpatialTemporalExtentType exSpatialTemporalExtent)
    {
        generatedSetterHelperImpl(exSpatialTemporalExtent, EXSPATIALTEMPORALEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EX_SpatialTemporalExtent" element
     */
    public org.isotc211.x2005.gmd.EXSpatialTemporalExtentType addNewEXSpatialTemporalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXSpatialTemporalExtentType target = null;
            target = (org.isotc211.x2005.gmd.EXSpatialTemporalExtentType)get_store().add_element_user(EXSPATIALTEMPORALEXTENT$0);
            return target;
        }
    }
}
