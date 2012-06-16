/*
 * An XML document type.
 * Localname: tupleList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TupleListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one tupleList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TupleListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TupleListDocument
{
    private static final long serialVersionUID = 1L;
    
    public TupleListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TUPLELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "tupleList");
    
    
    /**
     * Gets the "tupleList" element
     */
    public net.opengis.gml.x32.CoordinatesType getTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().find_element_user(TUPLELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tupleList" element
     */
    public void setTupleList(net.opengis.gml.x32.CoordinatesType tupleList)
    {
        generatedSetterHelperImpl(tupleList, TUPLELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "tupleList" element
     */
    public net.opengis.gml.x32.CoordinatesType addNewTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().add_element_user(TUPLELIST$0);
            return target;
        }
    }
}
