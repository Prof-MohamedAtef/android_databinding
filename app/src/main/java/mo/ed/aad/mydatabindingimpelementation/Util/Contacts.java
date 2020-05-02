package mo.ed.aad.mydatabindingimpelementation.Util;

import java.util.ArrayList;
import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.models.Contact;

public class Contacts {
    public static Contact contact1=new Contact("Mohamed Atef","27","01097555350","proofesser@gmail.com");
    static Contact contact2=new Contact("Noha Mohammed","30","01097441013","nohamelmandoh@gmail.com");
    static Contact contact3=new Contact("Nahed Mohammed","33","0109755656","nahedmohamed@gmail.com");
    static Contact contact4=new Contact("Nada Mohammed","31","01565064033","nadamohammed@gmail.com");
    public static List<Contact> getContacts(){
        List<Contact> contacts=new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        return contacts;
    }
}
