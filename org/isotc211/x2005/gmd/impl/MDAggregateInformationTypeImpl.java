/*
 * XML Type:  MD_AggregateInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDAggregateInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_AggregateInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDAggregateInformationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDAggregateInformationType
{
    private static final long serialVersionUID = 1L;
    
    public MDAggregateInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGGREGATEDATASETNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "aggregateDataSetName");
    private static final javax.xml.namespace.QName AGGREGATEDATASETIDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "aggregateDataSetIdentifier");
    private static final javax.xml.namespace.QName ASSOCIATIONTYPE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "associationType");
    private static final javax.xml.namespace.QName INITIATIVETYPE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "initiativeType");
    
    
    /**
     * Gets the "aggregateDataSetName" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getAggregateDataSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(AGGREGATEDATASETNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aggregateDataSetName" element
     */
    public boolean isSetAggregateDataSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGGREGATEDATASETNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "aggregateDataSetName" element
     */
    public void setAggregateDataSetName(org.isotc211.x2005.gmd.CICitationPropertyType aggregateDataSetName)
    {
        generatedSetterHelperImpl(aggregateDataSetName, AGGREGATEDATASETNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "aggregateDataSetName" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewAggregateDataSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(AGGREGATEDATASETNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "aggregateDataSetName" element
     */
    public void unsetAggregateDataSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGGREGATEDATASETNAME$0, 0);
        }
    }
    
    /**
     * Gets the "aggregateDataSetIdentifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getAggregateDataSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(AGGREGATEDATASETIDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aggregateDataSetIdentifier" element
     */
    public boolean isSetAggregateDataSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGGREGATEDATASETIDENTIFIER$2) != 0;
        }
    }
    
    /**
     * Sets the "aggregateDataSetIdentifier" element
     */
    public void setAggregateDataSetIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType aggregateDataSetIdentifier)
    {
        generatedSetterHelperImpl(aggregateDataSetIdentifier, AGGREGATEDATASETIDENTIFIER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "aggregateDataSetIdentifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewAggregateDataSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(AGGREGATEDATASETIDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "aggregateDataSetIdentifier" element
     */
    public void unsetAggregateDataSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGGREGATEDATASETIDENTIFIER$2, 0);
        }
    }
    
    /**
     * Gets the "associationType" element
     */
    public org.isotc211.x2005.gmd.DSAssociationTypeCodePropertyType getAssociationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAssociationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAssociationTypeCodePropertyType)get_store().find_element_user(ASSOCIATIONTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "associationType" element
     */
    public void setAssociationType(org.isotc211.x2005.gmd.DSAssociationTypeCodePropertyType associationType)
    {
        generatedSetterHelperImpl(associationType, ASSOCIATIONTYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "associationType" element
     */
    public org.isotc211.x2005.gmd.DSAssociationTypeCodePropertyType addNewAssociationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSAssociationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSAssociationTypeCodePropertyType)get_store().add_element_user(ASSOCIATIONTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "initiativeType" element
     */
    public org.isotc211.x2005.gmd.DSInitiativeTypeCodePropertyType getInitiativeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSInitiativeTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSInitiativeTypeCodePropertyType)get_store().find_element_user(INITIATIVETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "initiativeType" element
     */
    public boolean isSetInitiativeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITIATIVETYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "initiativeType" element
     */
    public void setInitiativeType(org.isotc211.x2005.gmd.DSInitiativeTypeCodePropertyType initiativeType)
    {
        generatedSetterHelperImpl(initiativeType, INITIATIVETYPE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "initiativeType" element
     */
    public org.isotc211.x2005.gmd.DSInitiativeTypeCodePropertyType addNewInitiativeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSInitiativeTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DSInitiativeTypeCodePropertyType)get_store().add_element_user(INITIATIVETYPE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "initiativeType" element
     */
    public void unsetInitiativeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITIATIVETYPE$6, 0);
        }
    }
}
