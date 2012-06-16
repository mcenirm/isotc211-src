/*
 * An XML document type.
 * Localname: ImageDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ImageDatumDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ImageDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ImageDatumDocument2Impl extends net.opengis.gml.x32.impl.AbstractDatumDocumentImpl implements net.opengis.gml.x32.ImageDatumDocument2
{
    private static final long serialVersionUID = 1L;
    
    public ImageDatumDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageDatum");
    
    
    /**
     * Gets the "ImageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumType getImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumType target = null;
            target = (net.opengis.gml.x32.ImageDatumType)get_store().find_element_user(IMAGEDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImageDatum" element
     */
    public void setImageDatum(net.opengis.gml.x32.ImageDatumType imageDatum)
    {
        generatedSetterHelperImpl(imageDatum, IMAGEDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumType addNewImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumType target = null;
            target = (net.opengis.gml.x32.ImageDatumType)get_store().add_element_user(IMAGEDATUM$0);
            return target;
        }
    }
}
