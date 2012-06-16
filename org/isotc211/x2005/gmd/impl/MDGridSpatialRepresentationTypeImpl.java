/*
 * XML Type:  MD_GridSpatialRepresentation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGridSpatialRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_GridSpatialRepresentation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDGridSpatialRepresentationTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractMDSpatialRepresentationTypeImpl implements org.isotc211.x2005.gmd.MDGridSpatialRepresentationType
{
    private static final long serialVersionUID = 1L;
    
    public MDGridSpatialRepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFDIMENSIONS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "numberOfDimensions");
    private static final javax.xml.namespace.QName AXISDIMENSIONPROPERTIES$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "axisDimensionProperties");
    private static final javax.xml.namespace.QName CELLGEOMETRY$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "cellGeometry");
    private static final javax.xml.namespace.QName TRANSFORMATIONPARAMETERAVAILABILITY$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "transformationParameterAvailability");
    
    
    /**
     * Gets the "numberOfDimensions" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getNumberOfDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(NUMBEROFDIMENSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numberOfDimensions" element
     */
    public void setNumberOfDimensions(org.isotc211.x2005.gco.IntegerPropertyType numberOfDimensions)
    {
        generatedSetterHelperImpl(numberOfDimensions, NUMBEROFDIMENSIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "numberOfDimensions" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewNumberOfDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(NUMBEROFDIMENSIONS$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "axisDimensionProperties" elements
     */
    public org.isotc211.x2005.gmd.MDDimensionPropertyType[] getAxisDimensionPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AXISDIMENSIONPROPERTIES$2, targetList);
            org.isotc211.x2005.gmd.MDDimensionPropertyType[] result = new org.isotc211.x2005.gmd.MDDimensionPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "axisDimensionProperties" element
     */
    public org.isotc211.x2005.gmd.MDDimensionPropertyType getAxisDimensionPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionPropertyType)get_store().find_element_user(AXISDIMENSIONPROPERTIES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "axisDimensionProperties" element
     */
    public int sizeOfAxisDimensionPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AXISDIMENSIONPROPERTIES$2);
        }
    }
    
    /**
     * Sets array of all "axisDimensionProperties" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAxisDimensionPropertiesArray(org.isotc211.x2005.gmd.MDDimensionPropertyType[] axisDimensionPropertiesArray)
    {
        check_orphaned();
        arraySetterHelper(axisDimensionPropertiesArray, AXISDIMENSIONPROPERTIES$2);
    }
    
    /**
     * Sets ith "axisDimensionProperties" element
     */
    public void setAxisDimensionPropertiesArray(int i, org.isotc211.x2005.gmd.MDDimensionPropertyType axisDimensionProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionPropertyType)get_store().find_element_user(AXISDIMENSIONPROPERTIES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(axisDimensionProperties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisDimensionProperties" element
     */
    public org.isotc211.x2005.gmd.MDDimensionPropertyType insertNewAxisDimensionProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionPropertyType)get_store().insert_element_user(AXISDIMENSIONPROPERTIES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axisDimensionProperties" element
     */
    public org.isotc211.x2005.gmd.MDDimensionPropertyType addNewAxisDimensionProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDimensionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDimensionPropertyType)get_store().add_element_user(AXISDIMENSIONPROPERTIES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "axisDimensionProperties" element
     */
    public void removeAxisDimensionProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AXISDIMENSIONPROPERTIES$2, i);
        }
    }
    
    /**
     * Gets the "cellGeometry" element
     */
    public org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType getCellGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType)get_store().find_element_user(CELLGEOMETRY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cellGeometry" element
     */
    public void setCellGeometry(org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType cellGeometry)
    {
        generatedSetterHelperImpl(cellGeometry, CELLGEOMETRY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cellGeometry" element
     */
    public org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType addNewCellGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType)get_store().add_element_user(CELLGEOMETRY$4);
            return target;
        }
    }
    
    /**
     * Gets the "transformationParameterAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getTransformationParameterAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(TRANSFORMATIONPARAMETERAVAILABILITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transformationParameterAvailability" element
     */
    public void setTransformationParameterAvailability(org.isotc211.x2005.gco.BooleanPropertyType transformationParameterAvailability)
    {
        generatedSetterHelperImpl(transformationParameterAvailability, TRANSFORMATIONPARAMETERAVAILABILITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transformationParameterAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewTransformationParameterAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(TRANSFORMATIONPARAMETERAVAILABILITY$6);
            return target;
        }
    }
}
