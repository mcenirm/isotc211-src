/*
 * XML Type:  MD_Format_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDFormatType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Format_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDFormatTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDFormatType
{
    private static final long serialVersionUID = 1L;
    
    public MDFormatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "name");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "version");
    private static final javax.xml.namespace.QName AMENDMENTNUMBER$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "amendmentNumber");
    private static final javax.xml.namespace.QName SPECIFICATION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "specification");
    private static final javax.xml.namespace.QName FILEDECOMPRESSIONTECHNIQUE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "fileDecompressionTechnique");
    private static final javax.xml.namespace.QName FORMATDISTRIBUTOR$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "formatDistributor");
    
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.isotc211.x2005.gco.CharacterStringPropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "version" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(org.isotc211.x2005.gco.CharacterStringPropertyType version)
    {
        generatedSetterHelperImpl(version, VERSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(VERSION$2);
            return target;
        }
    }
    
    /**
     * Gets the "amendmentNumber" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getAmendmentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(AMENDMENTNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "amendmentNumber" element
     */
    public boolean isSetAmendmentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMENDMENTNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "amendmentNumber" element
     */
    public void setAmendmentNumber(org.isotc211.x2005.gco.CharacterStringPropertyType amendmentNumber)
    {
        generatedSetterHelperImpl(amendmentNumber, AMENDMENTNUMBER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "amendmentNumber" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewAmendmentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(AMENDMENTNUMBER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "amendmentNumber" element
     */
    public void unsetAmendmentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMENDMENTNUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "specification" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(SPECIFICATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "specification" element
     */
    public boolean isSetSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIFICATION$6) != 0;
        }
    }
    
    /**
     * Sets the "specification" element
     */
    public void setSpecification(org.isotc211.x2005.gco.CharacterStringPropertyType specification)
    {
        generatedSetterHelperImpl(specification, SPECIFICATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "specification" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(SPECIFICATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "specification" element
     */
    public void unsetSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIFICATION$6, 0);
        }
    }
    
    /**
     * Gets the "fileDecompressionTechnique" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFileDecompressionTechnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FILEDECOMPRESSIONTECHNIQUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileDecompressionTechnique" element
     */
    public boolean isSetFileDecompressionTechnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEDECOMPRESSIONTECHNIQUE$8) != 0;
        }
    }
    
    /**
     * Sets the "fileDecompressionTechnique" element
     */
    public void setFileDecompressionTechnique(org.isotc211.x2005.gco.CharacterStringPropertyType fileDecompressionTechnique)
    {
        generatedSetterHelperImpl(fileDecompressionTechnique, FILEDECOMPRESSIONTECHNIQUE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fileDecompressionTechnique" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFileDecompressionTechnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FILEDECOMPRESSIONTECHNIQUE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "fileDecompressionTechnique" element
     */
    public void unsetFileDecompressionTechnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEDECOMPRESSIONTECHNIQUE$8, 0);
        }
    }
    
    /**
     * Gets array of all "formatDistributor" elements
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType[] getFormatDistributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMATDISTRIBUTOR$10, targetList);
            org.isotc211.x2005.gmd.MDDistributorPropertyType[] result = new org.isotc211.x2005.gmd.MDDistributorPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "formatDistributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType getFormatDistributorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().find_element_user(FORMATDISTRIBUTOR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "formatDistributor" element
     */
    public int sizeOfFormatDistributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATDISTRIBUTOR$10);
        }
    }
    
    /**
     * Sets array of all "formatDistributor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFormatDistributorArray(org.isotc211.x2005.gmd.MDDistributorPropertyType[] formatDistributorArray)
    {
        check_orphaned();
        arraySetterHelper(formatDistributorArray, FORMATDISTRIBUTOR$10);
    }
    
    /**
     * Sets ith "formatDistributor" element
     */
    public void setFormatDistributorArray(int i, org.isotc211.x2005.gmd.MDDistributorPropertyType formatDistributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().find_element_user(FORMATDISTRIBUTOR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(formatDistributor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formatDistributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType insertNewFormatDistributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().insert_element_user(FORMATDISTRIBUTOR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formatDistributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorPropertyType addNewFormatDistributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorPropertyType)get_store().add_element_user(FORMATDISTRIBUTOR$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "formatDistributor" element
     */
    public void removeFormatDistributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATDISTRIBUTOR$10, i);
        }
    }
}
