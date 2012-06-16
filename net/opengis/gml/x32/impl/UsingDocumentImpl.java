/*
 * An XML document type.
 * Localname: using
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsingDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one using(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.UsingDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "using");
    
    
    /**
     * Gets the "using" element
     */
    public net.opengis.gml.x32.ProcedurePropertyType getUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProcedurePropertyType target = null;
            target = (net.opengis.gml.x32.ProcedurePropertyType)get_store().find_element_user(USING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "using" element
     */
    public void setUsing(net.opengis.gml.x32.ProcedurePropertyType using)
    {
        generatedSetterHelperImpl(using, USING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "using" element
     */
    public net.opengis.gml.x32.ProcedurePropertyType addNewUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProcedurePropertyType target = null;
            target = (net.opengis.gml.x32.ProcedurePropertyType)get_store().add_element_user(USING$0);
            return target;
        }
    }
}
