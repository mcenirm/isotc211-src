/*
 * An XML document type.
 * Localname: secondDefiningParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SecondDefiningParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one secondDefiningParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SecondDefiningParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SecondDefiningParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecondDefiningParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECONDDEFININGPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "secondDefiningParameter");
    
    
    /**
     * Gets the "secondDefiningParameter" element
     */
    public net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter getSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter target = null;
            target = (net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter)get_store().find_element_user(SECONDDEFININGPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "secondDefiningParameter" element
     */
    public void setSecondDefiningParameter(net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter secondDefiningParameter)
    {
        generatedSetterHelperImpl(secondDefiningParameter, SECONDDEFININGPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "secondDefiningParameter" element
     */
    public net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter addNewSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter target = null;
            target = (net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter)get_store().add_element_user(SECONDDEFININGPARAMETER$0);
            return target;
        }
    }
    /**
     * An XML secondDefiningParameter(@http://www.opengis.net/gml/3.2).
     *
     * This is a complex type.
     */
    public static class SecondDefiningParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter
    {
        private static final long serialVersionUID = 1L;
        
        public SecondDefiningParameterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDDEFININGPARAMETER$0 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "SecondDefiningParameter");
        
        
        /**
         * Gets the "SecondDefiningParameter" element
         */
        public net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter getSecondDefiningParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter target = null;
                target = (net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter)get_store().find_element_user(SECONDDEFININGPARAMETER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SecondDefiningParameter" element
         */
        public void setSecondDefiningParameter(net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter secondDefiningParameter)
        {
            generatedSetterHelperImpl(secondDefiningParameter, SECONDDEFININGPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SecondDefiningParameter" element
         */
        public net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter addNewSecondDefiningParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter target = null;
                target = (net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter)get_store().add_element_user(SECONDDEFININGPARAMETER$0);
                return target;
            }
        }
    }
}
