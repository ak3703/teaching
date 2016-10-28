Anthony Kim
1004 - Intro to Java
10/28

Arrays
======

### What is an array?
Java Docs: 
An array is a container object that holds a fixed number of values of a single type

### Creating an Array:
```java
    int[] arr;          // declaring variable arr as an array of integers
    arr = new int[10];  // allocating space for 10 integers
    arr[0] = 1;         // assigning index 0 the value 1 
    int[] shorterArr = new int[10];

    int[] anotherArr = new int[] { 1, 2, 3, 4, 5 };
    int[] equivalentArr = { 1, 2, 3, 4, 5 }; 
```

### Multidimentional Arrays
```java
    int[][] twoD = new int[2][2];
    twoD[0][1] = 5;
    
    int[][] anotherTwoD = { { 1, 2, 3 }, { 4, 5, 6 } };
```

### Default Values
| Variable Type | Initial Value | 
|:------------- |:-------------:|
| byte          | (byte) 0      |
| short         | (short) 0     |
| int           | 0             |
| long          | 0L            |
| float         | 0.0f          |
| double        | 0.0d          |
| char          | null '\u0000  |
| boolean       | false         |

### When to Use Arrays
* When you know the size of what you're storing
  * Storing the number of students who received each grade (A,B,C,D,E,F) 


