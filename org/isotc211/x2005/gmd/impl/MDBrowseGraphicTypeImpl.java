/*
 * XML Type:  MD_BrowseGraphic_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDBrowseGraphicType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_BrowseGraphic_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDBrowseGraphicTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDBrowseGraphicType
{
    private static final long serialVersionUID = 1L;
    
    public MDBrowseGraphicTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILENAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "fileName");
    private static final javax.xml.namespace.QName FILEDESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "fileDescription");
    private static final javax.xml.namespace.QName FILETYPE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "fileType");
    
    
    /**
     * Gets the "fileName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FILENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fileName" element
     */
    public void setFileName(org.isotc211.x2005.gco.CharacterStringPropertyType fileName)
    {
        generatedSetterHelperImpl(fileName, FILENAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fileName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FILENAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "fileDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFileDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FILEDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileDescription" element
     */
    public boolean isSetFileDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "fileDescription" element
     */
    public void setFileDescription(org.isotc211.x2005.gco.CharacterStringPropertyType fileDescription)
    {
        generatedSetterHelperImpl(fileDescription, FILEDESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fileDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFileDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FILEDESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fileDescription" element
     */
    public void unsetFileDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEDESCRIPTION$2, 0);
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
