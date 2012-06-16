/*
 * An XML document type.
 * Localname: imageDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ImageDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one imageDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ImageDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ImageDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "imageDatum");
    private static final org.apache.xmlbeans.QNameSet IMAGEDATUM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "imageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesImageDatum"),
    });
    
    
    /**
     * Gets the "imageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumPropertyType getImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().find_element_user(IMAGEDATUM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "imageDatum" element
     */
    public void setImageDatum(net.opengis.gml.x32.ImageDatumPropertyType imageDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().find_element_user(IMAGEDATUM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().add_element_user(IMAGEDATUM$0);
            }
            target.set(imageDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "imageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumPropertyType addNewImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().add_element_user(IMAGEDATUM$0);
            return target;
        }
    }
}
