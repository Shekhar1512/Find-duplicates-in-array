package javaPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;

public class Find_Duplicates_Elements_InArray {

	public static void main(String[] args) {
		
		int  a[]= {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
		
		Solution ob = new Solution();
		ArrayList list=ob.duplicates(a,26);
		System.out.println(list);
		
	}
	
}



class Solution {
    public static ArrayList<Integer> duplicates(int a[], int n) {
        // code here
        
        
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        for(int i=0; i<a.length; i++)
        {
            if(set.contains(a[i]))
            {
                list.add(a[i]);
            }
            else
            {
                set.add(a[i]);
            }
        }
        
        if(list.size()==0)
        {
            list.add(-1);
            return list;
        }
        
        	else{
                
                set.clear();
                for(int i=0; i<list.size(); i++)
                {
                    set.add(list.get(i));
                }
                list.clear();
                Iterator<Integer> it = set.iterator();
                while(it.hasNext())
                {
                    list.add(it.next());
                }
                
                
                
                //
        	
        	
      Collections.sort(list);
      return list;
        }
    }
}