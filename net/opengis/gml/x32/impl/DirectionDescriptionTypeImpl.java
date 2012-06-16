/*
 * XML Type:  DirectionDescriptionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectionDescriptionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DirectionDescriptionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DirectionDescriptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DirectionDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public DirectionDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPASSPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "compassPoint");
    private static final javax.xml.namespace.QName KEYWORD$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "keyword");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "description");
    private static final javax.xml.namespace.QName REFERENCE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "reference");
    
    
    /**
     * Gets the "compassPoint" element
     */
    public net.opengis.gml.x32.CompassPointEnumeration.Enum getCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.CompassPointEnumeration.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "compassPoint" element
     */
    public net.opengis.gml.x32.CompassPointEnumeration xgetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompassPointEnumeration target = null;
            target = (net.opengis.gml.x32.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "compassPoint" element
     */
    public boolean isSetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPASSPOINT$0) != 0;
        }
    }
    
    /**
     * Sets the "compassPoint" element
     */
    public void setCompassPoint(net.opengis.gml.x32.CompassPointEnumeration.Enum compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPASSPOINT$0);
            }
            target.setEnumValue(compassPoint);
        }
    }
    
    /**
     * Sets (as xml) the "compassPoint" element
     */
    public void xsetCompassPoint(net.opengis.gml.x32.CompassPointEnumeration compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompassPointEnumeration target = null;
            target = (net.opengis.gml.x32.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CompassPointEnumeration)get_store().add_element_user(COMPASSPOINT$0);
            }
            target.set(compassPoint);
        }
    }
    
    /**
     * Unsets the "compassPoint" element
     */
    public void unsetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPASSPOINT$0, 0);
        }
    }
    
    /**
     * Gets the "keyword" element
     */
    public net.opengis.gml.x32.CodeType getKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(KEYWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "keyword" element
     */
    public boolean isSetKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$2) != 0;
        }
    }
    
    /**
     * Sets the "keyword" element
     */
    public void setKeyword(net.opengis.gml.x32.CodeType keyword)
    {
        generatedSetterHelperImpl(keyword, KEYWORD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "keyword" element
     */
    public net.opengis.gml.x32.CodeType addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(KEYWORD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "keyword" element
     */
    public void unsetKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$2, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "reference" element
     */
    public net.opengis.gml.x32.ReferenceType getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(REFERENCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reference" element
     */
    public boolean isSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$6) != 0;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(net.opengis.gml.x32.ReferenceType reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(REFERENCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "reference" element
     */
    public void unsetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$6, 0);
        }
    }
}
