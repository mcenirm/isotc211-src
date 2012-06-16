/*
 * An XML document type.
 * Localname: topoPointProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoPointPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one topoPointProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoPointPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoPointPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPointPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPOINTPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoPointProperty");
    
    
    /**
     * Gets the "topoPointProperty" element
     */
    public net.opengis.gml.x32.TopoPointPropertyType getTopoPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPointPropertyType target = null;
            target = (net.opengis.gml.x32.TopoPointPropertyType)get_store().find_element_user(TOPOPOINTPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoPointProperty" element
     */
    public void setTopoPointProperty(net.opengis.gml.x32.TopoPointPropertyType topoPointProperty)
    {
        generatedSetterHelperImpl(topoPointProperty, TOPOPOINTPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoPointProperty" element
     */
    public net.opengis.gml.x32.TopoPointPropertyType addNewTopoPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPointPropertyType target = null;
            target = (net.opengis.gml.x32.TopoPointPropertyType)get_store().add_element_user(TOPOPOINTPROPERTY$0);
            return target;
        }
    }
}
