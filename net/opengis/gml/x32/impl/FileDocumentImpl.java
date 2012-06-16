/*
 * An XML document type.
 * Localname: File
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FileDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one File(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class FileDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.FileDocument
{
    private static final long serialVersionUID = 1L;
    
    public FileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "File");
    
    
    /**
     * Gets the "File" element
     */
    public net.opengis.gml.x32.FileType getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FileType target = null;
            target = (net.opengis.gml.x32.FileType)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "File" element
     */
    public void setFile(net.opengis.gml.x32.FileType file)
    {
        generatedSetterHelperImpl(file, FILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "File" element
     */
    public net.opengis.gml.x32.FileType addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FileType target = null;
            target = (net.opengis.gml.x32.FileType)get_store().add_element_user(FILE$0);
            return target;
        }
    }
}
