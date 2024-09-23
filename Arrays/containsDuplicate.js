var containsDuplicate = function (nums) {
  let set = new Set();

  return set.size !== nums.length;
};
