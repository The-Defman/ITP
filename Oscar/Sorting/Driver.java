
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    private InsertionSort ob;
    int[] myArray;
    Driver(int[] A){
        myArray = A;
    }
    public void mergeSortArray(){
        ob.insertionSort(myArray);

    }
}