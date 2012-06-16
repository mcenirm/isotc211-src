/*
 * An XML document type.
 * Localname: valueList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one valueList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValueListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ValueListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueList");
    
    
    /**
     * Gets the "valueList" element
     */
    public net.opengis.gml.x32.MeasureListType getValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureListType target = null;
            target = (net.opengis.gml.x32.MeasureListType)get_store().find_element_user(VALUELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueList" element
     */
    public void setValueList(net.opengis.gml.x32.MeasureListType valueList)
    {
        generatedSetterHelperImpl(valueList, VALUELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueList" element
     */
    public net.opengis.gml.x32.MeasureListType addNewValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureListType target = null;
            target = (net.opengis.gml.x32.MeasureListType)get_store().add_element_user(VALUELIST$0);
            return target;
        }
    }
}
