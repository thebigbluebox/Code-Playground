// Cormen 2.1-2
// Rewrite the insertion sort procedure to sort into nonincreasing instead of decreasing order
function insertionSort(A) {
    for (var j = 1; j < A.length; j++) {

        var key = A[j];
        var i = j - 1;

        // reverse order if we place key as smaller than A[i]
        while (i >= 0 & A[i] < key) {
            // while (i >= 0 & A[i] > key) {
            A[i + 1] = A[i];
            i = i - 1;
        }
        A[i + 1] = key;
    }
    return A;
}
var test = insertionSort([9, 8, 7, 6, 1, 5, 4, 3, 2, 1]);
console.log(test);