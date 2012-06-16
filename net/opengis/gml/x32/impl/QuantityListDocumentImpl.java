/*
 * An XML document type.
 * Localname: QuantityList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.QuantityListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one QuantityList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class QuantityListDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueListDocumentImpl implements net.opengis.gml.x32.QuantityListDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityList");
    
    
    /**
     * Gets the "QuantityList" element
     */
    public net.opengis.gml.x32.MeasureOrNilReasonListType getQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureOrNilReasonListType target = null;
            target = (net.opengis.gml.x32.MeasureOrNilReasonListType)get_store().find_element_user(QUANTITYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuantityList" element
     */
    public void setQuantityList(net.opengis.gml.x32.MeasureOrNilReasonListType quantityList)
    {
        generatedSetterHelperImpl(quantityList, QUANTITYLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QuantityList" element
     */
    public net.opengis.gml.x32.MeasureOrNilReasonListType addNewQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureOrNilReasonListType target = null;
            target = (net.opengis.gml.x32.MeasureOrNilReasonListType)get_store().add_element_user(QUANTITYLIST$0);
            return target;
        }
    }
}
