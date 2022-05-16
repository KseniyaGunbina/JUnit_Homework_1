package PhoneBook;

import java.util.*;

public class PhoneBook {
    private HashMap<String, List<Contact>> PhoneBook = new HashMap<>();
    private int successFindContact = 0;
    private int failedFindContact = 0;

    public HashMap<String, List<Contact>> getPhoneBook() {
        return PhoneBook;
    }
    public HashMap<String, List<Contact>> addGroup(String groupName) {
        PhoneBook.put(groupName, new ArrayList<>() {
        });
        System.out.println("Группа успешно создана.\n");
        return PhoneBook;
    }

    public boolean check(List<Contact> list, Contact contact) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(contact)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findContactOnGroup(String group, Contact contact) {
        if (PhoneBook.containsKey(group)) {
            List<Contact> list = PhoneBook.get(group);
            if (check(list, contact)) {
                System.out.println("Контакт " + contact.toString() + " найден в группе " + group + ".\n");
                successFindContact++;
                return true;
            } else {
                System.out.println("Контакт " + contact.toString() + " в группе " + group + " не найден.\n");
                failedFindContact++;
                return false;
            }
        }
        return false;
    }

    public Contact findContactNumber(String number) {
        Collection<List<Contact>> values = PhoneBook.values();
        Contact contact = null;
        for (List<Contact> contacts : values) {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getPhoneNumber().equals(number)) {
                    contact = contacts.get(i);
                    break;
                }
            }
        } return contact;
    }


    public boolean addContact(Contact contact, String[] group) {
        List<Contact> list;
        for (int i = 0; i < group.length; i++) {
            if (!PhoneBook.containsKey(group[i]))
                break;

            list = PhoneBook.get(group[i]);

            if (!check(list, contact)) {
                list.add(contact);
                PhoneBook.put(group[i], list);
                System.out.println("Контакт " + contact.toString() + " успешно добавлен в группу " + group[i] + ".\n");
                System.out.println("Список контактов в группе " + group[i] + ":");
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(j+1 + ") " + list.get(j).toString());
                }
                System.out.println();
                return true;
            } else
                System.out.println("Контакт " + contact.toString() +
                        " уже состоит в группе " + group[i] + ".\n");
            return false;
        }
        return false;
    }
}
