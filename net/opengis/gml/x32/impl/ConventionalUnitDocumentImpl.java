/*
 * An XML document type.
 * Localname: ConventionalUnit
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConventionalUnitDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ConventionalUnit(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConventionalUnitDocumentImpl extends net.opengis.gml.x32.impl.UnitDefinitionDocumentImpl implements net.opengis.gml.x32.ConventionalUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConventionalUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVENTIONALUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConventionalUnit");
    
    
    /**
     * Gets the "ConventionalUnit" element
     */
    public net.opengis.gml.x32.ConventionalUnitType getConventionalUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConventionalUnitType target = null;
            target = (net.opengis.gml.x32.ConventionalUnitType)get_store().find_element_user(CONVENTIONALUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConventionalUnit" element
     */
    public void setConventionalUnit(net.opengis.gml.x32.ConventionalUnitType conventionalUnit)
    {
        generatedSetterHelperImpl(conventionalUnit, CONVENTIONALUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConventionalUnit" element
     */
    public net.opengis.gml.x32.ConventionalUnitType addNewConventionalUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConventionalUnitType target = null;
            target = (net.opengis.gml.x32.ConventionalUnitType)get_store().add_element_user(CONVENTIONALUNIT$0);
            return target;
        }
    }
}
