/*
 * XML Type:  OperationMethodType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationMethodType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML OperationMethodType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class OperationMethodTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.OperationMethodType
{
    private static final long serialVersionUID = 1L;
    
    public OperationMethodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMULACITATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "formulaCitation");
    private static final javax.xml.namespace.QName FORMULA$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "formula");
    private static final org.apache.xmlbeans.QNameSet FORMULA$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "formula"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "methodFormula"),
    });
    private static final javax.xml.namespace.QName SOURCEDIMENSIONS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sourceDimensions");
    private static final javax.xml.namespace.QName TARGETDIMENSIONS$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "targetDimensions");
    private static final javax.xml.namespace.QName PARAMETER$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameter");
    private static final org.apache.xmlbeans.QNameSet PARAMETER$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "generalOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameter"),
    });
    
    
    /**
     * Gets the "formulaCitation" element
     */
    public net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation getFormulaCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation target = null;
            target = (net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation)get_store().find_element_user(FORMULACITATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formulaCitation" element
     */
    public boolean isSetFormulaCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULACITATION$0) != 0;
        }
    }
    
    /**
     * Sets the "formulaCitation" element
     */
    public void setFormulaCitation(net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation formulaCitation)
    {
        generatedSetterHelperImpl(formulaCitation, FORMULACITATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "formulaCitation" element
     */
    public net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation addNewFormulaCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation target = null;
            target = (net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation)get_store().add_element_user(FORMULACITATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "formulaCitation" element
     */
    public void unsetFormulaCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULACITATION$0, 0);
        }
    }
    
    /**
     * Gets the "formula" element
     */
    public net.opengis.gml.x32.CodeType getFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(FORMULA$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formula" element
     */
    public boolean isSetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULA$3) != 0;
        }
    }
    
    /**
     * Sets the "formula" element
     */
    public void setFormula(net.opengis.gml.x32.CodeType formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(FORMULA$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(FORMULA$2);
            }
            target.set(formula);
        }
    }
    
    /**
     * Appends and returns a new empty "formula" element
     */
    public net.opengis.gml.x32.CodeType addNewFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(FORMULA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "formula" element
     */
    public void unsetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULA$3, 0);
        }
    }
    
    /**
     * Gets the "sourceDimensions" element
     */
    public java.math.BigInteger getSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceDimensions" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceDimensions" element
     */
    public boolean isSetSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEDIMENSIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "sourceDimensions" element
     */
    public void setSourceDimensions(java.math.BigInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDIMENSIONS$4);
            }
            target.setBigIntegerValue(sourceDimensions);
        }
    }
    
    /**
     * Sets (as xml) the "sourceDimensions" element
     */
    public void xsetSourceDimensions(org.apache.xmlbeans.XmlPositiveInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(SOURCEDIMENSIONS$4);
            }
            target.set(sourceDimensions);
        }
    }
    
    /**
     * Unsets the "sourceDimensions" element
     */
    public void unsetSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEDIMENSIONS$4, 0);
        }
    }
    
    /**
     * Gets the "targetDimensions" element
     */
    public java.math.BigInteger getTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDIMENSIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetDimensions" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TARGETDIMENSIONS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetDimensions" element
     */
    public boolean isSetTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETDIMENSIONS$6) != 0;
        }
    }
    
    /**
     * Sets the "targetDimensions" element
     */
    public void setTargetDimensions(java.math.BigInteger targetDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDIMENSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETDIMENSIONS$6);
            }
            target.setBigIntegerValue(targetDimensions);
        }
    }
    
    /**
     * Sets (as xml) the "targetDimensions" element
     */
    public void xsetTargetDimensions(org.apache.xmlbeans.XmlPositiveInteger targetDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TARGETDIMENSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(TARGETDIMENSIONS$6);
            }
            target.set(targetDimensions);
        }
    }
    
    /**
     * Unsets the "targetDimensions" element
     */
    public void unsetTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETDIMENSIONS$6, 0);
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$9, targetList);
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] result = new net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(PARAMETER$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$9);
        }
    }
    
    /**
     * Sets array of all "parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterArray(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] parameterArray)
    {
        check_orphaned();
        arraySetterHelper(parameterArray, PARAMETER$8, PARAMETER$9);
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(PARAMETER$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().insert_element_user(PARAMETER$9, PARAMETER$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(PARAMETER$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$9, i);
        }
    }
}
