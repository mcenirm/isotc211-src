/*
 * An XML document type.
 * Localname: singleCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SingleCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one singleCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SingleCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SingleCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public SingleCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLECRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "singleCRSRef");
    
    
    /**
     * Gets the "singleCRSRef" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType getSingleCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(SINGLECRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "singleCRSRef" element
     */
    public void setSingleCRSRef(net.opengis.gml.x32.SingleCRSPropertyType singleCRSRef)
    {
        generatedSetterHelperImpl(singleCRSRef, SINGLECRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "singleCRSRef" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType addNewSingleCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().add_element_user(SINGLECRSREF$0);
            return target;
        }
    }
}
