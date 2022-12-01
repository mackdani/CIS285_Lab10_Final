package testSelectionSort;


import java.util.Arrays;

import org.junit.jupiter.api.Test;
public class testSelectionSort {

	@Test
	public void test() {
	testPositive();
	testNegatives();
	testMixed();
	testDuplicates();
	}
    SelectionSort sort = new SelectionSort();

    public void testPositive(){
        int[] ArrayValue = new int[]{18,13,17,20,22};
        int[] res_values = new int[]{13,17,18,20,22};
        sort.basicSelectionSort(ArrayValue);
        assert(Arrays.equals(ArrayValue,res_values));
    }

    public void testNegatives(){
        int[] ArrayValue = new int[]{-11,-19,-8,-6,-4};
        int[] res_values = new int[]{-19,-11,-8,-6,-4};
        sort.basicSelectionSort(ArrayValue);
        assert(Arrays.equals(ArrayValue,res_values));
    }

    public void testMixed(){
        int[] ArrayValue = new int[]{-33,-24,16,-30,12,0};
        int[] res_values = new int[]{-33,-30,-24,0,12,16};
        sort.basicSelectionSort(ArrayValue);
        assert(Arrays.equals(ArrayValue,res_values));
    }

    public void testDuplicates(){
        int[] ArrayValue = new int[]{-88,-50,77,22,-11,27,-50,22,0};
        int[] res_values = new int[]{-88,-50,-50,-11,0,22,22,27,77};
        sort.basicSelectionSort(ArrayValue);
        assert(Arrays.equals(ArrayValue,res_values));
    }
}
