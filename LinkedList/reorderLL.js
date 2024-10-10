var reorderList = function (head) {
  //find mid

  let fast = head;
  let slow = head;

  while (fast.next && fast.next.next) {
    slow = slow.next;
    fast = fast.next.next;
  }

  //break linked list
  curr = slow.next;
  slow.next = null;

  //reverse second LL
  prev = null;

  while (curr) {
    temp = curr.next;
    curr.next = prev;
    prev = curr;
    curr = temp;
  }

  //combine Lists
  h1 = head;
  h2 = prev;

  while (h2) {
    temp = h1.next;
    h1.next = h2;
    h1 = h2;
    h2 = temp;
  }
};
