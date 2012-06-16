/*
 * An XML document type.
 * Localname: baseCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BaseCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one baseCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BaseCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.BaseCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseCRS");
    
    
    /**
     * Gets the "baseCRS" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType getBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(BASECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseCRS" element
     */
    public void setBaseCRS(net.opengis.gml.x32.SingleCRSPropertyType baseCRS)
    {
        generatedSetterHelperImpl(baseCRS, BASECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseCRS" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType addNewBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().add_element_user(BASECRS$0);
            return target;
        }
    }
}
