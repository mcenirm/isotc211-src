/*
 * An XML document type.
 * Localname: metaDataProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MetaDataPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one metaDataProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MetaDataPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MetaDataPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetaDataPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "metaDataProperty");
    
    
    /**
     * Gets the "metaDataProperty" element
     */
    public net.opengis.gml.x32.MetaDataPropertyType getMetaDataProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MetaDataPropertyType target = null;
            target = (net.opengis.gml.x32.MetaDataPropertyType)get_store().find_element_user(METADATAPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "metaDataProperty" element
     */
    public void setMetaDataProperty(net.opengis.gml.x32.MetaDataPropertyType metaDataProperty)
    {
        generatedSetterHelperImpl(metaDataProperty, METADATAPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "metaDataProperty" element
     */
    public net.opengis.gml.x32.MetaDataPropertyType addNewMetaDataProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MetaDataPropertyType target = null;
            target = (net.opengis.gml.x32.MetaDataPropertyType)get_store().add_element_user(METADATAPROPERTY$0);
            return target;
        }
    }
}
