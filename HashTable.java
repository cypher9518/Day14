package com.assinment;

public class HashTable {

    public static void main(String[] args) {

        HTable<String, Integer> hashTable = new HTable();
        String message = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray) {
            Integer value = hashTable.get(word);

            if( value == null)
                value = 1;
            else
                value = value + 1;

            hashTable.add(word , value);
        }
        System.out.println(hashTable);
        hashTable.remove("avoidable");
        System.out.println(hashTable);}


}
