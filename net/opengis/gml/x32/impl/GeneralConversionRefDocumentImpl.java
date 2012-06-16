/*
 * An XML document type.
 * Localname: generalConversionRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeneralConversionRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one generalConversionRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeneralConversionRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeneralConversionRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralConversionRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALCONVERSIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "generalConversionRef");
    
    
    /**
     * Gets the "generalConversionRef" element
     */
    public net.opengis.gml.x32.GeneralConversionPropertyType getGeneralConversionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralConversionPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().find_element_user(GENERALCONVERSIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "generalConversionRef" element
     */
    public void setGeneralConversionRef(net.opengis.gml.x32.GeneralConversionPropertyType generalConversionRef)
    {
        generatedSetterHelperImpl(generalConversionRef, GENERALCONVERSIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "generalConversionRef" element
     */
    public net.opengis.gml.x32.GeneralConversionPropertyType addNewGeneralConversionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralConversionPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().add_element_user(GENERALCONVERSIONREF$0);
            return target;
        }
    }
}
