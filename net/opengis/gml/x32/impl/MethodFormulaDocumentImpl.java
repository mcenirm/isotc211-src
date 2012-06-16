/*
 * An XML document type.
 * Localname: methodFormula
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MethodFormulaDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one methodFormula(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MethodFormulaDocumentImpl extends net.opengis.gml.x32.impl.FormulaDocumentImpl implements net.opengis.gml.x32.MethodFormulaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MethodFormulaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODFORMULA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "methodFormula");
    
    
    /**
     * Gets the "methodFormula" element
     */
    public net.opengis.gml.x32.CodeType getMethodFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(METHODFORMULA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "methodFormula" element
     */
    public void setMethodFormula(net.opengis.gml.x32.CodeType methodFormula)
    {
        generatedSetterHelperImpl(methodFormula, METHODFORMULA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "methodFormula" element
     */
    public net.opengis.gml.x32.CodeType addNewMethodFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(METHODFORMULA$0);
            return target;
        }
    }
}
