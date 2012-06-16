/*
 * An XML document type.
 * Localname: MultiGeometry
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiGeometryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiGeometry(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiGeometryDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateDocumentImpl implements net.opengis.gml.x32.MultiGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiGeometry");
    
    
    /**
     * Gets the "MultiGeometry" element
     */
    public net.opengis.gml.x32.MultiGeometryType getMultiGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiGeometryType target = null;
            target = (net.opengis.gml.x32.MultiGeometryType)get_store().find_element_user(MULTIGEOMETRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiGeometry" element
     */
    public void setMultiGeometry(net.opengis.gml.x32.MultiGeometryType multiGeometry)
    {
        generatedSetterHelperImpl(multiGeometry, MULTIGEOMETRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiGeometry" element
     */
    public net.opengis.gml.x32.MultiGeometryType addNewMultiGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiGeometryType target = null;
            target = (net.opengis.gml.x32.MultiGeometryType)get_store().add_element_user(MULTIGEOMETRY$0);
            return target;
        }
    }
}
