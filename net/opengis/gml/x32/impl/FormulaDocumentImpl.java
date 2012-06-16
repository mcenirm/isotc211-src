/*
 * An XML document type.
 * Localname: formula
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FormulaDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one formula(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class FormulaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.FormulaDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormulaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMULA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "formula");
    private static final org.apache.xmlbeans.QNameSet FORMULA$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "formula"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "methodFormula"),
    });
    
    
    /**
     * Gets the "formula" element
     */
    public net.opengis.gml.x32.CodeType getFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(FORMULA$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "formula" element
     */
    public void setFormula(net.opengis.gml.x32.CodeType formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(FORMULA$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(FORMULA$0);
            }
            target.set(formula);
        }
    }
    
    /**
     * Appends and returns a new empty "formula" element
     */
    public net.opengis.gml.x32.CodeType addNewFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(FORMULA$0);
            return target;
        }
    }
}
