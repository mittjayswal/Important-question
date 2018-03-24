package com.as.mitt.javainterview;

import java.util.Arrays;
// merge threee Sorted Array
public class MergerSortedArrayTernaryOperator {

	public static void main(String[] args) {
		 // Sort these 3 arrays. The final array should be d = {1,1,2,3,4,5}
	    int[] a = {1,3,10,20,30,40,50};
	    int[] b = {2,4,11,15,35};
	    int[] c = {1,5,12,21,45};
	    int[] d = new int[a.length + b.length + c.length];

	    int i = 0;
	    int j = 0;
	    int k = 0;
	   // for (int l = 0; l < d.length; l++) {
	     /*System.out.println("i = "+i+" a.length= "+a.length+" i < a.length = "+(i<a.length) +" j = "+j+" b.lenght= "+b.length + " a[i]="+a[i]+" b[j]="+ b[j]);
	     // i should go until the end of a array 
	     System.out.println("");
	     System.out.println("k="+k+" c.lenght="+c.length+" a[i]="+a[i]+" c[k]="+c[k]);
	     
	     System.out.println("");
	     System.out.println("j="+j+" b.lenght= "+b.length+" k="+k+" c.lenght= "+c.length+" b[j]"+b[j]+" c[k]"+c[k]);
	     */
	     /*d[l] = i < a.length && (j >= b.length || a[i] < b[j])
	                ? (k >= c.length || a[i] < c[k]
	                    ? a[i++]
	                    : c[k++])
	                : (j < b.length && (k >= c.length || b[j] < c[k])
	                    ? b[j++]
	                    : c[k++]);*/
	       // Uncomment this if you still need it:
	                    System.out.println("");
	   //    System.out.println(" i="+i+" j="+j+" k="+k+" l="+l); 
	   // }

	    	
	    	for (int l=0; l<d.length; l++) {
	    		
	    		d[l] = i < a.length && (j>= b.length || a[i] < b[j])
	    				? k>=c.length || (a[i] < c[k])
	    						?a[i++]
	    						:c[k++]
	    				: j < b.length && (k>=c.length || b[j] < c[k])
	    					? b[j++]
	    					: c[k++];
	    	}
	    System.out.println(Arrays.toString(d));
	    
	    
		
	}
}
