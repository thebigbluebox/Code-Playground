// cormen 2-2.2
function selectionSort(A) {
    // initialization: A[0..i] is sorted, and A[i..n] is unsorted
    // maintenance: as i increments, A[i..n] becomes increasingly sorted
    for (var i = 0; i < A.length; i++) {
        // temp index
        var tempIndex = i;
        // We pick the smallest value from A[i+1..n]
        for (var j = i + 1; j < A.length; j++) {
            // We maintain the index of the smallest value
            if (A[j] < A[tempIndex]) {
                tempIndex = j;
            }
        }
        // exchange current index with the next smallest value
        var tempVal = A[i];
        A[i] = A[tempIndex];
        A[tempIndex] = tempVal;
    }
    return A;
}

var test = selectionSort([6, 4, 7, 2, 3, 4, 1, 7]);
console.log(test);