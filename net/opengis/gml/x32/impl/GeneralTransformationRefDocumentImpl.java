/*
 * An XML document type.
 * Localname: generalTransformationRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeneralTransformationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one generalTransformationRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeneralTransformationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeneralTransformationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralTransformationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALTRANSFORMATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "generalTransformationRef");
    
    
    /**
     * Gets the "generalTransformationRef" element
     */
    public net.opengis.gml.x32.GeneralTransformationPropertyType getGeneralTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralTransformationPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralTransformationPropertyType)get_store().find_element_user(GENERALTRANSFORMATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "generalTransformationRef" element
     */
    public void setGeneralTransformationRef(net.opengis.gml.x32.GeneralTransformationPropertyType generalTransformationRef)
    {
        generatedSetterHelperImpl(generalTransformationRef, GENERALTRANSFORMATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "generalTransformationRef" element
     */
    public net.opengis.gml.x32.GeneralTransformationPropertyType addNewGeneralTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralTransformationPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralTransformationPropertyType)get_store().add_element_user(GENERALTRANSFORMATIONREF$0);
            return target;
        }
    }
}
