/*
 * An XML document type.
 * Localname: LI_Lineage
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LILineageDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one LI_Lineage(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class LILineageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.LILineageDocument
{
    private static final long serialVersionUID = 1L;
    
    public LILineageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LILINEAGE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LI_Lineage");
    
    
    /**
     * Gets the "LI_Lineage" element
     */
    public org.isotc211.x2005.gmd.LILineageType getLILineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LILineageType target = null;
            target = (org.isotc211.x2005.gmd.LILineageType)get_store().find_element_user(LILINEAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LI_Lineage" element
     */
    public void setLILineage(org.isotc211.x2005.gmd.LILineageType liLineage)
    {
        generatedSetterHelperImpl(liLineage, LILINEAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LI_Lineage" element
     */
    public org.isotc211.x2005.gmd.LILineageType addNewLILineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LILineageType target = null;
            target = (org.isotc211.x2005.gmd.LILineageType)get_store().add_element_user(LILINEAGE$0);
            return target;
        }
    }
}
