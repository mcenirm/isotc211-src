/*
 * XML Type:  MD_Georeferenceable_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeoreferenceableType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Georeferenceable_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDGeoreferenceableTypeImpl extends org.isotc211.x2005.gmd.impl.MDGridSpatialRepresentationTypeImpl implements org.isotc211.x2005.gmd.MDGeoreferenceableType
{
    private static final long serialVersionUID = 1L;
    
    public MDGeoreferenceableTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLPOINTAVAILABILITY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "controlPointAvailability");
    private static final javax.xml.namespace.QName ORIENTATIONPARAMETERAVAILABILITY$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "orientationParameterAvailability");
    private static final javax.xml.namespace.QName ORIENTATIONPARAMETERDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "orientationParameterDescription");
    private static final javax.xml.namespace.QName GEOREFERENCEDPARAMETERS$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "georeferencedParameters");
    private static final javax.xml.namespace.QName PARAMETERCITATION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "parameterCitation");
    
    
    /**
     * Gets the "controlPointAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getControlPointAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(CONTROLPOINTAVAILABILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "controlPointAvailability" element
     */
    public void setControlPointAvailability(org.isotc211.x2005.gco.BooleanPropertyType controlPointAvailability)
    {
        generatedSetterHelperImpl(controlPointAvailability, CONTROLPOINTAVAILABILITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "controlPointAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewControlPointAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(CONTROLPOINTAVAILABILITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "orientationParameterAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getOrientationParameterAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(ORIENTATIONPARAMETERAVAILABILITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "orientationParameterAvailability" element
     */
    public void setOrientationParameterAvailability(org.isotc211.x2005.gco.BooleanPropertyType orientationParameterAvailability)
    {
        generatedSetterHelperImpl(orientationParameterAvailability, ORIENTATIONPARAMETERAVAILABILITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orientationParameterAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewOrientationParameterAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(ORIENTATIONPARAMETERAVAILABILITY$2);
            return target;
        }
    }
    
    /**
     * Gets the "orientationParameterDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getOrientationParameterDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ORIENTATIONPARAMETERDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orientationParameterDescription" element
     */
    public boolean isSetOrientationParameterDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIENTATIONPARAMETERDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "orientationParameterDescription" element
     */
    public void setOrientationParameterDescription(org.isotc211.x2005.gco.CharacterStringPropertyType orientationParameterDescription)
    {
        generatedSetterHelperImpl(orientationParameterDescription, ORIENTATIONPARAMETERDESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orientationParameterDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewOrientationParameterDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ORIENTATIONPARAMETERDESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "orientationParameterDescription" element
     */
    public void unsetOrientationParameterDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIENTATIONPARAMETERDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "georeferencedParameters" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType getGeoreferencedParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().find_element_user(GEOREFERENCEDPARAMETERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "georeferencedParameters" element
     */
    public void setGeoreferencedParameters(org.isotc211.x2005.gco.RecordPropertyType georeferencedParameters)
    {
        generatedSetterHelperImpl(georeferencedParameters, GEOREFERENCEDPARAMETERS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "georeferencedParameters" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType addNewGeoreferencedParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().add_element_user(GEOREFERENCEDPARAMETERS$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "parameterCitation" elements
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType[] getParameterCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERCITATION$8, targetList);
            org.isotc211.x2005.gmd.CICitationPropertyType[] result = new org.isotc211.x2005.gmd.CICitationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameterCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getParameterCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(PARAMETERCITATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameterCitation" element
     */
    public int sizeOfParameterCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERCITATION$8);
        }
    }
    
    /**
     * Sets array of all "parameterCitation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterCitationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] parameterCitationArray)
    {
        check_orphaned();
        arraySetterHelper(parameterCitationArray, PARAMETERCITATION$8);
    }
    
    /**
     * Sets ith "parameterCitation" element
     */
    public void setParameterCitationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType parameterCitation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(PARAMETERCITATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameterCitation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType insertNewParameterCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().insert_element_user(PARAMETERCITATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewParameterCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(PARAMETERCITATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameterCitation" element
     */
    public void removeParameterCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERCITATION$8, i);
        }
    }
}
