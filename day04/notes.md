Day 4:
-Arrays:
    .In java it is an object(whenever we use the new keyword it is an object)
    .It will occupy a contiguous space in heap memory
    .eg: int n[]={4,5,6};
         int n1[]=new int[5]; //by default all values are 0
    .2D array  eg: nums[][]=new int[3][5];
    .Math.random() return double value between 0.0 and 1.0
    .Jagged array: A jagged array in Java (also known as a ragged array) is a multidimensional array where each row can have a different number of columns
    .Drawbacks:
        -fixed size
        -All array elements should be of same data type---can solve that by using object array
        -insertion and deletion in the middle of the array takes O(n)
    .Arrays is an object in java and strings are also class/objects in java
-Strings
    .Immutable objects in Java
    .Thread safe
    .To overcome immutability 2 ways:
        -String Builder:
            .uses char array
            .default size 16 after capactiy new capactiy=old capactiy*2 +2
            .best use for repeated modifications
            .fast but not thread safe
        -String Buffer:
            .default 16 bytes of buffer
            .slow but thread safe

            
