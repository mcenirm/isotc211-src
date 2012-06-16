/*
 * XML Type:  CoverageFunctionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoverageFunctionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CoverageFunctionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CoverageFunctionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CoverageFunctionType
{
    private static final long serialVersionUID = 1L;
    
    public CoverageFunctionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPINGRULE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MappingRule");
    private static final javax.xml.namespace.QName COVERAGEMAPPINGRULE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CoverageMappingRule");
    private static final javax.xml.namespace.QName GRIDFUNCTION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridFunction");
    
    
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
     * True if has "MappingRule" element
     */
    public boolean isSetMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPINGRULE$0) != 0;
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
    
    /**
     * Unsets the "MappingRule" element
     */
    public void unsetMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPINGRULE$0, 0);
        }
    }
    
    /**
     * Gets the "CoverageMappingRule" element
     */
    public net.opengis.gml.x32.MappingRuleType getCoverageMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MappingRuleType target = null;
            target = (net.opengis.gml.x32.MappingRuleType)get_store().find_element_user(COVERAGEMAPPINGRULE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CoverageMappingRule" element
     */
    public boolean isSetCoverageMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COVERAGEMAPPINGRULE$2) != 0;
        }
    }
    
    /**
     * Sets the "CoverageMappingRule" element
     */
    public void setCoverageMappingRule(net.opengis.gml.x32.MappingRuleType coverageMappingRule)
    {
        generatedSetterHelperImpl(coverageMappingRule, COVERAGEMAPPINGRULE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.x32.MappingRuleType)get_store().add_element_user(COVERAGEMAPPINGRULE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CoverageMappingRule" element
     */
    public void unsetCoverageMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COVERAGEMAPPINGRULE$2, 0);
        }
    }
    
    /**
     * Gets the "GridFunction" element
     */
    public net.opengis.gml.x32.GridFunctionType getGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridFunctionType target = null;
            target = (net.opengis.gml.x32.GridFunctionType)get_store().find_element_user(GRIDFUNCTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GridFunction" element
     */
    public boolean isSetGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDFUNCTION$4) != 0;
        }
    }
    
    /**
     * Sets the "GridFunction" element
     */
    public void setGridFunction(net.opengis.gml.x32.GridFunctionType gridFunction)
    {
        generatedSetterHelperImpl(gridFunction, GRIDFUNCTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GridFunction" element
     */
    public net.opengis.gml.x32.GridFunctionType addNewGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridFunctionType target = null;
            target = (net.opengis.gml.x32.GridFunctionType)get_store().add_element_user(GRIDFUNCTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "GridFunction" element
     */
    public void unsetGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDFUNCTION$4, 0);
        }
    }
}
