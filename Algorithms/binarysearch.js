// Cormen 2.3-5
// Rewrite the insertion sort procedure to sort into nonincreasing instead of decreasing order

// recursive
function binarySearchRec(A, k){
    if(A.length == 1){
        if(A[0] === k){
            return A;
        }
        else{
            return null;
        }
            
    }
    var midpoint = A.length/2;
    if(A[midpoint] > k){
        return binarySearch(A.slice(0,midpoint), k);
    } else {
        return binarySearch(A.slice(midpoint, A.length-1), k);
    }
}

function binarySearch(A, k) {
    var midpoint = A.length/2;
    while() {
        if(k > A[midpoint]){
            midpoint = midpoint/2 + midpoint;
        }
    }
}


var val = binarySearch([1,2,3,4,5,6,7,8,9,10],3);