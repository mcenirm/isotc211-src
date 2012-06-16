/*
 * An XML document type.
 * Localname: conversionRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConversionRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one conversionRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConversionRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ConversionRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversionRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "conversionRef");
    
    
    /**
     * Gets the "conversionRef" element
     */
    public net.opengis.gml.x32.ConversionPropertyType getConversionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionPropertyType target = null;
            target = (net.opengis.gml.x32.ConversionPropertyType)get_store().find_element_user(CONVERSIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversionRef" element
     */
    public void setConversionRef(net.opengis.gml.x32.ConversionPropertyType conversionRef)
    {
        generatedSetterHelperImpl(conversionRef, CONVERSIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversionRef" element
     */
    public net.opengis.gml.x32.ConversionPropertyType addNewConversionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionPropertyType target = null;
            target = (net.opengis.gml.x32.ConversionPropertyType)get_store().add_element_user(CONVERSIONREF$0);
            return target;
        }
    }
}
