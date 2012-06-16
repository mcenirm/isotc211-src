/*
 * An XML document type.
 * Localname: Count
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CountDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Count(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CountDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueDocumentImpl implements net.opengis.gml.x32.CountDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Count");
    
    
    /**
     * Gets the "Count" element
     */
    public net.opengis.gml.x32.CountDocument.Count getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CountDocument.Count target = null;
            target = (net.opengis.gml.x32.CountDocument.Count)get_store().find_element_user(COUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Count" element
     */
    public boolean isNilCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CountDocument.Count target = null;
            target = (net.opengis.gml.x32.CountDocument.Count)get_store().find_element_user(COUNT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Count" element
     */
    public void setCount(net.opengis.gml.x32.CountDocument.Count count)
    {
        generatedSetterHelperImpl(count, COUNT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Count" element
     */
    public net.opengis.gml.x32.CountDocument.Count addNewCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CountDocument.Count target = null;
            target = (net.opengis.gml.x32.CountDocument.Count)get_store().add_element_user(COUNT$0);
            return target;
        }
    }
    
    /**
     * Nils the "Count" element
     */
    public void setNilCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CountDocument.Count target = null;
            target = (net.opengis.gml.x32.CountDocument.Count)get_store().find_element_user(COUNT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CountDocument.Count)get_store().add_element_user(COUNT$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML Count(@http://www.opengis.net/gml/3.2).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.CountDocument$Count.
     */
    public static class CountImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements net.opengis.gml.x32.CountDocument.Count
    {
        private static final long serialVersionUID = 1L;
        
        public CountImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CountImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NILREASON$0 = 
            new javax.xml.namespace.QName("", "nilReason");
        
        
        /**
         * Gets the "nilReason" attribute
         */
        public java.lang.Object getNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$0);
                if (target == null)
                {
                    return null;
                }
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "nilReason" attribute
         */
        public net.opengis.gml.x32.NilReasonType xgetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.NilReasonType target = null;
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$0);
                return target;
            }
        }
        
        /**
         * True if has "nilReason" attribute
         */
        public boolean isSetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NILREASON$0) != null;
            }
        }
        
        /**
         * Sets the "nilReason" attribute
         */
        public void setNilReason(java.lang.Object nilReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$0);
                }
                target.setObjectValue(nilReason);
            }
        }
        
        /**
         * Sets (as xml) the "nilReason" attribute
         */
        public void xsetNilReason(net.opengis.gml.x32.NilReasonType nilReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.NilReasonType target = null;
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$0);
                if (target == null)
                {
                    target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$0);
                }
                target.set(nilReason);
            }
        }
        
        /**
         * Unsets the "nilReason" attribute
         */
        public void unsetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NILREASON$0);
            }
        }
    }
}
