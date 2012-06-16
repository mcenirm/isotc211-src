/*
 * XML Type:  MD_ImageDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDImageDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_ImageDescription_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDImageDescriptionTypeImpl extends org.isotc211.x2005.gmd.impl.MDCoverageDescriptionTypeImpl implements org.isotc211.x2005.gmd.MDImageDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public MDImageDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ILLUMINATIONELEVATIONANGLE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "illuminationElevationAngle");
    private static final javax.xml.namespace.QName ILLUMINATIONAZIMUTHANGLE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "illuminationAzimuthAngle");
    private static final javax.xml.namespace.QName IMAGINGCONDITION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "imagingCondition");
    private static final javax.xml.namespace.QName IMAGEQUALITYCODE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "imageQualityCode");
    private static final javax.xml.namespace.QName CLOUDCOVERPERCENTAGE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "cloudCoverPercentage");
    private static final javax.xml.namespace.QName PROCESSINGLEVELCODE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "processingLevelCode");
    private static final javax.xml.namespace.QName COMPRESSIONGENERATIONQUANTITY$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "compressionGenerationQuantity");
    private static final javax.xml.namespace.QName TRIANGULATIONINDICATOR$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "triangulationIndicator");
    private static final javax.xml.namespace.QName RADIOMETRICCALIBRATIONDATAAVAILABILITY$16 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "radiometricCalibrationDataAvailability");
    private static final javax.xml.namespace.QName CAMERACALIBRATIONINFORMATIONAVAILABILITY$18 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "cameraCalibrationInformationAvailability");
    private static final javax.xml.namespace.QName FILMDISTORTIONINFORMATIONAVAILABILITY$20 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "filmDistortionInformationAvailability");
    private static final javax.xml.namespace.QName LENSDISTORTIONINFORMATIONAVAILABILITY$22 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "lensDistortionInformationAvailability");
    
    
    /**
     * Gets the "illuminationElevationAngle" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getIlluminationElevationAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(ILLUMINATIONELEVATIONANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "illuminationElevationAngle" element
     */
    public boolean isSetIlluminationElevationAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ILLUMINATIONELEVATIONANGLE$0) != 0;
        }
    }
    
    /**
     * Sets the "illuminationElevationAngle" element
     */
    public void setIlluminationElevationAngle(org.isotc211.x2005.gco.RealPropertyType illuminationElevationAngle)
    {
        generatedSetterHelperImpl(illuminationElevationAngle, ILLUMINATIONELEVATIONANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "illuminationElevationAngle" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewIlluminationElevationAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(ILLUMINATIONELEVATIONANGLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "illuminationElevationAngle" element
     */
    public void unsetIlluminationElevationAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ILLUMINATIONELEVATIONANGLE$0, 0);
        }
    }
    
    /**
     * Gets the "illuminationAzimuthAngle" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getIlluminationAzimuthAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(ILLUMINATIONAZIMUTHANGLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "illuminationAzimuthAngle" element
     */
    public boolean isSetIlluminationAzimuthAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ILLUMINATIONAZIMUTHANGLE$2) != 0;
        }
    }
    
    /**
     * Sets the "illuminationAzimuthAngle" element
     */
    public void setIlluminationAzimuthAngle(org.isotc211.x2005.gco.RealPropertyType illuminationAzimuthAngle)
    {
        generatedSetterHelperImpl(illuminationAzimuthAngle, ILLUMINATIONAZIMUTHANGLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "illuminationAzimuthAngle" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewIlluminationAzimuthAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(ILLUMINATIONAZIMUTHANGLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "illuminationAzimuthAngle" element
     */
    public void unsetIlluminationAzimuthAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ILLUMINATIONAZIMUTHANGLE$2, 0);
        }
    }
    
    /**
     * Gets the "imagingCondition" element
     */
    public org.isotc211.x2005.gmd.MDImagingConditionCodePropertyType getImagingCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDImagingConditionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDImagingConditionCodePropertyType)get_store().find_element_user(IMAGINGCONDITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "imagingCondition" element
     */
    public boolean isSetImagingCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGINGCONDITION$4) != 0;
        }
    }
    
    /**
     * Sets the "imagingCondition" element
     */
    public void setImagingCondition(org.isotc211.x2005.gmd.MDImagingConditionCodePropertyType imagingCondition)
    {
        generatedSetterHelperImpl(imagingCondition, IMAGINGCONDITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "imagingCondition" element
     */
    public org.isotc211.x2005.gmd.MDImagingConditionCodePropertyType addNewImagingCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDImagingConditionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDImagingConditionCodePropertyType)get_store().add_element_user(IMAGINGCONDITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "imagingCondition" element
     */
    public void unsetImagingCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGINGCONDITION$4, 0);
        }
    }
    
    /**
     * Gets the "imageQualityCode" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getImageQualityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IMAGEQUALITYCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "imageQualityCode" element
     */
    public boolean isSetImageQualityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGEQUALITYCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "imageQualityCode" element
     */
    public void setImageQualityCode(org.isotc211.x2005.gmd.MDIdentifierPropertyType imageQualityCode)
    {
        generatedSetterHelperImpl(imageQualityCode, IMAGEQUALITYCODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "imageQualityCode" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewImageQualityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(IMAGEQUALITYCODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "imageQualityCode" element
     */
    public void unsetImageQualityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGEQUALITYCODE$6, 0);
        }
    }
    
    /**
     * Gets the "cloudCoverPercentage" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getCloudCoverPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(CLOUDCOVERPERCENTAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cloudCoverPercentage" element
     */
    public boolean isSetCloudCoverPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOUDCOVERPERCENTAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "cloudCoverPercentage" element
     */
    public void setCloudCoverPercentage(org.isotc211.x2005.gco.RealPropertyType cloudCoverPercentage)
    {
        generatedSetterHelperImpl(cloudCoverPercentage, CLOUDCOVERPERCENTAGE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cloudCoverPercentage" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewCloudCoverPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(CLOUDCOVERPERCENTAGE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "cloudCoverPercentage" element
     */
    public void unsetCloudCoverPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOUDCOVERPERCENTAGE$8, 0);
        }
    }
    
    /**
     * Gets the "processingLevelCode" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getProcessingLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(PROCESSINGLEVELCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processingLevelCode" element
     */
    public boolean isSetProcessingLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSINGLEVELCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "processingLevelCode" element
     */
    public void setProcessingLevelCode(org.isotc211.x2005.gmd.MDIdentifierPropertyType processingLevelCode)
    {
        generatedSetterHelperImpl(processingLevelCode, PROCESSINGLEVELCODE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "processingLevelCode" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewProcessingLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(PROCESSINGLEVELCODE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "processingLevelCode" element
     */
    public void unsetProcessingLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSINGLEVELCODE$10, 0);
        }
    }
    
    /**
     * Gets the "compressionGenerationQuantity" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getCompressionGenerationQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(COMPRESSIONGENERATIONQUANTITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "compressionGenerationQuantity" element
     */
    public boolean isSetCompressionGenerationQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPRESSIONGENERATIONQUANTITY$12) != 0;
        }
    }
    
    /**
     * Sets the "compressionGenerationQuantity" element
     */
    public void setCompressionGenerationQuantity(org.isotc211.x2005.gco.IntegerPropertyType compressionGenerationQuantity)
    {
        generatedSetterHelperImpl(compressionGenerationQuantity, COMPRESSIONGENERATIONQUANTITY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "compressionGenerationQuantity" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewCompressionGenerationQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(COMPRESSIONGENERATIONQUANTITY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "compressionGenerationQuantity" element
     */
    public void unsetCompressionGenerationQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPRESSIONGENERATIONQUANTITY$12, 0);
        }
    }
    
    /**
     * Gets the "triangulationIndicator" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getTriangulationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(TRIANGULATIONINDICATOR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "triangulationIndicator" element
     */
    public boolean isSetTriangulationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIANGULATIONINDICATOR$14) != 0;
        }
    }
    
    /**
     * Sets the "triangulationIndicator" element
     */
    public void setTriangulationIndicator(org.isotc211.x2005.gco.BooleanPropertyType triangulationIndicator)
    {
        generatedSetterHelperImpl(triangulationIndicator, TRIANGULATIONINDICATOR$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "triangulationIndicator" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewTriangulationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(TRIANGULATIONINDICATOR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "triangulationIndicator" element
     */
    public void unsetTriangulationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIANGULATIONINDICATOR$14, 0);
        }
    }
    
    /**
     * Gets the "radiometricCalibrationDataAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getRadiometricCalibrationDataAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(RADIOMETRICCALIBRATIONDATAAVAILABILITY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "radiometricCalibrationDataAvailability" element
     */
    public boolean isSetRadiometricCalibrationDataAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIOMETRICCALIBRATIONDATAAVAILABILITY$16) != 0;
        }
    }
    
    /**
     * Sets the "radiometricCalibrationDataAvailability" element
     */
    public void setRadiometricCalibrationDataAvailability(org.isotc211.x2005.gco.BooleanPropertyType radiometricCalibrationDataAvailability)
    {
        generatedSetterHelperImpl(radiometricCalibrationDataAvailability, RADIOMETRICCALIBRATIONDATAAVAILABILITY$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "radiometricCalibrationDataAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewRadiometricCalibrationDataAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(RADIOMETRICCALIBRATIONDATAAVAILABILITY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "radiometricCalibrationDataAvailability" element
     */
    public void unsetRadiometricCalibrationDataAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIOMETRICCALIBRATIONDATAAVAILABILITY$16, 0);
        }
    }
    
    /**
     * Gets the "cameraCalibrationInformationAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getCameraCalibrationInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(CAMERACALIBRATIONINFORMATIONAVAILABILITY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cameraCalibrationInformationAvailability" element
     */
    public boolean isSetCameraCalibrationInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMERACALIBRATIONINFORMATIONAVAILABILITY$18) != 0;
        }
    }
    
    /**
     * Sets the "cameraCalibrationInformationAvailability" element
     */
    public void setCameraCalibrationInformationAvailability(org.isotc211.x2005.gco.BooleanPropertyType cameraCalibrationInformationAvailability)
    {
        generatedSetterHelperImpl(cameraCalibrationInformationAvailability, CAMERACALIBRATIONINFORMATIONAVAILABILITY$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cameraCalibrationInformationAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewCameraCalibrationInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(CAMERACALIBRATIONINFORMATIONAVAILABILITY$18);
            return target;
        }
    }
    
    /**
     * Unsets the "cameraCalibrationInformationAvailability" element
     */
    public void unsetCameraCalibrationInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMERACALIBRATIONINFORMATIONAVAILABILITY$18, 0);
        }
    }
    
    /**
     * Gets the "filmDistortionInformationAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getFilmDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(FILMDISTORTIONINFORMATIONAVAILABILITY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filmDistortionInformationAvailability" element
     */
    public boolean isSetFilmDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILMDISTORTIONINFORMATIONAVAILABILITY$20) != 0;
        }
    }
    
    /**
     * Sets the "filmDistortionInformationAvailability" element
     */
    public void setFilmDistortionInformationAvailability(org.isotc211.x2005.gco.BooleanPropertyType filmDistortionInformationAvailability)
    {
        generatedSetterHelperImpl(filmDistortionInformationAvailability, FILMDISTORTIONINFORMATIONAVAILABILITY$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "filmDistortionInformationAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewFilmDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(FILMDISTORTIONINFORMATIONAVAILABILITY$20);
            return target;
        }
    }
    
    /**
     * Unsets the "filmDistortionInformationAvailability" element
     */
    public void unsetFilmDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILMDISTORTIONINFORMATIONAVAILABILITY$20, 0);
        }
    }
    
    /**
     * Gets the "lensDistortionInformationAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType getLensDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().find_element_user(LENSDISTORTIONINFORMATIONAVAILABILITY$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lensDistortionInformationAvailability" element
     */
    public boolean isSetLensDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENSDISTORTIONINFORMATIONAVAILABILITY$22) != 0;
        }
    }
    
    /**
     * Sets the "lensDistortionInformationAvailability" element
     */
    public void setLensDistortionInformationAvailability(org.isotc211.x2005.gco.BooleanPropertyType lensDistortionInformationAvailability)
    {
        generatedSetterHelperImpl(lensDistortionInformationAvailability, LENSDISTORTIONINFORMATIONAVAILABILITY$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lensDistortionInformationAvailability" element
     */
    public org.isotc211.x2005.gco.BooleanPropertyType addNewLensDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BooleanPropertyType target = null;
            target = (org.isotc211.x2005.gco.BooleanPropertyType)get_store().add_element_user(LENSDISTORTIONINFORMATIONAVAILABILITY$22);
            return target;
        }
    }
    
    /**
     * Unsets the "lensDistortionInformationAvailability" element
     */
    public void unsetLensDistortionInformationAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENSDISTORTIONINFORMATIONAVAILABILITY$22, 0);
        }
    }
}
