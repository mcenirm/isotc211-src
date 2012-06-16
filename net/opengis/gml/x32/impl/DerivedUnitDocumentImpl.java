/*
 * An XML document type.
 * Localname: DerivedUnit
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivedUnitDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DerivedUnit(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DerivedUnitDocumentImpl extends net.opengis.gml.x32.impl.UnitDefinitionDocumentImpl implements net.opengis.gml.x32.DerivedUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedUnit");
    
    
    /**
     * Gets the "DerivedUnit" element
     */
    public net.opengis.gml.x32.DerivedUnitType getDerivedUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivedUnitType target = null;
            target = (net.opengis.gml.x32.DerivedUnitType)get_store().find_element_user(DERIVEDUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DerivedUnit" element
     */
    public void setDerivedUnit(net.opengis.gml.x32.DerivedUnitType derivedUnit)
    {
        generatedSetterHelperImpl(derivedUnit, DERIVEDUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DerivedUnit" element
     */
    public net.opengis.gml.x32.DerivedUnitType addNewDerivedUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivedUnitType target = null;
            target = (net.opengis.gml.x32.DerivedUnitType)get_store().add_element_user(DERIVEDUNIT$0);
            return target;
        }
    }
}
