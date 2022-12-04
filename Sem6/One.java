    // Создаете одно из множеств: HashSet, TreeSet, LinkedHashSet (<Integer>)  
    // Замеряете время заполнения каждого из них 250_000 числами

package Sem6;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class One {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new TreeSet<>();
        Set<Integer> third = new LinkedHashSet<>();
        hashS(first);
        hashS(second);
        hashS(third);
    }

    public static void hashS(Collection<Integer> inp) {
        double sum = 0;
        int count = 10;
        for (int j = 0; j < count; j++) {
            long currTime = System.currentTimeMillis();
            for (int i = 0; i < 1_000_000; i++) {
                inp.add(i);
            }
            long time = System.currentTimeMillis();
            long ans = time - currTime;
            sum+= ans;
            inp.clear();
            // System.out.println(lst.toString());
        }

        Double midVal = (sum / count);
        System.out.println(midVal);
    }
}

//вариант коллег
// public static void speedMeasurement(Set<Integer> set) {
//     long sumTime = 0;
//     for (int j = 0; j < 100; j++) {
//         long time = System.currentTimeMillis();
//         for (int i = 0; i < 250_000; i++) {
//             set.add(i);
//         }
//         sumTime += System.currentTimeMillis() - time;
//         set.clear();
//     }
//     System.out.println(sumTime / 100);
// }
