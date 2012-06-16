/*
 * An XML document type.
 * Localname: roughConversionToPreferredUnit
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RoughConversionToPreferredUnitDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one roughConversionToPreferredUnit(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RoughConversionToPreferredUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.RoughConversionToPreferredUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoughConversionToPreferredUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUGHCONVERSIONTOPREFERREDUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "roughConversionToPreferredUnit");
    
    
    /**
     * Gets the "roughConversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType getRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().find_element_user(ROUGHCONVERSIONTOPREFERREDUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "roughConversionToPreferredUnit" element
     */
    public void setRoughConversionToPreferredUnit(net.opengis.gml.x32.ConversionToPreferredUnitType roughConversionToPreferredUnit)
    {
        generatedSetterHelperImpl(roughConversionToPreferredUnit, ROUGHCONVERSIONTOPREFERREDUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "roughConversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType addNewRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().add_element_user(ROUGHCONVERSIONTOPREFERREDUNIT$0);
            return target;
        }
    }
}
