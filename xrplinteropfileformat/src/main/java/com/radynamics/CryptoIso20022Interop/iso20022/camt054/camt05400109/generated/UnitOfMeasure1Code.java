//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.03.28 um 11:20:19 AM CEST 
//


package com.radynamics.CryptoIso20022Interop.iso20022.camt054.camt05400109.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnitOfMeasure1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasure1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PIEC"/&gt;
 *     &lt;enumeration value="TONS"/&gt;
 *     &lt;enumeration value="FOOT"/&gt;
 *     &lt;enumeration value="GBGA"/&gt;
 *     &lt;enumeration value="USGA"/&gt;
 *     &lt;enumeration value="GRAM"/&gt;
 *     &lt;enumeration value="INCH"/&gt;
 *     &lt;enumeration value="KILO"/&gt;
 *     &lt;enumeration value="PUND"/&gt;
 *     &lt;enumeration value="METR"/&gt;
 *     &lt;enumeration value="CMET"/&gt;
 *     &lt;enumeration value="MMET"/&gt;
 *     &lt;enumeration value="LITR"/&gt;
 *     &lt;enumeration value="CELI"/&gt;
 *     &lt;enumeration value="MILI"/&gt;
 *     &lt;enumeration value="GBOU"/&gt;
 *     &lt;enumeration value="USOU"/&gt;
 *     &lt;enumeration value="GBQA"/&gt;
 *     &lt;enumeration value="USQA"/&gt;
 *     &lt;enumeration value="GBPI"/&gt;
 *     &lt;enumeration value="USPI"/&gt;
 *     &lt;enumeration value="MILE"/&gt;
 *     &lt;enumeration value="KMET"/&gt;
 *     &lt;enumeration value="YARD"/&gt;
 *     &lt;enumeration value="SQKI"/&gt;
 *     &lt;enumeration value="HECT"/&gt;
 *     &lt;enumeration value="ARES"/&gt;
 *     &lt;enumeration value="SMET"/&gt;
 *     &lt;enumeration value="SCMT"/&gt;
 *     &lt;enumeration value="SMIL"/&gt;
 *     &lt;enumeration value="SQMI"/&gt;
 *     &lt;enumeration value="SQYA"/&gt;
 *     &lt;enumeration value="SQFO"/&gt;
 *     &lt;enumeration value="SQIN"/&gt;
 *     &lt;enumeration value="ACRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasure1Code")
@XmlEnum
public enum UnitOfMeasure1Code {

    PIEC,
    TONS,
    FOOT,
    GBGA,
    USGA,
    GRAM,
    INCH,
    KILO,
    PUND,
    METR,
    CMET,
    MMET,
    LITR,
    CELI,
    MILI,
    GBOU,
    USOU,
    GBQA,
    USQA,
    GBPI,
    USPI,
    MILE,
    KMET,
    YARD,
    SQKI,
    HECT,
    ARES,
    SMET,
    SCMT,
    SMIL,
    SQMI,
    SQYA,
    SQFO,
    SQIN,
    ACRE;

    public String value() {
        return name();
    }

    public static UnitOfMeasure1Code fromValue(String v) {
        return valueOf(v);
    }

}
