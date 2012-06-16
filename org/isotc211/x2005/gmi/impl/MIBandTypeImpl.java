/*
 * XML Type:  MI_Band_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIBandType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Band_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIBandTypeImpl extends org.isotc211.x2005.gmd.impl.MDBandTypeImpl implements org.isotc211.x2005.gmi.MIBandType
{
    private static final long serialVersionUID = 1L;
    
    public MIBandTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANDBOUNDARYDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "bandBoundaryDefinition");
    private static final javax.xml.namespace.QName NOMINALSPATIALRESOLUTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "nominalSpatialResolution");
    private static final javax.xml.namespace.QName TRANSFERFUNCTIONTYPE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "transferFunctionType");
    private static final javax.xml.namespace.QName TRANSMITTEDPOLARISATION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "transmittedPolarisation");
    private static final javax.xml.namespace.QName DETECTEDPOLARISATION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "detectedPolarisation");
    
    
    /**
     * Gets the "bandBoundaryDefinition" element
     */
    public org.isotc211.x2005.gmi.MIBandDefinitionPropertyType getBandBoundaryDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIBandDefinitionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIBandDefinitionPropertyType)get_store().find_element_user(BANDBOUNDARYDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bandBoundaryDefinition" element
     */
    public boolean isSetBandBoundaryDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANDBOUNDARYDEFINITION$0) != 0;
        }
    }
    
    /**
     * Sets the "bandBoundaryDefinition" element
     */
    public void setBandBoundaryDefinition(org.isotc211.x2005.gmi.MIBandDefinitionPropertyType bandBoundaryDefinition)
    {
        generatedSetterHelperImpl(bandBoundaryDefinition, BANDBOUNDARYDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bandBoundaryDefinition" element
     */
    public org.isotc211.x2005.gmi.MIBandDefinitionPropertyType addNewBandBoundaryDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIBandDefinitionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIBandDefinitionPropertyType)get_store().add_element_user(BANDBOUNDARYDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bandBoundaryDefinition" element
     */
    public void unsetBandBoundaryDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANDBOUNDARYDEFINITION$0, 0);
        }
    }
    
    /**
     * Gets the "nominalSpatialResolution" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getNominalSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(NOMINALSPATIALRESOLUTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nominalSpatialResolution" element
     */
    public boolean isSetNominalSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMINALSPATIALRESOLUTION$2) != 0;
        }
    }
    
    /**
     * Sets the "nominalSpatialResolution" element
     */
    public void setNominalSpatialResolution(org.isotc211.x2005.gco.RealPropertyType nominalSpatialResolution)
    {
        generatedSetterHelperImpl(nominalSpatialResolution, NOMINALSPATIALRESOLUTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nominalSpatialResolution" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewNominalSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(NOMINALSPATIALRESOLUTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "nominalSpatialResolution" element
     */
    public void unsetNominalSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMINALSPATIALRESOLUTION$2, 0);
        }
    }
    
    /**
     * Gets the "transferFunctionType" element
     */
    public org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType getTransferFunctionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType)get_store().find_element_user(TRANSFERFUNCTIONTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transferFunctionType" element
     */
    public boolean isSetTransferFunctionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFERFUNCTIONTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "transferFunctionType" element
     */
    public void setTransferFunctionType(org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType transferFunctionType)
    {
        generatedSetterHelperImpl(transferFunctionType, TRANSFERFUNCTIONTYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transferFunctionType" element
     */
    public org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType addNewTransferFunctionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType)get_store().add_element_user(TRANSFERFUNCTIONTYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "transferFunctionType" element
     */
    public void unsetTransferFunctionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFERFUNCTIONTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "transmittedPolarisation" element
     */
    public org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType getTransmittedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType)get_store().find_element_user(TRANSMITTEDPOLARISATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transmittedPolarisation" element
     */
    public boolean isSetTransmittedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSMITTEDPOLARISATION$6) != 0;
        }
    }
    
    /**
     * Sets the "transmittedPolarisation" element
     */
    public void setTransmittedPolarisation(org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType transmittedPolarisation)
    {
        generatedSetterHelperImpl(transmittedPolarisation, TRANSMITTEDPOLARISATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transmittedPolarisation" element
     */
    public org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType addNewTransmittedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType)get_store().add_element_user(TRANSMITTEDPOLARISATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "transmittedPolarisation" element
     */
    public void unsetTransmittedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSMITTEDPOLARISATION$6, 0);
        }
    }
    
    /**
     * Gets the "detectedPolarisation" element
     */
    public org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType getDetectedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType)get_store().find_element_user(DETECTEDPOLARISATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "detectedPolarisation" element
     */
    public boolean isSetDetectedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETECTEDPOLARISATION$8) != 0;
        }
    }
    
    /**
     * Sets the "detectedPolarisation" element
     */
    public void setDetectedPolarisation(org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType detectedPolarisation)
    {
        generatedSetterHelperImpl(detectedPolarisation, DETECTEDPOLARISATION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "detectedPolarisation" element
     */
    public org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType addNewDetectedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType)get_store().add_element_user(DETECTEDPOLARISATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "detectedPolarisation" element
     */
    public void unsetDetectedPolarisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETECTEDPOLARISATION$8, 0);
        }
    }
}
