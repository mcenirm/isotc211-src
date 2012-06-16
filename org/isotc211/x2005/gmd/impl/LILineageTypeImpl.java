/*
 * XML Type:  LI_Lineage_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LILineageType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML LI_Lineage_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class LILineageTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.LILineageType
{
    private static final long serialVersionUID = 1L;
    
    public LILineageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATEMENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "statement");
    private static final javax.xml.namespace.QName PROCESSSTEP$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "processStep");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "source");
    
    
    /**
     * Gets the "statement" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(STATEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statement" element
     */
    public boolean isSetStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATEMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "statement" element
     */
    public void setStatement(org.isotc211.x2005.gco.CharacterStringPropertyType statement)
    {
        generatedSetterHelperImpl(statement, STATEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "statement" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(STATEMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "statement" element
     */
    public void unsetStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATEMENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "processStep" elements
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType[] getProcessStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSSTEP$2, targetList);
            org.isotc211.x2005.gmd.LIProcessStepPropertyType[] result = new org.isotc211.x2005.gmd.LIProcessStepPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "processStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType getProcessStepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().find_element_user(PROCESSSTEP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "processStep" element
     */
    public int sizeOfProcessStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSSTEP$2);
        }
    }
    
    /**
     * Sets array of all "processStep" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProcessStepArray(org.isotc211.x2005.gmd.LIProcessStepPropertyType[] processStepArray)
    {
        check_orphaned();
        arraySetterHelper(processStepArray, PROCESSSTEP$2);
    }
    
    /**
     * Sets ith "processStep" element
     */
    public void setProcessStepArray(int i, org.isotc211.x2005.gmd.LIProcessStepPropertyType processStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().find_element_user(PROCESSSTEP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processStep);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "processStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType insertNewProcessStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().insert_element_user(PROCESSSTEP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "processStep" element
     */
    public org.isotc211.x2005.gmd.LIProcessStepPropertyType addNewProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LIProcessStepPropertyType target = null;
            target = (org.isotc211.x2005.gmd.LIProcessStepPropertyType)get_store().add_element_user(PROCESSSTEP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "processStep" element
     */
    public void removeProcessStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSSTEP$2, i);
        }
    }
    
    /**
     * Gets array of all "source" elements
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$4, targetList);
            org.isotc211.x2005.gmd.LISourcePropertyType[] result = new org.isotc211.x2005.gmd.LISourcePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "source" element
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().find_element_user(SOURCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$4);
        }
    }
    
    /**
     * Sets array of all "source" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSourceArray(org.isotc211.x2005.gmd.LISourcePropertyType[] sourceArray)
    {
        check_orphaned();
        arraySetterHelper(sourceArray, SOURCE$4);
    }
    
    /**
     * Sets ith "source" element
     */
    public void setSourceArray(int i, org.isotc211.x2005.gmd.LISourcePropertyType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().find_element_user(SOURCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().insert_element_user(SOURCE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().add_element_user(SOURCE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$4, i);
        }
    }
}
