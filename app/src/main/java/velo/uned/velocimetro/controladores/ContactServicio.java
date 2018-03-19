package velo.uned.velocimetro.controladores;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import velo.uned.velocimetro.dao.ContactDao;
import velo.uned.velocimetro.modelo.Contact;

/**
 * Created by Alvaro on 16/3/2018.
 */

public class ContactServicio {
    private ContactDao contactDao;

    public ContactServicio(Context context) {
        contactDao = new ContactDao(context);
    }

    public void addContact(Contact contact) {

        contactDao.addContact(contact);

    }


    // Getting All Contacts
    public List<Contact> getAllContacts() {
        List<Contact> contactList = contactDao.getAllContacts();

        return contactList;
    }
}