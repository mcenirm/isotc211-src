/*
 * An XML document type.
 * Localname: DS_StereoMate
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSStereoMateDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_StereoMate(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSStereoMateDocumentImpl extends org.isotc211.x2005.gmd.impl.DSOtherAggregateDocumentImpl implements org.isotc211.x2005.gmd.DSStereoMateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSStereoMateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSSTEREOMATE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_StereoMate");
    
    
    /**
     * Gets the "DS_StereoMate" element
     */
    public org.isotc211.x2005.gmd.DSStereoMateType getDSStereoMate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSStereoMateType target = null;
            target = (org.isotc211.x2005.gmd.DSStereoMateType)get_store().find_element_user(DSSTEREOMATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_StereoMate" element
     */
    public void setDSStereoMate(org.isotc211.x2005.gmd.DSStereoMateType dsStereoMate)
    {
        generatedSetterHelperImpl(dsStereoMate, DSSTEREOMATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_StereoMate" element
     */
    public org.isotc211.x2005.gmd.DSStereoMateType addNewDSStereoMate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSStereoMateType target = null;
            target = (org.isotc211.x2005.gmd.DSStereoMateType)get_store().add_element_user(DSSTEREOMATE$0);
            return target;
        }
    }
}
