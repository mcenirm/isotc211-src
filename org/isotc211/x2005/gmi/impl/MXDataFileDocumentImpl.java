/*
 * An XML document type.
 * Localname: MX_DataFile
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MXDataFileDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MX_DataFile(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MXDataFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MXDataFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public MXDataFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MXDATAFILE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MX_DataFile");
    
    
    /**
     * Gets the "MX_DataFile" element
     */
    public org.isotc211.x2005.gmi.MXDataFileType getMXDataFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MXDataFileType target = null;
            target = (org.isotc211.x2005.gmi.MXDataFileType)get_store().find_element_user(MXDATAFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MX_DataFile" element
     */
    public void setMXDataFile(org.isotc211.x2005.gmi.MXDataFileType mxDataFile)
    {
        generatedSetterHelperImpl(mxDataFile, MXDATAFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MX_DataFile" element
     */
    public org.isotc211.x2005.gmi.MXDataFileType addNewMXDataFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MXDataFileType target = null;
            target = (org.isotc211.x2005.gmi.MXDataFileType)get_store().add_element_user(MXDATAFILE$0);
            return target;
        }
    }
}
