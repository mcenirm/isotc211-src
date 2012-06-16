/*
 * XML Type:  FileType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FileType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML FileType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class FileTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.FileType
{
    private static final long serialVersionUID = 1L;
    
    public FileTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rangeParameters");
    private static final javax.xml.namespace.QName FILENAME$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "fileName");
    private static final javax.xml.namespace.QName FILEREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "fileReference");
    private static final javax.xml.namespace.QName FILESTRUCTURE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "fileStructure");
    private static final javax.xml.namespace.QName MIMETYPE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "mimeType");
    private static final javax.xml.namespace.QName COMPRESSION$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "compression");
    
    
    /**
     * Gets the "rangeParameters" element
     */
    public net.opengis.gml.x32.AssociationRoleType getRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(RANGEPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeParameters" element
     */
    public void setRangeParameters(net.opengis.gml.x32.AssociationRoleType rangeParameters)
    {
        generatedSetterHelperImpl(rangeParameters, RANGEPARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeParameters" element
     */
    public net.opengis.gml.x32.AssociationRoleType addNewRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().add_element_user(RANGEPARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "fileName" element
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileName" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILENAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileName" element
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$2) != 0;
        }
    }
    
    /**
     * Sets the "fileName" element
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$2);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "fileName" element
     */
    public void xsetFileName(org.apache.xmlbeans.XmlAnyURI fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(FILENAME$2);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Unsets the "fileName" element
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$2, 0);
        }
    }
    
    /**
     * Gets the "fileReference" element
     */
    public java.lang.String getFileReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileReference" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFileReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILEREFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileReference" element
     */
    public boolean isSetFileReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEREFERENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "fileReference" element
     */
    public void setFileReference(java.lang.String fileReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEREFERENCE$4);
            }
            target.setStringValue(fileReference);
        }
    }
    
    /**
     * Sets (as xml) the "fileReference" element
     */
    public void xsetFileReference(org.apache.xmlbeans.XmlAnyURI fileReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILEREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(FILEREFERENCE$4);
            }
            target.set(fileReference);
        }
    }
    
    /**
     * Unsets the "fileReference" element
     */
    public void unsetFileReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEREFERENCE$4, 0);
        }
    }
    
    /**
     * Gets the "fileStructure" element
     */
    public net.opengis.gml.x32.CodeType getFileStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(FILESTRUCTURE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fileStructure" element
     */
    public void setFileStructure(net.opengis.gml.x32.CodeType fileStructure)
    {
        generatedSetterHelperImpl(fileStructure, FILESTRUCTURE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fileStructure" element
     */
    public net.opengis.gml.x32.CodeType addNewFileStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(FILESTRUCTURE$6);
            return target;
        }
    }
    
    /**
     * Gets the "mimeType" element
     */
    public java.lang.String getMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mimeType" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(MIMETYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "mimeType" element
     */
    public boolean isSetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMETYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "mimeType" element
     */
    public void setMimeType(java.lang.String mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMETYPE$8);
            }
            target.setStringValue(mimeType);
        }
    }
    
    /**
     * Sets (as xml) the "mimeType" element
     */
    public void xsetMimeType(org.apache.xmlbeans.XmlAnyURI mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(MIMETYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(MIMETYPE$8);
            }
            target.set(mimeType);
        }
    }
    
    /**
     * Unsets the "mimeType" element
     */
    public void unsetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMETYPE$8, 0);
        }
    }
    
    /**
     * Gets the "compression" element
     */
    public java.lang.String getCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "compression" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMPRESSION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "compression" element
     */
    public boolean isSetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPRESSION$10) != 0;
        }
    }
    
    /**
     * Sets the "compression" element
     */
    public void setCompression(java.lang.String compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRESSION$10);
            }
            target.setStringValue(compression);
        }
    }
    
    /**
     * Sets (as xml) the "compression" element
     */
    public void xsetCompression(org.apache.xmlbeans.XmlAnyURI compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMPRESSION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COMPRESSION$10);
            }
            target.set(compression);
        }
    }
    
    /**
     * Unsets the "compression" element
     */
    public void unsetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPRESSION$10, 0);
        }
    }
}
