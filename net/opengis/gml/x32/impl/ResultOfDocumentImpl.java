/*
 * An XML document type.
 * Localname: resultOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ResultOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one resultOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ResultOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ResultOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResultOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULTOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "resultOf");
    
    
    /**
     * Gets the "resultOf" element
     */
    public net.opengis.gml.x32.ResultType getResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ResultType target = null;
            target = (net.opengis.gml.x32.ResultType)get_store().find_element_user(RESULTOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultOf" element
     */
    public void setResultOf(net.opengis.gml.x32.ResultType resultOf)
    {
        generatedSetterHelperImpl(resultOf, RESULTOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultOf" element
     */
    public net.opengis.gml.x32.ResultType addNewResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ResultType target = null;
            target = (net.opengis.gml.x32.ResultType)get_store().add_element_user(RESULTOF$0);
            return target;
        }
    }
}
