/*
 * An XML document type.
 * Localname: LE_NominalResolution
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LENominalResolutionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one LE_NominalResolution(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class LENominalResolutionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.LENominalResolutionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LENominalResolutionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENOMINALRESOLUTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_NominalResolution");
    
    
    /**
     * Gets the "LE_NominalResolution" element
     */
    public org.isotc211.x2005.gmi.LENominalResolutionType getLENominalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LENominalResolutionType target = null;
            target = (org.isotc211.x2005.gmi.LENominalResolutionType)get_store().find_element_user(LENOMINALRESOLUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LE_NominalResolution" element
     */
    public void setLENominalResolution(org.isotc211.x2005.gmi.LENominalResolutionType leNominalResolution)
    {
        generatedSetterHelperImpl(leNominalResolution, LENOMINALRESOLUTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LE_NominalResolution" element
     */
    public org.isotc211.x2005.gmi.LENominalResolutionType addNewLENominalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LENominalResolutionType target = null;
            target = (org.isotc211.x2005.gmi.LENominalResolutionType)get_store().add_element_user(LENOMINALRESOLUTION$0);
            return target;
        }
    }
}
