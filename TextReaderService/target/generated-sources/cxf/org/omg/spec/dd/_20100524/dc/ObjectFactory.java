
package org.omg.spec.dd._20100524.dc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.spec.dd._20100524.dc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Font_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DC", "Font");
    private final static QName _Bounds_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DC", "Bounds");
    private final static QName _Point_QNAME = new QName("http://www.omg.org/spec/DD/20100524/DC", "Point");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.spec.dd._20100524.dc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Font }
     * 
     */
    public Font createFont() {
        return new Font();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Bounds }
     * 
     */
    public Bounds createBounds() {
        return new Bounds();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Font }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DC", name = "Font")
    public JAXBElement<Font> createFont(Font value) {
        return new JAXBElement<Font>(_Font_QNAME, Font.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bounds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DC", name = "Bounds")
    public JAXBElement<Bounds> createBounds(Bounds value) {
        return new JAXBElement<Bounds>(_Bounds_QNAME, Bounds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Point }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DD/20100524/DC", name = "Point")
    public JAXBElement<Point> createPoint(Point value) {
        return new JAXBElement<Point>(_Point_QNAME, Point.class, null, value);
    }

}
