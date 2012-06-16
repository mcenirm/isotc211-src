/*
 * An XML document type.
 * Localname: AbstractDQ_Element
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDQ_Element(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDQElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractDQElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDQELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Element");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDQELEMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_AccuracyOfATimeMeasurement"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalValidity"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_RelativeInternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_NonQuantitativeAttributeAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "QE_Usability"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_QuantitativeAttributeAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ConceptualConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ThematicClassificationCorrectness"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_AbsoluteExternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Completeness"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_LogicalConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_DomainConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_ThematicAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_TemporalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_PositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessOmission"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TopologicalConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_GriddedDataPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_FormatConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessCommission"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Element"),
    });
    
    
    /**
     * Gets the "AbstractDQ_Element" element
     */
    public org.isotc211.x2005.gmd.AbstractDQElementType getAbstractDQElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQElementType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQElementType)get_store().find_element_user(ABSTRACTDQELEMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDQ_Element" element
     */
    public void setAbstractDQElement(org.isotc211.x2005.gmd.AbstractDQElementType abstractDQElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQElementType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQElementType)get_store().find_element_user(ABSTRACTDQELEMENT$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDQElementType)get_store().add_element_user(ABSTRACTDQELEMENT$0);
            }
            target.set(abstractDQElement);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDQ_Element" element
     */
    public org.isotc211.x2005.gmd.AbstractDQElementType addNewAbstractDQElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQElementType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQElementType)get_store().add_element_user(ABSTRACTDQELEMENT$0);
            return target;
        }
    }
}
