/*
 * An XML document type.
 * Localname: quantityType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.QuantityTypeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one quantityType(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class QuantityTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.QuantityTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "quantityType");
    
    
    /**
     * Gets the "quantityType" element
     */
    public net.opengis.gml.x32.StringOrRefType getQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(QUANTITYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "quantityType" element
     */
    public void setQuantityType(net.opengis.gml.x32.StringOrRefType quantityType)
    {
        generatedSetterHelperImpl(quantityType, QUANTITYTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantityType" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(QUANTITYTYPE$0);
            return target;
        }
    }
}
