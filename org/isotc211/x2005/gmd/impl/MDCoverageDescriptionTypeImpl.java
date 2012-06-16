/*
 * XML Type:  MD_CoverageDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDCoverageDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_CoverageDescription_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDCoverageDescriptionTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractMDContentInformationTypeImpl implements org.isotc211.x2005.gmd.MDCoverageDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public MDCoverageDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "attributeDescription");
    private static final javax.xml.namespace.QName CONTENTTYPE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "contentType");
    private static final javax.xml.namespace.QName DIMENSION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dimension");
    
    
    /**
     * Gets the "attributeDescription" element
     */
    public org.isotc211.x2005.gco.RecordTypePropertyType getAttributeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordTypePropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordTypePropertyType)get_store().find_element_user(ATTRIBUTEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attributeDescription" element
     */
    public void setAttributeDescription(org.isotc211.x2005.gco.RecordTypePropertyType attributeDescription)
    {
        generatedSetterHelperImpl(attributeDescription, ATTRIBUTEDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "attributeDescription" element
     */
    public org.isotc211.x2005.gco.RecordTypePropertyType addNewAttributeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordTypePropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordTypePropertyType)get_store().add_element_user(ATTRIBUTEDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "contentType" element
     */
    public org.isotc211.x2005.gmd.MDCoverageContentTypeCodePropertyType getContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCoverageContentTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCoverageContentTypeCodePropertyType)get_store().find_element_user(CONTENTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contentType" element
     */
    public void setContentType(org.isotc211.x2005.gmd.MDCoverageContentTypeCodePropertyType contentType)
    {
        generatedSetterHelperImpl(contentType, CONTENTTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contentType" element
     */
    public org.isotc211.x2005.gmd.MDCoverageContentTypeCodePropertyType addNewContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCoverageContentTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCoverageContentTypeCodePropertyType)get_store().add_element_user(CONTENTTYPE$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "dimension" elements
     */
    public org.isotc211.x2005.gmd.MDRangeDimensionPropertyType[] getDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSION$4, targetList);
            org.isotc211.x2005.gmd.MDRangeDimensionPropertyType[] result = new org.isotc211.x2005.gmd.MDRangeDimensionPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dimension" element
     */
    public org.isotc211.x2005.gmd.MDRangeDimensionPropertyType getDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRangeDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRangeDimensionPropertyType)get_store().find_element_user(DIMENSION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dimension" element
     */
    public int sizeOfDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$4);
        }
    }
    
    /**
     * Sets array of all "dimension" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDimensionArray(org.isotc211.x2005.gmd.MDRangeDimensionPropertyType[] dimensionArray)
    {
        check_orphaned();
        arraySetterHelper(dimensionArray, DIMENSION$4);
    }
    
    /**
     * Sets ith "dimension" element
     */
    public void setDimensionArray(int i, org.isotc211.x2005.gmd.MDRangeDimensionPropertyType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRangeDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRangeDimensionPropertyType)get_store().find_element_user(DIMENSION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dimension" element
     */
    public org.isotc211.x2005.gmd.MDRangeDimensionPropertyType insertNewDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRangeDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRangeDimensionPropertyType)get_store().insert_element_user(DIMENSION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dimension" element
     */
    public org.isotc211.x2005.gmd.MDRangeDimensionPropertyType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRangeDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRangeDimensionPropertyType)get_store().add_element_user(DIMENSION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "dimension" element
     */
    public void removeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$4, i);
        }
    }
}
