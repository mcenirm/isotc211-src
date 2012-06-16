/*
 * An XML document type.
 * Localname: solidArrayProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SolidArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one solidArrayProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SolidArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SolidArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "solidArrayProperty");
    
    
    /**
     * Gets the "solidArrayProperty" element
     */
    public net.opengis.gml.x32.SolidArrayPropertyType getSolidArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SolidArrayPropertyType)get_store().find_element_user(SOLIDARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidArrayProperty" element
     */
    public void setSolidArrayProperty(net.opengis.gml.x32.SolidArrayPropertyType solidArrayProperty)
    {
        generatedSetterHelperImpl(solidArrayProperty, SOLIDARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidArrayProperty" element
     */
    public net.opengis.gml.x32.SolidArrayPropertyType addNewSolidArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SolidArrayPropertyType)get_store().add_element_user(SOLIDARRAYPROPERTY$0);
            return target;
        }
    }
}
