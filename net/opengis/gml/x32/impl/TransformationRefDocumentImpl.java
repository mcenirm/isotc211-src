/*
 * An XML document type.
 * Localname: transformationRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TransformationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one transformationRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TransformationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TransformationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "transformationRef");
    
    
    /**
     * Gets the "transformationRef" element
     */
    public net.opengis.gml.x32.TransformationPropertyType getTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TransformationPropertyType target = null;
            target = (net.opengis.gml.x32.TransformationPropertyType)get_store().find_element_user(TRANSFORMATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transformationRef" element
     */
    public void setTransformationRef(net.opengis.gml.x32.TransformationPropertyType transformationRef)
    {
        generatedSetterHelperImpl(transformationRef, TRANSFORMATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transformationRef" element
     */
    public net.opengis.gml.x32.TransformationPropertyType addNewTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TransformationPropertyType target = null;
            target = (net.opengis.gml.x32.TransformationPropertyType)get_store().add_element_user(TRANSFORMATIONREF$0);
            return target;
        }
    }
}
