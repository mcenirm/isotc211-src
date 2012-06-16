/*
 * An XML document type.
 * Localname: AbstractRS_ReferenceSystem
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractRSReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractRS_ReferenceSystem(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractRSReferenceSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractRSReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRSReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTRSREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractRS_ReferenceSystem");
    
    
    /**
     * Gets the "AbstractRS_ReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.AbstractRSReferenceSystemType getAbstractRSReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractRSReferenceSystemType target = null;
            target = (org.isotc211.x2005.gmd.AbstractRSReferenceSystemType)get_store().find_element_user(ABSTRACTRSREFERENCESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractRS_ReferenceSystem" element
     */
    public void setAbstractRSReferenceSystem(org.isotc211.x2005.gmd.AbstractRSReferenceSystemType abstractRSReferenceSystem)
    {
        generatedSetterHelperImpl(abstractRSReferenceSystem, ABSTRACTRSREFERENCESYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AbstractRS_ReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.AbstractRSReferenceSystemType addNewAbstractRSReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractRSReferenceSystemType target = null;
            target = (org.isotc211.x2005.gmd.AbstractRSReferenceSystemType)get_store().add_element_user(ABSTRACTRSREFERENCESYSTEM$0);
            return target;
        }
    }
}
