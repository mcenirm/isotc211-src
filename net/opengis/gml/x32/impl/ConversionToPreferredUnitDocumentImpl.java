/*
 * An XML document type.
 * Localname: conversionToPreferredUnit
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConversionToPreferredUnitDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one conversionToPreferredUnit(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConversionToPreferredUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ConversionToPreferredUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversionToPreferredUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSIONTOPREFERREDUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "conversionToPreferredUnit");
    
    
    /**
     * Gets the "conversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType getConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().find_element_user(CONVERSIONTOPREFERREDUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversionToPreferredUnit" element
     */
    public void setConversionToPreferredUnit(net.opengis.gml.x32.ConversionToPreferredUnitType conversionToPreferredUnit)
    {
        generatedSetterHelperImpl(conversionToPreferredUnit, CONVERSIONTOPREFERREDUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType addNewConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().add_element_user(CONVERSIONTOPREFERREDUNIT$0);
            return target;
        }
    }
}
