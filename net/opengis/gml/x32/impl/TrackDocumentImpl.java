/*
 * An XML document type.
 * Localname: track
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TrackDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one track(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TrackDocumentImpl extends net.opengis.gml.x32.impl.HistoryDocumentImpl implements net.opengis.gml.x32.TrackDocument
{
    private static final long serialVersionUID = 1L;
    
    public TrackDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACK$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "track");
    
    
    /**
     * Gets the "track" element
     */
    public net.opengis.gml.x32.HistoryPropertyType getTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().find_element_user(TRACK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "track" element
     */
    public void setTrack(net.opengis.gml.x32.HistoryPropertyType track)
    {
        generatedSetterHelperImpl(track, TRACK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "track" element
     */
    public net.opengis.gml.x32.HistoryPropertyType addNewTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().add_element_user(TRACK$0);
            return target;
        }
    }
}
