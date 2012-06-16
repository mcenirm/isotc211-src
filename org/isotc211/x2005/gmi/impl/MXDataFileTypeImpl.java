/*
 * XML Type:  MX_DataFile_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MXDataFileType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MX_DataFile_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MXDataFileTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MXDataFileType
{
    private static final long serialVersionUID = 1L;
    
    public MXDataFileTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "fileFormat");
    
    
    /**
     * Gets the "fileFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType getFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(FILEFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fileFormat" element
     */
    public void setFileFormat(org.isotc211.x2005.gmd.MDFormatPropertyType fileFormat)
    {
        generatedSetterHelperImpl(fileFormat, FILEFORMAT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fileFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType addNewFileFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().add_element_user(FILEFORMAT$0);
            return target;
        }
    }
}
