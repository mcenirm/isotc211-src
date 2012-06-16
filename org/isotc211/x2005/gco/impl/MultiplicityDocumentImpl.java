/*
 * An XML document type.
 * Localname: Multiplicity
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.MultiplicityDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Multiplicity(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class MultiplicityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.MultiplicityDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiplicityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPLICITY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Multiplicity");
    
    
    /**
     * Gets the "Multiplicity" element
     */
    public org.isotc211.x2005.gco.MultiplicityType getMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityType)get_store().find_element_user(MULTIPLICITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Multiplicity" element
     */
    public void setMultiplicity(org.isotc211.x2005.gco.MultiplicityType multiplicity)
    {
        generatedSetterHelperImpl(multiplicity, MULTIPLICITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Multiplicity" element
     */
    public org.isotc211.x2005.gco.MultiplicityType addNewMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.MultiplicityType target = null;
            target = (org.isotc211.x2005.gco.MultiplicityType)get_store().add_element_user(MULTIPLICITY$0);
            return target;
        }
    }
}
