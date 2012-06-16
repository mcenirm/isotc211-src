/*
 * An XML document type.
 * Localname: sourceCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SourceCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one sourceCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SourceCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SourceCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sourceCRS");
    
    
    /**
     * Gets the "sourceCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType getSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(SOURCECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sourceCRS" element
     */
    public void setSourceCRS(net.opengis.gml.x32.CRSPropertyType sourceCRS)
    {
        generatedSetterHelperImpl(sourceCRS, SOURCECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(SOURCECRS$0);
            return target;
        }
    }
}
