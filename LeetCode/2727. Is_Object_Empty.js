/* Link - https://leetcode.com/problems/is-object-empty/ */

/**
 * @param {Object | Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    return !Object.keys(obj).length
};
/* 
for (let key in obj) return false;
return true;
*/
