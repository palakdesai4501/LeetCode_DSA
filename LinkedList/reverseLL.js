var reverseList = function (head) {
  let prev = null;

  while (head) {
    let nextnode = head.next;
    head.next = prev;
    prev = head;
    head = nextnode;
  }
  return prev;
};
