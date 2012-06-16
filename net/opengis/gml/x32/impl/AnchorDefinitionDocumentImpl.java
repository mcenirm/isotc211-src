/*
 * An XML document type.
 * Localname: anchorDefinition
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AnchorDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one anchorDefinition(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AnchorDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AnchorDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnchorDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHORDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "anchorDefinition");
    private static final org.apache.xmlbeans.QNameSet ANCHORDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "anchorPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "anchorDefinition"),
    });
    
    
    /**
     * Gets the "anchorDefinition" element
     */
    public net.opengis.gml.x32.CodeType getAnchorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ANCHORDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anchorDefinition" element
     */
    public void setAnchorDefinition(net.opengis.gml.x32.CodeType anchorDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ANCHORDEFINITION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ANCHORDEFINITION$0);
            }
            target.set(anchorDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "anchorDefinition" element
     */
    public net.opengis.gml.x32.CodeType addNewAnchorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ANCHORDEFINITION$0);
            return target;
        }
    }
}
