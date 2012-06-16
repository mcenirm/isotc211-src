/*
 * An XML document type.
 * Localname: multiSolidProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSolidPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiSolidProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiSolidPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiSolidPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiSolidProperty");
    
    
    /**
     * Gets the "multiSolidProperty" element
     */
    public net.opengis.gml.x32.MultiSolidPropertyType getMultiSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSolidPropertyType target = null;
            target = (net.opengis.gml.x32.MultiSolidPropertyType)get_store().find_element_user(MULTISOLIDPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiSolidProperty" element
     */
    public void setMultiSolidProperty(net.opengis.gml.x32.MultiSolidPropertyType multiSolidProperty)
    {
        generatedSetterHelperImpl(multiSolidProperty, MULTISOLIDPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiSolidProperty" element
     */
    public net.opengis.gml.x32.MultiSolidPropertyType addNewMultiSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSolidPropertyType target = null;
            target = (net.opengis.gml.x32.MultiSolidPropertyType)get_store().add_element_user(MULTISOLIDPROPERTY$0);
            return target;
        }
    }
}
