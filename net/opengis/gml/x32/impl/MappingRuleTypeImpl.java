/*
 * XML Type:  MappingRuleType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MappingRuleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MappingRuleType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class MappingRuleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MappingRuleType
{
    private static final long serialVersionUID = 1L;
    
    public MappingRuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RULEDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ruleDefinition");
    private static final javax.xml.namespace.QName RULEREFERENCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ruleReference");
    
    
    /**
     * Gets the "ruleDefinition" element
     */
    public java.lang.String getRuleDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RULEDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ruleDefinition" element
     */
    public org.apache.xmlbeans.XmlString xgetRuleDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RULEDEFINITION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ruleDefinition" element
     */
    public boolean isSetRuleDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RULEDEFINITION$0) != 0;
        }
    }
    
    /**
     * Sets the "ruleDefinition" element
     */
    public void setRuleDefinition(java.lang.String ruleDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RULEDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RULEDEFINITION$0);
            }
            target.setStringValue(ruleDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "ruleDefinition" element
     */
    public void xsetRuleDefinition(org.apache.xmlbeans.XmlString ruleDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RULEDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RULEDEFINITION$0);
            }
            target.set(ruleDefinition);
        }
    }
    
    /**
     * Unsets the "ruleDefinition" element
     */
    public void unsetRuleDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RULEDEFINITION$0, 0);
        }
    }
    
    /**
     * Gets the "ruleReference" element
     */
    public net.opengis.gml.x32.ReferenceType getRuleReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(RULEREFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ruleReference" element
     */
    public boolean isSetRuleReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RULEREFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "ruleReference" element
     */
    public void setRuleReference(net.opengis.gml.x32.ReferenceType ruleReference)
    {
        generatedSetterHelperImpl(ruleReference, RULEREFERENCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ruleReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewRuleReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(RULEREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ruleReference" element
     */
    public void unsetRuleReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RULEREFERENCE$2, 0);
        }
    }
}
