/*
 * An XML document type.
 * Localname: Transformation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TransformationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Transformation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TransformationDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeneralTransformationDocumentImpl implements net.opengis.gml.x32.TransformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation");
    
    
    /**
     * Gets the "Transformation" element
     */
    public net.opengis.gml.x32.TransformationType getTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TransformationType target = null;
            target = (net.opengis.gml.x32.TransformationType)get_store().find_element_user(TRANSFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Transformation" element
     */
    public void setTransformation(net.opengis.gml.x32.TransformationType transformation)
    {
        generatedSetterHelperImpl(transformation, TRANSFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Transformation" element
     */
    public net.opengis.gml.x32.TransformationType addNewTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TransformationType target = null;
            target = (net.opengis.gml.x32.TransformationType)get_store().add_element_user(TRANSFORMATION$0);
            return target;
        }
    }
}
