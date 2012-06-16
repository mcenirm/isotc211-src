/*
 * An XML document type.
 * Localname: rangeParameters
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RangeParametersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one rangeParameters(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RangeParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.RangeParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public RangeParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rangeParameters");
    
    
    /**
     * Gets the "rangeParameters" element
     */
    public net.opengis.gml.x32.AssociationRoleType getRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(RANGEPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeParameters" element
     */
    public void setRangeParameters(net.opengis.gml.x32.AssociationRoleType rangeParameters)
    {
        generatedSetterHelperImpl(rangeParameters, RANGEPARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeParameters" element
     */
    public net.opengis.gml.x32.AssociationRoleType addNewRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().add_element_user(RANGEPARAMETERS$0);
            return target;
        }
    }
}
