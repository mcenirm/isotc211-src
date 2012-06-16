/*
 * An XML document type.
 * Localname: abstractGeneralOperationParameterRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralOperationParameterRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one abstractGeneralOperationParameterRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeneralOperationParameterRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractGeneralOperationParameterRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralOperationParameterRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALOPERATIONPARAMETERREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "abstractGeneralOperationParameterRef");
    
    
    /**
     * Gets the "abstractGeneralOperationParameterRef" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getAbstractGeneralOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(ABSTRACTGENERALOPERATIONPARAMETERREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractGeneralOperationParameterRef" element
     */
    public void setAbstractGeneralOperationParameterRef(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType abstractGeneralOperationParameterRef)
    {
        generatedSetterHelperImpl(abstractGeneralOperationParameterRef, ABSTRACTGENERALOPERATIONPARAMETERREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstractGeneralOperationParameterRef" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewAbstractGeneralOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(ABSTRACTGENERALOPERATIONPARAMETERREF$0);
            return target;
        }
    }
}
