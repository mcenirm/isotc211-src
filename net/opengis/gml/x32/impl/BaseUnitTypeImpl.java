/*
 * XML Type:  BaseUnitType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BaseUnitType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML BaseUnitType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class BaseUnitTypeImpl extends net.opengis.gml.x32.impl.UnitDefinitionTypeImpl implements net.opengis.gml.x32.BaseUnitType
{
    private static final long serialVersionUID = 1L;
    
    public BaseUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITSSYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "unitsSystem");
    
    
    /**
     * Gets the "unitsSystem" element
     */
    public net.opengis.gml.x32.ReferenceType getUnitsSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(UNITSSYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unitsSystem" element
     */
    public void setUnitsSystem(net.opengis.gml.x32.ReferenceType unitsSystem)
    {
        generatedSetterHelperImpl(unitsSystem, UNITSSYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unitsSystem" element
     */
    public net.opengis.gml.x32.ReferenceType addNewUnitsSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(UNITSSYSTEM$0);
            return target;
        }
    }
}
