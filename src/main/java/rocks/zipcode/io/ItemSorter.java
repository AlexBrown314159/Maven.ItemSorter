package rocks.zipcode.io;

import com.sun.tools.javac.jvm.Items;

import java.util.Comparator;
import java.util.Comparator;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * @author leon on 30/01/2019.
 */


    public class ItemSorter {

        private Item[] items;



        public ItemSorter(Item[] items) {

            this.items = items;
        }

        public Item[] sort(Comparator<Item> comparator) {

            Arrays.sort(items, comparator);

            return items;
        }

    }






//
//    class SortbyitemName implements Comparator<Item> {
//        // Used for sorting in ascending order of name
//
//        public int compare(Item a, Item b)
//        {
//            return a.itemName.compareTo(b.itemName);
//        }
//    }
//
//
//    class SortbyitemPrice implements Comparator<Item> {
//        // Used for sorting in ascending order of name
//
//        public int compare(Item a, Item b)
//        {
//            return a.itemPrice.compareTo(b.itemPrice);
//        }
//    }
//









//
//
//    public Item[] sort(Comparator<Item> comparator) {
//        return itemArray;
//    }
//
//    public int compare(Item o1, Item o2) {
//        return 0;
//    }
//}
