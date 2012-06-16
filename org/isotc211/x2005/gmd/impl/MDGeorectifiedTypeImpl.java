/*
 * XML Type:  MD_Georectified_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeorectifiedType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Georectified_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDGeorectifiedTypeImpl extends org.isotc211.x2005.gmd.impl.MDGridSpatialRepresentationTypeImpl implements org.isotc211.x2005.gmd.MDGeorectifiedType
{
    private static final long serialVersionUID = 1L;
    
    public MDGeorectifiedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKPOINTAVAILABILITY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "checkPointAvailability");
    private static final javax.xml.namespace.QName CHECKPOINTDESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "checkPointDescription");
    private static final javax.xml.namespace.QName CORNERPOINTS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "cornerPoints");
    private static final javax.xml.namespace.QName CENTERPOINT$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "centerPoint");
    private static final javax.xml.namespace.QName POINTINPIXEL$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "pointInPixel");
    private static final javax.xml.namespace.QName TRANSFORMATIONDIMENSIONDESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "transformationDimensionDescription");
    private static final javax.xml.namespace.QName TRANSFORMATIONDIMENSIONMAPPING$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "transformationDimensionMapping");
    
    
    /**
     * Gets the "checkPointAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getCheckPointAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(CHECKPOINTAVAILABILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "checkPointAvailability" element
     */
    public void setCheckPointAvailability(org.isotc211.x2005.gco.BooleanPropertyType checkPointAvailability)
    {
        generatedSetterHelperImpl(checkPointAvailability, CHECKPOINTAVAILABILITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "checkPointAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewCheckPointAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(CHECKPOINTAVAILABILITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "checkPointDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCheckPointDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CHECKPOINTDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "checkPointDescription" element
     */
    public boolean isSetCheckPointDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKPOINTDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "checkPointDescription" element
     */
    public void setCheckPointDescription(org.isotc211.x2005.gco.CharacterStringPropertyType checkPointDescription)
    {
        generatedSetterHelperImpl(checkPointDescription, CHECKPOINTDESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "checkPointDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCheckPointDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CHECKPOINTDESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "checkPointDescription" element
     */
    public void unsetCheckPointDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKPOINTDESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets array of all "cornerPoints" elements
     */
    public org.isotc211.x2005.gss.GMPointPropertyType[] getCornerPointsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORNERPOINTS$4, targetList);
            org.isotc211.x2005.gss.GMPointPropertyType[] result = new org.isotc211.x2005.gss.GMPointPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cornerPoints" element
     */
    public org.isotc211.x2005.gss.GMPointPropertyType getCornerPointsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMPointPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMPointPropertyType)get_store().find_element_user(CORNERPOINTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cornerPoints" element
     */
    public int sizeOfCornerPointsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORNERPOINTS$4);
        }
    }
    
    /**
     * Sets array of all "cornerPoints" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCornerPointsArray(org.isotc211.x2005.gss.GMPointPropertyType[] cornerPointsArray)
    {
        check_orphaned();
        arraySetterHelper(cornerPointsArray, CORNERPOINTS$4);
    }
    
    /**
     * Sets ith "cornerPoints" element
     */
    public void setCornerPointsArray(int i, org.isotc211.x2005.gss.GMPointPropertyType cornerPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMPointPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMPointPropertyType)get_store().find_element_user(CORNERPOINTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cornerPoints);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cornerPoints" element
     */
    public org.isotc211.x2005.gss.GMPointPropertyType insertNewCornerPoints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMPointPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMPointPropertyType)get_store().insert_element_user(CORNERPOINTS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cornerPoints" element
     */
    public org.isotc211.x2005.gss.GMPointPropertyType addNewCornerPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMPointPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMPointPropertyType)get_store().add_element_user(CORNERPOINTS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "cornerPoints" element
     */
    public void removeCornerPoints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORNERPOINTS$4, i);
        }
    }
    
    /**
     * Gets the "centerPoint" element
     */
    public org.isotc211.x2005.gss.GMPointPropertyType getCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMPointPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMPointPropertyType)get_store().find_element_user(CENTERPOINT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "centerPoint" element
     */
    public boolean isSetCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CENTERPOINT$6) != 0;
        }
    }
    
    /**
     * Sets the "centerPoint" element
     */
    public void setCenterPoint(org.isotc211.x2005.gss.GMPointPropertyType centerPoint)
    {
        generatedSetterHelperImpl(centerPoint, CENTERPOINT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "centerPoint" element
     */
    public org.isotc211.x2005.gss.GMPointPropertyType addNewCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gss.GMPointPropertyType target = null;
            target = (org.isotc211.x2005.gss.GMPointPropertyType)get_store().add_element_user(CENTERPOINT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "centerPoint" element
     */
    public void unsetCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CENTERPOINT$6, 0);
        }
    }
    
    /**
     * Gets the "pointInPixel" element
     */
    public org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType getPointInPixel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType)get_store().find_element_user(POINTINPIXEL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointInPixel" element
     */
    public void setPointInPixel(org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType pointInPixel)
    {
        generatedSetterHelperImpl(pointInPixel, POINTINPIXEL$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointInPixel" element
     */
    public org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType addNewPointInPixel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType)get_store().add_element_user(POINTINPIXEL$8);
            return target;
        }
    }
    
    /**
     * Gets the "transformationDimensionDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getTransformationDimensionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(TRANSFORMATIONDIMENSIONDESCRIPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transformationDimensionDescription" element
     */
    public boolean isSetTransformationDimensionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORMATIONDIMENSIONDESCRIPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "transformationDimensionDescription" element
     */
    public void setTransformationDimensionDescription(org.isotc211.x2005.gco.CharacterStringPropertyType transformationDimensionDescription)
    {
        generatedSetterHelperImpl(transformationDimensionDescription, TRANSFORMATIONDIMENSIONDESCRIPTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transformationDimensionDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewTransformationDimensionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(TRANSFORMATIONDIMENSIONDESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "transformationDimensionDescription" element
     */
    public void unsetTransformationDimensionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORMATIONDIMENSIONDESCRIPTION$10, 0);
        }
    }
    
    /**
     * Gets array of all "transformationDimensionMapping" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getTransformationDimensionMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSFORMATIONDIMENSIONMAPPING$12, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "transformationDimensionMapping" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getTransformationDimensionMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(TRANSFORMATIONDIMENSIONMAPPING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "transformationDimensionMapping" element
     */
    public int sizeOfTransformationDimensionMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORMATIONDIMENSIONMAPPING$12);
        }
    }
    
    /**
     * Sets array of all "transformationDimensionMapping" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTransformationDimensionMappingArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] transformationDimensionMappingArray)
    {
        check_orphaned();
        arraySetterHelper(transformationDimensionMappingArray, TRANSFORMATIONDIMENSIONMAPPING$12);
    }
    
    /**
     * Sets ith "transformationDimensionMapping" element
     */
    public void setTransformationDimensionMappingArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType transformationDimensionMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(TRANSFORMATIONDIMENSIONMAPPING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transformationDimensionMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transformationDimensionMapping" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewTransformationDimensionMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(TRANSFORMATIONDIMENSIONMAPPING$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transformationDimensionMapping" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewTransformationDimensionMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(TRANSFORMATIONDIMENSIONMAPPING$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "transformationDimensionMapping" element
     */
    public void removeTransformationDimensionMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORMATIONDIMENSIONMAPPING$12, i);
        }
    }
}
