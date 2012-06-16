/*
 * XML Type:  AbstractGeneralParameterValuePropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractGeneralParameterValuePropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractGeneralParameterValuePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralParameterValuePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALPARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralParameterValue");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGENERALPARAMETERVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ParameterValueGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralParameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ParameterValue"),
    });
    
    
    /**
     * Gets the "AbstractGeneralParameterValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValueType getAbstractGeneralParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValueType)get_store().find_element_user(ABSTRACTGENERALPARAMETERVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeneralParameterValue" element
     */
    public void setAbstractGeneralParameterValue(net.opengis.gml.x32.AbstractGeneralParameterValueType abstractGeneralParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValueType)get_store().find_element_user(ABSTRACTGENERALPARAMETERVALUE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralParameterValueType)get_store().add_element_user(ABSTRACTGENERALPARAMETERVALUE$0);
            }
            target.set(abstractGeneralParameterValue);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeneralParameterValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValueType addNewAbstractGeneralParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValueType)get_store().add_element_user(ABSTRACTGENERALPARAMETERVALUE$0);
            return target;
        }
    }
}
