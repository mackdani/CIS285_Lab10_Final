package testSelectionSort;

public class old_SelectionSort {
private int temp;
/** Creates a new instance of SelectionSort */
public old_SelectionSort() {
}
/* A simple SelectionSort algorithm
* pre-condition:
* post-condition:
* inputs:
* outputs:
* special conditions:
*/
public int[] basicSelectionSort(int[] x) {
for (int i = 0; i &lt; x.length; ++i) {
for (int j= i+1; j &lt; x.length; ++j) {
if (x[i] &gt; x[j]) {
temp = x[i];
x[i] = x[j];
temp = x[j];
}
} // end of inner for loop
} // end of outer for loop
return x;
} // end of basicSelectionSort method
}
