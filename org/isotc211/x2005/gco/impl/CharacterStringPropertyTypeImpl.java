/*
 * XML Type:  CharacterString_PropertyType
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.CharacterStringPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML CharacterString_PropertyType(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class CharacterStringPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.CharacterStringPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public CharacterStringPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_InitiativeTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ProgressCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DatatypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_GeometryTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_TriggerCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ObjectiveTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MediumNameCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_PriorityCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "CharacterString"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LocalisedCharacterString"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_TopologyLevelCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_AssociationTypeCode"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_TransferFunctionTypeCode"),
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
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
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
     * True if has "CharacterString" element
     */
    public boolean isSetCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERSTRING$1) != 0;
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
    
    /**
     * Unsets the "CharacterString" element
     */
    public void unsetCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERSTRING$1, 0);
        }
    }
    
    /**
     * Gets the "nilReason" attribute
     */
    public java.lang.Object getNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "nilReason" attribute
     */
    public net.opengis.gml.x32.NilReasonType xgetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            return target;
        }
    }
    
    /**
     * True if has "nilReason" attribute
     */
    public boolean isSetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NILREASON$2) != null;
        }
    }
    
    /**
     * Sets the "nilReason" attribute
     */
    public void setNilReason(java.lang.Object nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$2);
            }
            target.setObjectValue(nilReason);
        }
    }
    
    /**
     * Sets (as xml) the "nilReason" attribute
     */
    public void xsetNilReason(net.opengis.gml.x32.NilReasonType nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$2);
            }
            target.set(nilReason);
        }
    }
    
    /**
     * Unsets the "nilReason" attribute
     */
    public void unsetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NILREASON$2);
        }
    }
}
