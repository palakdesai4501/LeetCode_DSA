var productExceptSelf = function (nums) {
  let res = [];
  let start = 1;

  for (let i = 0; i < nums.length; i++) {
    res.push(start);
    start = start * nums[i];
  }

  let start2 = 1;

  for (let i = nums.length; i >= 0; i--) {
    res[i] = start2 * res[i];
    start2 = start2 * nums[i];
  }
};
