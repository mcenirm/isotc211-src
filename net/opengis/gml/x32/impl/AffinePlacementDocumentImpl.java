/*
 * An XML document type.
 * Localname: AffinePlacement
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AffinePlacementDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AffinePlacement(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AffinePlacementDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.AffinePlacementDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffinePlacementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFINEPLACEMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffinePlacement");
    
    
    /**
     * Gets the "AffinePlacement" element
     */
    public net.opengis.gml.x32.AffinePlacementType getAffinePlacement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffinePlacementType target = null;
            target = (net.opengis.gml.x32.AffinePlacementType)get_store().find_element_user(AFFINEPLACEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffinePlacement" element
     */
    public void setAffinePlacement(net.opengis.gml.x32.AffinePlacementType affinePlacement)
    {
        generatedSetterHelperImpl(affinePlacement, AFFINEPLACEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffinePlacement" element
     */
    public net.opengis.gml.x32.AffinePlacementType addNewAffinePlacement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffinePlacementType target = null;
            target = (net.opengis.gml.x32.AffinePlacementType)get_store().add_element_user(AFFINEPLACEMENT$0);
            return target;
        }
    }
}
