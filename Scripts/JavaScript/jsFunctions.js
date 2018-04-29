/**
 * Recursively remove IDs of elements underneth the selected element
 * @param {element in question}  
 */
function removeIdRecurs($element){
    $element.attr("id","");
    var children = $element.children();
    for(var i = 0; i < children.length; i ++){
        removeIdRecurs(children.eq(i))
    }
}