/*
 * XML Type:  MD_ApplicationSchemaInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDApplicationSchemaInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_ApplicationSchemaInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDApplicationSchemaInformationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDApplicationSchemaInformationType
{
    private static final long serialVersionUID = 1L;
    
    public MDApplicationSchemaInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "name");
    private static final javax.xml.namespace.QName SCHEMALANGUAGE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "schemaLanguage");
    private static final javax.xml.namespace.QName CONSTRAINTLANGUAGE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "constraintLanguage");
    private static final javax.xml.namespace.QName SCHEMAASCII$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "schemaAscii");
    private static final javax.xml.namespace.QName GRAPHICSFILE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "graphicsFile");
    private static final javax.xml.namespace.QName SOFTWAREDEVELOPMENTFILE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "softwareDevelopmentFile");
    private static final javax.xml.namespace.QName SOFTWAREDEVELOPMENTFILEFORMAT$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "softwareDevelopmentFileFormat");
    
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(NAME$0, 0);
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
    public void setName(org.isotc211.x2005.gmd.CICitationPropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "schemaLanguage" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getSchemaLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(SCHEMALANGUAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "schemaLanguage" element
     */
    public void setSchemaLanguage(org.isotc211.x2005.gco.CharacterStringPropertyType schemaLanguage)
    {
        generatedSetterHelperImpl(schemaLanguage, SCHEMALANGUAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schemaLanguage" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewSchemaLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(SCHEMALANGUAGE$2);
            return target;
        }
    }
    
    /**
     * Gets the "constraintLanguage" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getConstraintLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CONSTRAINTLANGUAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "constraintLanguage" element
     */
    public void setConstraintLanguage(org.isotc211.x2005.gco.CharacterStringPropertyType constraintLanguage)
    {
        generatedSetterHelperImpl(constraintLanguage, CONSTRAINTLANGUAGE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "constraintLanguage" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewConstraintLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CONSTRAINTLANGUAGE$4);
            return target;
        }
    }
    
    /**
     * Gets the "schemaAscii" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getSchemaAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(SCHEMAASCII$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schemaAscii" element
     */
    public boolean isSetSchemaAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMAASCII$6) != 0;
        }
    }
    
    /**
     * Sets the "schemaAscii" element
     */
    public void setSchemaAscii(org.isotc211.x2005.gco.CharacterStringPropertyType schemaAscii)
    {
        generatedSetterHelperImpl(schemaAscii, SCHEMAASCII$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schemaAscii" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewSchemaAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(SCHEMAASCII$6);
            return target;
        }
    }
    
    /**
     * Unsets the "schemaAscii" element
     */
    public void unsetSchemaAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMAASCII$6, 0);
        }
    }
    
    /**
     * Gets the "graphicsFile" element
     */
    public org.isotc211.x2005.gco.BinaryPropertyType getGraphicsFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryPropertyType target = null;
            target = (org.isotc211.x2005.gco.BinaryPropertyType)get_store().find_element_user(GRAPHICSFILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "graphicsFile" element
     */
    public boolean isSetGraphicsFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHICSFILE$8) != 0;
        }
    }
    
    /**
     * Sets the "graphicsFile" element
     */
    public void setGraphicsFile(org.isotc211.x2005.gco.BinaryPropertyType graphicsFile)
    {
        generatedSetterHelperImpl(graphicsFile, GRAPHICSFILE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "graphicsFile" element
     */
    public org.isotc211.x2005.gco.BinaryPropertyType addNewGraphicsFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryPropertyType target = null;
            target = (org.isotc211.x2005.gco.BinaryPropertyType)get_store().add_element_user(GRAPHICSFILE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "graphicsFile" element
     */
    public void unsetGraphicsFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHICSFILE$8, 0);
        }
    }
    
    /**
     * Gets the "softwareDevelopmentFile" element
     */
    public org.isotc211.x2005.gco.BinaryPropertyType getSoftwareDevelopmentFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryPropertyType target = null;
            target = (org.isotc211.x2005.gco.BinaryPropertyType)get_store().find_element_user(SOFTWAREDEVELOPMENTFILE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "softwareDevelopmentFile" element
     */
    public boolean isSetSoftwareDevelopmentFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWAREDEVELOPMENTFILE$10) != 0;
        }
    }
    
    /**
     * Sets the "softwareDevelopmentFile" element
     */
    public void setSoftwareDevelopmentFile(org.isotc211.x2005.gco.BinaryPropertyType softwareDevelopmentFile)
    {
        generatedSetterHelperImpl(softwareDevelopmentFile, SOFTWAREDEVELOPMENTFILE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "softwareDevelopmentFile" element
     */
    public org.isotc211.x2005.gco.BinaryPropertyType addNewSoftwareDevelopmentFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryPropertyType target = null;
            target = (org.isotc211.x2005.gco.BinaryPropertyType)get_store().add_element_user(SOFTWAREDEVELOPMENTFILE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "softwareDevelopmentFile" element
     */
    public void unsetSoftwareDevelopmentFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWAREDEVELOPMENTFILE$10, 0);
        }
    }
    
    /**
     * Gets the "softwareDevelopmentFileFormat" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getSoftwareDevelopmentFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(SOFTWAREDEVELOPMENTFILEFORMAT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "softwareDevelopmentFileFormat" element
     */
    public boolean isSetSoftwareDevelopmentFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWAREDEVELOPMENTFILEFORMAT$12) != 0;
        }
    }
    
    /**
     * Sets the "softwareDevelopmentFileFormat" element
     */
    public void setSoftwareDevelopmentFileFormat(org.isotc211.x2005.gco.CharacterStringPropertyType softwareDevelopmentFileFormat)
    {
        generatedSetterHelperImpl(softwareDevelopmentFileFormat, SOFTWAREDEVELOPMENTFILEFORMAT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "softwareDevelopmentFileFormat" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewSoftwareDevelopmentFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(SOFTWAREDEVELOPMENTFILEFORMAT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "softwareDevelopmentFileFormat" element
     */
    public void unsetSoftwareDevelopmentFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWAREDEVELOPMENTFILEFORMAT$12, 0);
        }
    }
}
