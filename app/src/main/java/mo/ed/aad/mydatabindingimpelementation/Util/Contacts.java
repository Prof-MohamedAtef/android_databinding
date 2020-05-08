package mo.ed.aad.mydatabindingimpelementation.Util;

import java.util.ArrayList;
import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;

public class Contacts {
    public static Contact contact1=new Contact("Mohamed Atef","27","50086086","proofesser@gmail.com");
    static Contact contact2=new Contact("xxxx Mohammed","30","0350350350","samdksdfjkg@gmail.com");
    static Contact contact3=new Contact("ttttt Mohammed","33","240608606","dsfkljsdf@gmail.com");
    static Contact contact4=new Contact("yyyy Mohammed","31","207686660","20860sdfsdf@gmail.com");

    public static List<Contact> getContacts(){
        List<Contact> contacts=new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        return contacts;
    }
}
