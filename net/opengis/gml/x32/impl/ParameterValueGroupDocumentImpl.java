/*
 * An XML document type.
 * Localname: ParameterValueGroup
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ParameterValueGroupDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ParameterValueGroup(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ParameterValueGroupDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeneralParameterValueDocumentImpl implements net.opengis.gml.x32.ParameterValueGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERVALUEGROUP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ParameterValueGroup");
    
    
    /**
     * Gets the "ParameterValueGroup" element
     */
    public net.opengis.gml.x32.ParameterValueGroupType getParameterValueGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ParameterValueGroupType target = null;
            target = (net.opengis.gml.x32.ParameterValueGroupType)get_store().find_element_user(PARAMETERVALUEGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ParameterValueGroup" element
     */
    public void setParameterValueGroup(net.opengis.gml.x32.ParameterValueGroupType parameterValueGroup)
    {
        generatedSetterHelperImpl(parameterValueGroup, PARAMETERVALUEGROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParameterValueGroup" element
     */
    public net.opengis.gml.x32.ParameterValueGroupType addNewParameterValueGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ParameterValueGroupType target = null;
            target = (net.opengis.gml.x32.ParameterValueGroupType)get_store().add_element_user(PARAMETERVALUEGROUP$0);
            return target;
        }
    }
}
