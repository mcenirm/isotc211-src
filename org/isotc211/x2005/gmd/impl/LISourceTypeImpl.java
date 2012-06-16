/*
 * XML Type:  LI_Source_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LISourceType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML LI_Source_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class LISourceTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.LISourceType
{
    private static final long serialVersionUID = 1L;
    
    public LISourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "description");
    private static final javax.xml.namespace.QName SCALEDENOMINATOR$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "scaleDenominator");
    private static final javax.xml.namespace.QName SOURCEREFERENCESYSTEM$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "sourceReferenceSystem");
    private static final javax.xml.namespace.QName SOURCECITATION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "sourceCitation");
    private static final javax.xml.namespace.QName SOURCEEXTENT$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "sourceExtent");
    private static final javax.xml.namespace.QName SOURCESTEP$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "sourceStep");
    
    
    /**
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "scaleDenominator" element
     */
    public org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType getScaleDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType)get_store().find_element_user(SCALEDENOMINATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scaleDenominator" element
     */
    public boolean isSetScaleDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCALEDENOMINATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "scaleDenominator" element
     */
    public void setScaleDenominator(org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType scaleDenominator)
    {
        generatedSetterHelperImpl(scaleDenominator, SCALEDENOMINATOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scaleDenominator" element
     */
    public org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType addNewScaleDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType)get_store().add_element_user(SCALEDENOMINATOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "scaleDenominator" element
     */
    public void unsetScaleDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCALEDENOMINATOR$2, 0);
        }
    }
    
    /**
     * Gets the "sourceReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType getSourceReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().find_element_user(SOURCEREFERENCESYSTEM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceReferenceSystem" element
     */
    public boolean isSetSourceReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEREFERENCESYSTEM$4) != 0;
        }
    }
    
    /**
     * Sets the "sourceReferenceSystem" element
     */
    public void setSourceReferenceSystem(org.isotc211.x2005.gmd.MDReferenceSystemPropertyType sourceReferenceSystem)
    {
        generatedSetterHelperImpl(sourceReferenceSystem, SOURCEREFERENCESYSTEM$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType addNewSourceReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().add_element_user(SOURCEREFERENCESYSTEM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sourceReferenceSystem" element
     */
    public void unsetSourceReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEREFERENCESYSTEM$4, 0);
        }
    }
    
    /**
     * Gets the "sourceCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getSourceCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(SOURCECITATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceCitation" element
     */
    public boolean isSetSourceCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCECITATION$6) != 0;
        }
    }
    
    /**
     * Sets the "sourceCitation" element
     */
    public void setSourceCitation(org.isotc211.x2005.gmd.CICitationPropertyType sourceCitation)
    {
        generatedSetterHelperImpl(sourceCitation, SOURCECITATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewSourceCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(SOURCECITATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "sourceCitation" element
     */
    public void unsetSourceCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCECITATION$6, 0);
        }
    }
    
    /**
     * Gets array of all "sourceExtent" elements
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType[] getSourceExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCEEXTENT$8, targetList);
            org.isotc211.x2005.gmd.EXExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sourceExtent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType getSourceExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(SOURCEEXTENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sourceExtent" element
     */
    public int sizeOfSourceExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEEXTENT$8);
        }
    }
    
    /**
     * Sets array of all "sourceExtent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSourceExtentArray(org.isotc211.x2005.gmd.EXExtentPropertyType[] sourceExtentArray)
    {
        check_orphaned();
        arraySetterHelper(sourceExtentArray, SOURCEEXTENT$8);
    }
    
    /**
     * Sets ith "sourceExtent" element
     */
    public void setSourceExtentArray(int i, org.isotc211.x2005.gmd.EXExtentPropertyType sourceExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(SOURCEEXTENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sourceExtent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceExtent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType insertNewSourceExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().insert_element_user(SOURCEEXTENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceExtent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType addNewSourceExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().add_element_user(SOURCEEXTENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "sourceExtent" element
     */
    public void removeSourceExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEEXTENT$8, i);
        }
    }
    
    /**
     * Gets array of all "sourceStep" elements
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType[] getSourceStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCESTEP$10, targetList);
            org.isotc211.x2005.gmd.LIProcessStepPropertyType[] result = new org.isotc211.x2005.gmd.LIProcessStepPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sourceStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType getSourceStepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().find_element_user(SOURCESTEP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sourceStep" element
     */
    public int sizeOfSourceStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCESTEP$10);
        }
    }
    
    /**
     * Sets array of all "sourceStep" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSourceStepArray(org.isotc211.x2005.gmd.LIProcessStepPropertyType[] sourceStepArray)
    {
        check_orphaned();
        arraySetterHelper(sourceStepArray, SOURCESTEP$10);
    }
    
    /**
     * Sets ith "sourceStep" element
     */
    public void setSourceStepArray(int i, org.isotc211.x2005.gmd.LIProcessStepPropertyType sourceStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().find_element_user(SOURCESTEP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sourceStep);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType insertNewSourceStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().insert_element_user(SOURCESTEP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType addNewSourceStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().add_element_user(SOURCESTEP$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "sourceStep" element
     */
    public void removeSourceStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCESTEP$10, i);
        }
    }
}
