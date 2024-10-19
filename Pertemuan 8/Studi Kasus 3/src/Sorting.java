public class Sorting {

    public static void selectionSort(Integer[] intList)
    {
        int min;
        Comparable temp;

        for (int index = 0; index < intList.length-1;index++)
        {
            min = index;
            for (int scan = index+1; scan < intList.length; scan++)
            {
                if (intList[scan].compareTo(intList[min]) < 0 )
                {
                    min = scan;
                }
            }
            temp = intList[min];
            intList[min]=intList[index];
            intList[index] =(Integer)temp;
        }
    }

    public static void insertionSort (Comparable[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index];
            int position = index;

            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }

}
