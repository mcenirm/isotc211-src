/*
 * An XML document type.
 * Localname: CharacterString
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.CharacterStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one CharacterString(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class CharacterStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.CharacterStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public CharacterStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARACTERSTRING$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "CharacterString");
    private static final org.apache.xmlbeans.QNameSet CHARACTERSTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ObligationCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_PixelOrientationCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_TopicCategoryCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_SequenceCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_SpatialRepresentationTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ScopeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_BandDefinition"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MediumFormatCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_RestrictionCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MaintenanceFrequencyCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_PresentationFormCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "Country"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DatatypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ProgressCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_InitiativeTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_GeometryTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_TriggerCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ObjectiveTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MediumNameCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LocalisedCharacterString"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "CharacterString"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_PriorityCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_TopologyLevelCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_TransferFunctionTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_AssociationTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ImagingConditionCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_OperationTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LanguageCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CellGeometryCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_KeywordTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_SensorTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_OnLineFunctionCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_GeometricObjectTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_EvaluationMethodTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DistributionUnits"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_RoleCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_DateTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CoverageContentTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DimensionNameTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_CharacterSetCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ContextCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ClassificationCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_PolarisationOrientationCode"),
    });
    
    
    /**
     * Gets the "CharacterString" element
     */
    public java.lang.String getCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERSTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CharacterString" element
     */
    public org.apache.xmlbeans.XmlString xgetCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARACTERSTRING$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CharacterString" element
     */
    public void setCharacterString(java.lang.String characterString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERSTRING$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARACTERSTRING$0);
            }
            target.setStringValue(characterString);
        }
    }
    
    /**
     * Sets (as xml) the "CharacterString" element
     */
    public void xsetCharacterString(org.apache.xmlbeans.XmlString characterString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARACTERSTRING$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHARACTERSTRING$0);
            }
            target.set(characterString);
        }
    }
}
