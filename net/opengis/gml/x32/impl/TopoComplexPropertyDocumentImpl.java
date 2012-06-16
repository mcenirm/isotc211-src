/*
 * An XML document type.
 * Localname: topoComplexProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoComplexPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one topoComplexProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoComplexPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoComplexPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoComplexPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCOMPLEXPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoComplexProperty");
    
    
    /**
     * Gets the "topoComplexProperty" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType getTopoComplexProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(TOPOCOMPLEXPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoComplexProperty" element
     */
    public void setTopoComplexProperty(net.opengis.gml.x32.TopoComplexPropertyType topoComplexProperty)
    {
        generatedSetterHelperImpl(topoComplexProperty, TOPOCOMPLEXPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoComplexProperty" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType addNewTopoComplexProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().add_element_user(TOPOCOMPLEXPROPERTY$0);
            return target;
        }
    }
}
