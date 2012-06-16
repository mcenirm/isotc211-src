/*
 * An XML document type.
 * Localname: UnitDefinition
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UnitDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one UnitDefinition(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UnitDefinitionDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.UnitDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnitDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UnitDefinition");
    private static final org.apache.xmlbeans.QNameSet UNITDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConventionalUnit"),
    });
    
    
    /**
     * Gets the "UnitDefinition" element
     */
    public net.opengis.gml.x32.UnitDefinitionType getUnitDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UnitDefinitionType target = null;
            target = (net.opengis.gml.x32.UnitDefinitionType)get_store().find_element_user(UNITDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnitDefinition" element
     */
    public void setUnitDefinition(net.opengis.gml.x32.UnitDefinitionType unitDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UnitDefinitionType target = null;
            target = (net.opengis.gml.x32.UnitDefinitionType)get_store().find_element_user(UNITDEFINITION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.UnitDefinitionType)get_store().add_element_user(UNITDEFINITION$0);
            }
            target.set(unitDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "UnitDefinition" element
     */
    public net.opengis.gml.x32.UnitDefinitionType addNewUnitDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UnitDefinitionType target = null;
            target = (net.opengis.gml.x32.UnitDefinitionType)get_store().add_element_user(UNITDEFINITION$0);
            return target;
        }
    }
}
