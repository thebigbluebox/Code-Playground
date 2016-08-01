// Cormen 2.1-3
// Consider the searching problem:
// Input: A sequence of n numbers A = <a1, a2 ... an>
// Output: An index i such that v = A[i] or the special value NIL if v do appear in A

function linearSearch(A, v) {
    var i = 0;
    while (i < A.length) {
        if (A[i] == v) {
            return i;
        }
        i++;
    }
    return;
}
// Positive test
var test = linearSearch([1, 5, 4, 3, 2], 2);
console.log(test);
// Negative test
var test = linearSearch([1, 5, 4, 3, 2], 9);
console.log(test);