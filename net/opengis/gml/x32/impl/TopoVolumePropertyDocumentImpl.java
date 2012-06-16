/*
 * An XML document type.
 * Localname: topoVolumeProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoVolumePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one topoVolumeProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoVolumePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoVolumePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoVolumePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOVOLUMEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoVolumeProperty");
    
    
    /**
     * Gets the "topoVolumeProperty" element
     */
    public net.opengis.gml.x32.TopoVolumePropertyType getTopoVolumeProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoVolumePropertyType target = null;
            target = (net.opengis.gml.x32.TopoVolumePropertyType)get_store().find_element_user(TOPOVOLUMEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoVolumeProperty" element
     */
    public void setTopoVolumeProperty(net.opengis.gml.x32.TopoVolumePropertyType topoVolumeProperty)
    {
        generatedSetterHelperImpl(topoVolumeProperty, TOPOVOLUMEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoVolumeProperty" element
     */
    public net.opengis.gml.x32.TopoVolumePropertyType addNewTopoVolumeProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoVolumePropertyType target = null;
            target = (net.opengis.gml.x32.TopoVolumePropertyType)get_store().add_element_user(TOPOVOLUMEPROPERTY$0);
            return target;
        }
    }
}
