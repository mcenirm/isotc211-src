/*
 * An XML document type.
 * Localname: MD_GeometricObjects
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeometricObjectsDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_GeometricObjects(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDGeometricObjectsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDGeometricObjectsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDGeometricObjectsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDGEOMETRICOBJECTS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_GeometricObjects");
    
    
    /**
     * Gets the "MD_GeometricObjects" element
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectsType getMDGeometricObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectsType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectsType)get_store().find_element_user(MDGEOMETRICOBJECTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_GeometricObjects" element
     */
    public void setMDGeometricObjects(org.isotc211.x2005.gmd.MDGeometricObjectsType mdGeometricObjects)
    {
        generatedSetterHelperImpl(mdGeometricObjects, MDGEOMETRICOBJECTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_GeometricObjects" element
     */
    public org.isotc211.x2005.gmd.MDGeometricObjectsType addNewMDGeometricObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDGeometricObjectsType target = null;
            target = (org.isotc211.x2005.gmd.MDGeometricObjectsType)get_store().add_element_user(MDGEOMETRICOBJECTS$0);
            return target;
        }
    }
}
