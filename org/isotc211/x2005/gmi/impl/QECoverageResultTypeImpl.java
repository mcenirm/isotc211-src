/*
 * XML Type:  QE_CoverageResult_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.QECoverageResultType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML QE_CoverageResult_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class QECoverageResultTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractDQResultTypeImpl implements org.isotc211.x2005.gmi.QECoverageResultType
{
    private static final long serialVersionUID = 1L;
    
    public QECoverageResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPATIALREPRESENTATIONTYPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "spatialRepresentationType");
    private static final javax.xml.namespace.QName RESULTSPATIALREPRESENTATION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "resultSpatialRepresentation");
    private static final javax.xml.namespace.QName RESULTCONTENTDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "resultContentDescription");
    private static final javax.xml.namespace.QName RESULTFORMAT$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "resultFormat");
    private static final javax.xml.namespace.QName RESULTFILE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "resultFile");
    
    
    /**
     * Gets the "spatialRepresentationType" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType getSpatialRepresentationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType)get_store().find_element_user(SPATIALREPRESENTATIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "spatialRepresentationType" element
     */
    public void setSpatialRepresentationType(org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType spatialRepresentationType)
    {
        generatedSetterHelperImpl(spatialRepresentationType, SPATIALREPRESENTATIONTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "spatialRepresentationType" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType addNewSpatialRepresentationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType)get_store().add_element_user(SPATIALREPRESENTATIONTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "resultSpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType getResultSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType)get_store().find_element_user(RESULTSPATIALREPRESENTATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultSpatialRepresentation" element
     */
    public void setResultSpatialRepresentation(org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType resultSpatialRepresentation)
    {
        generatedSetterHelperImpl(resultSpatialRepresentation, RESULTSPATIALREPRESENTATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultSpatialRepresentation" element
     */
    public org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType addNewResultSpatialRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType)get_store().add_element_user(RESULTSPATIALREPRESENTATION$2);
            return target;
        }
    }
    
    /**
     * Gets the "resultContentDescription" element
     */
    public org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType getResultContentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType)get_store().find_element_user(RESULTCONTENTDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultContentDescription" element
     */
    public void setResultContentDescription(org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType resultContentDescription)
    {
        generatedSetterHelperImpl(resultContentDescription, RESULTCONTENTDESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultContentDescription" element
     */
    public org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType addNewResultContentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType)get_store().add_element_user(RESULTCONTENTDESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Gets the "resultFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType getResultFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(RESULTFORMAT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultFormat" element
     */
    public void setResultFormat(org.isotc211.x2005.gmd.MDFormatPropertyType resultFormat)
    {
        generatedSetterHelperImpl(resultFormat, RESULTFORMAT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType addNewResultFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().add_element_user(RESULTFORMAT$6);
            return target;
        }
    }
    
    /**
     * Gets the "resultFile" element
     */
    public org.isotc211.x2005.gmi.MXDataFilePropertyType getResultFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MXDataFilePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MXDataFilePropertyType)get_store().find_element_user(RESULTFILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultFile" element
     */
    public void setResultFile(org.isotc211.x2005.gmi.MXDataFilePropertyType resultFile)
    {
        generatedSetterHelperImpl(resultFile, RESULTFILE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultFile" element
     */
    public org.isotc211.x2005.gmi.MXDataFilePropertyType addNewResultFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MXDataFilePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MXDataFilePropertyType)get_store().add_element_user(RESULTFILE$8);
            return target;
        }
    }
}
