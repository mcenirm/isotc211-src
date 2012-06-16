/*
 * An XML document type.
 * Localname: CoverageMappingRule
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoverageMappingRuleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CoverageMappingRule(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoverageMappingRuleDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.CoverageMappingRuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoverageMappingRuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVERAGEMAPPINGRULE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CoverageMappingRule");
    
    
    /**
     * Gets the "CoverageMappingRule" element
     */
    public net.opengis.gml.x32.MappingRuleType getCoverageMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MappingRuleType target = null;
            target = (net.opengis.gml.x32.MappingRuleType)get_store().find_element_user(COVERAGEMAPPINGRULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoverageMappingRule" element
     */
    public void setCoverageMappingRule(net.opengis.gml.x32.MappingRuleType coverageMappingRule)
    {
        generatedSetterHelperImpl(coverageMappingRule, COVERAGEMAPPINGRULE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CoverageMappingRule" element
     */
    public net.opengis.gml.x32.MappingRuleType addNewCoverageMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MappingRuleType target = null;
            target = (net.opengis.gml.x32.MappingRuleType)get_store().add_element_user(COVERAGEMAPPINGRULE$0);
            return target;
        }
    }
}
