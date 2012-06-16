/*
 * An XML document type.
 * Localname: MappingRule
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MappingRuleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MappingRule(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MappingRuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MappingRuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public MappingRuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPINGRULE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MappingRule");
    
    
    /**
     * Gets the "MappingRule" element
     */
    public net.opengis.gml.x32.StringOrRefType getMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(MAPPINGRULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MappingRule" element
     */
    public void setMappingRule(net.opengis.gml.x32.StringOrRefType mappingRule)
    {
        generatedSetterHelperImpl(mappingRule, MAPPINGRULE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MappingRule" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(MAPPINGRULE$0);
            return target;
        }
    }
}
