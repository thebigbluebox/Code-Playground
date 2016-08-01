// cormen 2.1-4
// Consider the problem of adding two n-bit binary integers, stored in two n-element
// arrays A and B. The sume of two integers should be stored in binary
// in an (n+1) element array C. State the problem formally

// Assuming this is little endian
function binaryAddition(A, B) {
    var C = [];
    // initialization: we assume that C[0 - j] is added
    var j = 0;
    var carry = false;

    // maintenance: as the loop progress j is incremenented meaning everything
    // to the left of j is added while to right it has not finished
    while (j <= Math.max(A.length, B.length)) {
        var op1 = 0;
        if (A[j]) {
            op1 = A[j];
        }
        var op2 = 0;
        if (B[j]) {
            op2 = B[j];
        }
        // Only in JS, never anywhere else
        var ans = op1 + op2 + carry;
        switch (ans) {
            case 0:
                carry = false;
                C.push(0);
                break;
            case 1:
                carry = false;
                C.push(1);
                break;
            case 2:
            case 3:
                C.push(1);
                carry = true;
        }
        j++;
    }
    // termination: by the end j = Max(A.length,B.length)+1 meaning
    // the final result will have carried over and finished the addition
    return C;
}

var Bin1 = [0, 1, 1, 1, 0, 1, 0, 1];
var Bin2 = [0, 0, 0, 1, 0, 1, 1, 1];
var test = binaryAddition(Bin1, Bin2);
console.log(test);