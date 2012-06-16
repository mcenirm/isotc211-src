/*
 * XML Type:  EX_TemporalExtent_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXTemporalExtentType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML EX_TemporalExtent_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class EXTemporalExtentTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.EXTemporalExtentType
{
    private static final long serialVersionUID = 1L;
    
    public EXTemporalExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "extent");
    
    
    /**
     * Gets the "extent" element
     */
    public org.isotc211.x2005.gts.TMPrimitivePropertyType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gts.TMPrimitivePropertyType target = null;
            target = (org.isotc211.x2005.gts.TMPrimitivePropertyType)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(org.isotc211.x2005.gts.TMPrimitivePropertyType extent)
    {
        generatedSetterHelperImpl(extent, EXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public org.isotc211.x2005.gts.TMPrimitivePropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gts.TMPrimitivePropertyType target = null;
            target = (org.isotc211.x2005.gts.TMPrimitivePropertyType)get_store().add_element_user(EXTENT$0);
            return target;
        }
    }
}
