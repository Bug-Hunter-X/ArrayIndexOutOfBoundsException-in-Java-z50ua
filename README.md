# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java programming error: the `ArrayIndexOutOfBoundsException`.  The example shows how exceeding the valid index range of an array leads to this runtime exception.  The solution provides a corrected version with a proper loop condition.

**Cause:** The original code uses `i <= arr.length` in the loop condition.  Array indices in Java start at 0 and go up to `length - 1`. Accessing `arr[arr.length]` attempts to access an element one position beyond the array's end.

**Solution:** Change the loop condition to `i < arr.length` to ensure only valid indices are accessed.