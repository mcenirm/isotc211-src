/*
 * An XML document type.
 * Localname: imageCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ImageCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one imageCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ImageCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ImageCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGECRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "imageCRSRef");
    
    
    /**
     * Gets the "imageCRSRef" element
     */
    public net.opengis.gml.x32.ImageCRSPropertyType getImageCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageCRSPropertyType target = null;
            target = (net.opengis.gml.x32.ImageCRSPropertyType)get_store().find_element_user(IMAGECRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "imageCRSRef" element
     */
    public void setImageCRSRef(net.opengis.gml.x32.ImageCRSPropertyType imageCRSRef)
    {
        generatedSetterHelperImpl(imageCRSRef, IMAGECRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "imageCRSRef" element
     */
    public net.opengis.gml.x32.ImageCRSPropertyType addNewImageCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageCRSPropertyType target = null;
            target = (net.opengis.gml.x32.ImageCRSPropertyType)get_store().add_element_user(IMAGECRSREF$0);
            return target;
        }
    }
}
