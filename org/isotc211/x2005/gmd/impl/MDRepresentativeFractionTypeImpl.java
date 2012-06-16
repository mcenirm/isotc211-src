/*
 * XML Type:  MD_RepresentativeFraction_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDRepresentativeFractionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_RepresentativeFraction_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDRepresentativeFractionTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDRepresentativeFractionType
{
    private static final long serialVersionUID = 1L;
    
    public MDRepresentativeFractionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DENOMINATOR$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "denominator");
    
    
    /**
     * Gets the "denominator" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(DENOMINATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "denominator" element
     */
    public void setDenominator(org.isotc211.x2005.gco.IntegerPropertyType denominator)
    {
        generatedSetterHelperImpl(denominator, DENOMINATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "denominator" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(DENOMINATOR$0);
            return target;
        }
    }
}
