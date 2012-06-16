/*
 * An XML document type.
 * Localname: definedByConversion
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefinedByConversionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one definedByConversion(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DefinedByConversionDocumentImpl extends net.opengis.gml.x32.impl.ConversionDocumentImpl implements net.opengis.gml.x32.DefinedByConversionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinedByConversionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINEDBYCONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "definedByConversion");
    
    
    /**
     * Gets the "definedByConversion" element
     */
    public net.opengis.gml.x32.GeneralConversionPropertyType getDefinedByConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralConversionPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().find_element_user(DEFINEDBYCONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definedByConversion" element
     */
    public void setDefinedByConversion(net.opengis.gml.x32.GeneralConversionPropertyType definedByConversion)
    {
        generatedSetterHelperImpl(definedByConversion, DEFINEDBYCONVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definedByConversion" element
     */
    public net.opengis.gml.x32.GeneralConversionPropertyType addNewDefinedByConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralConversionPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().add_element_user(DEFINEDBYCONVERSION$0);
            return target;
        }
    }
}
