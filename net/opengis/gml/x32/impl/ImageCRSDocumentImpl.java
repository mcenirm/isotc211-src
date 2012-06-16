/*
 * An XML document type.
 * Localname: ImageCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ImageCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ImageCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ImageCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.ImageCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageCRS");
    
    
    /**
     * Gets the "ImageCRS" element
     */
    public net.opengis.gml.x32.ImageCRSType getImageCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageCRSType target = null;
            target = (net.opengis.gml.x32.ImageCRSType)get_store().find_element_user(IMAGECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImageCRS" element
     */
    public void setImageCRS(net.opengis.gml.x32.ImageCRSType imageCRS)
    {
        generatedSetterHelperImpl(imageCRS, IMAGECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImageCRS" element
     */
    public net.opengis.gml.x32.ImageCRSType addNewImageCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageCRSType target = null;
            target = (net.opengis.gml.x32.ImageCRSType)get_store().add_element_user(IMAGECRS$0);
            return target;
        }
    }
}
