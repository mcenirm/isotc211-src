/*
 * XML Type:  EX_Extent_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXExtentType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML EX_Extent_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class EXExtentTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.EXExtentType
{
    private static final long serialVersionUID = 1L;
    
    public EXExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "description");
    private static final javax.xml.namespace.QName GEOGRAPHICELEMENT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "geographicElement");
    private static final javax.xml.namespace.QName TEMPORALELEMENT$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "temporalElement");
    private static final javax.xml.namespace.QName VERTICALELEMENT$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "verticalElement");
    
    
    /**
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$0);
            return target;
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
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets array of all "geographicElement" elements
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] getGeographicElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOGRAPHICELEMENT$2, targetList);
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geographicElement" element
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType getGeographicElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().find_element_user(GEOGRAPHICELEMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geographicElement" element
     */
    public int sizeOfGeographicElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOGRAPHICELEMENT$2);
        }
    }
    
    /**
     * Sets array of all "geographicElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGeographicElementArray(org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] geographicElementArray)
    {
        check_orphaned();
        arraySetterHelper(geographicElementArray, GEOGRAPHICELEMENT$2);
    }
    
    /**
     * Sets ith "geographicElement" element
     */
    public void setGeographicElementArray(int i, org.isotc211.x2005.gmd.EXGeographicExtentPropertyType geographicElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().find_element_user(GEOGRAPHICELEMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geographicElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geographicElement" element
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType insertNewGeographicElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().insert_element_user(GEOGRAPHICELEMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geographicElement" element
     */
    public org.isotc211.x2005.gmd.EXGeographicExtentPropertyType addNewGeographicElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicExtentPropertyType)get_store().add_element_user(GEOGRAPHICELEMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "geographicElement" element
     */
    public void removeGeographicElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOGRAPHICELEMENT$2, i);
        }
    }
    
    /**
     * Gets array of all "temporalElement" elements
     */
    public org.isotc211.x2005.gmd.EXTemporalExtentPropertyType[] getTemporalElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEMPORALELEMENT$4, targetList);
            org.isotc211.x2005.gmd.EXTemporalExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXTemporalExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "temporalElement" element
     */
    public org.isotc211.x2005.gmd.EXTemporalExtentPropertyType getTemporalElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXTemporalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXTemporalExtentPropertyType)get_store().find_element_user(TEMPORALELEMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "temporalElement" element
     */
    public int sizeOfTemporalElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPORALELEMENT$4);
        }
    }
    
    /**
     * Sets array of all "temporalElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTemporalElementArray(org.isotc211.x2005.gmd.EXTemporalExtentPropertyType[] temporalElementArray)
    {
        check_orphaned();
        arraySetterHelper(temporalElementArray, TEMPORALELEMENT$4);
    }
    
    /**
     * Sets ith "temporalElement" element
     */
    public void setTemporalElementArray(int i, org.isotc211.x2005.gmd.EXTemporalExtentPropertyType temporalElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXTemporalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXTemporalExtentPropertyType)get_store().find_element_user(TEMPORALELEMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(temporalElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "temporalElement" element
     */
    public org.isotc211.x2005.gmd.EXTemporalExtentPropertyType insertNewTemporalElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXTemporalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXTemporalExtentPropertyType)get_store().insert_element_user(TEMPORALELEMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "temporalElement" element
     */
    public org.isotc211.x2005.gmd.EXTemporalExtentPropertyType addNewTemporalElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXTemporalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXTemporalExtentPropertyType)get_store().add_element_user(TEMPORALELEMENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "temporalElement" element
     */
    public void removeTemporalElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPORALELEMENT$4, i);
        }
    }
    
    /**
     * Gets array of all "verticalElement" elements
     */
    public org.isotc211.x2005.gmd.EXVerticalExtentPropertyType[] getVerticalElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERTICALELEMENT$6, targetList);
            org.isotc211.x2005.gmd.EXVerticalExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXVerticalExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "verticalElement" element
     */
    public org.isotc211.x2005.gmd.EXVerticalExtentPropertyType getVerticalElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXVerticalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXVerticalExtentPropertyType)get_store().find_element_user(VERTICALELEMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "verticalElement" element
     */
    public int sizeOfVerticalElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICALELEMENT$6);
        }
    }
    
    /**
     * Sets array of all "verticalElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVerticalElementArray(org.isotc211.x2005.gmd.EXVerticalExtentPropertyType[] verticalElementArray)
    {
        check_orphaned();
        arraySetterHelper(verticalElementArray, VERTICALELEMENT$6);
    }
    
    /**
     * Sets ith "verticalElement" element
     */
    public void setVerticalElementArray(int i, org.isotc211.x2005.gmd.EXVerticalExtentPropertyType verticalElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXVerticalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXVerticalExtentPropertyType)get_store().find_element_user(VERTICALELEMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(verticalElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verticalElement" element
     */
    public org.isotc211.x2005.gmd.EXVerticalExtentPropertyType insertNewVerticalElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXVerticalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXVerticalExtentPropertyType)get_store().insert_element_user(VERTICALELEMENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verticalElement" element
     */
    public org.isotc211.x2005.gmd.EXVerticalExtentPropertyType addNewVerticalElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXVerticalExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXVerticalExtentPropertyType)get_store().add_element_user(VERTICALELEMENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "verticalElement" element
     */
    public void removeVerticalElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICALELEMENT$6, i);
        }
    }
}
