/*
 * An XML document type.
 * Localname: Conversion
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConversionDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Conversion(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConversionDocument2Impl extends net.opengis.gml.x32.impl.AbstractGeneralConversionDocumentImpl implements net.opengis.gml.x32.ConversionDocument2
{
    private static final long serialVersionUID = 1L;
    
    public ConversionDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion");
    
    
    /**
     * Gets the "Conversion" element
     */
    public net.opengis.gml.x32.ConversionType getConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionType target = null;
            target = (net.opengis.gml.x32.ConversionType)get_store().find_element_user(CONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Conversion" element
     */
    public void setConversion(net.opengis.gml.x32.ConversionType conversion)
    {
        generatedSetterHelperImpl(conversion, CONVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Conversion" element
     */
    public net.opengis.gml.x32.ConversionType addNewConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionType target = null;
            target = (net.opengis.gml.x32.ConversionType)get_store().add_element_user(CONVERSION$0);
            return target;
        }
    }
}
