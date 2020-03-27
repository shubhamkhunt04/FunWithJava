class arr
{
    private long[] a;       // ref to array a
    private int nElemn;     // number of dataitem
    public arr(int max) {   // constructor
        a = new long[max]; // creat array
        nElemn = 0;
    }
    public int size(){
        return nElemn;
    }

    public int find(long serchKey)
    {
        int lowerBound = 0;
        int upperBound = nElemn-1;
        int curIn;

    while(true)
    {
        curIn = (lowerBound+upperBound)/2;
        if(a[curIn]==serchKey)
            return curIn;                      // found it
        else if(lowerBound>upperBound)
            return nElemn;                     // can't find it
        else
        {                                  // divide range
            if(a[curIn]<serchKey)
                lowerBound = curIn+1;              // it's in upperhalf
            else
                upperBound = curIn-1;              // it's in lowerhalf
        }
    }
}

public void insert(long value){                 // put element into array
    int j;      
    for(j=0;j<nElemn;j++)                       // find where it goes
        if(a[j]>value)                           // (linear search)
            break;
    for(int k= nElemn;k>j;k--)                    // move bigger ones up          
        a[k]=a[k-1];
    a[j]=value;                                     // insert it
    nElemn++;                                       // incremanet size
}

public boolean delete(long value){
    int j = find(value);
    if(j==nElemn)                               // can't find it
        return false;
    else{                                       // found it
        for(int k = j;k<nElemn;k++)             // move bigger once down
            a[k]=a[k+1];
        nElemn--;
        return true;
    }
}

public void display(){                          // display array content
    for(int j=0;j<nElemn;j++)                   // for each element
        System.out.println(a[j] + " ");     // display it
    System.out.println("");
}
}

class binary
{
    public static void main(String args[])
    {
        int maxsize = 100;                       // array size
        arr array;                               // reference to array

        array = new arr(maxsize);                   // create the array

        array.insert(77);                          // insert 10 items
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        int serchKey = 55;          // search for item

        if(array.find(serchKey)!=array.size())
            System.out.println("Found "+serchKey);
        else
            System.out.println("Can't find "+serchKey);

        array.display();                                // display item

        array.delete(00);                                   // delete 3 items
        array.delete(55);
        array.delete(99);

        array.display();                               // display items again
    }
}