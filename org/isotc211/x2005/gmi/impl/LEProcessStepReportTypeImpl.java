/*
 * XML Type:  LE_ProcessStepReport_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessStepReportType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML LE_ProcessStepReport_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class LEProcessStepReportTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.LEProcessStepReportType
{
    private static final long serialVersionUID = 1L;
    
    public LEProcessStepReportTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "description");
    private static final javax.xml.namespace.QName FILETYPE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "fileType");
    
    
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
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$2, 0);
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
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$2);
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
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "fileType" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FILETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileType" element
     */
    public boolean isSetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILETYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "fileType" element
     */
    public void setFileType(org.isotc211.x2005.gco.CharacterStringPropertyType fileType)
    {
        generatedSetterHelperImpl(fileType, FILETYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fileType" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FILETYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "fileType" element
     */
    public void unsetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILETYPE$4, 0);
        }
    }
}
