//created by shubham khunt at 04:03 pm(date : 01/03/2020)

class highArray
{
    private long[] a;       // ref to array a
    private int nElems;     // number of data items

    public highArray(int max)
    {
        a = new long[max];  // create the array
        nElems = 0;         // no item yet
    }

    public boolean find(long serchKey)
    {
        int j;              // find specified value
        for(j=0;j<nElems;j++) // for each element 
            if(a[j]==serchKey) // found item ??
                break;          // exit loop before end
        if(j==nElems)           // gone to end ?
            return false;       // yes,can't find it 
        else
            return true;        // no,found it
    }

    public void insert(long value)   // put elemet into array
    {
        a[nElems]=value;        // insert it
        nElems++;               // increment size
    }

    public boolean delete(long value)
    {
        int j;              // look for it
        for(j=0;j<nElems;j++)
            if(value==a[j])
                break;
        if(j==nElems)       //can't find it
            return false;
        else                // fount it
        {
            for(int k = j; k<nElems;k++)        // move higher once down
                a[k]=a[k+1];
            nElems--;                       // decrement size
            return true;
        }
    } // end delete method

    public void display()               // display array contents
    {
        for(int j = 0 ;j<nElems;j++)         // for each element
            System.out.print(a[j] + " ");      // display it
        System.out.println("");
    }
} // end class arr


class highArrayApp
{
    public static void main(String args[])
    {
        int maxsize = 100;    // array size
        highArray arr1 = new highArray(maxsize); // create array

        arr1.insert(10);    // insert item
        arr1.insert(20);
        arr1.insert(30);
        arr1.insert(40);
        arr1.insert(50);
        arr1.insert(60);
        arr1.insert(70);
        arr1.insert(80);
        arr1.insert(90);
        arr1.insert(100);

        arr1.display();     // display item

        int serchKey = 50;          // search for item
        if(arr1.find(serchKey))
            System.out.println("Found "+serchKey);
        else
            System.out.println("can't Found "+serchKey);

        arr1.delete(30);    // delete 3 item
        arr1.delete(100);
        arr1.delete(90);

        arr1.display();        // display item again
    }
}