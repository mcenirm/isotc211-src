/*
 * XML Type:  TimeUnitType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeUnitType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeUnitType(@http://www.opengis.net/gml/3.2).
 *
 * This is a union type. Instances are of one of the following types:
 *     net.opengis.gml.x32.TimeUnitType$Member
 *     net.opengis.gml.x32.TimeUnitType$Member2
 */
public class TimeUnitTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.x32.TimeUnitType, net.opengis.gml.x32.TimeUnitType.Member, net.opengis.gml.x32.TimeUnitType.Member2
{
    private static final long serialVersionUID = 1L;
    
    public TimeUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected TimeUnitTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.TimeUnitType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.x32.TimeUnitType.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.TimeUnitType$Member2.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.gml.x32.TimeUnitType.Member2
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
